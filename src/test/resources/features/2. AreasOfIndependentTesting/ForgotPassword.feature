Feature: Automate TCs for Forgot Password

  Scenario: User Email exists in database
    #ASK-955
    Given open page
    And click on forgot password link k
    And type email to the field
    And click on reset password button
    And error message appears

@open
  Scenario: User Email required
    Given open page secon time
    And just click on reset password button
    And I click on request a password
    And it shows error that email required
@reset
  Scenario: User valid Email address
    Given I open a test url
    And click on forgot password linkk
    And I type my email address into email field
    And I push Request Password Reset button
    And I open my email web page
    And I login in
    And I open a message from assessmentdotportnovatgmaildotcom
    And I click on the reseting password link
    And I enter a new password twice and push Reset button
    Then I push a login back button
    And Type my email addres with a new password
    And push sign in button

@invalidemail
  Scenario: User invalid Email address
    Given I open a test url l
    And I push forgot my password
    And I type invalid email address
    And I push Request password Reset

@oldpassword
Scenario: Enter old passwod
  Given I open a test url ll
  And click on forgot password linkkk
  And I type my email address into email field d
  And I push Request Password Reset button n
  And I open my email web page e
  And I enter old password twice and push Reset button n
  And Error message appears there
#  Then I push a login back button
#  And Type my email addres with a new password
#  And push sign in button
