@login
Feature: Login
  Scenario: Valid email and password
    Given I Navigate to login page
    Then I Type Email "riseka88@gmail.com"
    And I Type Password "like8888"
    Then I Push "Submit" button
    Then I logged in and user's name appears on top left corner of account
