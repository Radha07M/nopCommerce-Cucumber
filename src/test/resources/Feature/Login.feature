Feature: Login to NopCommerce

Scenario: Successfully login to application without outline
Given user launch a application
When user enter email address "admin@yourstore.com" and password "admin"
And user click on Login button
Then verify user should see Page title "Dashboard / nopCommerce administration"
When user click on logout link
Then verify user should see Page title "Your store. Login"
And close the browser

Scenario Outline: Successfully login to application
Given user launch a application
When user enter email address and password
And user click on Login button
Then verify user should see Page title "<title1>"
When user click on logout link
Then verify user should see Page title "<title2>"
And close the browser
  
Examples:
|title1|title2|
|PageTitle1|PageTitle2|
