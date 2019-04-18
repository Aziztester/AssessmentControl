Feature: 3.19
  Scenario: Teacher create Quiz with textual questions and assign it to single student.
  Student completes Quiz and teacher reviewed it. Student can see status of Quiz
   Given I open url"http://local.school.portnov.com:4520/#/login"
    Then Type email "dragonscorp1+2@gmail.com"
    And Type Password "Portnov"
    And Push Sign In button
    And Click on Quizzes on left navigational panel
    And Push "Create New Quiz" button
    And Type Title of the Quiz "Hello world"
    And Click Add Question
    And Select textual radio button
    And Type text in Question "How to Write 'Hello World' in Java"
#    And Click Add Question
#    And Select Textual Type of question
#    Then Type text of Q2 "Why QA"
    And Select Is Show Stopper question
    And Push on Save button
    Then Click My Assignments on left navigational panel
    And Push Create new Assignment button
    And Select Quiz "Hello world"
    And Select Student "Aziz Test"
    And Push Give Assignment button
    Then Click Logout on left navigational panel
    And Type email "dragonscorp1+1@gmail.com"
    And Type Password "Portnov"
    And Push Sign In button
    And Click My Assignments on left navigational panel
    And Click Go To Assessment button
    And Type "system.out.println('Hello world')" to Enter Your Answer
    And Push Submit My Answers button
    Then Click Logout on left navigational panel
    Then Type email "dragonscorp1+2@gmail.com"
    And Type Password "Portnov"
    And Push Sign In button
    And Click Submissions on left navigational panel
    And Push Grade button
    And Push "+" button to grade
    And Push "+" button to grade
    And Push Save button Q
    And Click on Quizzes on left navigational panel
    And Push on "Quiz" Hello World
    And Push on popup "Delete"
    And Click My Assignments on left navigational panel
    And Push button "three dots"
    And Push popup "Delete"








