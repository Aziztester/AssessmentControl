Feature: 3.14
  @EndToEnd_3
  Scenario: Teacher creates Quiz, searches students by group and assign Quiz to the group
    When  Navigate to login page
    And Type email "7johnk@google-mail.ooo"
    And Type Password "12345"
    And Push Sign In button
    And Click on Quizzes on left navigational panel
#  // Create Quiz with 1 Single-Chioce question and 1 Textual question
    And Push Create new Quiz button
    And Type Title of the Quiz "Testing Assignment current date time 0310/10:28"
    And Click Add Question
    And Select Single-Choice Type of question
    And Type text of Question "What is SQA?"
    And Type text in Options "Software quality assurance" and "Software testing"
    And Select first option as correct answer
    And Click Add Question
    And Select Textual Type of question
    And Type text for Question "What is SDLC?"
    And Push on Save button
#  // Assign Quiz to group students
    And Click Assignments on left navigational panel
    And Push Create new Assignment button
    And Select Group "CAB"
    And Select "Testing Assignment current date time 0310/10:28" in Select Quiz to Assign dropdown list
    And Click Select All button at the right bottom
    And Push Give Assignment button
    And Click Logout on left navigational panel
#  // Student 1 "Dmitry Dmitriev" in Group "CAB"
    And Type email "enoreddineelarror@ccgtoxu3wtyhgmgg6.cf"
    And Type Password "12345"
    And Push Sign In button
    And Click My Assignments on left navigational panel
    Then Verify that quiz for "Testing Assignment current date time 0310/10:28" was assigned
    And Click Logout on left navigational panel
#  // Student 2 "Vladimir Vladimirov"in Group "CAB"
    And Type email "kaha.king@lqghzkal4gr.ml"
    And Type Password "12345"
    And Push Sign In button
    And Click My Assignments on left navigational panel
    Then Verify that quiz for "Testing Assignment current date time 0310/10:28" was assigned
    And Click Logout on left navigational panel
#  // Student 3 "David Davidov"in Group "CAB"
    And Type email "7said.elyamani.5x@payforclick.net"
    And Type Password "12345"
    And Push Sign In button
    And Click My Assignments on left navigational panel
    Then Verify that quiz for "Testing Assignment current date time 0310/10:28" was assigned
    And Click Logout on left navigational panel
#  // Student 4 "Vasiliy Vasilievna"in Group "CAB"
    And Type email "kaha.king@lqghzkal4gr.ml"
    And Type Password "12345"
    And Push Sign In button
    And Click My Assignments on left navigational panel
    Then Verify that quiz for "Testing Assignment current date time 0310/10:28" was assigned
    And Click Logout on left navigational panel
#  // Student 5 "Mickhail Portnov"in Group "CAB"
    And Type email "0tlemceni_redav@gzvmwiqwycv8topg6zx.cf"
    And Type Password "12345"
    And Push Sign In button
    And Click My Assignments on left navigational panel
    Then Verify that quiz for "Testing Assignment current date time 0310/10:28" was assigned
    And Click Logout on left navigational panel
#  // Login as teacher and delete Assignment
    And Type email "uproxy-stil503@8t0sznngp6aowxsrj.ml"
    And Type Password "12345"
    And Push Sign In button
    And Delete the quiz with name "Testing Assignment current date time 0310/10:28"
    And Delete assignment with quiz name "Testing Assignment current date time 0310/10:28"