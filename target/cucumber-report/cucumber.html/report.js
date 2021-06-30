$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefile/registration.feature");
formatter.feature({
  "line": 1,
  "name": "Registration",
  "description": "As a user I want to register in to nopCommerce website",
  "id": "registration",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14696638500,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "verify user should register successfully",
  "description": "",
  "id": "registration;verify-user-should-register-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I click on register Link",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "I should navigate to registration page successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I enter first name \"Ravi\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter last name \"Mishra\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter email \"ravi.mishra12@yahoo.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter password \"abcd1234\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I enter confirm password \"abcd1234\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on register button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I should register successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "ComputerTest.iAmOnHomePage()"
});
formatter.result({
  "duration": 1125280700,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.iClickOnRegisterLink()"
});
formatter.result({
  "duration": 5333801100,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTest.iShouldNavigateToRegistrationPageSuccessfully()"
});
formatter.result({
  "duration": 619818900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ravi",
      "offset": 20
    }
  ],
  "location": "LoginTest.iEnterFirstName(String)"
});
formatter.result({
  "duration": 2530126800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mishra",
      "offset": 19
    }
  ],
  "location": "LoginTest.iEnterLastName(String)"
});
formatter.result({
  "duration": 154906200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ravi.mishra12@yahoo.com",
      "offset": 15
    }
  ],
  "location": "LoginTest.iEnterEmail(String)"
});
formatter.result({
  "duration": 894460200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd1234",
      "offset": 18
    }
  ],
  "location": "LoginTest.iEnterPassword(String)"
});
formatter.result({
  "duration": 800574100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcd1234",
      "offset": 26
    }
  ],
  "location": "LoginTest.iEnterConfirmPassword(String)"
});
formatter.result({
  "duration": 644486600,
  "status": "passed"
});
formatter.match({
  "location": "LoginTest.iClickOnRegisterButton()"
});
formatter.result({
  "duration": 1524473900,
  "status": "passed"
});
formatter.match({
  "location": "RegisterTest.iShouldRegisterSuccessfully()"
});
formatter.result({
  "duration": 70228200,
  "status": "passed"
});
formatter.after({
  "duration": 1499075200,
  "status": "passed"
});
});