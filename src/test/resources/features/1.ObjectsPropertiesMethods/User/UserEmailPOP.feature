Feature: User Email ASK - 30

  @test1
  Scenario: ASK -860 User can create account with ANCII letters in email
    Given I open registration page
    When I fill registration form with ANCII letters in email
    Then I verify user was registered

  @test2
  Scenario: ASK - 861 User can create account with all upper case letters in email
    Given I open registration page
    When I fill registration form with all upper case letters in email
    Then I verify user was registered

  @test3
  Scenario: ASK - 862 User can create account with ASCII printable characters "`~$!#%^&*_-+={}|'?/" in
  local-part of email
    Given I open registration page
    When I fill registration form with ASCII printable characters
    Then I verify user was registered

  @test4
  Scenario: ASK - 863 User can create account with numbers in local-part of email
    Given I open registration page
    When I fill registration form with numbers in local-part of email
    Then I verify user was registered

  @test5
  Scenario: ASK 864 User can create account with numbers in domain name of email
    Given I open registration page
    When I fill registration form with numbers in domain name
    Then I verify user was registered

  @rest5
  Scenario: ASK 879 User can create account with email, consisting of 64 characters in local-part
  with 63 characters in first part of domain name and 63 characters in last part of domain name
    Given I open registration page
    When I fill registration form according to scenario
    Then I verify user was registered

  @test6
  Scenario: ASK 878 User cannot create account with 64 or more characters in last part of domain name of email
    Given I open registration page
    When I fill registration form with 64 or more characters in last part of domain name
    Then I verify error msg in email field

  @test7
  Scenario: ASK 876 User cannot create account with 65 or more characters in local-part of  email
    Given I open registration page
    When I fill registration form with 65 or more characters in local-part of  email
    Then I verify error msg in email field

  @test8
  Scenario: ASK 877 User cannot create account with 64 or more characters in first part of domain name of  email
    Given I open registration page
    When fill registration form with 64 or more characters in first part of domain name of  email
    Then I verify error msg in email field

  @test9
  Scenario: ASK 868 User cannot create account with Cyrillic letters
    Given I open registration page
    When fill registration form with Cyrillic letters
    Then I verify error msg in email field

  @test10
  Scenario: ASK 869 User cannot create account with ASCII printable characters "<@,">[()]"
  in local-part of email
    Given I open registration page
    When fill registration form with printable characters
    Then I verify error msg in email field

  @test11
  Scenario: ASK 870 User cannot create account with ASCII printable characters "$!#%^&*_-+={}|'?/"
  in domain name of email
    Given I open registration page
    When fill registration form with ASCII printable characters
    Then I verify error msg in email field

  @rest12
  Scenario: ASK 871 User cannot create account with space character in local-part of email
    Given I open registration page
    When fill registration form with space character in local-part of email
    Then I verify error msg in email field

  @test13
  Scenario: ASK 872 User cannot create account with space character in domain name of email
    Given I open registration page
    When fill registration form with space character in domain name of email
    Then I verify error msg in email field

  @test14
  Scenario: ASK 874 User cannot create account with two @@ characters in row in email
    Given I open registration page
    When fill registration form with two @@ characters in row in email
    Then I verify error msg in email field

  @test15
  Scenario: ASK 875 User cannot create account without @ character in email
    Given I open registration page
    When fill registration form without @ character in email
    Then I verify error msg in email field













