Feature: test test case
  @EndToEnd
  Scenario: testing
    Given I open url "http://local.school.portnov.com:4520/#/login"
    And I click I forgot password
    Then "Reset Password Request" massage appears
    Then I type Email in Request password reset window "qa.sofi@gmail.com"
    And I push button "Request Password Reset"
