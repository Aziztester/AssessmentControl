Feature: Serg Bells automated TCs

  Scenario: EndToEndTesting_3_17
    Given Navigate to login page
    When Type email "1suj@testerino.tk"
    And Type Password "12345"
    And Push Sign In button
    And Click on Quizzes on left navigational panel
#  // Create Quizz 1
    And Push Create new Quiz button
    And Type Title of the Quiz "SergBells TestQuiz_3_17_1"
    And Click Add Question
    And Select Single-Choice Type of question
    And Type text of Question "Single choice Question"
    And Type text in Options "Text of option 1" and "Text of option 2"
    And Select first option as correct answer
    And Push Save button
#  // Create Quizz 2
    And Push Create new Quiz button
    And Type Title of the Quiz "SergBells TestQuiz_3_17_2"
    And Click Add Question
    And Select Single-Choice Type of question
    And Type text of Question "Single choice Question"
    And Type text in Options "Text of option 1" and "Text of option 2"
    And Select first option as correct answer
    And Push Save button
#  // Create Quizz 3
    And Push Create new Quiz button
    And Type Title of the Quiz "SergBells TestQuiz_3_17_3"
    And Click Add Question
    And Select Single-Choice Type of question
    And Type text of Question "Single choice Question"
    And Type text in Options "Text of option 1" and "Text of option 2"
    And Select first option as correct answer
    And Push Save button
#  // Create Assignments
    And Click Assignments on left navigational panel
    And Push Create new Assignment button
    And Select Quiz "SergBells TestQuiz_3_17_1"
    And Select Student "Peter Petrov"
    And Push Give Assignment button
    And Push Create new Assignment button
    And Select Quiz "SergBells TestQuiz_3_17_2"
    And Select Student "Peter Petrov"
    And Push Give Assignment button
    And Push Create new Assignment button
    And Select Quiz "SergBells TestQuiz_3_17_3"
    And Select Student "Peter Petrov"
    And Push Give Assignment button
    And Click Logout on left navigational panel
#  // Verify Assignments
    And Type email "qbboy.yagami.32@highsite.store"
    And Type Password "12345"
    And Push Sign In button
    And Click My Assignments on left navigational panel
    Then Verify that SergBells TestQuiz "SergBells TestQuiz_3_17_1" was assigned
    Then Verify that SergBells TestQuiz "SergBells TestQuiz_3_17_2" was assigned
    Then Verify that SergBells TestQuiz "SergBells TestQuiz_3_17_3" was assigned
    And Click Logout on left navigational panel
#  // Login as teacher and delete Quizzes and Assignments
    And Type email "1suj@testerino.tk"
    And Type Password "12345"
    And Push Sign In button
    And Delete SergBells TestQuiz with name "SergBells TestQuiz_3_17_1"
    And Delete SergBells TestAssignments with name "SergBells TestQuiz_3_17_1"
    And Delete SergBells TestQuiz with name "SergBells TestQuiz_3_17_2"
    And Delete SergBells TestAssignments with name "SergBells TestQuiz_3_17_2"
    And Delete SergBells TestQuiz with name "SergBells TestQuiz_3_17_3"
    And Delete SergBells TestAssignments with name "SergBells TestQuiz_3_17_3"
