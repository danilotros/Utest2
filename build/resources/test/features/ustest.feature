@stories
Feature:daniel register in Utest
  As a User, I want to register in utest platform
  @scenario1
  Scenario: Register in the utest platform
    Given than Daniel want register utest platform

    When he fill out the forms
      | strName | strLastName | strEmail                       | strPassword |strMes|strAnio|strDia|strCiudad|strPais|strCode|strVersion|strComputer|strLenguage|strMovil|strModel|strOs|
      |  Daniel  |  Garcia     | danielgarcia10211222@gmail.com| TGGADll96$  |October|1996| 20|  Bogotá   |Colombia| 111151 |10|Windows         | Italian   | Huawei   | Y8p |  Android 10|

    Then  he finish the proccess
      |strTextoBotonFinal|
      |Complete Setup|


