Feature: Automate TC for End to End Testing: Create user as a student, change role to teacher
  #TC-198 Create User and change User role to teacher
  Background: Register as a student
    Given I open url "http://local.school.portnov.com:4520/#/login"
    And I wait for 2 sec

  @Test1
  Scenario: Create a User as a Student
    When I click on element with xpath "//span[contains(text(),'Register Now')]"
    And I wait for 3 sec
    And I click on element with xpath "//input[@placeholder ='First Name']"
    Then I type "Ivan" into element with xpath "//input[@placeholder='First Name']"
    And I click on element with xpath "//input[@placeholder='Last Name']"
    Then I type "Ivanov" into element with xpath "//input[@placeholder='Last Name']"
    And I click on element with xpath "//input[@placeholder='Email']"
    Then I type "onnihennucu-1204@yopmail.com" into element with xpath "//input[@placeholder='Email']"
    And I click on element with xpath "//input[@placeholder='Group Code']"
    Then I type "A005" into element with xpath "//input[@placeholder='Group Code']"
    And I click on element with xpath "//input[@placeholder='Password']"
    Then I type "12345" into element with xpath "//input[@placeholder='Password']"
    And I click on element with xpath "//input[@placeholder='Confirm Password']"
    Then I type "12345" into element with xpath "//input[@placeholder='Confirm Password']"
    Then I click on element with xpath "//button[@type='submit']"
    And I wait for 6 sec
