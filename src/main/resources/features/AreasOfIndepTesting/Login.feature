@regression
Feature: Login

  @regression1
  Scenario: User provides valid combination of login and password (Happy path)

    Given I open URL "http://local.school.portnov.com:4520/#/login"
    When I type email "5cam@bskyb.ml"
    And I type Password "12345" in login page
    And I push "Sign In" button in login page
    Then user's name "Andrii" appears in left corner of the page

#  check if XPath and Idea of verification is correct in "Authentication failed" step
  @regression2
  Scenario: User provides valid login and invalid password

    Given I open URL "http://local.school.portnov.com:4520/#/login"
    When I type email "5cam@bskyb.ml"
    And I type Password "12346" in login page
    And I push "Sign In" button in login page
    Then error message "Authentication failed. User not found or password does not match" appears in login page

#  check if XPath and Idea of verification is correct in "Authentication failed" step
  @regression3
  Scenario: User provides invalid combination of a valid login (from User1) and a valid password (from User2)

    Given I open URL "http://local.school.portnov.com:4520/#/login"
    When I type email "5cam@bskyb.ml"
    And I type Password "xXUiqYfeTLid2qC" in login page
    And I push "Sign In" button in login page
    Then error message "Authentication failed. User not found or password does not match>" appears in login page

#  check if XPath and Idea of verification is correct in "Bullets appears" step
  @regression4
  Scenario: User provides Password and it masks with bullets

    Given I open URL "http://local.school.portnov.com:4520/#/login"
    When I type Password "12345" in login page
    Then Bullets appears in Password field

#
  @regression5
  Scenario: User tries to cut content from the 'Password' field,
  using right-mouse-click 'Cut' function

    Given I open URL "http://local.school.portnov.com:4520/#/login"
    When I type Password "12345" in login page
    And element Password with XPath "//*[@placeholder='Password *']" should have attribute "type" as "password"


  @regression6
  Scenario: User tries to copy content from the 'Password' field,
  using right-mouse-click 'Copy' function.
    Verify if type of web element is password.

    Given I open URL "http://local.school.portnov.com:4520/#/login"
    When I type Password "12345" in login page
    Then I inspect element "Password" on the page


  @regression7
  Scenario: User types white space before Email.
  Verify that entering a leading space in the Email field should result in an error message

    Given I open URL "http://local.school.portnov.com:4520/#/login"
    When I type email " 5cam@bskyb.ml"
    And I type Password "12345" in login page
    And I push "Sign In" button in login page
    Then error message "Should be a valid email address" appears under Email field
