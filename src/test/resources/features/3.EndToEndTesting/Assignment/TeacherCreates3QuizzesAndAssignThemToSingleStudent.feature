Feature: Automate TC "Teacher creates 3 quizzes, assign it to student. Student finds all the Quizzes" (ASK-777)
    #Test Case: ASK-362 Teacher creates 3 quizzes, assign it to student. Student finds all the Quizzes
  Background: Navigate to login page
    Given I open url "http://local.school.portnov.com:4520/#/login"
    And I wait for 3 sec

  @Test-3Quizzes
  Scenario: Teacher creates 3 quizzes
    When I click on element with xpath "//input[@placeholder='Email *']"
    And I type "lfelipe@gag16dotw7t.tk" into element with xpath "//input[@placeholder='Email *']"
    And I click on element with xpath "//input[@placeholder='Password *']"
    And I type "12345" into element with xpath "//input[@placeholder='Password *']"
    And I click on element with xpath "//button[@type='submit']"
    And I wait for 3 sec
    Then element with xpath "//h3[contains(text(),'Olga Petrova')]" should be displayed

    When I click on element with xpath "//h5[contains(text(),'Quizzes')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed

  #Quizz 1
    When I click on element with xpath "//span[contains(text(),'Create New Quiz')]"
    And I wait for 1 sec
    Then element with xpath "//*[@placeholder = 'Title Of The Quiz *']" should be displayed
    When I click on element with xpath "//*[@placeholder = 'Title Of The Quiz *']"
    And I type "ASK-777 ASK-362 Quiz 1" into element with xpath "//*[@placeholder = 'Title Of The Quiz *']"
    And I click on element with xpath "//*[contains(text(), 'add_circle')]"
    And I wait for 1 sec
    Then element with xpath "//div[contains(text(), 'Question Type')]" should be displayed
    When I click on element with xpath "//*[contains(text(), 'Q1')]/../../..//div[contains(text(), 'Textual')]"
    And I wait for 1 sec
    Then element with xpath "//*[contains(text(), 'Q1')]/../../..//textarea[@placeholder='Question *']" should be displayed
    When I type "What is Software Testing?" into element with xpath "//*[contains(text(), 'Q1')]/../../..//textarea[@placeholder='Question *']"
    And I wait for 1 sec
  #Save quiz 1
    And I click on element with xpath "//span[contains(text(),'Save')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed
    When I scroll to the element with xpath "//mat-panel-title[contains(text(),'ASK-777 ASK-362 Quiz 1')]" with offset 5
    And I wait for 1 sec
    Then element with xpath "//mat-panel-title[contains(text(),'ASK-777 ASK-362 Quiz 1')]" should be displayed
    And I wait for 1 sec

  #Quizz 2
    And I click on element with xpath "//span[contains(text(),'Create New Quiz')]"
    And I wait for 1 sec
    When I click on element with xpath "//*[@placeholder = 'Title Of The Quiz *']"
    And I type "ASK-777 ASK-362 Quiz 2" into element with xpath "//*[@placeholder = 'Title Of The Quiz *']"
    And I click on element with xpath "//*[contains(text(), 'add_circle')]"
    And I wait for 1 sec
    Then element with xpath "//div[contains(text(), 'Question Type')]" should be displayed
    When I click on element with xpath "//*[contains(text(), 'Q1')]/../../..//div[contains(text(), 'Textual')]"
    And I wait for 1 sec
    Then element with xpath "//*[contains(text(), 'Q1')]/../../..//textarea[@placeholder='Question *']" should be displayed
    When I type "What is Software Testing?" into element with xpath "//*[contains(text(), 'Q1')]/../../..//textarea[@placeholder='Question *']"
    And I wait for 1 sec
    #Save quiz 2
    And I click on element with xpath "//span[contains(text(),'Save')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed
    When I scroll to the element with xpath "//mat-panel-title[contains(text(),'ASK-777 ASK-362 Quiz 2')]" with offset 5
    And I wait for 1 sec
    Then element with xpath "//mat-panel-title[contains(text(),'ASK-777 ASK-362 Quiz 2')]" should be displayed
    And I wait for 1 sec

  #Quizz 3
    When I click on element with xpath "//span[contains(text(),'Create New Quiz')]"
    And I wait for 1 sec
    Then element with xpath "//*[@placeholder = 'Title Of The Quiz *']" should be displayed
    When I click on element with xpath "//*[@placeholder = 'Title Of The Quiz *']"
    And I type "ASK-777 ASK-362 Quiz 3" into element with xpath "//*[@placeholder = 'Title Of The Quiz *']"
    And I click on element with xpath "//*[contains(text(), 'add_circle')]"
    And I wait for 1 sec
    Then element with xpath "//div[contains(text(), 'Question Type')]" should be displayed
    When I click on element with xpath "//*[contains(text(), 'Q1')]/../../..//div[contains(text(), 'Textual')]"
    And I wait for 1 sec
    Then element with xpath "//*[contains(text(), 'Q1')]/../../..//textarea[@placeholder='Question *']" should be displayed
    When I type "What is Software Testing?" into element with xpath "//*[contains(text(), 'Q1')]/../../..//textarea[@placeholder='Question *']"
    And I wait for 1 sec
    #Save quiz 3
    And I click on element with xpath "//span[contains(text(),'Save')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed
    When I scroll to the element with xpath "//mat-panel-title[contains(text(),'ASK-777 ASK-362 Quiz 3')]" with offset 5
    And I wait for 1 sec
    Then element with xpath "//mat-panel-title[contains(text(),'ASK-777 ASK-362 Quiz 3')]" should be displayed
    And I wait for 1 sec

  @Test-Assign3QuizzesToSingleStudent
  Scenario: Teacher assigns 3 quizzes to a single student
    When I click on element with xpath "//h5[contains(text(),'Assignments')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Assignments')]" should be displayed
    # Assignment 1
    When I click on element with xpath "//span[contains(text(),'Create New Assignment')]"
    Then element with xpath "//mat-card[@class='page mat-card']" should be displayed
    When I click on element with xpath "//mat-select[@aria-label='Select Quiz To Assign']"
    And I wait for 1 sec
    Then element with xpath "//mat-option[@class='mat-option ng-star-inserted mat-active']" should be displayed
    When I type "ASK-777" into element with xpath "//mat-option[@class='mat-option ng-star-inserted mat-active']"
    And I wait for 1 sec
    And I scroll to the element with xpath "//span[contains(text(),'ASK-777 ASK-362 Quiz 1')]" with offset 5
    And I click on element with xpath "//span[contains(text(),'ASK-777 ASK-362 Quiz 1')]"
    And I find "Sophia Jones" in one of the elements with xpath "//mat-list-option", scroll to it with offset 5 and click it
    And I wait for 1 sec
    And I click on element with xpath "//span[contains(text(),'Give Assignment')]"
    And I wait for 3 sec
    Then element with xpath "//mat-card[@class='page mat-card']" should be displayed
    When I scroll to the element with xpath "//mat-panel-title[contains(text(),'ASK-777 ASK-362 Quiz 1')]" with offset 5
    And I wait for 1 sec

    # Assignment 2
    When I click on element with xpath "//span[contains(text(),'Create New Assignment')]"
    Then element with xpath "//mat-card[@class='page mat-card']" should be displayed
    When I click on element with xpath "//mat-select[@aria-label='Select Quiz To Assign']"
    And I wait for 1 sec
    Then element with xpath "//mat-option[@class='mat-option ng-star-inserted mat-active']" should be displayed
    When I type "ASK-777" into element with xpath "//mat-option[@class='mat-option ng-star-inserted mat-active']"
    And I wait for 1 sec
    And I scroll to the element with xpath "//span[contains(text(),'ASK-777 ASK-362 Quiz 2')]" with offset 5
    And I click on element with xpath "//span[contains(text(),'ASK-777 ASK-362 Quiz 2')]"
    And I find "Sophia Jones" in one of the elements with xpath "//mat-list-option", scroll to it with offset 5 and click it
    And I wait for 1 sec
    And I click on element with xpath "//span[contains(text(),'Give Assignment')]"
    And I wait for 3 sec
    Then element with xpath "//mat-card[@class='page mat-card']" should be displayed
    When I scroll to the element with xpath "//mat-panel-title[contains(text(),'ASK-777 ASK-362 Quiz 2')]" with offset 5
    And I wait for 1 sec

    # Assignment 3
    When I click on element with xpath "//span[contains(text(),'Create New Assignment')]"
    Then element with xpath "//mat-card[@class='page mat-card']" should be displayed
    When I click on element with xpath "//mat-select[@aria-label='Select Quiz To Assign']"
    And I wait for 1 sec
    Then element with xpath "//mat-option[@class='mat-option ng-star-inserted mat-active']" should be displayed
    When I type "ASK-777" into element with xpath "//mat-option[@class='mat-option ng-star-inserted mat-active']"
    And I wait for 1 sec
    And I scroll to the element with xpath "//span[contains(text(),'ASK-777 ASK-362 Quiz 3')]" with offset 5
    Then element with xpath "//span[contains(text(),'ASK-777 ASK-362 Quiz 3')]" should be displayed
    When I click on element with xpath "//span[contains(text(),'ASK-777 ASK-362 Quiz 3')]"
    And I find "Sophia Jones" in one of the elements with xpath "//mat-list-option", scroll to it with offset 5 and click it
    And I wait for 1 sec
    And I click on element with xpath "//span[contains(text(),'Give Assignment')]"
    And I wait for 3 sec
    Then element with xpath "//mat-card[@class='page mat-card']" should be displayed
    When I scroll to the element with xpath "//mat-panel-title[contains(text(),'ASK-777 ASK-362 Quiz 3')]" with offset 5
    And I wait for 2 sec

    #Logout
    Then I click on element with xpath "//h5[contains(text(),'Log Out')]"
    Then element with xpath "//ac-modal-confirmation[@class='ng-star-inserted']" should be displayed
    And I click on element with xpath "//span[contains(text(),'Log Out')]"
    And I wait for 3 sec

