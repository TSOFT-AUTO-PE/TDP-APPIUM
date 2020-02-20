package com.tsoft.bot.frontend.utility;

import com.tsoft.bot.frontend.helpers.Hook;
import io.appium.java_client.*;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import java.awt.*;
import java.sql.Driver;
import java.time.Duration;
import java.util.HashMap;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofSeconds;

public class Swipe extends Hook {


    public static boolean swipeFromUpToBottom()
    {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            HashMap<String, String> scrollObject = new HashMap<String, String>();
            scrollObject.put("direction", "up");
            js.executeScript("mobile: scroll", scrollObject);
            System.out.println("Swipe up was Successfully done.");
        }
        catch (Exception e)
        {
            System.out.println("swipe up was not successfull");
        }
        return false;
    }

    public static boolean swipeFromBottomToUp()
    {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            HashMap<String, String> scrollObject = new HashMap<String, String>();
            scrollObject.put("direction", "down");
            js.executeScript("mobile: scroll", scrollObject);
            System.out.println("Swipe down was Successfully done");
        }
        catch (Exception e)
        {
            System.out.println("swipe down was not successfull");
        }
        return false;
    }

    public static void swipeDown(int howManySwipes) {
        Dimension size = driver.manage().window().getSize();
        // calculate coordinates for vertical swipe
        int startVerticalY = (int) (size.height * 0.8);
        int endVerticalY = (int) (size.height * 0.21);
        int startVerticalX = (int) (size.width / 2.1);
        try {
            for (int i = 1; i <= howManySwipes; i++) {
                new TouchAction<>(driver).press(point(startVerticalX, endVerticalY))
                        .waitAction(waitOptions(ofSeconds(2))).moveTo(point(startVerticalX, startVerticalY))
                        .release().perform();
            }
        } catch (Exception e) {
            //print error or something
        }
    }
}
