Feature:Teacher create Quiz and assign it to single student and student get assignment

  Scenario:Login as Teacher

    Given I open a url "<http://local.school.portnov.com:4520/#/login>"
    When I type E-mail "<>" with xpath""
    And I type Password "<12345>"
    And I "SignIn"
    Then verify the page

  Scenario: Create a Quiz

    When I click on "Quizzes"
    Then verify the page
    And I click on "Create Quizzes"
    And I type the Title into a "Title of the Quiz" field as "QA Basics"
    Then I push add "Question"
    Then I push "Radio button" to select type of Question as Textual
    Then I type the "Question" as "What is Software Quality Assurance?"
    Then I check the "Showstopper"
    Then I Adjust the "points" to "1"
    Then I click on add "Question" button
    Then I push "Radio button" to select type of Question as "Single Choice"
    Then I type the second question as "What are different test levels?"
    Then I type "option one" as "Unit, Integration, system and acceptance testing"
    Then I type "option two" as "unit, regression, system and end to end testing"
    Then I select "Radio button" of option one
    Then I push add "Question" button
    Then I push "Radio button" to select type of Question as "Multiple Choice"
    Then I type the "Third Question" as "What is most frequent testing?"
    Then I type "option one" as "Stress testing"
    Then I type "option two" as "Release/Build, Acceptance"
    Then I push "checkbox button" of option two
    Then I push "checkbox button" of "Include "Other" text area option for this question"
    Then I Adjust the "points" to "10"
    Then I push save
    Then I click on "Assignments"
    Then I push Create "New Assignment"
    Then I select the student from "Group filter" list-option
    Then I select the "Quiz to Assign" from list-option
    Then I push "Give Assisgnment"
    Then I push logout button

  Scenario: Login as Student

    When I login as "Student" with Email "sbhonsle.ash@korutbete.cf" and password "12345"
    Then I Click on "Goto My Assignments"

