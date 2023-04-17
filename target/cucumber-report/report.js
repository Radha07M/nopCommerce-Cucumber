$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/Login.feature");
formatter.feature({
  "name": "Login to NopCommerce",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Successfully login to application",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user launch a application",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStep.launchApplication()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter email address \"admin@yourstore.com\" and password \"admin\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.enterEmailAndPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.clickOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify user should see Page title \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.VerifyPageTitle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on logout link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStep.clickOnLogoutLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify user should see Page title \"Your store. Login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.VerifyPageTitle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStep.CloseBrowser()"
});
formatter.result({
  "status": "passed"
});
});