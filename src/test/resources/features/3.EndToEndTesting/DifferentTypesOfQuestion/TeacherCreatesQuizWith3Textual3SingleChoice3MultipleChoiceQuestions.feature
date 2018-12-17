 Feature: Teacher creates Quiz with 3 Textual, 3 Single Choice and 3 Multiple Choice questions

Scenario: Login to Teacher's account
  Given I Opened url "http://local.school.portnov.com:4520/#/login"
  Then I logged in with Email "lfelipe@gag16dotw7t.tk" and password "12345"
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
  And I put the option as "6"
  Then I click on Add Question
  Then I choose type of question as "Single-Choice"
  Then I typed Question "What is 3 + 5 ?"
  Then I click on Add Question
  Then I choose type of question as "Single-Choice"
  Then I typed Question "What is 7 + 2 ?"
  Then I click on Add Question
  Then I choose type of question as "Multiple-Choice"
  Then I typed Question "90 is divisible by ?"
  Then I click on Add Question
  Then I choose type of question as "Multiple-Choice"
  Then I typed Question "70 is divisible by ?"
  Then I click on Add Question
  Then I choose type of question as "Multiple-Choice"
  Then I typed Question "40 is divisible by ?"
  Then I waited for "3" seconds









