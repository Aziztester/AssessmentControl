Feature: 3.1 Create User
  Scenario: Create User
    Given I open url "http://local.school.portnov.com:4520/#/login"
    Then I push Register now button
    And I type First Name "Lena1"
    And I type Last Name "Shain1"
    And I type Email "knourelism@sgb-itu-bangsat.mla"
    And I type Group Code "123"
    And I type Password "abcdef"
    And I type Confirm Password "abcdef"
    And I push button Register me
    Then I receive message You've been registered

# // Log in as a teacher
    And I push on "Back to Login page" button
    And Type email "1suj@testerino.tk"
    And Type Password "12345"
    And Push Sign In button
    And click on User's Managment on the left navigational panel
    And select Sudent "Lena1 Shain1" from Students List
    When push “Options” button on the right side

