Feature: Teacher create new quiz with Single-Choice question  and assign it to student and also can see in "List of Assignments"

  Scenario: Teacher creates quiz with Single-choice question and assign to single student
    Given navigate to teacher "login" page
    And create quiz with "Single-choice" question
    And "assign" it to a single student
    And teacher delete the "quiz"
    And teacher also delete the "assignment"
    And then "logout"

  Scenario: Teacher creates quiz with Single-choice question and assign to five students
    Given navigate to teacher "login" page
    And create quiz with "Single-choice" question
    Then assign it to "five" students
    And teacher delete the "quiz"
    And teacher also delete the "assignment"
    And then "logout"


  Scenario: Teacher creates quiz with Single-choice question and assign to all students
    Given navigate to teacher "login" page
    And create quiz with "Single-choice" question
    Then assign it to "allstudents"
    And teacher delete the "quiz"
    And teacher also delete the "assignment"
    And then "logout"

