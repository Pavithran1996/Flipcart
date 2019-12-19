$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature%20File/Flipcart.feature");
formatter.feature({
  "name": "To validate the Adictin Functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "To Check Adictin login functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the browser and open the flipcart application",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.launch_the_browser_and_open_the_flipcart_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Username and Password",
  "rows": [
    {
      "cells": [
        "pavithran1996",
        "pranav@85"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.enter_the_Username_and_Password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.click_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter booking credentials",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.enter_booking_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Confirm the Booking",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.confirm_the_Booking()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Address credentials",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.enter_Address_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Logout the page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.logout_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Successful",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.successful()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});