Feature: Login to NopCommerce

  Scenario: Successfully login to application
    Given user launch a application
    When user enter email address "admin@yourstore.com" and password "admin"
    And user click on Login button
    Then verify user should see Page title "Dashboard / nopCommerce administration"
    When user click on logout link
    Then verify user should see Page title "Your store. Login"
    And close the browser
