Feature: Teacher create 3 quizzes and assign to single student
  and teacher see the history of quizzes that performed by student.

    Scenario: teacher creates three quizzes(Single-choice and Multiple Choice)
    Given  Navigate to login page "login"
    Then teacher create  "firstquiz"
    Then teacher also create "secondquiz"
    And then last "thirdquiz"
    And teacher "assigns" three quizes to a single student
    And teacher "logout"

    Scenario: student login and complete the assignment
    And student "login"
    Then student answer "firstassignment"
    Then also answered "secondassignment"
    And student answered "thirdassignment"
    And student able "logout"

    Scenario: teacher view the results
    Given  Navigate to login page  "login"
    And teacher login and view the student's "assignments"
    And teacher "logout"

      Scenario: Deleting the quiz
       Given  Navigate to login page  "login"
       Then delete all the "threequizzes" that teacher created

      Scenario: Deleting the assignments
        Given  Navigate to login page  "login"
        Then deleting all of the "assignments" teacher created


