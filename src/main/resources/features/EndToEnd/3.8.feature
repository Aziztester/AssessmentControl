Feature: 3.8
  @EndToEnd_3
  Scenario: Teacher creates Quiz with 3 Textual, 3 single-Choice, 3 Multiple-Choice questions
    When Navigate to login page
    And Type email "liskascottish@gmail.com"
    And Type Password "Masik0906"
    And Push Sign In button
    And Click on Quizzes on left navigational panel
# // Create Quiz
    And Push Create new Quiz button
    And Type Title of the Quiz "Testing from Teacher Liska"
# // Create 3 Textual Type of Questions
    And Click Add Question
    And Select Textual Type of Q1
    And Type text of question "What do you know about California?"
    And Click Add Question
    And Select Textual Type of Q2
    And Type text of question "What is the capital of California?"
    And Click Add Question
    And Select Textual Type of Q3
    And Type text of question "What is a population of California?"

# // Create 3 Single-Choice Type of Questions
    And Click Add Question
    And Select Single-Choice Type of Q4
    And Type text of question "What is quality?"
    And Type text in Option 1 "Actual result"
    And Type text in Option 2 "Expected result = Actual result"
    And Select Option 2 as correct answer
    And Select check-box Include "Other" text area option for this question

    And Click Add Question
    And Select Single-Choice Type of Q5
    And Type text of question "What is a bug?"
    And Type text in Option 1 "Mismatching"
    And Type text in Option 2 "Lady bug"
    And Select Option 1 as correct answer
    And Select check-box Include "Other" text area option for this question

    And Click Add Question
    And Select Single-Choice Type of Q6
    And Type text of question "Lollipop and KitKat is for what?"
    And Type text in Option 1 "Android"
    And Type text in Option 2 "Apple"
    And Select Option 1 as correct answer
    And Select check-box Include "Other" text area option for this question

# // Create 3 Multiple-Choice Questions
    And Click Add Question
    And Select Multiple-Choice Type of Q7
    And Type text of question "What is Regression Testing?"
    And Type text in Option 1 "testing done by users, not by testers"
    And Type text in Option 2 "testing after the code was modified"
    And Push Add Option button
    And Type text in Option 3 "partial retesting to make sure that no new errors were introduced"
    And Select Option 2 and 3 as correct answers
    And Select check-box Include "Other" text area option for this question

    And Click Add Question
    And Select Multiple-Choice Type of Q8
    And Type text of question "What is Functional Testing?"
    And Type text in Option 1 "Positive"
    And Type text in Option 2 "Negative"
    And Push Add Option button
    And Type text in Option 3 "API"
    And Select Option 1 and 2 as correct answers
    And Select check-box Include "Other" text area option for this question

    And Click Add Question
    And Select Multiple-Choice Type of Q9
    And Type text of question "What does Kernel do?"
    And Type text in Option 1 "Schedules tasks"
    And Type text in Option 2 "Manages data/file access and storage"
    And Push Add Option button
    And Type text in Option 3 "Translates commands entered by the user"
    And Select Option 1 and 2 as correct answers
    And Select check-box Include "Other" text area option for this question
    And Push Save button
    # //Verify and delete
    Then "Testing from Teacher Liska" appears in the "List of Quizzes" page
    Then Click on "Testing from Teacher Liska"
    And Push "Delete" button on the right side
    And Push "Delete" button on the Confirmation Pop-up


