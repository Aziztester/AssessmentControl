
Feature: Teacher Create Quiz with 3 Textual, 3 Single-Choice, 3 Multiple-Choice question 90% passing rate (ASK-371)

  Scenario: Teacher Create Quiz
    Given V get url "http://local.school.portnov.com:4520/#/login"
    When V login as teacher "VladimirTeacher.test@gmail.com" with password "12345"
    Then V verify "//p[contains(text(),'TEACHER')]" is displayed
    When V open quizzes list
    Then V verify "//*[contains(text(),'Quizzes')]" is displayed
    When V create quiz "ASK-371 Quiz"
    And  V create textual question "Explain SDLC methodology?" number "1"
    And  V create textual question "Explain SDLC methodology one more time?" number "2"
    And  V create textual question "Explain SDLC methodology again?" number "3"
    When V create single-option question "Explain SDLC methodology?" number "4" with options "Unit, Integration, system and acceptance testing", "unit, regression, system and end to end testing"
    And V create single-option question "Explain SDLC methodology-2?" number "5" with options "Unit, Integration, system and acceptance testing", "unit, regression, system and end to end testing"
    And V create single-option question "Explain SDLC methodology-3?" number "6" with options "Unit, Integration, system and acceptance testing", "unit, regression, system and end to end testing"
    When V create multiple-choice question "Who can assign/change a severity in a bug report?" number "7" with options "Development Manager", "tester"
    And V create multiple-choice question "Who can assign/change a severity in a bug report-2?" number "8" with options "Development Manager", "tester"
    And V create multiple-choice question "Who can assign/change a severity in a bug report-3?" number "9" with options "Development Manager", "tester"
    When V increase passing rate to "90%"
    And V save
    And V wait for "//*[contains(text(),'List of Quizzes')]"
    Then V verify "//*[contains(text(),'Quizzes')]" is displayed
    Then V verify "//*[contains(text(),'ASK-371 Quiz')]" is displayed

#    And I wait for 3 sec
