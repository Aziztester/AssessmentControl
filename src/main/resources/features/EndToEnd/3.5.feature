Feature: 3.5
  @EndToEnd_3
  Scenario: Teacher creates Quiz with 5 multiple choice question
    When  Navigate to login page
    And Type email "uproxy-stil503@8t0sznngp6aowxsrj.ml"
    And Type Password "12345"
    And Push Sign In button
    And Click on Quizzes on left navigational panel
#  // Create Quiz
    And Push Create new Quiz button
    And Type Title of the Quiz "Manual Testing"
    And Click Add Question
    And Select Multiple-Choice Type of question
    And Type text of Question "Question 1"
    And Push Add option button 2 time
    And Type text in Options "Answer 1" and "Answer 2" and "Answer 3" and "Answer 4"
    And Select second and third option as correct answer
    And Push add question
# // Add question 2
    And Select Multiple-Choice Type of question
    And Type text of Question "Question 2"
    And Push Add option button 2 time
    And Type text in Options "Value 1" and "Value 2" and "Value 3" and "Value 4"
    And Select First and third option as correct answer
    And Push add question
# // Add question 3
    And Select Multiple-Choice Type of question
    And Type text of Question "Question 3"
    And Push Add option button 2 time
    And Type text in Options "Answer 1" and "Answer 2" and "Answer 3" and "Answer 4"
    And Select Second and Forth option as correct answer
    And Push add question
# // Add question 4
    And Select Multiple-Choice Type of question
    And Type text of Question "Question 4"
    And Push Add option button 2 time
    And Type text in Options "Option 1" and "Option 2" and "Option 3" and "Option 4"
    And Select First and Second option as correct answer
    And Push add question
# // Add question 5
    And Select Multiple-Choice Type of question
    And Type text of Question "Question 5"
    And Push Add option button 2 time
    And Type text in Options "Number 1" and "Number 2" and "Number 3" and "Number 4"
    And Select Third and Forth option as correct answer
    And Push Save button
    Then It should appear "Manual Testing" in List of quizzes
    Then Click on "Manual Testing"
    And Push to delete button on the right
    And Push Delete button on confirmation box

