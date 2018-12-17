Feature: Teacher create Quiz and assign it to single student,Student complete quiz and Teacher annotate question in quiz,student can see each annotation (ASK-1033)

  @vladimir1
  Scenario: Teacher create Quiz and assign it to single student,Student complete quiz and Teacher annotate question in quiz,student can see each annotation (ASK-1033)
    Given V get url "http://local.school.portnov.com:4520/#/login"
    When V login as teacher "umoha@jerapah993r.gq" with password "12345"
    And V open quizzes list
    And V delete quiz "Software Testing 1", if present
    And V create quiz "Software Testing 1"
    And V choose textual question type for question "1"
    And V create textual question "What is Software Testing?" number "1"
    And V create last textual question "What is Software Quality Assurance?" number "2"
    And V save
    And V wait for 500 msec
    And V open Assignments list
    And V delete all assignments of quiz "Software Testing 1" for student "Sophia Jones", if exist
    And V wait for 1000 msec
    And V click on element with xpath "//*[contains(text(),'Create New Assignment')]/.."
    And V wait for 500 msec
    And V wait for "//h4[contains(text(),'Give Assignment')]"
    And V wait for 500 msec
    And V assign quiz "Software Testing 1" to student "Sophia Jones"
    And V logout
    When V login as student "rwqnono2@rdyn171d60tswq0hs8.cf" with password "12345"
    And V wait for 500 msec
    And V click on element with xpath "//h5[contains(text(),'My Assignments')]"
    And V wait for "//h4[contains(text(),'My Assignments')]"
    And V go to assessment, quiz "Software Testing 1"
    And V type text answer "Answer 1" for question "1"
    And V type text answer "Answer 2" for question "2"
    And V click on element with xpath "//*[contains(text(),'Submit My Answers')]/.."
    And V click on element with xpath "//*[contains(text(),'Ok')]/.."
    And V wait for "//h4[contains(text(),'My Assignments')]"
    And V logout
    When V login as teacher "umoha@jerapah993r.gq" with password "12345"
    And V wait for 500 msec
    And V open Submissions list
    And V go to last Grade of Quiz "Software Testing 1" of Student "Sophia Jones" and put the comments
    And V wait for 1000 msec
    And V logout
    When V login as student "rwqnono2@rdyn171d60tswq0hs8.cf" with password "12345"
    And V click on element with xpath "//h5[contains(text(),'My Grades')]"
    Then V go to details of my last Grade of Quiz "Software Testing 1" and verify Teacher's comments
    When V logout
    And V login as teacher "umoha@jerapah993r.gq" with password "12345"
    And V open Assignments list
    And V delete all assignments of quiz "Software Testing 1" for student "Sophia Jones", if exist
    And V open quizzes list
    And V delete quiz "Software Testing 1", if present



    And V wait for 3000 msec

