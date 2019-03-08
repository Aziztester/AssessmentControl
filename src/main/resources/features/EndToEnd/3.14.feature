Feature: 3.14
  @EndToEnd_3
  Scenario: Teacher creates Quiz, searches students by group and assign Quiz to the group
    When  Navigate to login page
    And Type email "uproxy-stil503@8t0sznngp6aowxsrj.ml"
    And Type Password "12345"
    And Push Sign In button
    And Click on Quizzes on left navigational panel
#  // Create Quiz with 1 Single-Chioce question and 1 Textual question
    And Push Create new Quiz button
    And Type Title of the Quiz "Testing Assignment 11"
    And Click Add Question
    And Select Single-Choice Type of question
    And Type text of Question "What is SQA?"
    And Type text in Options "Software quality assurance" and "Software testing"
    And Select first option as correct answer
    And Click Add Question
    And Select Textual Type of question
    And Type text for Question "What is SDLC?"
    And Push Save button
#  // Assign Quiz to group students
    And Click Assignments on left navigational panel
    And Push Create new Assignment button
    And Select Group "ABC"
    And Select "Testing Assignment 11" in Select Quiz to Assign dropdown list
    And Click Select All button at the right bottom
    And Push Give Assignment button
    And Click Logout on left navigational panel
#  // Student 1 "Peter Petrov" in Group "ABC"
    And Type email "8demoo.ccd@mqkivwkhyfz9v4.ga"
    And Type Password "12345"
    And Push Sign In button
    And Click My Assignments on left navigational panel
    Then Verify that quiz "Testing Assignment 11" was assigned
    And Click Logout on left navigational panel
#  // Student 2 "Ivan Ivanov"in Group "ABC"
    And Type email "gtahermememeh@nhifswkaidn4hr0dwf4.ga"
    And Type Password "12345"
    And Push Sign In button
    And Click My Assignments on left navigational panel
    Then Verify that quiz "Testing Assignment 11" was assigned
    And Click Logout on left navigational panel
#  // Student 3 "Elena Talley"in Group "ABC"
    And Type email "lzakaria.saou@twlcd4i6jad6.ml"
    And Type Password "12345"
    And Push Sign In button
    And Click My Assignments on left navigational panel
    Then Verify that quiz "Testing Assignment 11" was assigned
    And Click Logout on left navigational panel
#  // Student 4 "Emma Smith"in Group "ABC"
    And Type email "7imane.jarfi.18c@igvaku.gq"
    And Type Password "12345"
    And Push Sign In button
    And Click My Assignments on left navigational panel
    Then Verify that quiz "Testing Assignment 11" was assigned
    And Click Logout on left navigational panel
#  // Student 5 "Sophia Jones"in Group "ABC"
    And Type email "gminhee.par@ttt72pfc0g.tk"
    And Type Password "12345"
    And Push Sign In button
    And Click My Assignments on left navigational panel
    Then Verify that quiz "Testing Assignment 11" was assigned
    And Click Logout on left navigational panel
#  // Login as teacher and delete Assignment
    And Type email "ksak.dody9@3g2bpbxdrbyieuv9n.cf"
    And Type Password "12345"
    And Push Sign In button
    And Delete quiz with name "Testing Assignment 11"
    And Delete assignments that assigned to Group "ABC" with quiz name "Testing Assignment 11"