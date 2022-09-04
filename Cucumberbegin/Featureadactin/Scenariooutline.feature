@loginfunctionality
Feature: Adactin login functionality 
  @tag2
  Scenario Outline: Verification of the login function 
    Given Adactin login page is opened 
    When User enters the valid and invalid "<userid>" and  "<password>"
    And User clicked the login button
    Then The page will navigate to search hotel 

    Examples: 
      |    userid     |    Password     |
      | lincolnkalai  | Kalai@lincoln123| 
      | kalailincoln  |    Kalai1234    | 
