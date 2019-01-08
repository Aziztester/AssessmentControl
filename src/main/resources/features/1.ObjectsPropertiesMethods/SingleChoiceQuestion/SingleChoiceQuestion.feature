@ObjectPropertiesMethods
Feature: Single Choice Question - Text

  Scenario: Single Choice Question - Text - Alphanumerical & Sp. char. (Happy path)
    Given  Navigate to login page  "login"
    Then I create quiz with Alphanumerical and special character "happy" path
    Then I verify the quiz present in "quizlist"
    And I delete the "quiz"

  Scenario: Single Choice Question - Text - Single char
    Given  Navigate to login page  "login"
    Then  I click on Create New quiz and create question as "Single Char"
    And I verify  that the quiz present in "quizlist"
    And  I delete the "quiz"

  Scenario: Single Choice Question - Text. Zero character input/Required field
    Given  Navigate to login page  "login"
    Then create quiz entering "zero char" in question
    And verify the "error message"

  Scenario:Single Choice Question - Text - Leading space
    Given  Navigate to login page  "login"
    Then enter a question with "leading space" in quiz
    Then I check whether the quiz present in "quizlist"
    And  I delete the "quiz"


  Scenario: Single Choice Question - Text - Trailing space
    Given  Navigate to login page  "login"
    And create quiz with "trailing" space in the question
    Then I check whether the quiz present in "quizlist"
    And  I delete the "quiz"


  Scenario: Single Choice Question - Text - Space characters inside
    Given  Navigate to login page  "login"
    And create question with "space char" inside
    Then I check whether the quiz present in "quizlist"
    And  I delete the "quiz"


  Scenario: Single Choice Question - Text - Only Whitespaces
    Given  Navigate to login page  "login"
    Then create question that has "whitespace" inside
    Then I check whether the quiz present in "quizlist"
    And  I delete the "quiz"


  Scenario: Single Choice Question - Text - Max characters
    Given  Navigate to login page  "login"
    Then I create single choice question with "max" characters
    Then I check whether the quiz present in "quizlist"
    And  I delete the "quiz"


  Scenario: Single Choice Question - Text - Max+1 characters
    Given  Navigate to login page  "login"
    Then I create  question with "more"  characters
    Then I check whether the quiz present in "quizlist"
    And  I delete the "quiz"