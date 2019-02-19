Feature: Textual Question - Text
  Scenario: Text - Alphanumeric and Special Characters
    When Navigate to login page
    And Type email "ksak.dody9@3g2bpbxdrbyieuv9n.cf"
    And Type Password "12345"
    And Push Sign In button
    And Click on Quizzes on left navigational panel
#  // Create Quiz
    And Push Create new Quiz button
    And Type Title of the Quiz "Alphanumeric and Special Characters"
    And Click Add Question
    And Select textual radio button
    And Type in Question "Az#@$%*!"
    And Push Save button
    Then Verify if Quiz "Alphanumeric and Special Characters" appears in the List of Quizzes
    And Delete Quiz "Alphanumeric and Special Characters"