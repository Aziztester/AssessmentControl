Feature: User - Group Code
  Scenario: Alphanumerical and special characters
    When Navigate to registration page "http://local.school.portnov.com:4520/#/login"
    And Click on "Register Now" with xpath"//span[contains(text(),'Register Now')]"
    And Type First name "Petya" into First name field with x-path "//input[@placeholder='First Name']"
    And Type Last name "Perov" into Last name field with x-path "//input[@placeholder='Last Name']"
    And Type Email "petrov@gmail.com" into Email field with x-path "//input[@placeholder='Email']"
    And Type Group Id "A777" into Group Id field with x-path "//input[@placeholder='Group Code']"
    And Type Password "12345" into Password field with x-path "//input[@placeholder='Password']"
    And Type Confirm password "12345" into Confirm Password field with x-path "//input[@placeholder='Confirm Password']"
    And Push "Register Me" button with x-path "//*[contains(text(),'Register Me')]"
    Then Verify the message "You have been Registered." with path "//h4[contains(text(),'You have been Registered.')]" is displayed
    When Click on "Back to Login Page" with xpath"//span[@class='mat-button-wrapper']"
    And Type Email "olenqa12@yandex.com" into Email field with x-path "//input[@formcontrolname='email']"
    And Type Password "12345" into Password field with x-path "//input[@formcontrolname='password']"
    And I clicked on "Sign in" with x-path"//span[contains(text(),'Sign In')]"
    And I clicked on "User's Management" with x-path"//h5[contains(text(),'Management')]"
    And I find User with x-path "//h4[contains(text(),'petya perov')]"
    And I clicked on "Options" with x-path"//span[@class='mat-button-wrapper']"
    And I delete User with x-path "//div[@class='mat-menu-content ng-trigger ng-trigger-fadeInItems']//button[4]"
    Then I clicked on "Delete" with x-path"//span[contains(text(),'Delete')]"


  Scenario: Zero character input / Required field
    When Navigate to registration page "http://local.school.portnov.com:4520/#/login"
    And Click on "Register Now" with xpath"//span[contains(text(),'Register Now')]"
      And Type First name "Petya" into First name field with x-path "//input[@placeholder='First Name']"
      And Type Last name "Perov" into Last name field with x-path "//input[@placeholder='Last Name']"
      And Type Email "petrov@gmail.com" into Email field with x-path "//input[@placeholder='Email']"
      And Type Group Id " " into Group Id field with x-path "//input[@placeholder='Group Code']"
      And Type Password "12345" into Password field with x-path "//input[@placeholder='Password']"
      And Type Confirm password "12345" into Confirm Password field with x-path "//input[@placeholder='Confirm Password']"
      And Push "Register Me" button with x-path "//*[contains(text(),'Register Me')]"
      Then Verify message "This field is required" with xpath "//*[contains(text(),'This field is required')]" is displayed


  Scenario: One character
    When Navigate to registration page "http://local.school.portnov.com:4520/#/login"
    And Click on "Register Now" with xpath"//span[contains(text(),'Register Now')]"
    And Type First name "petya" into First name field with x-path "//input[@placeholder='First Name']"
    And Type Last name "perov" into Last name field with x-path "//input[@placeholder='Last Name']"
    And Type Email "petrov@gmail.com" into Email field with x-path "//input[@placeholder='Email']"
    And Type Group Id "A" into Group Id field with x-path "//input[@placeholder='Group Code']"
    And Type Password "12345" into Password field with x-path "//input[@placeholder='Password']"
    And Type Confirm password "12345" into Confirm Password field with x-path "//input[@placeholder='Confirm Password']"
    And Push "Register Me" button with x-path "//*[contains(text(),'Register Me')]"
    Then Verify the message "You have been Registered." with path "//h4[contains(text(),'You have been Registered.')]" is displayed
    When Click on "Back to Login Page" with xpath"//span[@class='mat-button-wrapper']"
    And Type Email "olenqa12@yandex.com" into Email field with x-path "//input[@formcontrolname='email']"
    And Type Password "12345" into Password field with x-path "//input[@formcontrolname='password']"
    And I clicked on "Sign in" with x-path"//span[contains(text(),'Sign In')]"
    And I clicked on "User's Management" with x-path"//h5[contains(text(),'Management')]"
    And I find User with x-path "//h4[contains(text(),'petya perov')]"
    And I clicked on "Options" with x-path"//span[@class='mat-button-wrapper']"
    And I delete User with x-path "//div[@class='mat-menu-content ng-trigger ng-trigger-fadeInItems']//button[4]"
    Then I clicked on "Delete" with x-path"//span[contains(text(),'Delete')]"

  Scenario: Maximum characters
    When Navigate to registration page "http://local.school.portnov.com:4520/#/login"
    And Click on "Register Now" with xpath"//span[contains(text(),'Register Now')]"
    And Type First name "petya" into First name field with x-path "//input[@placeholder='First Name']"
    And Type Last name "perov" into Last name field with x-path "//input[@placeholder='Last Name']"
    And Type Email "petrov@gmail.com" into Email field with x-path "//input[@placeholder='Email']"
    And Type Group Id "A77777" into Group Id field with x-path "//input[@placeholder='Group Code']"
    And Type Password "12345" into Password field with x-path "//input[@placeholder='Password']"
    And Type Confirm password "12345" into Confirm Password field with x-path "//input[@placeholder='Confirm Password']"
    And Push "Register Me" button with x-path "//*[contains(text(),'Register Me')]"
    Then Verify the message "You have been Registered." with path "//h4[contains(text(),'You have been Registered.')]" is displayed
    When Click on "Back to Login Page" with xpath"//span[@class='mat-button-wrapper']"
    And Type Email "olenqa12@yandex.com" into Email field with x-path "//input[@formcontrolname='email']"
    And Type Password "12345" into Password field with x-path "//input[@formcontrolname='password']"
    And I clicked on "Sign in" with x-path"//span[contains(text(),'Sign In')]"
    And I clicked on "User's Management" with x-path"//h5[contains(text(),'Management')]"
    And I find User with x-path "//h4[contains(text(),'petya perov')]"
    And I clicked on "Options" with x-path"//span[@class='mat-button-wrapper']"
    And I delete User with x-path "//div[@class='mat-menu-content ng-trigger ng-trigger-fadeInItems']//button[4]"
    Then I clicked on "Delete" with x-path"//span[contains(text(),'Delete')]"

  Scenario: Max+1 characters
    When Navigate to registration page "http://local.school.portnov.com:4520/#/login"
    And Click on "Register Now" with xpath"//span[contains(text(),'Register Now')]"
    And Type First name "petya" into First name field with x-path "//input[@placeholder='First Name']"
    And Type Last name "perov" into Last name field with x-path "//input[@placeholder='Last Name']"
    And Type Email "petrov@gmail.com" into Email field with x-path "//input[@placeholder='Email']"
    And Type Group Id "A777887" into Group Id field with x-path "//input[@placeholder='Group Code']"
    Then Verify the message "Too long. Should be no more than 6 characters." with path "//*[text()='Too long. Should be no more than 6 characters']" is displayed
