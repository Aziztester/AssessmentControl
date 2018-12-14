Feature: Teacher creates Quiz and assign it for 5 individual students
  Scenario: Teacher creates Quiz and assign it for 5 individual students
    When I navigate to login page
    And I login as a teacher with email "umoha@jerapah993r.gq" and password "12345"
    And create new quiz
    And choose the quiz
    And assign quiz to "Elena Talley"
    And assign quiz to "Tina Turner"
    And assign quiz to "Barbra Streisand"
    And assign quiz to "Cherilyn Sarkisian"
    And assign quiz to "Louise Ciccone"
    And push assign button
    And push logout
    And login as a student with email "vmichele.maowe@r115pwhzofguwog.cf" and password "12345"
    Then verify that assignment was given
    And push logout
    And login as a student with email "fthayannemello.m2@lwwz3zzp4pvfle5vz9q.cf" and password "12345"
    Then verify that assignment was given
    And push logout

    And login as a student with email "wjhonatafellipea6@emdwgsnxatla1.gq" and password "12345"
    Then verify that assignment was given
    And push logout

    And login as a student with email "1po9iu8v@4xzotgbunzq.tk" and password "12345"
    Then verify that assignment was given
    And push logout

    And login as a student with email "qmarcos_26danort4@lbhuxcywcxjnh.gq" and password "12345"
    Then verify that assignment was given
    And push logout

    And I login as a teacher with email "umoha@jerapah993r.gq" and password "12345"
    And Delete quiz with name "quiz for assignment for 5 students"

    And Delete assignments with name "quiz for assignment for 5 students"







