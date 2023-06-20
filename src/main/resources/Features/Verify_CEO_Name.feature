@prasanna
  Feature: This feature is to get CEO name from OrangeHRM app
    Scenario Outline: This test is to verify the CEO name
      Given the user is logged successfully anf is on Home page
      When the user clicks on directory option from Menu bar
      And the user selects job title as "Chief Executive Officer" from drop down
      And clicks the search button
      Then the user should see the CEO name as "<CEO_Name>"
      Examples:
        | CEO_Name   |
        | John Smith |