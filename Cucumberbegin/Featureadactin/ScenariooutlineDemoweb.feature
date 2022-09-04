Feature: Demoweb login functionality
  @tag1
  Scenario Outline: To verify the demoweb login function 
    Given The demoweb login page is opened
    When Customer enters the "<Email>" and "<Password>"
    And Customer clicks login button
    Then The page is navigated to home 

    Examples: 
      |     Email        |  Password   | 
      | dsfmf@gmail.com  |  kalai@123  | 
      | ksdjsk@gmail.com |  admin123   | 
