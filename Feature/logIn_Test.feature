Feature: The Login Page
    As a returning customer
    I want to login to the application
    So that i can view my account balance

  Scenario: Successful Login with Valid Credentials
    Given User is on Login Page
    When User enter vaild credentials
    Then User should be able to view account balance
