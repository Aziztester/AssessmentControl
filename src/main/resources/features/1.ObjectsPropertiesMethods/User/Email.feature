Feature: To Automate testcase for User-Email

  Scenario:Email-Alphanumerical&Special char
    Given Navigate to registration page"http://local.school.portnov.com:4520/#/registration"
    Then Type FirstName "Andrew" into firstname field with xpath"//input[@placeholder='First Name']"
    Then Type LastName "Pitt" into lastname field with xpath"//input[@placeholder='Last Name']"
    Then Type Email "0hanilegro6@gmail.com" into email field with xpath"//input[@placeholder='Email']"
    Then Type Group ID "ASK"into group field with xpath"//input[@placeholder='Group Code']"
    Then Type Password "12345"into password field with xpath"//input[@placeholder='Password']"
    Then Type Confirm Password "12345" into confirm password field with xpath"//input[@placeholder='Confirm Password']"
    Then Push Register Me button with xpath"//button[@type='submit']"
    Then Verify if "You have been registered" message appears with xpath"//h4[contains(text(),'You have been Registered.')]"

  Scenario:Eamil-All Upper case
    Given Navigate to registration page"http://local.school.portnov.com:4520/#/registration"
    Then Type FirstName "Andrew" into firstname field with xpath"//input[@placeholder='First Name']"
    Then Type LastName "Pitt" into lastname field with xpath"//input[@placeholder='Last Name']"
    Then Type Email "0HANILEGRO6@GMAIL.COM" into email field with xpath"//input[@placeholder='Email']"
    Then Type Group ID "ASK"into group field with xpath"//input[@placeholder='Group Code']"
    Then Type Password "12345"into password field with xpath"//input[@placeholder='Password']"
    Then Type Confirm Password "12345" into confirm password field with xpath"//input[@placeholder='Confirm Password']"
    Then Push Register Me button with xpath"//button[@type='submit']"
    Then Verify if "You have been registered" message appears with xpath"//h4[contains(text(),'You have been Registered.')]"

  Scenario:Email-ASCII printable characters `~$!#%^&*_-+={}|'?/ in local part
    Given Navigate to registration page"http://local.school.portnov.com:4520/#/registration"
    Then Type FirstName "Andrew" into firstname field with xpath"//input[@placeholder='First Name']"
    Then Type LastName "Pitt" into lastname field with xpath"//input[@placeholder='Last Name']"
    Then Type Email "`~$!#%^&*_-+={}|'?/@gmail.com" into email field with xpath"//input[@placeholder='Email']"
    Then Type Group ID "ASK"into group field with xpath"//input[@placeholder='Group Code']"
    Then Type Password "12345"into password field with xpath"//input[@placeholder='Password']"
    Then Type Confirm Password "12345" into confirm password field with xpath"//input[@placeholder='Confirm Password']"
    Then Push Register Me button with xpath"//button[@type='submit']"
    Then Verify if "You have been registered" message appears with xpath"//h4[contains(text(),'You have been Registered.')]"

  Scenario:Email-Numbers in local part
    Given Navigate to registration page"http://local.school.portnov.com:4520/#/registration"
    Then Type FirstName "Andrew" into firstname field with xpath"//input[@placeholder='First Name']"
    Then Type LastName "Pitt" into lastname field with xpath"//input[@placeholder='Last Name']"
    Then Type Email "123456543@gamil.com" into email field with xpath"//input[@placeholder='Email']"
    Then Type Group ID "ASK"into group field with xpath"//input[@placeholder='Group Code']"
    Then Type Password "12345"into password field with xpath"//input[@placeholder='Password']"
    Then Type Confirm Password "12345" into confirm password field with xpath"//input[@placeholder='Confirm Password']"
    Then Push Register Me button with xpath"//button[@type='submit']"
    Then Verify if "You have been registered" message appears with xpath"//h4[contains(text(),'You have been Registered.')]"

  Scenario:Email-Numbers in domain name
    Given Navigate to registration page"http://local.school.portnov.com:4520/#/registration"
    Then Type FirstName "Andrew" into firstname field with xpath"//input[@placeholder='First Name']"
    Then Type LastName "Pitt" into lastname field with xpath"//input[@placeholder='Last Name']"
    Then Type Email "0hanilegro6@123456543.com" into email field with xpath"//input[@placeholder='Email']"
    Then Type Group ID "ASK"into group field with xpath"//input[@placeholder='Group Code']"
    Then Type Password "12345"into password field with xpath"//input[@placeholder='Password']"
    Then Type Confirm Password "12345" into confirm password field with xpath"//input[@placeholder='Confirm Password']"
    Then Push Register Me button with xpath"//button[@type='submit']"
    Then Verify if "You have been registered" message appears with xpath"//h4[contains(text(),'You have been Registered.')]"

  Scenario:Email-64 characters in local part
    Given Navigate to registration page"http://local.school.portnov.com:4520/#/registration"
    Then Type FirstName "Andrew" into firstname field with xpath"//input[@placeholder='First Name']"
    Then Type LastName "Pitt" into lastname field with xpath"//input[@placeholder='Last Name']"
    Then Type Email "1234567890123456789012345678901234567890123456789012345678901234@gmail.com" into email field with xpath"//input[@placeholder='Email']"
    Then Type Group ID "ASK"into group field with xpath"//input[@placeholder='Group Code']"
    Then Type Password "12345"into password field with xpath"//input[@placeholder='Password']"
    Then Type Confirm Password "12345" into confirm password field with xpath"//input[@placeholder='Confirm Password']"
    Then Push Register Me button with xpath"//button[@type='submit']"
    Then Verify if "You have been registered" message appears with xpath"//h4[contains(text(),'You have been Registered.')]"

  Scenario:Email-63 characters in first part of domain
    Given Navigate to registration page"http://local.school.portnov.com:4520/#/registration"
    Then Type FirstName "Andrew" into firstname field with xpath"//input[@placeholder='First Name']"
    Then Type LastName "Pitt" into lastname field with xpath"//input[@placeholder='Last Name']"
    Then Type Email "0hanilegro6@123456789012345678901234567890123456789012345678901234567890123.com" into email field with xpath"//input[@placeholder='Email']"
    Then Type Group ID "ASK"into group field with xpath"//input[@placeholder='Group Code']"
    Then Type Password "12345"into password field with xpath"//input[@placeholder='Password']"
    Then Type Confirm Password "12345" into confirm password field with xpath"//input[@placeholder='Confirm Password']"
    Then Push Register Me button with xpath"//button[@type='submit']"
    Then Verify if "You have been registered" message appears with xpath"//h4[contains(text(),'You have been Registered.')]"

  Scenario:Email-63 characters in last part of domain
    Given Navigate to registration page"http://local.school.portnov.com:4520/#/registration"
    Then Type FirstName "Andrew" into firstname field with xpath"//input[@placeholder='First Name']"
    Then Type LastName "Pitt" into lastname field with xpath"//input[@placeholder='Last Name']"
    Then Type Email "0hanilegro6@gmail.nameeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" into email field with xpath"//input[@placeholder='Email']"
    Then Type Group ID "ASK"into group field with xpath"//input[@placeholder='Group Code']"
    Then Type Password "12345"into password field with xpath"//input[@placeholder='Password']"
    Then Type Confirm Password "12345" into confirm password field with xpath"//input[@placeholder='Confirm Password']"
    Then Push Register Me button with xpath"//button[@type='submit']"
    Then Verify if "You have been registered" message appears with xpath"//h4[contains(text(),'You have been Registered.')]"

  Scenario:Email-65 characters in local part
    Given Navigate to registration page"http://local.school.portnov.com:4520/#/registration"
    Then Type FirstName "Andrew" into firstname field with xpath"//input[@placeholder='First Name']"
    Then Type LastName "Pitt" into lastname field with xpath"//input[@placeholder='Last Name']"
    Then Type Email "12345678901234567890123456789012345678901234567890123456789012345@gmail.com" into email field with xpath"//input[@placeholder='Email']"
    Then Type Group ID "ASK"into group field with xpath"//input[@placeholder='Group Code']"
    Then Type Password "12345"into password field with xpath"//input[@placeholder='Password']"
    Then Type Confirm Password "12345" into confirm password field with xpath"//input[@placeholder='Confirm Password']"
    Then Push Register Me button with xpath"//button[@type='submit']"
    Then Verify if "Should be a valid email address" message appears with xpath"//*[@class='mat-error ng-star-inserted']"

  Scenario:Email-64 characters in last part of domain name
    Given Navigate to registration page"http://local.school.portnov.com:4520/#/registration"
    Then Type FirstName "Andrew" into firstname field with xpath"//input[@placeholder='First Name']"
    Then Type LastName "Pitt" into lastname field with xpath"//input[@placeholder='Last Name']"
    Then Type Email "0hanilegro6@gmail.nameeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee" into email field with xpath"//input[@placeholder='Email']"
    Then Type Group ID "ASK"into group field with xpath"//input[@placeholder='Group Code']"
    Then Type Password "12345"into password field with xpath"//input[@placeholder='Password']"
    Then Type Confirm Password "12345" into confirm password field with xpath"//input[@placeholder='Confirm Password']"
    Then Push Register Me button with xpath"//button[@type='submit']"
    Then Verify if "Should be a valid email address" message appears with xpath"//*[@class='mat-error ng-star-inserted']"

  Scenario:Email-64 characters in first part of domain name
    Given Navigate to registration page"http://local.school.portnov.com:4520/#/registration"
    Then Type FirstName "Andrew" into firstname field with xpath"//input[@placeholder='First Name']"
    Then Type LastName "Pitt" into lastname field with xpath"//input[@placeholder='Last Name']"
    Then Type Email "0hanilegro6@domain1234567890123456789012345678901234567890123456789012345678.com" into email field with xpath"//input[@placeholder='Email']"
    Then Type Group ID "ASK"into group field with xpath"//input[@placeholder='Group Code']"
    Then Type Password "12345"into password field with xpath"//input[@placeholder='Password']"
    Then Type Confirm Password "12345" into confirm password field with xpath"//input[@placeholder='Confirm Password']"
    Then Push Register Me button with xpath"//button[@type='submit']"
    Then Verify if "Should be a valid email address" message appears with xpath"//*[@class='mat-error ng-star-inserted']"

  Scenario:Email-Cyrillic letters in local part
    Given Navigate to registration page"http://local.school.portnov.com:4520/#/registration"
    Then Type FirstName "Andrew" into firstname field with xpath"//input[@placeholder='First Name']"
    Then Type LastName "Pitt" into lastname field with xpath"//input[@placeholder='Last Name']"
    Then Type Email "дерек@gmail.com" into email field with xpath"//input[@placeholder='Email']"
    Then Type Group ID "ASK"into group field with xpath"//input[@placeholder='Group Code']"
    Then Type Password "12345"into password field with xpath"//input[@placeholder='Password']"
    Then Type Confirm Password "12345" into confirm password field with xpath"//input[@placeholder='Confirm Password']"
    Then Push Register Me button with xpath"//button[@type='submit']"
    Then  Verify if "Should be a valid email address" message appears with xpath"//*[@class='mat-error ng-star-inserted']"

  Scenario:Email-ASCII printable characters <@,">[()] in local part
    Given Navigate to registration page"http://local.school.portnov.com:4520/#/registration"
    Then Type FirstName "Andrew" into firstname field with xpath"//input[@placeholder='First Name']"
    Then Type LastName "Pitt" into lastname field with xpath"//input[@placeholder='Last Name']"
    Then Type Email "><@,[()]@gmail.com" into email field with xpath"//input[@placeholder='Email']"
    Then Type Group ID "ASK"into group field with xpath"//input[@placeholder='Group Code']"
    Then Type Password "12345"into password field with xpath"//input[@placeholder='Password']"
    Then Type Confirm Password "12345" into confirm password field with xpath"//input[@placeholder='Confirm Password']"
    Then Push Register Me button with xpath"//button[@type='submit']"
    Then  Verify if "Should be a valid email address" message appears with xpath"//*[@class='mat-error ng-star-inserted']"

  Scenario:Email-ASCII printable characters $!#%^&*_-+={}|'?/in domain name
    Given Navigate to registration page"http://local.school.portnov.com:4520/#/registration"
    Then Type FirstName "Andrew" into firstname field with xpath"//input[@placeholder='First Name']"
    Then Type LastName "Pitt" into lastname field with xpath"//input[@placeholder='Last Name']"
    Then Type Email "0hanilegro6@do$!#%^&*_-+={}|'?/main.com" into email field with xpath"//input[@placeholder='Email']"
    Then Type Group ID "ASK"into group field with xpath"//input[@placeholder='Group Code']"
    Then Type Password "12345"into password field with xpath"//input[@placeholder='Password']"
    Then Type Confirm Password "12345" into confirm password field with xpath"//input[@placeholder='Confirm Password']"
    Then Push Register Me button with xpath"//button[@type='submit']"
    Then  Verify if "Should be a valid email address" message appears with xpath"//*[@class='mat-error ng-star-inserted']"

  Scenario:Email-Space character in local-part
    Given Navigate to registration page"http://local.school.portnov.com:4520/#/registration"
    Then Type FirstName "Andrew" into firstname field with xpath"//input[@placeholder='First Name']"
    Then Type LastName "Pitt" into lastname field with xpath"//input[@placeholder='Last Name']"
    Then Type Email "0han ile gro6@gmail.com" into email field with xpath"//input[@placeholder='Email']"
    Then Type Group ID "ASK"into group field with xpath"//input[@placeholder='Group Code']"
    Then Type Password "12345"into password field with xpath"//input[@placeholder='Password']"
    Then Type Confirm Password "12345" into confirm password field with xpath"//input[@placeholder='Confirm Password']"
    Then Push Register Me button with xpath"//button[@type='submit']"
    Then Verify if "Should be a valid email address" message appears with xpath"//*[@class='mat-error ng-star-inserted']"

  Scenario:Email-Space character in domain name
    Given Navigate to registration page"http://local.school.portnov.com:4520/#/registration"
    Then Type FirstName "Andrew" into firstname field with xpath"//input[@placeholder='First Name']"
    Then Type LastName "Pitt" into lastname field with xpath"//input[@placeholder='Last Name']"
    Then Type Email "0hanilegro6@oft gamil.com" into email field with xpath"//input[@placeholder='Email']"
    Then Type Group ID "ASK"into group field with xpath"//input[@placeholder='Group Code']"
    Then Type Password "12345"into password field with xpath"//input[@placeholder='Password']"
    Then Type Confirm Password "12345" into confirm password field with xpath"//input[@placeholder='Confirm Password']"
    Then Push Register Me button with xpath"//button[@type='submit']"
    Then Verify if "Should be a valid email address" message appears with xpath"//*[@class='mat-error ng-star-inserted']"

  Scenario:Email-Two @@ characters in row
    Given Navigate to registration page"http://local.school.portnov.com:4520/#/registration"
    Then Type FirstName "Andrew" into firstname field with xpath"//input[@placeholder='First Name']"
    Then Type LastName "Pitt" into lastname field with xpath"//input[@placeholder='Last Name']"
    Then Type Email "0hanilegro6@@gmail.com" into email field with xpath"//input[@placeholder='Email']"
    Then Type Group ID "ASK"into group field with xpath"//input[@placeholder='Group Code']"
    Then Type Password "12345"into password field with xpath"//input[@placeholder='Password']"
    Then Type Confirm Password "12345" into confirm password field with xpath"//input[@placeholder='Confirm Password']"
    Then Push Register Me button with xpath"//button[@type='submit']"
    Then Verify if "Should be a valid email address" message appears with xpath"//*[@class='mat-error ng-star-inserted']"

  Scenario:Email-Without @ character
    Given Navigate to registration page"http://local.school.portnov.com:4520/#/registration"
    Then Type FirstName "Andrew" into firstname field with xpath"//input[@placeholder='First Name']"
    Then Type LastName "Pitt" into lastname field with xpath"//input[@placeholder='Last Name']"
    Then Type Email "0hanilegro6gmail.com" into email field with xpath"//input[@placeholder='Email']"
    Then Type Group ID "ASK"into group field with xpath"//input[@placeholder='Group Code']"
    Then Type Password "12345"into password field with xpath"//input[@placeholder='Password']"
    Then Type Confirm Password "12345" into confirm password field with xpath"//input[@placeholder='Confirm Password']"
    Then Push Register Me button with xpath"//button[@type='submit']"
    Then Verify if "Should be a valid email address" message appears with xpath"//*[@class='mat-error ng-star-inserted']"


  Scenario Outline:User-Email
    Given Navigate to registration page"http://local.school.portnov.com:4520/#/registration"
    Then Type FirstName "Andrew" into firstname field with xpath"//input[@placeholder='First Name']"
    Then Type LastName "Pitt" into lastname field with xpath"//input[@placeholder='Last Name']"
    Then Type Email "<Email>" into email field with xpath"//input[@placeholder='Email']"
    Then Type Group ID "ASK"into group field with xpath"//input[@placeholder='Group Code']"
    Then Type Password "12345"into password field with xpath"//input[@placeholder='Password']"
    Then Type Confirm Password "12345" into confirm password field with xpath"//input[@placeholder='Confirm Password']"
    Then Push Register Me button with xpath"//button[@type='submit']"
    Then Verify if "<Message>" message appears with xpath"<Xpath>"
    Examples:
      |         Email                                                                       |       Message                  |                        Xpath                       |
      | 0hanilegro6@gmail.com                                                               | You have been registered       | //h4[contains(text(),'You have been Registered.')] |
      | 0HANILEGRO6@GMAIL.COM                                                               | You have been registered       | //h4[contains(text(),'You have been Registered.')] |
      | a`~$!#%^&*_-+={}'?/@gmail.com                                                       | You have been registered       | //h4[contains(text(),'You have been Registered.')] |
      | 123456543@gamil.com                                                                 | You have been registered       | //h4[contains(text(),'You have been Registered.')] |
      | 0hanilegro6@123456543.com                                                           | You have been registered       | //h4[contains(text(),'You have been Registered.')] |
      | 1234567890123456789012345678901234567890123456789012345678901234@gmail.com          | You have been registered       | //h4[contains(text(),'You have been Registered.')] |
      | 0hanilegro6@123456789012345678901234567890123456789012345678901234567890123.com     | You have been registered       | //h4[contains(text(),'You have been Registered.')] |
      | 0hanilegro6@gmail.nameeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee   | You have been registered       | //h4[contains(text(),'You have been Registered.')] |
      | 12345678901234567890123456789012345678901234567890123456789012345@gmail.com         | Should be a valid email address| //*[@class='mat-error ng-star-inserted']           |
      | 0hanilegro6@domain1234567890123456789012345678901234567890123456789012345678.com    | Should be a valid email address| //*[@class='mat-error ng-star-inserted']           |
      | 0hanilegro6@gmail.nameeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee  | Should be a valid email address| //*[@class='mat-error ng-star-inserted']           |
      | дерек@gmail.com                                                                     | Should be a valid email address| //*[@class='mat-error ng-star-inserted']           |
      | ><@,[()]@gmail.com                                                                  | Should be a valid email address| //*[@class='mat-error ng-star-inserted']           |
      | 0hanilegro6@do$!#%^&*_-+={}'?/main.com                                              | Should be a valid email address| //*[@class='mat-error ng-star-inserted']           |
      | 0han ile gro6@gmail.com                                                             | Should be a valid email address| //*[@class='mat-error ng-star-inserted']           |
      | 0hanilegro6@oft gamil.com                                                           | Should be a valid email address| //*[@class='mat-error ng-star-inserted']           |
      | 0hanilegro6@@gmail.com                                                              | Should be a valid email address| //*[@class='mat-error ng-star-inserted']           |
      | 0hanilegro6gmail.com                                                                | Should be a valid email address| //*[@class='mat-error ng-star-inserted']           |


