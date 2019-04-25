Feature: User-Password
  @EndToEnd_ASK372
  Scenario: Allowable characters: alphanumeric and special characters
    Given Navigate to login page
    And Click on Register Now button
    And I type First Name "Nat"
    And I type Last Name "Kir"
    And I type Email "5sobi.khan_alone0@topfivestars.fun"
    And I type Group Code "123"
    And I type Password "aB10!@#$%^&*(){}[]|?.,-_+=;:''~``§"
    And I type Confirm Password "aB10!@#$%^&*(){}[]|?.,-_+=;:''~``§"
    And I push button Register me
    Then Message "You have been Registered" appears


  @EndToEnd_ASK373
  Scenario: Password field is required - cannot be empty
    Given Navigate to login page
    And Click on Register Now button
    And I type First Name "Natasha"
    And I type Last Name "Kirusheva"
    And I type Email "0pola.michellp@fikrinhdyh.cf"
    And I type Group Code "123"
    And I push button Register me
    Then an error message "This field is required" for password field is displayed


  @EndToEnd_ASK385
  Scenario: Minimum (5) characters
    Given Navigate to login page
    And Click on Register Now button
    And I type First Name "Natasha"
    And I type Last Name "Kirusheva"
    And I type Email "0pola.michellp@fikrinhdyh.cf"
    And I type Group Code "123"
    And I type Password "12345"
    And I type Confirm Password "12345"
    And I push button Register me
    Then Message "You have been Registered" appears


  @EndToEnd_ASK375
  Scenario: Minimum-1 (4) characters
    Given Navigate to login page
    And Click on Register Now button
    And I type First Name "Natasha"
    And I type Last Name "Kirusheva"
    And I type Email "0pola.michellp@fikrinhdyh.cf"
    And I type Group Code "123"
    And I type Password "1234"
    And I type Confirm Password "1234"
    And I push button Register me
    Then Message "Too short. Should be at least 5 characters" displayed


  @EndToEnd_ASK386
  Scenario: Maximum (32) characters
      Given Navigate to login page
        And Click on Register Now button
        And I type First Name "Natasha"
        And I type Last Name "Kirusheva"
        And I type Email "0pola.michellp@fikrinhdyh.cf"
        And I type Group Code "123"
        And I type Password "stTKY}#*Ej+c+/.RGdR9E\bUJr[t&q2v"
        And I type Confirm Password "stTKY}#*Ej+c+/.RGdR9E\bUJr[t&q2v"
        And I push button Register me
        Then Message "You have been Registered" appears


  @EndToEnd_ASK376
  Scenario: Maximum+1 (33) characters
      Given Navigate to login page
        And Click on Register Now button
        And I type First Name "Natasha"
        And I type Last Name "Kirusheva"
        And I type Email "0pola.michellp@fikrinhdyh.cf"
        And I type Group Code "123"
        And I type Password "stTKY}#*Ej+c+/.RGdR9E\bUJr[t&q2v1"
        And I type Confirm Password "stTKY}#*Ej+c+/.RGdR9E\bUJr[t&q2v1"
        And I push button Register me
        Then Message "You have been Registered" appears


  @EndToEnd_ASK377
  Scenario: White spaces are not allowed
      Given Navigate to login page
        And Click on Register Now button
        And I type First Name "Natasha"
        And I type Last Name "Kirusheva"
        And I type Email "0pola.michellp@fikrinhdyh.cf"
        And I type Group Code "123"
        And I type Password "123^ 5"
        And I type Confirm Password "123^ 5"
        And I push button Register me
        Then an error message "Whitespaces are not allowed" for password field displayed


  @EndToEnd_ASK378
  Scenario: Password must match Confirm Password
      Given Navigate to login page
        And Click on Register Now button
        And I type First Name "Natasha"
        And I type Last Name "Kirusheva"
        And I type Email "0pola.michellp@fikrinhdyh.cf"
        And I type Group Code "123"
        And I type Password "1234567"
        And I type Confirm Password "1234567111"
        And I push button Register me
       Then an error message "Entered passwords should match" for confirm password field should displayed


  @EndToEnd_ASK383
  Scenario: Non allowable characters: Russian alphabet (Not ASCII)
      Given Navigate to login page
        And Click on Register Now button
        And I type First Name "Natasha"
        And I type Last Name "Kirusheva"
        And I type Email "0pola.michellp@fikrinhdyh.cf"
        And I type Group Code "123"
        And I type Password "привет"
        And I type Confirm Password "привет"
        And I push button Register me
        Then error message "Non allowable characters" should appears


    
        















