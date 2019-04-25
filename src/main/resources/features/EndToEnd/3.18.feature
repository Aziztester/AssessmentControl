Feature: 3.18
  @EndToEnd_3_18
  Scenario: Teacher creates 3 quizzes and assign it to single student.Student pass all assigned Quiz. Teacher can see history of Quizzes that was performed by student (User’s management).
    Given Navigate to login page
    And Type email "davidtestqaqa@gmail.com"
    And Type Password "davidtest111"
    And Push Sign In button
    And Click on Quizzes on left navigational panel
    #Create a quiz 1
    And Push Create new Quiz button
    And Type Title of the Quiz "Soccerone"
    And Click Add Question
    And Select Single-Choice Type of question
    And Type text of Q1 "England"
    And Type text in Options "Option Yes1" and "Option No1"
    And Select first option as correct answer
    And Push on Save button
    #Create a quiz 2
    And Push Create new Quiz button
    And Type Title of the Quiz "Soccertwo"
    And Click Add Question
    And Select Single-Choice Type of question
    And Type text of Q1 "Germany"
    And Type text in Options "Option Yes2" and "Option No2"
    And Select first option as correct answer
    And Push on Save button
    #Create a quiz 3
    And Push Create new Quiz button
    And Type Title of the Quiz "Soccerthree"
    And Click Add Question
    And Select Single-Choice Type of question
    And Type text of Q1 "Denmark"
    And Type text in Options "Option Yes3" and "Option No3"
    And Select first option as correct answer
    And Push on Save button
    #Create Assignments
    And Click Assignments on left navigational panel
    And Push Create new Assignment button
    And Select Quiz "Soccerone"
    And Select Student "Dava Test"
    And Push Give Assignment button
    And Push Create new Assignment button
    And Select Quiz "Soccertwo"
    And Select Student "Dava Test"
    And Push Give Assignment button
    And Push Create new Assignment button
    And Select Quiz "Soccerthree"
    And Select Student "Dava Test"
    And Push Give Assignment button
    And Click Logout on left navigational panel
    #Student Dava Test
    And Type email "fmar@im-irsyad.tech"
    And Type Password "davadava"
    And Push Sign In button
    And Click My Assignments on left navigational panel
    And Push Go To Assessment button
    And Click quiz "Soccerone" from the list of Assignments
    And Click Option 1 radiobutton
    And Push Submit My Answers button
    And Click Ok on Success pop-up message
    And Click quiz "Soccertwo" from list of Assignments
    And Click Option 1 from options list
    And Push Submit My Answers button
    And Click Ok on Success pop-up message
    And Click quiz "Soccerthree" in Assignments
    And I click Option 1 from options
    And Push Submit My Answers button
    And Click Ok on Success pop-up message
    And Click Logout on left navigational panel
    #Teacher get submissions and delete quizzes
    And Type email "davidtestqaqa@gmail.com"
    And Type Password "davidtest111"
    And Push Sign In button
    And Click Submissions on left navigational panel
    And Click Automatically Graded tab
    Then Verify that Quiz "Soccerone" was submitted by student
    And Delete assignment with quiz name "Soccerone"
    Then Verify if Quiz "Soccertwo" was submitted by student
    And Delete assignment with quiz name "Soccertwo"
    Then Verify if Quiz "Soccerthree" was submit by student
    And Delete quiz with name "Soccerthree"


    @StudentCheckLogin
    Scenario: Test on Student side
      Given Navigate to login page
      And Type email "fmar@im-irsyad.tech"
      And Type Password "davadava"
      And Push Sign In button
      And Click My Assignments on left navigational panel
      #Then Verify that quiz "Soccerone" was assigned in the list
      And Click on Go To Assessment button with a name "Soccerone"
      And Select Option first as correct
      And Push Submit My Answers button
      And Click Ok on Success pop-up message
