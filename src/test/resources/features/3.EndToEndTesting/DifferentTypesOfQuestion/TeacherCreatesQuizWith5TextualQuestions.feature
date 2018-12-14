Feature: Teacher creates Quiz with 5 Textual questions (ASK-1089)

  @Textual Teacher creates Quiz with 5 Textual questions (ASK-1089)
  Scenario: Teacher creates Quiz with 5 Textual questions (ASK-1089)
    Given Opened url "http://local.school.portnov.com:4520/#/login"
    And Type email address "umoha@jerapah993r.gq" and password "123456"
    Then Click on the "Sign in" button
    When Click the element "Quizzes"
    Then Click quiz "Create New Quiz"
    When Type the title of Quiz  "Textual Questions"
    And Click "Add Question"
    And Click Element "Textual"
    Then Typed Question "What is 2 X 2 ?"
    Then Click on Add Question
    Then Choose type of question as "Textual"
    And Type Question "What is 3 X 3 ?"
    Then Click on Add Question 3
    And Select type of question as "Textual"
    And Type 3 Question "What is 4 x 4?"
    Then Click  Add Question 4
    And Select "Textual"type of question
    And Type 4th Question "What is 5 x 5?"
    Then Click add Question 5
    And Select "Textual" type of question
    Then Type  Question "What is 5 x 5?"
    Then Click the "Save" button
    When Select the Quiz
    And Click Delete
    Then Click the string "Confirmation"






















