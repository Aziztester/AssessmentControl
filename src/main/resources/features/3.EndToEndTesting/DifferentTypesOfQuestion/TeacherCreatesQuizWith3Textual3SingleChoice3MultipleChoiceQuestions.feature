Feature: Teacher creates Quiz with 3 Textual, 3 Single Choice and 3 Multiple Choice questions
  @EndToEnd
  Scenario: Login to Teacher's account
    Given I Opened url "http://local.school.portnov.com:4520/#/login"
    Then I logged in with Email "umoha@jerapah993r.gq" and password "12345"
    Then I click on Quizzes
    Then I click on Create Quizzes
    Then I clicked on Submit button
    Then I verify url "http://local.school.portnov.com:4520/#/quiz-builder"
    Then I write the Quiz title as "Mathematics"
    Then I click on Add Question
    Then I choose type of question as "Textual"
    Then I typed Question "What is 2 X 2 ?"
  #  And I clicked on Show Stopper check box
    Then I click on Add Question
    Then I choose type of question as "Textual"
    Then I typed Question "What is 3 X 3 ?"
    Then I click on Add Question
    Then I choose type of question as "Textual"
    Then I typed Question "What is 4 X 4 ?"
    Then I click on Add Question
    Then I choose type of question as "Single-Choice"
    Then I typed Question "What is 2 + 4 ?"