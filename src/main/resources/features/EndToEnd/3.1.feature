Feature: 3.1 Create User
  Scenario: Create User
    Given I open url "http://local.school.portnov.com:4520/#/login"
    Then I push Register now button
    And I type First Name "Lena"
    And I type Last Name "Shain"
    And I type Email "knourelism@sgb-itu-bangsat.ml"
    And I type Group Code "123"
    And I type Password "abcdef"
    And I type Confirm Password "abcdef"
    And I push button Register me