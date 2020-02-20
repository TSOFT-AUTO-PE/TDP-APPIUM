package com.tsoft.bot.frontend.steps.APP_USSD;

import com.tsoft.bot.frontend.helpers.Hook;
import com.tsoft.bot.frontend.utility.ExcelReader;
import com.tsoft.bot.frontend.utility.ExtentReportUtil;
import com.tsoft.bot.frontend.utility.GenerateWord;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import static com.tsoft.bot.frontend.pageobject.APP_USSD.PageObject_USSD.*;

public class steps_USSD {

    private static GenerateWord generateWord = new GenerateWord();
    private AppiumDriver<MobileElement> driver;

    public steps_USSD() {
        this.driver = Hook.getDriver();
    }


    @Given("^Se ingresa a USSD mediante \"([^\"]*)\"$")
    public void seIngresaAUSSDMediante(String arg0) throws Throwable {
        try {
            driver.findElement(By.id(TXT_SEARCH)).clear();
            driver.findElement(By.id(TXT_SEARCH)).sendKeys("USSD");
            driver.findElement(By.id(SELECT_USSD)).click();
            driver.findElement(By.id(TAB_USSD)).click();
            driver.findElement(By.id(TXT_FIELD)).click();
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se inició correctamente USSD");
            generateWord.sendText("Se inició correctamente USSD");
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
        }
    }

    @When("^se ingresa a la opcion Consultas$")
    public void seIngresaALaOpcionConsultas() throws Exception {
        try {
            driver.findElement(By.id(TXT_FIELD)).sendKeys("1");
            driver.findElement(By.id(BTN_ENVIAR)).click();
            Thread.sleep(3000);
            driver.findElement(By.id(TXT_FIELD)).click();
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se ingresó correctamente a la opción : Consultas");
            generateWord.sendText("Se ingresó correctamente a la opción : Consultas");
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
        }
    }

    @And("^se ingresa a la opcion Mas$")
    public void seIngresaALaOpcionMas() throws Exception {
        try {
            driver.findElement(By.id(TXT_FIELD)).sendKeys("5");
            driver.findElement(By.id(BTN_ENVIAR)).click();
            Thread.sleep(3000);
            driver.findElement(By.id(TXT_FIELD)).click();
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se ingresó correctamente a la opción : Mas");
            generateWord.sendText("Se ingresó correctamente a la opción : Mas");
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
        }
    }

    @Then("^se ingresa a la opcion Tarifas$")
    public void seIngresaALaOpcionTarifas() throws Exception {
        try {
            driver.findElement(By.id(TXT_FIELD)).sendKeys("1");
            driver.findElement(By.id(BTN_ENVIAR)).click();
            Thread.sleep(5000);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se ingresó correctamente a la opción : Tarifas");
            generateWord.sendText("Se ingresó correctamente a la opción : Tarifas");
            generateWord.addImageToWord(driver);
            driver.findElement(By.id(BTN_ENVIAR)).click();

        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
        }
    }

    @Then("^se ingresa a la opcion Perdida/robo de tu equipo$")
    public void seIngresaALaOpcionPerdidaRoboDeTuEquipo() throws Exception {
        try {
            driver.findElement(By.id(TXT_FIELD)).sendKeys("2");
            driver.findElement(By.id(BTN_ENVIAR)).click();
            Thread.sleep(5000);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se ingresó correctamente a la opción : Perdida/robo de tu equipo");
            generateWord.sendText("Se ingresó correctamente a la opción : Perdida/robo de tu equipo");
            generateWord.addImageToWord(driver);
            driver.findElement(By.id(BTN_ENVIAR)).click();

        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
        }
    }

    @Then("^se ingresa a la opcion Llamadas Internacionales$")
    public void seIngresaALaOpcionLlamadasInternacionales() throws Exception {
        try {
            driver.findElement(By.id(TXT_FIELD)).sendKeys("3");
            driver.findElement(By.id(BTN_ENVIAR)).click();
            Thread.sleep(5000);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se ingresó correctamente a la opción : Llamadas Internacionales");
            generateWord.sendText("Se ingresó correctamente a la opción : Llamadas Internacionales");
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
        }
    }

    @And("^se verifica para otros operadores$")
    public void seVerificaParaOtrosOperadores() throws Exception {
        try {
            driver.findElement(By.id(TXT_FIELD)).sendKeys("1");
            driver.findElement(By.id(BTN_ENVIAR)).click();
            Thread.sleep(5000);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se ingresó correctamente a la opción : Llamadas Internacionales para otros Operadores");
            generateWord.sendText("Se ingresó correctamente a la opción : Llamadas Internacionales para otros Operadores");
            generateWord.addImageToWord(driver);
            driver.findElement(By.id(BTN_ENVIAR)).click();

        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
        }
    }

    @When("^se ingresa a la opcion Duplicar MB / FB Gratis$")
    public void seIngresaALaOpcionDuplicarMBFBGratis() throws Exception {
        try {
            driver.findElement(By.id(TXT_FIELD)).sendKeys("2");
            driver.findElement(By.id(BTN_ENVIAR)).click();
            Thread.sleep(5000);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se ingresó correctamente a la opción : Duplicar MB + FB GRATIS");
            generateWord.sendText("Se ingresó correctamente a la opción : Duplicar MB + FB GRATIS");
            generateWord.addImageToWord(driver);
        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
        }
    }

    @Then("^se ingresa la opcion de duplicar (\\d+)MB$")
    public void seIngresaLaOpcionDeDuplicarMB(int arg0) throws Exception {
        try {
            driver.findElement(By.id(TXT_FIELD)).sendKeys("1");
            driver.findElement(By.id(BTN_ENVIAR)).click();
            Thread.sleep(3000);
            ExtentReportUtil.INSTANCE.stepPass(driver, "Se ingresó correctamente a la opción : Duplicar, Procesando solicitud");
            generateWord.sendText("Se ingresó correctamente a la opción : Duplicar, Procesando solicitud");
            generateWord.addImageToWord(driver);
            driver.findElement(By.id(BTN_ENVIAR)).click();

        } catch (Exception e) {
            ExtentReportUtil.INSTANCE.stepFail(driver, "Fallo el caso de prueba : " + e.getMessage());
            generateWord.sendText("Tiempo de espera ha excedido");
            generateWord.addImageToWord(driver);
        }
    }
}