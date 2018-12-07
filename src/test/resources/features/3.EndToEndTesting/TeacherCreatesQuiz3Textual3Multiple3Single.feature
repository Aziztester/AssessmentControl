Feature: The teacher creates a quiz with 3 textual, 3 multiple-choice, 3 single-choice questions and 75% of the passing rate

    Scenario: The teacher creates a quiz with 3 textual, 3 multiple-choice, 3 single-choice questions and 75% of the passing rate
      Given I Navigate to login page "http://local.school.portnov.com:4520/#/login"
      When I register as a teacher
      And You create new quiz
      And create three textual questions
      And create three single-choice questions
      And create three multiple-choice questions
      Then verified that passing rate is 75%

      When we save quiz
      Then verify that quiz with name "New quiz with 3 text,3 multiple, 3 single" exist







