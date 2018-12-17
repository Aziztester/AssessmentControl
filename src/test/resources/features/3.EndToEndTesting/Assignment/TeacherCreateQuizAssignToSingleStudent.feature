Feature:Teacher create Quiz and assign it to single student and student get assignment




  Scenario:Login as Teacher

    Given Navigate to Web Page "URL"
    When I type E-mail in the "Email" field
    And I type Password in the "Password" field
    And I push "SignIn" button
#    //Then verify the page

#    // create Quiz

    When I click on "Quizzes"
#    //Then verify the page
    And I click on "Create Quizzes" button
    And I type the Title into a "Title of the Quiz" field
    Then I push add "Question"
    Then I push "Radio button" to select type of Question as Textual
    Then I type the "Question" as "What is Software Quality Assurance?"
    Then I check the "Showstopper" box
    Then I click on add "Question2" button
    Then I push "Radio button" to select type of Question as "Single Choice"
    Then I type the "Second Question"
    Then I type the "Option One" field
    Then I type "Option Two" Field
    Then I select "Radio Button" of option one
    Then I push add "Question" button
    Then I push "Radio Button" to select type of Question as "Multiple Choice" field
    Then I type the "Third Question" Field3
    Then I type "option one"
    Then I type "option two" Q3
    Then I push "checkbox button" of option two
    Then I push "checkbox button" of "Include "Other" text area option for this question"
    Then I push "save"
 #   //Assign to student
    Then I click on "Assignments" Field
    Then I push Create "New Assignment"
    Then I select the "Quiz to Assign" from list-option
    Then I select to "Quiz"
    And I assign to the student from list "Vladimir Vladimirov"
    Then I click "logout" button
#    //Login as Student
    When I login as "Student" with Email and password
    Then I Click on "Goto My Assignments" Page

#    Then I Adjust the "points" to "10"
#    Then I select the student from "Group filter" list-option
#    And I check Student "checkbox"
#    Then I click "Give Assisgnment" Button

#  Scenario: Login as Student

#    When I login as "Student" with Email "sbhonsle.ash@korutbete.cf" and password "12345"
#    Then I Click on "Goto My Assignments"
