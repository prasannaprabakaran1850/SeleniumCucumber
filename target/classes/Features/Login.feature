Feature: Feature to test login functionality
  As a user
  I want to be able to login to the application
  So that I can access my account

  Scenario: Successful login
    Given I am on the login page
    When I enter my username as "Admin" and password as "admin123"
    And I click on the login button
    Then I should be logged in

 Scenario Outline: Successful login using multiple data
    Given I am on the login page
    When I enter my username as "<username>" and password as "<password>"
    And I click on the login button
    Then I should be logged in

   Examples:
     | username | password |
     | Admin    | admin123 |
     | prasanna | 1234     |
