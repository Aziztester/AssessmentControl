Feature: Textual Question in JAVA ASK-132
  # MAKE SURE quiz   contains "$$000SQA1" does not exist at the top List of Quizzes!
  # If so delete those before run the tests

  @test1
  Scenario: Alphanumerical and special characters input  - ASK-149
    Given I go to Login page and login as a teacher
    When I create a quiz with text "Aa1$#"
    Then I verify that the quiz is in the List of Qiuzzes
    And I delete the quiz

  @test2
  Scenario: Single character input - ASK-135
    Given I go to Login page and login as a teacher
    When I create a quiz with text "k"
    Then I verify that the quiz is in the List of Qiuzzes
    And I delete the quiz

  @test3
  Scenario: 1000 characters input - ASK 561
    Given I go to Login page and login as a teacher
    When I create a quiz with 1000 characters
    Then I verify that the quiz is in the List of Qiuzzes
    And I delete the quiz

  @test4
  Scenario:  Required field - ASK 152
    Given I go to Login page and login as a teacher
    When I create a quiz with empty text field
    Then I verify there is an error message

  @test5
  Scenario:  Leading spaces ASk - 556
    Given I go to Login page and login as a teacher
    When I create a quiz with text "   LeadingSpace"
    Then I verify that the leading spaces was truncated
    And  I delete the quiz with leading spaces

  @test6
  Scenario:  TrailingSpace ASK-557
    Given I go to Login page and login as a teacher
    When I create a quiz with trailing space
    Then I verify than the trailing spaces was truncated
    And I delete the truncated quiz

  @test7
  Scenario: Whitespaces inside  ASK-558
    Given I go to Login page and login as a teacher
    When I create a quiz with Whitespaces inside
    Then I verify that the whitespaces was truncated
    And I delete quiz with spaces

  @test8
  Scenario:  Whitespaces only ASK - 560
    Given I go to Login page and login as a teacher
    And I create a quiz with whitespaces only
    Then I verify if the quiz was created

  @test9
  Scenario: Max char+1 (1001) ASK -562
    Given I go to Login page and login as a teacher
    When I create a quiz with one thousand and one characters
    Then I verify if quiz with one thousand and one characters was created

  @test10
  Scenario: Switching to the next line with Enter ASK - 564
    Given I go to Login page and login as a teacher
    When I create a quiz switching to the next line with Enter
    Then I verify if text is written in one line
    And I delete created quiz

    @test11
    Scenario: Deleting quizzes
      Given I go to Login page and login as a teacher
      When I delete quizzes

      @testPOPP
      Scenario: Popp
        Given I open urllll







