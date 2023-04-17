Feature: Login to NopCommerce

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
