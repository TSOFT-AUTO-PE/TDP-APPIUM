$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("APP_MiMovistar.feature");
formatter.feature({
  "line": 1,
  "name": "APP_MiMovistar NOVUM",
  "description": "",
  "id": "app-mimovistar-novum",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 62,
  "name": "Validar Gestión de Sesiones (Equipo)",
  "description": "",
  "id": "app-mimovistar-novum;validar-gestión-de-sesiones-(equipo)",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 61,
      "name": "@APP_MiMovistar_TEST4"
    }
  ]
});
formatter.step({
  "line": 64,
  "name": "Se ingresa a la app Mi Movistar y se da click al boton empieza ahora",
  "keyword": "Given "
});
formatter.step({
  "line": 65,
  "name": "se selecciona el ingreso como titular",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "se ingresa el DNI \"\u003ccaso_prueba\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 67,
  "name": "se ingresa la contrasenia de 6 numeros \"\u003ccaso_prueba\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "se da click en el boton ingresar",
  "keyword": "And "
});
formatter.step({
  "line": 69,
  "name": "se da click en ajustes y se selecciona seguridad y privacidad",
  "keyword": "And "
});
formatter.step({
  "line": 70,
  "name": "se da click en gestion de sesiones y se valida el dispositivo",
  "keyword": "And "
});
formatter.step({
  "line": 71,
  "name": "se realiza el logout de la app",
  "keyword": "Then "
});
formatter.examples({
  "line": 73,
  "name": "",
  "description": "",
  "id": "app-mimovistar-novum;validar-gestión-de-sesiones-(equipo);",
  "rows": [
    {
      "cells": [
        "caso_prueba"
      ],
      "line": 74,
      "id": "app-mimovistar-novum;validar-gestión-de-sesiones-(equipo);;1"
    },
    {
      "cells": [
        "1"
      ],
      "line": 75,
      "id": "app-mimovistar-novum;validar-gestión-de-sesiones-(equipo);;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 151498500,
  "status": "passed"
});
formatter.before({
  "duration": 40241171500,
  "status": "passed"
});
formatter.scenario({
  "line": 75,
  "name": "Validar Gestión de Sesiones (Equipo)",
  "description": "",
  "id": "app-mimovistar-novum;validar-gestión-de-sesiones-(equipo);;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 61,
      "name": "@APP_MiMovistar_TEST4"
    }
  ]
});
formatter.step({
  "line": 64,
  "name": "Se ingresa a la app Mi Movistar y se da click al boton empieza ahora",
  "keyword": "Given "
});
formatter.step({
  "line": 65,
  "name": "se selecciona el ingreso como titular",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "se ingresa el DNI \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 67,
  "name": "se ingresa la contrasenia de 6 numeros \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "se da click en el boton ingresar",
  "keyword": "And "
});
formatter.step({
  "line": 69,
  "name": "se da click en ajustes y se selecciona seguridad y privacidad",
  "keyword": "And "
});
formatter.step({
  "line": 70,
  "name": "se da click en gestion de sesiones y se valida el dispositivo",
  "keyword": "And "
});
formatter.step({
  "line": 71,
  "name": "se realiza el logout de la app",
  "keyword": "Then "
});
formatter.match({
  "location": "steps_appMiMovistar.seIngresaALaAppMiMovistarYSeDaClickAlBotonEmpiezaAhora()"
});
formatter.result({
  "duration": 5139598300,
  "status": "passed"
});
formatter.match({
  "location": "steps_appMiMovistar.seSeleccionaElIngresoComoTitular()"
});
formatter.result({
  "duration": 5642963800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 19
    }
  ],
  "location": "steps_appMiMovistar.seIngresaElDNI(String)"
});
formatter.result({
  "duration": 3933035200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 29
    },
    {
      "val": "1",
      "offset": 40
    }
  ],
  "location": "steps_appMiMovistar.seIngresaLaContraseniaDeNumeros(int,String)"
});
formatter.result({
  "duration": 2250639100,
  "status": "passed"
});
formatter.match({
  "location": "steps_appMiMovistar.seDaClickEnElBotonIngresar()"
});
formatter.result({
  "duration": 1897408700,
  "status": "passed"
});
formatter.match({
  "location": "steps_appMiMovistar.seDaClickEnAjustesYSeSeleccionaSeguridadYPrivasidad()"
});
formatter.result({
  "duration": 15583811300,
  "status": "passed"
});
formatter.match({
  "location": "steps_appMiMovistar.seDaClickEnGestionDeSesionesYSeValidaElDispositivo()"
});
formatter.result({
  "duration": 8036276500,
  "status": "passed"
});
formatter.match({
  "location": "steps_appMiMovistar.seRealizaElLogoutDeLaApp()"
});
formatter.result({
  "duration": 5199505100,
  "status": "passed"
});
formatter.after({
  "duration": 3299197100,
  "status": "passed"
});
});