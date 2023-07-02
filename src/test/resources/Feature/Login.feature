Feature: Login to NopCommerce

  Scenario: Successfully login to application without outline
    Given user launch a application
    When user enter email address "admin@yourstore.com" and password "admin"
    And user click on Login button
    Then verify user should see Page title "Dashboard / nopCommerce administration" through parameters
    When user click on logout link
    Then verify user should see Page title "Your store. Login" through parameters
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
      | title1     | title2     |
      | PageTitle1 | PageTitle2 |

  Scenario Outline: Verify user should get error message on entering text
    Given user launch a application
    When user enters email address "<incorrectId>"
    And user click on Login button
    Then verify user should able to see error message "<errorMsg>"
    And close the browser

    Examples: 
      | incorrectId     | errorMsg              |
      | IncorrectMailId | IncorrectMailErrorMsg |

  Scenario Outline: Verify user should get error message on incorrect mail id
    Given user launch a application
    When user enters email address "<incorrectId>"
    And user click on Login button
    Then verify user should able to see error summary message "<errorMsg>"
    And close the browser

    Examples: 
      | incorrectId      | errorMsg        |
      | IncorrectMailId2 | AccountErrorMsg |

  Scenario Outline: Verify user should get error message on incorrect password
    Given user launch a application
    When user enters email address "<MailId>"
    And user enters password "<password>"
    And user click on Login button
    Then verify user should able to see error summary message "<errorMsg>"
    And close the browser

    Examples: 
      | MailId   | password          | errorMsg         |
      | username | IncorrectPassword | PasswordErrorMsg |
