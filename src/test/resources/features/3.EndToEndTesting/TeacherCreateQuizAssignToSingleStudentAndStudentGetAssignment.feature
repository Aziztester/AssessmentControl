Feature: Teacher Create a Quiz, Assign it to a Single Student, and Student Get the Assignment
  Background: Navigate to login page
    Given I open url "http://local.school.portnov.com:4520/#/login"
    And I wait for 3 sec

  @Test-CreateQuiz
  Scenario: Teacher Creates a Quiz
    Given I login with E-mail "lfelipe@gag16dotw7t.tk" and Password "12345"
    Then "Olga Petrova" should display at the left top corner
    When I click Menu Item "Quizzes" and wait for 5 sec
    When I click on element with xpath "//h5[contains(text(),'Quizzes')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed
    When I click on element with xpath "//span[contains(text(),'Create New Quiz')]"
    And I wait for 1 sec
    Then element with xpath "//input[contains(@placeholder, 'Title Of The Quiz')]" should be displayed
    When I type "ASK-677 Test Quiz" into element with xpath "//input[contains(@placeholder, 'Title Of The Quiz')]"
    And I click on element with xpath "//*[contains(text(), 'add_circle')]"
    And I wait for 1 sec
    Then element with xpath "//div[contains(text(), 'Question Type')]" should be displayed
    When I click on element with xpath "//*[contains(text(), 'Q1')]/../../..//div[contains(text(), 'Textual')]"
    And I wait for 1 sec
    Then element with xpath "//*[contains(text(), 'Q1')]/../../..//textarea[@placeholder='Question *']" should be displayed
    When I type "What is Software Testing?" into element with xpath "//*[contains(text(), 'Q1')]/../../..//textarea[@placeholder='Question *']"
    Then I wait for 1 sec
    When I click on element with xpath "//span[contains(text(),'Save')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed
    When I scroll to the element with xpath "//mat-panel-title[contains(text(),'ASK-677 Test Quiz')]" with offset 5
    And I wait for 1 sec
    Then element with xpath "//mat-panel-title[contains(text(),'ASK-677 Test Quiz')]" should be displayed
    And I wait for 1 sec

  @Test-AssignQuiz
  Scenario: Teacher Gives an Assignment
    Given I login with E-mail "lfelipe@gag16dotw7t.tk" and Password "12345"
    Then "Olga Petrova" should display at the left top corner
    When I click Menu Item "Assignments" and wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Assignments')]" should be displayed
    When I click on element with xpath "//span[contains(text(),'Create New Assignment')]"
    Then element with xpath "//mat-card[@class='page mat-card']" should be displayed
    When I click on element with xpath "//mat-select[@aria-label='Select Quiz To Assign']"
    And I wait for 1 sec
    Then element with xpath "//mat-option[@class='mat-option ng-star-inserted mat-active']" should be displayed
    When I type "ASK-777" into element with xpath "//mat-option[@class='mat-option ng-star-inserted mat-active']"
    And I wait for 1 sec
    And I scroll to the element with xpath "//span[contains(text(),'ASK-677 Test Quiz')]" with offset 5
    And I click on element with xpath "//span[contains(text(),'ASK-677 Test Quiz')]"
    And I find "Peter Ivanov" in one of the elements with xpath "//mat-list-option", scroll to it with offset 5 and click it
    And I wait for 1 sec
    And I click on element with xpath "//span[contains(text(),'Give Assignment')]"
    And I wait for 3 sec
    Then element with xpath "//mat-card[@class='page mat-card']" should be displayed
    When I scroll to the element with xpath "//mat-panel-title[contains(text(),'ASK-677 Test Quiz')]" with offset 5
    And I wait for 1 sec

  @Test-StudentGetsAssignment
  Scenario: Student Goes to Assessment
    Given I login with E-mail "umoha@jerapah993r.gq" and Password "12345"
    Then "Peter Ivanov" should display at the left top corner
    When I click Menu Item "My Assignments" and wait for 2 sec
    Then element with xpath "//h4[contains(text(),'My Assignments')]" should be displayed
    When I scroll to the element with xpath "//td[contains(text(), 'ASK-677 Test Quiz')]" with offset 5
    And I click on element with xpath "//td[contains(text(), 'ASK-677 Test Quiz')]/..//span[contains(text(), 'Go To Assessment')]/.."
    Then element with xpath "//h4[contains(text(),'ASK-677 Test Quiz')]" should be displayed
    When I type "a" into element with xpath "//textarea[@placeholder='Enter your answer']"
    And I click on element with xpath "//span[contains(text(), 'Submit My Answers')]/.."
    And I wait for 2 sec
    Then element with xpath "//h1[contains(text(),'Success')]" should be displayed
    When I click on element with xpath "//span[contains(text(),'Ok')]/.."
    And I wait for 2 sec
    Then element with xpath "//h4[contains(text(),'My Assignments')]" should be displayed
    When I click Menu Item "My Grades" and wait for 2 sec
    Then element with xpath "//h4[contains(text(),'My Grades')]" should be displayed
    When I scroll to the element with xpath "//td[contains(text(), 'ASK-677 Test Quiz')]" with offset 5
    Then I wait for 2 sec

  @Test-DeleteAssignment
  Scenario: Teacher deletes Assignment
    Given I login with E-mail "lfelipe@gag16dotw7t.tk" and Password "12345"
    Then "Olga Petrova" should display at the left top corner
    When I click Menu Item "Assignments" and wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Assignments')]" should be displayed
    When I scroll to the element with xpath "//*[contains(text(),'ASK-677 Test Quiz')]" with offset 5
    And I click on element with xpath "//*[contains(text(),'ASK-677 Test Quiz')]/..//mat-icon[@class='mat-icon material-icons'][contains(text(),'more_vert')]"
    Then element with xpath "//span[contains(text(),'Delete Assignment')]" should be displayed
    When I click on element with xpath "//span[contains(text(),'Delete Assignment')]"
    Then element with xpath "//h1[contains(text(),'Confirmation')]" should be displayed
    When I wait for 1 sec
    And I click on element with xpath "//span[contains(text(),'Delete')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Assignments')]" should be displayed

  @Test-DeleteQuiz
  Scenario: Teacher deletes Quiz
    Given I login with E-mail "lfelipe@gag16dotw7t.tk" and Password "12345"
    Then "Olga Petrova" should display at the left top corner
    When I click Menu Item "Quizzes" and wait for 5 sec
    When I scroll to the element with xpath "//*[contains(text(),'ASK-677 Test Quiz')]" with offset 5
    And I click on element with xpath "//*[contains(text(), 'ASK-677 Test Quiz')]/../../.."
    Then element with xpath "//*[contains(text(), 'ASK-677 Test Quiz')]/../../..//*[contains(text(), 'Delete')]" should be displayed
    When I click on element with xpath "//*[contains(text(), 'ASK-677 Test Quiz')]/../../..//*[contains(text(), 'Delete')]"
    Then element with xpath "//h1[contains(text(),'Confirmation')]" should be displayed
    When I click on element with xpath "//div[@class='mat-dialog-actions']//span[contains(text(),'Delete')]"
    And I wait for 1 sec
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed
