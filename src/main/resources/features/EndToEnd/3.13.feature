Feature: 3.13
  @EndToEnd_3
  Scenario: Teacher creates Quiz and assign it for 5 individual students
    When  Navigate to login page
    And Type email "7johnk@google-mail.ooo"
    And Type Password "12345"
    And Push Sign In button
    And Click on Quizzes on left navigational panel
#  // Create Quiz
    And Push Create new Quiz button
    And Type Title of the Quiz "Testing Assignment Sofia"
    And Click Add Question
    And Select Single-Choice Type of question
    And Type text of Question "Single choice Question"
    And Type text in Options "Text of option 1" and "Text of option 2"
    And Select first option as correct answer
    And Push Save button
#  // Create Assignments
    And Click Assignments on left navigational panel
    And Push Create new Assignment button
    And Select Quiz "Testing Assignment Sofia"
    And Select Student "Peter Petrov"
    And Select Student "Ivan Ivanov"
    And Select Student "Elena Talley"
    And Push Give Assignment button
    And Click Logout on left navigational panel
#  // Student 1 "Peter Petrov"
    And Type email "8demoo.ccd@mqkivwkhyfz9v4.ga"
    And Type Password "12345"
    And Push Sign In button
    And Click My Assignments on left navigational panel
    Then Verify that quiz "Testing Assignment Sofia" was assign
    And Click Logout on left navigational panel
#  // Student 2 "Ivan Ivanov"
    And Type email "gtahermememeh@nhifswkaidn4hr0dwf4.ga"
    And Type Password "12345"
    And Push Sign In button
    And Click My Assignments on left navigational panel
    Then Verify that quiz "Testing Assignment Sofia" was assign
    And Click Logout on left navigational panel
#  // Student 3 "Elena Talley"
    And Type email "lzakaria.saou@twlcd4i6jad6.ml"
    And Type Password "12345"
    And Push Sign In button
    And Click My Assignments on left navigational panel
    Then Verify that quiz "Testing Assignment Sofia" was assign
    And Click Logout on left navigational panel
#  // Student 4 "Emma Smith"
    And Type email "7imane.jarfi.18c@igvaku.gq"
    And Type Password "12345"
    And Push Sign In button
    And Click My Assignments on left navigational panel
    Then Verify that quiz "Testing Assignment Sofia" was assign
    And Click Logout on left navigational panel
#  // Student 5 "Sophia Jones"
    And Type email "gminhee.par@ttt72pfc0g.tk"
    And Type Password "12345"
    And Push Sign In button
    And Click My Assignments on left navigational panel
    Then Verify that quiz "Testing Assignment Sofia" was assign
    And Click Logout on left navigational panel
#  // Login as teacher and delete Assignment
    And Type email "ksak.dody9@3g2bpbxdrbyieuv9n.cf"
    And Type Password "12345"
    And Push Sign In button
    And Delete quiz with name "Testing Assignment Sofia"
    And Delete assignments with name "Testing Assignment Sofia"
