@predefined
Feature: Functional testing

  @predefined1
  Scenario: User creates an account using Alphanumeric and Special characters in Group Code.

    Given I open URL "http://local.school.portnov.com:4520/#/registration"
    When I type First name "Natalka"
    And I type Last name "Kirushka"
    And I type Email "lsaleem_85@myloans.space"
    And I type Group Code "!3rQ&0"
    And I type Password "qwert"
    And I type Confirm Password "qwert"
    And I push "Register Me" button
    Then "You have been Registered" successful message appears


  @predefined2
  Scenario: User creates an account with empty Group Code

    Given I open URL "http://local.school.portnov.com:4520/#/registration"
    When I type First name "Natalka"
    And I type Last name "Kirushka"
    And I type Email "lsaleem_85@myloans.space"
    And I type Password "qwert"
    And I type Confirm Password "qwert"
    And I push "Register Me" button
    Then Error message "This field is required" appears under Group code field


  @predefined3
  Scenario: User creates an account with Group Code contains min 1 character

    Given I open URL "http://local.school.portnov.com:4520/#/registration"
    When I type First name "Natalka"
    And I type Last name "Kirushka"
    And I type Email "lsaleem_85@myloans.space"
    And I type Group Code "A"
    And I type Password "qwert"
    And I type Confirm Password "qwert"
    And I push "Register Me" button
    Then "You have been register" message appears


  @predefined4
  Scenario: User creates an account with Group code contains 6 characters.

    Given I open URL "http://local.school.portnov.com:4520/#/registration"
    When I type First name "Natalka"
    And I type Last name "Kirushka"
    And I type Email "lsaleem_85@myloans.space"
    And I type Group Code "!3rQ&0"
    And I type Password "qwert"
    And I type Confirm Password "qwert"
    And I push "Register Me" button
    Then "You have been register" message appears


  @predefined5
  Scenario: User creates an account with Group Code which contains 7 characters.

    Given I open URL "http://local.school.portnov.com:4520/#/registration"
    When I type First name "Nata"
    And I type Last name "Kirka"
    And I type Email "nata.kirka@gmail.com"
    And I type Group Code "asd1237"
    When I move input focus to password
    Then Error message "Too long. Should be no more than 6 characters" appears under field Group Code

#Do not pass, because of a bug in application
  @predefined6
  Scenario: User create an account with Group Code which contains white spaces.

    Given I open URL "http://local.school.portnov.com:4520/#/registration"
    When I type First name "Natasha"
    And I type Last name "K"
    And I type Email "natasha.k@gmail.com"
    And I type Group Code " 56 t?"
    And I type Password "asdfg"
    And I type Confirm Password "asdfg"
    And I push "Register Me" button
    Then Error WhiteSpace message "White spaces are not allowed" appears under field Group Code
