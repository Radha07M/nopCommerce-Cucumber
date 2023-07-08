Feature: Products Catalog

  Scenario Outline: User should be able to create new product and search and verify the product details
    Given user launch a application
    When user logged into an application
    And user clicks on left navigation menu "<menu>"
    And user clicks on left navigation menu "<menu2>"
    And user clicks on Add New button
    Then verify form title "<pageName>"
    When user enter new product "<productName>" details in Add new Product Page
    And user clicks on product Save button
    Then verify success alert message "<message>"

    Examples: 
      | menu    | menu2    | message        | productName | pageName    |
      | Catalog | Products | ProdSuccessMsg | Product     | AddProdPage |
