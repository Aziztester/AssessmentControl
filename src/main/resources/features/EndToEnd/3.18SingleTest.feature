Feature: 3.18 Single Test
  @EndToEnd_3_18Test
  Scenario: Teacher creates 1 quiz and assign it to single student.Student pass an assigned Quiz.
  Teacher can see history of quizzes that was performed by student (User’s management).
    Given Navigate to login page
    And Type email "davidtestqaqa@gmail.com"
    And Type Password "davidtest111"
    And Push Sign In button
    And Click on Quizzes on left navigational panel
    #Create a quiz
    And Push Create new Quiz button
    And Type Title of the Quiz "PALOALTO"
    And Click Add Question
    And Select Single-Choice Type of question
    And Type text of Q1 "World?"
    And Type text in Options "Yes" and "No"
    And Select first option as correct answer
    And Push on Save button
    #Create assignment
    And Click Assignments on left navigational panel
    And Push Create new Assignment button
    And Select Quiz "PALOALTO"
    And Select Student "Dava Test"
    And Push Give Assignment button
    And Click Logout on left navigational panel
    #Login as a DAVA TEST
    And Type email "fmar@im-irsyad.tech"
    And Type Password "davadava"
    And Push Sign In button
    And Click My Assignments on left navigational panel
    And Push Go To Assessment button
    And Select the first option as correct answer
    And Push Submit My Answers button
    And Click Ok on Success pop-up message
    And Click Logout on the left navigation panel
    And Click Logout
    #Teacher get submission and deletes quiz
    And Type email "davidtestqaqa@gmail.com"
    And Type Password "davidtest111"
    And Push Sign In button
    And Click on Quizzes on left navigational panel
    And Click on Quiz "PALOALTO"
    And Delete the quiz at the end
    And Click on Assignments on left navigational panel
    And Click on Assignment "PALOALTO"
    And Confirm the pop out


    @PasswordVerify
    Scenario: Nata
      Given I open url"http://local.school.portnov.com:4520/#/login"
        When I type a Password "12345"
        And Select entered chars in password
        Then I right click



    
    