#  @Test-StudentSeeAssignments
#  Scenario: Student can see new assignments
  Then I clear element with xpath "//input[@placeholder='Email *']"
  Then I click on element with xpath "//input[@placeholder='Email *']"
  And I type "sbhonsle.ash@korutbete.cf" into element with xpath "//input[@placeholder='Email *']"
  Then I clear element with xpath "//input[@placeholder='Password *']"
  Then I click on element with xpath "//input[@placeholder='Password *']"
  Then I type "12345" into element with xpath "//input[@placeholder='Password *']"
  Then I click on element with xpath "//button[@type='submit']"
  And I wait for 3 sec

  #Look at Assignments
  When I click on element with xpath "//h5[contains(text(),'My Assignments')]"
  And I wait for 2 sec

    Then I scroll to the element with xpath "//td[contains(text(),'ASK-777 ASK-362 Quiz 1')]" with offset 5
    And I wait for 1 sec
    Then I scroll to the element with xpath "//td[contains(text(),'ASK-777 ASK-362 Quiz 2')]" with offset 5
    And I wait for 2 sec
    Then I scroll to the element with xpath "//td[contains(text(),'ASK-777 ASK-362 Quiz 3')]" with offset 5
    And I wait for 2 sec

    # Delete temporary test objects
  @Test-DeleteAssignments
  Scenario: Teacher deletes created Assignments
    #Login as Teacher
    Given I click on element with xpath "//input[@placeholder='Email *']"
    When I type "lfelipe@gag16dotw7t.tk" into element with xpath "//input[@placeholder='Email *']"
    And I click on element with xpath "//input[@placeholder='Password *']"
    And I type "12345" into element with xpath "//input[@placeholder='Password *']"
    And I click on element with xpath "//button[@type='submit']"
    And I wait for 3 sec
    Then element with xpath "//h3[contains(text(),'Olga Petrova')]" should be displayed
    #Navigate to Assignments
    When I click on element with xpath "//h5[contains(text(),'Assignments')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Assignments')]" should be displayed
    #Delete Assignment 1
    When I scroll to the element with xpath "//*[contains(text(),'ASK-777 ASK-362 Quiz 1')]" with offset 5
    And I click on element with xpath "//*[contains(text(),'ASK-777 ASK-362 Quiz 1')]/..//mat-icon[@class='mat-icon material-icons'][contains(text(),'more_vert')]"
    Then element with xpath "//span[contains(text(),'Delete Assignment')]" should be displayed
    When I click on element with xpath "//span[contains(text(),'Delete Assignment')]"
    Then element with xpath "//h1[contains(text(),'Confirmation')]" should be displayed
    When I wait for 1 sec
    And I click on element with xpath "//span[contains(text(),'Delete')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Assignments')]" should be displayed
    #Delete Assignment 2
    When I scroll to the element with xpath "//*[contains(text(),'ASK-777 ASK-362 Quiz 2')]" with offset 5
    And I click on element with xpath "//*[contains(text(),'ASK-777 ASK-362 Quiz 2')]/..//mat-icon[@class='mat-icon material-icons'][contains(text(),'more_vert')]"
    Then element with xpath "//span[contains(text(),'Delete Assignment')]" should be displayed
    When I click on element with xpath "//span[contains(text(),'Delete Assignment')]"
    Then element with xpath "//h1[contains(text(),'Confirmation')]" should be displayed
    When I wait for 1 sec
    And I click on element with xpath "//span[contains(text(),'Delete')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Assignments')]" should be displayed
    #Delete Assignment 3
    When I scroll to the element with xpath "//*[contains(text(),'ASK-777 ASK-362 Quiz 3')]" with offset 5
    And I click on element with xpath "//*[contains(text(),'ASK-777 ASK-362 Quiz 3')]/..//mat-icon[@class='mat-icon material-icons'][contains(text(),'more_vert')]"
    Then element with xpath "//span[contains(text(),'Delete Assignment')]" should be displayed
    When I click on element with xpath "//span[contains(text(),'Delete Assignment')]"
    Then element with xpath "//h1[contains(text(),'Confirmation')]" should be displayed
    When I wait for 1 sec
    And I click on element with xpath "//span[contains(text(),'Delete')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Assignments')]" should be displayed

  @Test-DeleteQuizzes
  Scenario: Teacher deletes created Quizzes
    #Login as Teacher
    Given I click on element with xpath "//input[@placeholder='Email *']"
    And I type "lfelipe@gag16dotw7t.tk" into element with xpath "//input[@placeholder='Email *']"
    Then I click on element with xpath "//input[@placeholder='Password *']"
    Then I type "12345" into element with xpath "//input[@placeholder='Password *']"
    Then I click on element with xpath "//button[@type='submit']"
    And I wait for 3 sec
    Then element with xpath "//h3[contains(text(),'Olga Petrova')]" should be displayed

    #Navigate to Quizzes
    When I click on element with xpath "//h5[contains(text(),'Quizzes')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed
    #Delete Quiz 1
    When I scroll to the element with xpath "//*[contains(text(),'ASK-777 ASK-362 Quiz 1')]" with offset 5
    And I click on element with xpath "//*[contains(text(), 'ASK-777 ASK-362 Quiz 1')]/../../.."
    Then element with xpath "//*[contains(text(), 'ASK-777 ASK-362 Quiz 1')]/../../..//*[contains(text(), 'Delete')]" should be displayed
    When I click on element with xpath "//*[contains(text(), 'ASK-777 ASK-362 Quiz 1')]/../../..//*[contains(text(), 'Delete')]"
    Then element with xpath "//h1[contains(text(),'Confirmation')]" should be displayed
    When I click on element with xpath "//div[@class='mat-dialog-actions']//span[contains(text(),'Delete')]"
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed
    Then I wait for 5 sec
    #Delete Quiz 2
    When I scroll to the element with xpath "//*[contains(text(),'ASK-777 ASK-362 Quiz 2')]" with offset 5
    And I click on element with xpath "//*[contains(text(), 'ASK-777 ASK-362 Quiz 2')]/../../.."
    Then element with xpath "//*[contains(text(), 'ASK-777 ASK-362 Quiz 2')]/../../..//*[contains(text(), 'Delete')]" should be displayed
    When I click on element with xpath "//*[contains(text(), 'ASK-777 ASK-362 Quiz 2')]/../../..//*[contains(text(), 'Delete')]"
    Then element with xpath "//h1[contains(text(),'Confirmation')]" should be displayed
    When I click on element with xpath "//div[@class='mat-dialog-actions']//span[contains(text(),'Delete')]"
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed
    Then I wait for 5 sec
    #Delete Quiz 3
    When I scroll to the element with xpath "//*[contains(text(),'ASK-777 ASK-362 Quiz 3')]" with offset 5
    And I click on element with xpath "//*[contains(text(), 'ASK-777 ASK-362 Quiz 3')]/../../.."
    Then element with xpath "//*[contains(text(), 'ASK-777 ASK-362 Quiz 3')]/../../..//*[contains(text(), 'Delete')]" should be displayed
    When I click on element with xpath "//*[contains(text(), 'ASK-777 ASK-362 Quiz 3')]/../../..//*[contains(text(), 'Delete')]"
    Then element with xpath "//h1[contains(text(),'Confirmation')]" should be displayed
    When I click on element with xpath "//div[@class='mat-dialog-actions']//span[contains(text(),'Delete')]"
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed
    Then I wait for 5 sec
