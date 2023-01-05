Feature: This is to text the facebooklogin

@regression
  Scenario: homepage default login with valid credentails
    Given user need to launch the facebookapplication
    When user need to enter the valid username and password
    And user need to click on login button
    Then verify the homepage is navigated or not
@smoke
  Scenario Outline: homepage default login with valid credentails
    Given user need to launch the facebookapplication
    When user need to enter the invalid "<username>" and valid "<password>"
    And user need to click on login button
    Then verify the homepage is navigated or not

    Examples: 
      | username    | password |
      | 1@gmail.com |    13234 |
      | 2@gmail.com |    13344 |
