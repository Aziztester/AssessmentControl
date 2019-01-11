Feature: User - First name ASK-1306

  Scenario: Alphanumerical and sp character
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
    When Click on "Back to Login Page" with xpath"//span[@class='mat-button-wrapper']"
    And Type Email "galinademysheva@gmail.com" into Email field with x-path "//input[@formcontrolname='email']"
    And Type Password "123456" into Password field with x-path "//input[@formcontrolname='password']"
    And I clicked on "Sign in" with x-path"//span[contains(text(),'Sign In')]"
    And I clicked on "User's Management" with x-path"//h5[contains(text(),'Management')]"
    And I find User with x-path "//h4[contains(text(),'Management')]/..//*[contains(text(),'Group: A007')]/..//*[contains(text(),'iV@#7 Ivanova')]"
    And I clicked on "Options" with x-path"//span[@class='mat-button-wrapper']"
    And I delete User with x-path "//div[@class='mat-menu-content ng-trigger ng-trigger-fadeInItems']//button[4]"
    Then I clicked on "Delete" with x-path"//span[contains(text(),'Delete')]"

  Scenario: Single character
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
    When Click on "Back to Login Page" with xpath"//span[@class='mat-button-wrapper']"
    And Type Email "galinademysheva@gmail.com" into Email field with x-path "//input[@formcontrolname='email']"
    And Type Password "123456" into Password field with x-path "//input[@formcontrolname='password']"
    And I clicked on "Sign in" with x-path"//span[contains(text(),'Sign In')]"
    And I clicked on "User's Management" with x-path"//h5[contains(text(),'Management')]"
    And I find User with x-path "//h4[contains(text(),'Management')]/..//*[contains(text(),'Group: A007')]/..//*[contains(text(),'I Ivanova')]"
    And I clicked on "Options" with x-path"//span[@class='mat-button-wrapper']"
    And I delete User with x-path "//div[@class='mat-menu-content ng-trigger ng-trigger-fadeInItems']//button[4]"
    Then I clicked on "Delete" with x-path"//span[contains(text(),'Delete')]"

  Scenario: Zero character input / Required field
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

  Scenario: Max characters
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
    When Click on "Back to Login Page" with xpath"//span[@class='mat-button-wrapper']"
    And Type Email "galinademysheva@gmail.com" into Email field with x-path "//input[@formcontrolname='email']"
    And Type Password "123456" into Password field with x-path "//input[@formcontrolname='password']"
    And I clicked on "Sign in" with x-path"//span[contains(text(),'Sign In')]"
    And I clicked on "User's Management" with x-path"//h5[contains(text(),'Management')]"
    And I find User with x-path "//h4[contains(text(),'Management')]/..//*[contains(text(),'Group: A007')]/..//*[contains(text(),'Ivanivan912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912 I')]"
    And I clicked on "Options" with x-path"//span[@class='mat-button-wrapper']"
    And I delete User with x-path "//div[@class='mat-menu-content ng-trigger ng-trigger-fadeInItems']//button[4]"
    Then I clicked on "Delete" with x-path"//span[contains(text(),'Delete')]"

  Scenario: Max+1 characters
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

  Scenario: Leading space
    When Navigate to registration page "http://local.school.portnov.com:4520/#/login"
    And Click on "Register Now" with xpath"//span[contains(text(),'Register Now')]"
    And Type First name " Ivan" into First name field with x-path "//input[@placeholder='First Name']"
    And Click on Last Name field with x-path "//input[@placeholder='Last Name']"
    Then Verify the message "Whitespaces are not allowed" with path "//*[@class='mat-error ng-star-inserted']" is displayed

  Scenario: Trailing space
    When Navigate to registration page "http://local.school.portnov.com:4520/#/login"
    And Click on "Register Now" with xpath"//span[contains(text(),'Register Now')]"
    And Type First name "Ivan " into First name field with x-path "//input[@placeholder='First Name']"
    And Click on Last Name field with x-path "//input[@placeholder='Last Name']"
    Then Verify the message "Whitespaces are not allowed" with path "//*[@class='mat-error ng-star-inserted']" is displayed

  Scenario: Space characters inside
    When Navigate to registration page "http://local.school.portnov.com:4520/#/login"
    And Click on "Register Now" with xpath"//span[contains(text(),'Register Now')]"
    And Type First name "Iv an" into First name field with x-path "//input[@placeholder='First Name']"
    And Click on Last Name field with x-path "//input[@placeholder='Last Name']"
    Then Verify the message "Whitespaces are not allowed" with path "//*[@class='mat-error ng-star-inserted']" is displayed

  Scenario Outline: User First Name - positive test cases Outline
    When Navigate to registration page "http://local.school.portnov.com:4520/#/login"
    And Click on "Register Now" with xpath"//span[contains(text(),'Register Now')]"
    And Type First name "<First>" into First name field with x-path "//input[@placeholder='First Name']"
    And Type Last name "<Last>" into Last name field with x-path "//input[@placeholder='Last Name']"
    And Type Email "ivanov@gmail.com" into Email field with x-path "//input[@placeholder='Email']"
    And Type Group Id "A007" into Group Id field with x-path "//input[@placeholder='Group Code']"
    And Type Password "12345" into Password field with x-path "//input[@placeholder='Password']"
    And Type Confirm password "12345" into Confirm Password field with x-path "//input[@placeholder='Confirm Password']"
    And Push "Register Me" button with x-path "//*[contains(text(),'Register Me')]"
    Then Verify the message "You have been Registered." with path "//h4[contains(text(),'You have been Registered.')]" is displayed
    When Click on "Back to Login Page" with xpath"//span[@class='mat-button-wrapper']"
    And Type Email "galinademysheva@gmail.com" into Email field with x-path "//input[@formcontrolname='email']"
    And Type Password "123456" into Password field with x-path "//input[@formcontrolname='password']"
    And I clicked on "Sign in" with x-path"//span[contains(text(),'Sign In')]"
    And I clicked on "User's Management" with x-path"//h5[contains(text(),'Management')]"
    And I find "<User>" with x-path "<xpath>"
    And I clicked on "Options" with x-path"//span[@class='mat-button-wrapper']"
    And I delete User with x-path "//div[@class='mat-menu-content ng-trigger ng-trigger-fadeInItems']//button[4]"
    Then I clicked on "Delete" with x-path"//span[contains(text(),'Delete')]"

    Examples:
      | First   |Last     |User| xpath|
      |  iV@#7  |Ivanova  |iV@#7 Ivanova|//h4[contains(text(),'Management')]/..//*[contains(text(),'Group: A007')]/..//*[contains(text(),'iV@#7 Ivanova')]|
      |  I      | Ivanova |I Ivanova    |//h4[contains(text(),'Management')]/..//*[contains(text(),'Group: A007')]/..//*[contains(text(),'I Ivanova')]|
      |Ivanivan912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912| I |Ivanivan912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912 I|//h4[contains(text(),'Management')]/..//*[contains(text(),'Group: A007')]/..//*[contains(text(),'Ivanivan912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912345678912 I')]|

