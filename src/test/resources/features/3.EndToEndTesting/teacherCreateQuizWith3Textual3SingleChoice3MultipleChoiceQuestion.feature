@Quiz3Text3Single3Multiple
Feature: Teacher Create Quiz with 3 Textual, 3 Single- Choice, 3 Multiple-Choice question 90% passing rate (ASK-371)

  @Quiz3Text3Single3Multiple1
  Scenario: Teacher Create Quiz
    Given I open url "http://local.school.portnov.com:4520/#/login"
    When I type "VladimirTeacher.test@gmail.com" into element with xpath "//*[@formcontrolname='email']"
    And I type "12345" into element with xpath "//*[@type='password']"
    And I click on element with xpath "//button[@type='submit']"
    Then element with xpath "//p[contains(text(),'TEACHER')]" should be displayed
    When I click on element with xpath "//*[contains(text(),'Quizzes')]"
    And I wait for 4 sec
    Then element with xpath "//*[contains(text(),'List of Quizzes')]" should be displayed
    When I click on element with xpath "//*[contains(text(),'Create New Quiz')]"
    And I wait for 3 sec
    Then element with xpath "//*[contains(text(),'Title Of The Quiz *')]" should be displayed
    When I type "ASK-371 Quiz" into element with xpath "//input[@placeholder='Title Of The Quiz *']"
    And I click on element with xpath "//*[contains(text(),'add_circle')]"
    When I click on element with xpath "//*[contains(text(),'Textual')]/.."
    And I type "Explain SDLC methodology?" into element with xpath "//*[@placeholder='Question *']"
    And I click on element with xpath "//*[contains(text(),'add_circle')]"
    And I wait for 1 sec
    And I click on element with xpath "//*[contains(text(), 'Q2:')]/../../..//div[contains(text(), 'Textual')]"
    And I type "Explain SDLC methodology again" into element with xpath "//*[contains(text(), 'Q2:')]/../../..//*[@placeholder='Question *']"
    And I wait for 1 sec
    And I click on element with xpath "//*[contains(text(),'add_circle')]"
    And I wait for 1 sec
    And I click on element with xpath "//*[contains(text(), 'Q3:')]/../../..//div[contains(text(), 'Textual')]"
    And I type "Explain SDLC methodology one more time" into element with xpath "//*[contains(text(), 'Q3:')]/../../..//*[@placeholder='Question *']"
    And I wait for 1 sec
    And I click on element with xpath "//*[contains(text(),'add_circle')]"
    And I wait for 1 sec
    And I click on element with xpath "//*[contains(text(), 'Q4:')]/../../..//div[contains(text(), 'Single-Choice')]"
    And I type "What are different test levels?" into element with xpath "//*[contains(text(), 'Q4:')]/../../..//*[@placeholder='Question *']"
    And I click on element with xpath "//*[@placeholder='Option 1*']/../../../../..//mat-radio-button"
    And I type "Unit, Integration, system and acceptance testing" into element with xpath "//*[@placeholder='Option 1*']"
    And I type "unit, regression, system and end to end testing" into element with xpath "//*[@placeholder='Option 2*']"
    And I wait for 1 sec
    And I click on element with xpath "//*[contains(text(),'add_circle')]"
    And I wait for 1 sec
    And I click on element with xpath "//*[contains(text(), 'Q5:')]/../../..//div[contains(text(), 'Single-Choice')]"
    And I type "What are different test levels-2?" into element with xpath "//*[contains(text(), 'Q5:')]/../../..//*[@placeholder='Question *']"
    And I wait for 1 sec
    And I click on element with xpath "//*[contains(text(), 'Q5:')]/../../..//*[@placeholder='Option 1*']/../../../../..//mat-radio-button"
    And I type "Unit, Integration, system and acceptance testing" into element with xpath "//*[contains(text(), 'Q5:')]/../../..//textarea[@placeholder='Option 1*']"
    And I type "unit, regression, system and end to end testing" into element with xpath "//*[contains(text(), 'Q5:')]/../../..//textarea[@placeholder='Option 2*']"
    And I wait for 1 sec
    And I click on element with xpath "//*[contains(text(),'add_circle')]"
    And I wait for 1 sec
    And I click on element with xpath "//*[contains(text(), 'Q6:')]/../../..//div[contains(text(), 'Single-Choice')]"
    And I type "What are different test levels-3?" into element with xpath "//*[contains(text(), 'Q6:')]/../../..//*[@placeholder='Question *']"
    And I wait for 1 sec
    And I click on element with xpath "//*[contains(text(), 'Q6:')]/../../..//*[@placeholder='Option 1*']/../../../../..//mat-radio-button"
    And I type "Unit, Integration, system and acceptance testing" into element with xpath "//*[contains(text(), 'Q6:')]/../../..//textarea[@placeholder='Option 1*']"
    And I type "unit, regression, system and end to end testing" into element with xpath "//*[contains(text(), 'Q6:')]/../../..//textarea[@placeholder='Option 2*']"
    And I wait for 1 sec
    And I click on element with xpath "//*[contains(text(),'add_circle')]"
    And I wait for 1 sec
    And I click on element with xpath "//*[contains(text(), 'Q7:')]/../../..//div[contains(text(), 'Multiple-Choice')]"
    And I type "Who can assign/change a severity in a bug report?" into element with xpath "//*[contains(text(), 'Q7:')]/../../..//*[@placeholder='Question *']"
    And I type "Development Manager" into element with xpath "//*[contains(text(), 'Q7:')]/../../..//textarea[@placeholder='Option 1*']"
    And I click on element with xpath "//*[@placeholder='Option 2*']/../../../../..//mat-checkbox"
    And I type "tester" into element with xpath "//*[contains(text(), 'Q7:')]/../../..//textarea[@placeholder='Option 2*']"
    And I click on element with xpath "//*[contains(text(),'add_circle')]"
    And I wait for 1 sec
    And I click on element with xpath "//*[contains(text(), 'Q8:')]/../../..//div[contains(text(), 'Multiple-Choice')]"
    And I type "Who can assign/change a severity in a bug report-2?" into element with xpath "//*[contains(text(), 'Q8:')]/../../..//*[@placeholder='Question *']"
    And I type "Development Manager" into element with xpath "//*[contains(text(), 'Q8:')]/../../..//textarea[@placeholder='Option 1*']"
    And I click on element with xpath "//*[contains(text(),'Q8:')]/../../..//textarea[@placeholder='Option 2*']/../../../../..//mat-checkbox"
    And I type "tester" into element with xpath "//*[contains(text(), 'Q8:')]/../../..//textarea[@placeholder='Option 2*']"
    And I click on element with xpath "//*[contains(text(),'add_circle')]"
    And I wait for 1 sec
    And I click on element with xpath "//*[contains(text(), 'Q9:')]/../../..//div[contains(text(), 'Multiple-Choice')]"
    And I type "Who can assign/change a severity in a bug report-2?" into element with xpath "//*[contains(text(), 'Q9:')]/../../..//*[@placeholder='Question *']"
    And I type "Development Manager" into element with xpath "//*[contains(text(), 'Q9:')]/../../..//textarea[@placeholder='Option 1*']"
    And I click on element with xpath "//*[contains(text(),'Q9:')]/../../..//textarea[@placeholder='Option 2*']/../../../../..//mat-checkbox"
    And I type "tester" into element with xpath "//*[contains(text(), 'Q9:')]/../../..//textarea[@placeholder='Option 2*']"
    And I click on element with xpath "//span[text() = '+']/.."
    And I click on element with xpath "//span[text() = '+']/.."
    And I click on element with xpath "//span[text() = '+']/.."
    And I click on element with xpath "//span[text() = '+']/.."
    And I click on element with xpath "//span[text() = '+']/.."
    And I click on element with xpath "//span[text() = '+']/.."
    And I click on element with xpath "//span[text() = '+']/.."
    And I click on element with xpath "//span[text() = '+']/.."
    And I click on element with xpath "//span[text() = '+']/.."
    And I click on element with xpath "//span[text() = '+']/.."
    And I click on element with xpath "//span[text() = '+']/.."
    And I click on element with xpath "//span[text() = '+']/.."
    And I click on element with xpath "//span[text() = '+']/.."
    And I click on element with xpath "//span[text() = '+']/.."
    And I click on element with xpath "//span[text() = '+']/.."
    And I wait for 1 sec
    And I click on element with xpath "//*[contains(text(),'Save')]/.."
    And I wait for 3 sec
    Then element with xpath "//*[contains(text(),'List of Quizzes')]" should be displayed
    Then element with xpath "//*[contains(text(),'ASK-371 Quiz')]" should be displayed

#    And I wait for 5 sec
