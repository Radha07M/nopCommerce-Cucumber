Feature: Login to NopCommerce

  Scenario: Successfully login to application
    Given user launch a application
    When user enter email address and password
    And user click on Login button
    Then verify user should see Page title <PageTitle1>
    When user click on logout link
    Then verify user should see Page title <PageTitle2>
    And close the browser
