@ObjectsPropertiesMethods
Feature: User-First Name

  Scenario: User-First Name - AlphaNumeric and sp char
    Given I open url "http://local.school.portnov.com:4520/#/registration"
    Then  I type First Name: "Dian+@-&1"
    And   I type Last Name: "Brown"
    And   I type Email: "1suj@testerin.tk"
    And   I type Group Code: "001"
    And   I type Password:"12345"
    And   I type Confirm Password: "12345"
    And   Push Register Me button
    Then "You have been registered" is displayed
    Then  I open url"http://local.school.portnov.com:4520/#/login"
    And I type Email: "1suj@testerin.tk"
    And I type Password:"12345"
    And Push Sign In button
    And Click "Users Management" on left navigation panel
    And Click "Teachers"
    And Look for user "Diana Brown" and click
    And Push "Options"
    Then Push "Delete User" option

  Scenario: User-First Name - Required field
    Given  I open url "http://local.school.portnov.com:4520/#/registration"
    Then   I type Last Name: "Brown"
    And    I type Email: "1suj@testerio.tk"
    And    I type Group Code: "001"
    And    I type Password:"12345"
    And    I type Confirm Password: "12345"
    And    Push "Register Me" button
    Then   "This field is required" message is displayed under "First Name"

  Scenario: User-First Name - Min characters
    Given  I open url "http://local.school.portnov.com:4520/#/registration"
    Then   I type First Name: "A"
    And    I type Last Name: "I"
    And    I type Email: "1suj@testerno.tk"
    And    I type Group Code: "001"
    And    I type Password:"12345"
    And    I type Confirm Password: "12345"
    And    Push "Register Me" button
    Then "You have been registered" is displayed
#    Then I open url "http://local.school.portnov.com:4520/#/login"
#    And I type Email: "1suj@testerin.tk"
#    And I type Password:"12345"
#    And Push Sign In button
#    And Click "Users Management" on left navigation panel
#    And Click "Teachers"
#    And Look for user "Diana Brown" and click
#    And Push "Options"
#    Then Push "Delete User" option



  Scenario: User-First Name - Max characters
    Given  I open url "http://local.school.portnov.com:4520/#/registration"
    Then   I type First Name: "Diana+@&1ppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp"
    And    I type Last Name: "Brown"
    And    I type Email: "1suj@teterino.tk"
    And    I type Group Code: "001"
    And    I type Password:"12345"
    And    I type Confirm Password: "12345"
    And    Push "Register Me" button
    Then "You have been registered" is displayed
#    Then I open url "http://local.school.portnov.com:4520/#/login"
#    And I type Email: "1suj@testerin.tk"
#    And I type Password:"12345"
#    And Push Sign In button
#    And Click "Users Management" on left navigation panel
#    And Click "Teachers"
#    And Look for user "Diana Brown" and click
#    And Push "Options"
#    Then Push "Delete User" option


  Scenario: User-First Name - Max+1 characters
    Given  I open url "http://local.school.portnov.com:4520/#/registration"
    Then   I type First Name: "Diana+@-&pppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp"
    And    I type Last Name: "Brown"
    And    I type Email: "1suj@testerino.tk"
    And    I type Group Code: "001"
    And    I type Password:"12345"
    And    I type Confirm Password: "12345"
    And    Push "Register Me" button
    Then   "Data too long for column 'name' at row 1" message appears


  Scenario:User-First Name - White spaces
    Given  I open url "http://local.school.portnov.com:4520/#/registration"
    Then   I enter FirstName:" "
    And    Click on "Last Name" field
    Then   "Whitespaces are not allowed" message appears under the "First Name field"


  Scenario: User-First Name- Leading White spaces
    Given  I open url "http://local.school.portnov.com:4520/#/registration"
    Then   I type " Diana"
    And    Click on "Last Name" field
    Then   "Whitespaces are not allowed" message appears under the "First Name field"


  Scenario: User-First Name - Trailing White spaces
    Given  I open url "http://local.school.portnov.com:4520/#/registration"
    Then   I type "Diana "
    And    Click on "Last Name" field
    Then   "Whitespaces are not allowed" message appears under the "First Name field"
