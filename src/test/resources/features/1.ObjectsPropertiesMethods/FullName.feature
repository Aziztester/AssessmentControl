Feature: Full Name ASK - 622

  @test1
  Scenario: First Name - Leading space ASK - 625
    Given I go to Login page and login as a teacher
    When I change name to "Ivan*? Iv@n0v"
    Then I verify that the name was changed
    And I change name back to "Olga Petrova"

  @test2
  Scenario: First Name (Single char) + Last Name (Single char) ASK - 627
    Given I go to Login page and login as a teacher
    When I change name to "I I"
    Then I verify that the name was changed "I I"
    And I change name back to "Olga Petrova"

  @test3
  Scenario: Max characters First Name ASK - 630
    Given I go to Login page and login as a teacher
    When I change name to the name with max characters
    Then I verify that the name was changed to the name with max characters
    And I change name back to "Olga Petrova"

  @test4
  Scenario: Max Characters Last Name ASK - 631
    Given I go to Login page and login as a teacher
    When I change name to the name with max char in Last Name
    Then  I verify that the name was changed to the name with Max Characters Last Name
    And I change name back to "Olga Petrova"

  @test5
  Scenario: Single character input ASK - 628
    Given I go to Login page and login as a teacher
    When I change name to "I " and press Tab
    And I verify that there is an error message

  @test6
  Scenario: Zero character input / Required field ASK - 629
    Given I go to Login page and login as a teacher
    When I change name to Zero character input and press Tab
    And I verify that there is an error msg

  @test7
  Scenario: First Name (Max character +1) + Last Name (1 char) ASK - 632
    Given I go to Login page and login as a teacher
    When I change name to First Name Max character plus one  and Last Name one char and press Tab
    And I verify that there is an error msg Too long

  @test8
  Scenario: First Name (1 char) + Last Name (Max character +1) ASK - 633
    Given I go to Login page and login as a teacher
    When I change name to First name one character and Last Name Max char plus one and press Tab
    And I verify that there is an error msg Too long

  @test9
  Scenario: First Name - Leading space ASK - 634
    Given I go to Login page and login as a teacher
    When I change name to the name with leading space
    And I verify that there is an error message

  @test10
  Scenario: Last Name - Trailing spaces ASK - 635
    Given I go to Login page and login as a teacher
    When I change name to the name with trailing space
    And I verify that there is an error message

  @test11
  Scenario: Full Name - Three parts ASK - 636
    Given I go to Login page and login as a teacher
    When I change name to the name with Three parts
    And I verify that there is an error message

  @test12
  Scenario: Two spaces between First and Last Names ASK - 641
    Given I go to Login page and login as a teacher
    When I change name to the name with Two spaces between
    And I verify that there is an error message

  @test13
  Scenario: Spaces ASK - 640
    Given I go to Login page and login as a teacher
    When I change name to the name with space
    And I verify that there is an error message






