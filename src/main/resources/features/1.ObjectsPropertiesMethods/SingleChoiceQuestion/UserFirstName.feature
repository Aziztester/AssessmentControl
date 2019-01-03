Feature: User - First name ASK-1306

  Scenario: Alphanumerical and sp character ASK-1307
    When Navigate to registration page "http://local.school.portnov.com:4520/#/login"
    And Click on "Register Now" with xpath"//span[contains(text(),'Register Now')]"
    And Type First name "iV@#7" into First name field with x-path "//input[@placeholder='First Name']"
    And Type Last name "Ivanova" into Last name field with x-path "//input[@placeholder='Last Name']"
    And Type Email "ivanov@gmail.com" into Email field with x-path "//input[@placeholder='Email']"
    And Type Group Id "A007" into Group Id field with x-path "//input[@placeholder='Group Code']"
    And Type Password "12345" into Password field with x-path "//input[@placeholder='Password']"
    And Type Confirm password "12345" into Confirm Password field with x-path "//input[@placeholder='Confirm Password']"
    And Push "Register Me" button with x-path "//*[contains(text(),'Register Me')]"
    Then Verify the message "You have been Registered." with path "//h4[contains(text(),'You have been Registered.')]" is displayed

  Scenario: Single character ASK-1309
    When Navigate to registration page "http://local.school.portnov.com:4520/#/login"
    And Click on "Register Now" with xpath"//span[contains(text(),'Register Now')]"
    And Type First name "I" into First name field with x-path "//input[@placeholder='First Name']"
    And Type Last name "Ivanova" into Last name field with x-path "//input[@placeholder='Last Name']"
    And Type Email "ivanov@gmail.com" into Email field with x-path "//input[@placeholder='Email']"
    And Type Group Id "A007" into Group Id field with x-path "//input[@placeholder='Group Code']"
    And Type Password "12345" into Password field with x-path "//input[@placeholder='Password']"
    And Type Confirm password "12345" into Confirm Password field with x-path "//input[@placeholder='Confirm Password']"
    And Push "Register Me" button with x-path "//*[contains(text(),'Register Me')]"
    Then Verify the message "You have been Registered." with path "//h4[contains(text(),'You have been Registered.')]" is displayed

  Scenario: Zero character input / Required field ASK-1310
    When Navigate to registration page "http://local.school.portnov.com:4520/#/login"
    And Click on "Register Now" with xpath"//span[contains(text(),'Register Now')]"
#    And Type First name " " into First name field with x-path "//input[@placeholder='First Name']"
    And Type Last name "Ivanova" into Last name field with x-path "//input[@placeholder='Last Name']"
    And Type Email "ivanobv@gmail.com" into Email field with x-path "//input[@placeholder='Email']"
    And Type Group Id "A007" into Group Id field with x-path "//input[@placeholder='Group Code']"
    And Type Password "12345" into Password field with x-path "//input[@placeholder='Password']"
    And Type Confirm password "12345" into Confirm Password field with x-path "//input[@placeholder='Confirm Password']"
    And Push "Register Me" button with x-path "//*[contains(text(),'Register Me')]"
    Then Verify the message "This field is required" with path "//*[@class='mat-error ng-star-inserted']" is displayed

  Scenario: Max characters ASK-1312
    When Navigate to registration page "http://local.school.portnov.com:4520/#/login"
    And Click on "Register Now" with xpath"//span[contains(text(),'Register Now')]"
    And Type First name "Ivanivan912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912" into First name field with x-path "//input[@placeholder='First Name']"
    And Type Last name "I" into Last name field with x-path "//input[@placeholder='Last Name']"
    And Type Email "ivanov@gmail.com" into Email field with x-path "//input[@placeholder='Email']"
    And Type Group Id "A007" into Group Id field with x-path "//input[@placeholder='Group Code']"
    And Type Password "12345" into Password field with x-path "//input[@placeholder='Password']"
    And Type Confirm password "12345" into Confirm Password field with x-path "//input[@placeholder='Confirm Password']"
    And Push "Register Me" button with x-path "//*[contains(text(),'Register Me')]"
    Then Verify the message "You have been Registered." with path "//h4[contains(text(),'You have been Registered.')]" is displayed

  Scenario: Max+1 characters ASK-1313
    When Navigate to registration page "http://local.school.portnov.com:4520/#/login"
    And Click on "Register Now" with xpath"//span[contains(text(),'Register Now')]"
    And Type First name "Ivanivan9123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123456789123" into First name field with x-path "//input[@placeholder='First Name']"
    And Type Last name "I" into Last name field with x-path "//input[@placeholder='Last Name']"
    And Type Email "ivanov@gmail.com" into Email field with x-path "//input[@placeholder='Email']"
    And Type Group Id "A007" into Group Id field with x-path "//input[@placeholder='Group Code']"
    And Type Password "12345" into Password field with x-path "//input[@placeholder='Password']"
    And Type Confirm password "12345" into Confirm Password field with x-path "//input[@placeholder='Confirm Password']"
    And Push "Register Me" button with x-path "//*[contains(text(),'Register Me')]"
    Then Verify the message "Data too long for column 'name' at row 1" with path "//div[@class='cdk-overlay-container']" is displayed

  Scenario: Leading space ASK-1314
    When Navigate to registration page "http://local.school.portnov.com:4520/#/login"
    And Click on "Register Now" with xpath"//span[contains(text(),'Register Now')]"
    And Type First name " Ivan" into First name field with x-path "//input[@placeholder='First Name']"
    And Click on Last Name field with x-path "//input[@placeholder='Last Name']"
    Then Verify the message "Whitespaces are not allowed" with path "//*[@class='mat-error ng-star-inserted']" is displayed

  Scenario: Trailing space ASK-1315
    When Navigate to registration page "http://local.school.portnov.com:4520/#/login"
    And Click on "Register Now" with xpath"//span[contains(text(),'Register Now')]"
    And Type First name "Ivan " into First name field with x-path "//input[@placeholder='First Name']"
    And Click on Last Name field with x-path "//input[@placeholder='Last Name']"
    Then Verify the message "Whitespaces are not allowed" with path "//*[@class='mat-error ng-star-inserted']" is displayed

  Scenario: Space characters inside ASK-1316
    When Navigate to registration page "http://local.school.portnov.com:4520/#/login"
    And Click on "Register Now" with xpath"//span[contains(text(),'Register Now')]"
    And Type First name "Iv an" into First name field with x-path "//input[@placeholder='First Name']"
    And Click on Last Name field with x-path "//input[@placeholder='Last Name']"
    Then Verify the message "Whitespaces are not allowed" with path "//*[@class='mat-error ng-star-inserted']" is displayed