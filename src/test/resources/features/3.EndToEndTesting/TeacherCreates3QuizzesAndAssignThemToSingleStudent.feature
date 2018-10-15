Feature: Automate TC "Teacher creates 3 quizzes, assign it to student. Student finds all the Quizzes" (ASK-777)
    #Test Case: ASK-362 Teacher creates 3 quizzes, assign it to student. Student finds all the Quizzes
  Background: Navigate to login page
    Given I open url "http://local.school.portnov.com:4520/#/login"
    And I wait for 3 sec

  @Test-3Quizzes
Scenario: Teacher creates 3 quizzes and assign them to a single student
  Then I click on element with xpath "//input[@placeholder='Email *']"
  And I type "lfelipe@gag16dotw7t.tk" into element with xpath "//input[@placeholder='Email *']"
  Then I click on element with xpath "//input[@placeholder='Password *']"
  Then I type "12345" into element with xpath "//input[@placeholder='Password *']"
  And I wait for 3 sec
  Then I click on element with xpath "//button[@type='submit']"
  And I wait for 3 sec

  When I click on element with xpath "//h5[contains(text(),'Quizzes')]"
  And I wait for 5 sec
  Then element with xpath "//mat-card[@class='page mat-card ng-star-inserted']" should be displayed
  #Quizz 1
  Then I click on element with xpath "//span[contains(text(),'Create New Quiz')]"
  And I wait for 3 sec
  And element with xpath "//*[@placeholder = 'Title Of The Quiz *']" should be displayed
  When I click on element with xpath "//*[@placeholder = 'Title Of The Quiz *']"
  Then I type "ASK-777 ASK-362 Quiz 1" into element with xpath "//*[@placeholder = 'Title Of The Quiz *']"
  Then I click on element with xpath "//*[contains(text(), 'add_circle')]"
  And I wait for 2 sec
  When I click on element with xpath "//*[contains(text(), 'Q1')]/../../..//div[contains(text(), 'Textual')]"
  Then element with xpath "//div[@class='mat-input-infix mat-form-field-infix']" should be displayed
  And element with xpath "//*[contains(text(), 'Q1')]/../../..//textarea[@placeholder='Question *']" should be displayed
  And I type "What is Software Testing?" into element with xpath "//*[contains(text(), 'Q1')]/../../..//textarea[@placeholder='Question *']"
  And I wait for 3 sec
  #Save quiz 1
  Then I click on element with xpath "//span[contains(text(),'Save')]"
  And I wait for 5 sec
  Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be presented
  And I wait for 5 sec
  Then I scroll to the element with xpath "//mat-panel-title[contains(text(),'ASK-777 ASK-362 Quiz 1')]" with offset 5
  And I wait for 2 sec
  Then element with xpath "//mat-panel-title[contains(text(),'ASK-777 ASK-362 Quiz 1')]" should be displayed
  And I wait for 5 sec

  #Quizz 2
  Then I click on element with xpath "//span[contains(text(),'Create New Quiz')]"
  And I wait for 3 sec
  And element with xpath "//*[@placeholder = 'Title Of The Quiz *']" should be displayed
  When I click on element with xpath "//*[@placeholder = 'Title Of The Quiz *']"
  Then I type "ASK-777 ASK-362 Quiz 2" into element with xpath "//*[@placeholder = 'Title Of The Quiz *']"
  Then I click on element with xpath "//*[contains(text(), 'add_circle')]"
  And I wait for 2 sec
  When I click on element with xpath "//*[contains(text(), 'Q1')]/../../..//div[contains(text(), 'Textual')]"
  Then element with xpath "//div[@class='mat-input-infix mat-form-field-infix']" should be displayed
  And element with xpath "//*[contains(text(), 'Q1')]/../../..//textarea[@placeholder='Question *']" should be displayed
  And I type "What is Software Testing?" into element with xpath "//*[contains(text(), 'Q1')]/../../..//textarea[@placeholder='Question *']"
  And I wait for 3 sec
  #Save quiz 2
  Then I click on element with xpath "//span[contains(text(),'Save')]"
  And I wait for 5 sec
  Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be presented
  And I wait for 5 sec
  Then I scroll to the element with xpath "//mat-panel-title[contains(text(),'ASK-777 ASK-362 Quiz 2')]" with offset 5
  And I wait for 2 sec
  Then element with xpath "//mat-panel-title[contains(text(),'ASK-777 ASK-362 Quiz 2')]" should be displayed
  And I wait for 5 sec

  #Quizz 3
  Then I click on element with xpath "//span[contains(text(),'Create New Quiz')]"
  And I wait for 3 sec
  And element with xpath "//*[@placeholder = 'Title Of The Quiz *']" should be displayed
  When I click on element with xpath "//*[@placeholder = 'Title Of The Quiz *']"
  Then I type "ASK-777 ASK-362 Quiz 3" into element with xpath "//*[@placeholder = 'Title Of The Quiz *']"
  Then I click on element with xpath "//*[contains(text(), 'add_circle')]"
  And I wait for 2 sec
  When I click on element with xpath "//*[contains(text(), 'Q1')]/../../..//div[contains(text(), 'Textual')]"
  Then element with xpath "//div[@class='mat-input-infix mat-form-field-infix']" should be displayed
  And element with xpath "//*[contains(text(), 'Q1')]/../../..//textarea[@placeholder='Question *']" should be displayed
  And I type "What is Software Testing?" into element with xpath "//*[contains(text(), 'Q1')]/../../..//textarea[@placeholder='Question *']"
  And I wait for 3 sec
    #Save quiz 3
  Then I click on element with xpath "//span[contains(text(),'Save')]"
  And I wait for 5 sec
  Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be presented
  And I wait for 5 sec
  Then I scroll to the element with xpath "//mat-panel-title[contains(text(),'ASK-777 ASK-362 Quiz 3')]" with offset 5
  And I wait for 2 sec
  Then element with xpath "//mat-panel-title[contains(text(),'ASK-777 ASK-362 Quiz 3')]" should be displayed
  And I wait for 5 sec

#  @Test-Assign3QuizzesToSingleStudent
#  Scenario: Teacher assigns 3 quizzes to a single student
    Then I click on element with xpath "//h5[contains(text(),'Assignments')]"
    And I wait for 5 sec
    Then element with xpath "//mat-card[@class='page mat-card']" should be displayed
    # Assignment 1
    Then I click on element with xpath "//span[contains(text(),'Create New Assignment')]"
    And I wait for 2 sec
    And element with xpath "//mat-card[@class='page mat-card']" should be displayed
    And I wait for 3 sec
    When I click on element with xpath "//mat-select[@aria-label='Select Quiz To Assign']"
    And I wait for 3 sec
    Then element with xpath "//mat-option[@class='mat-option ng-star-inserted mat-active']" should be displayed
    And I wait for 2 sec
    Then I type "ASK-777" into element with xpath "//mat-option[@class='mat-option ng-star-inserted mat-active']"
    And I wait for 2 sec
    Then I scroll to the element with xpath "//span[contains(text(),'ASK-777 ASK-362 Quiz 1')]" with offset 5
    And I wait for 2 sec
    Then I click on element with xpath "//span[contains(text(),'ASK-777 ASK-362 Quiz 1')]"
    And I wait for 2 sec
    Then I find "Sophia Jones" in one of the elements with xpath "//mat-list-option", scroll to it with offset 5 and click it
    And I wait for 2 sec
    Then I click on element with xpath "//span[contains(text(),'Give Assignment')]"
    And I wait for 5 sec
    Then element with xpath "//mat-card[@class='page mat-card']" should be displayed
    Then I scroll to the element with xpath "//mat-panel-title[contains(text(),'ASK-777 ASK-362 Quiz 1')]" with offset 5
    And I wait for 5 sec

    # Assignment 2
    Then I click on element with xpath "//span[contains(text(),'Create New Assignment')]"
    And I wait for 2 sec
    And element with xpath "//mat-card[@class='page mat-card']" should be displayed
    And I wait for 3 sec
    When I click on element with xpath "//mat-select[@aria-label='Select Quiz To Assign']"
    And I wait for 3 sec
    Then element with xpath "//mat-option[@class='mat-option ng-star-inserted mat-active']" should be displayed
    And I wait for 2 sec
    Then I type "ASK-777" into element with xpath "//mat-option[@class='mat-option ng-star-inserted mat-active']"
    And I wait for 2 sec
    Then I scroll to the element with xpath "//span[contains(text(),'ASK-777 ASK-362 Quiz 2')]" with offset 5
    And I wait for 2 sec
    Then I click on element with xpath "//span[contains(text(),'ASK-777 ASK-362 Quiz 2')]"
    And I wait for 2 sec
    Then I find "Sophia Jones" in one of the elements with xpath "//mat-list-option", scroll to it with offset 5 and click it
    And I wait for 2 sec
    Then I click on element with xpath "//span[contains(text(),'Give Assignment')]"
    And I wait for 5 sec
    Then element with xpath "//mat-card[@class='page mat-card']" should be displayed
    Then I scroll to the element with xpath "//mat-panel-title[contains(text(),'ASK-777 ASK-362 Quiz 2')]" with offset 5
    And I wait for 5 sec

    # Assignment 3
    Then I click on element with xpath "//span[contains(text(),'Create New Assignment')]"
    And I wait for 2 sec
    And element with xpath "//mat-card[@class='page mat-card']" should be displayed
    And I wait for 3 sec
    When I click on element with xpath "//mat-select[@aria-label='Select Quiz To Assign']"
    And I wait for 3 sec
    Then element with xpath "//mat-option[@class='mat-option ng-star-inserted mat-active']" should be displayed
    And I wait for 2 sec
    Then I type "ASK-777" into element with xpath "//mat-option[@class='mat-option ng-star-inserted mat-active']"
    And I wait for 2 sec
    Then I scroll to the element with xpath "//span[contains(text(),'ASK-777 ASK-362 Quiz 3')]" with offset 5
    And I wait for 2 sec
    Then I click on element with xpath "//span[contains(text(),'ASK-777 ASK-362 Quiz 3')]"
    And I wait for 2 sec
    Then I find "Sophia Jones" in one of the elements with xpath "//mat-list-option", scroll to it with offset 5 and click it
    And I wait for 2 sec
    Then I click on element with xpath "//span[contains(text(),'Give Assignment')]"
    And I wait for 5 sec
    Then element with xpath "//mat-card[@class='page mat-card']" should be displayed
    Then I scroll to the element with xpath "//mat-panel-title[contains(text(),'ASK-777 ASK-362 Quiz 3')]" with offset 5
    And I wait for 5 sec
    #Logout
    Then I click on element with xpath "//h5[contains(text(),'Log Out')]"
    And I wait for 1 sec
    When element with xpath "//ac-modal-confirmation[@class='ng-star-inserted']" should be displayed
    And I click on element with xpath "//span[contains(text(),'Log Out')]"
    And I wait for 3 sec

#  @Test-StudentSeeAssignments
#  Scenario: Student can see new assignments
  Then I clear element with xpath "//input[@placeholder='Email *']"
#  Then I click on element with xpath "//input[@placeholder='Email *']"
  And I type "sbhonsle.ash@korutbete.cf" into element with xpath "//input[@placeholder='Email *']"
  Then I clear element with xpath "//input[@placeholder='Password *']"
#  Then I click on element with xpath "//input[@placeholder='Password *']"
  Then I type "12345" into element with xpath "//input[@placeholder='Password *']"
  And I wait for 3 sec
  Then I click on element with xpath "//button[@type='submit']"
  And I wait for 3 sec

  #Look at Assignments
  When I click on element with xpath "//h5[contains(text(),'My Assignments')]"
  And I wait for 2 sec

    Then I scroll to the element with xpath "//td[contains(text(),'ASK-777 ASK-362 Quiz 1')]" with offset 5
    And I wait for 2 sec
    Then I scroll to the element with xpath "//td[contains(text(),'ASK-777 ASK-362 Quiz 2')]" with offset 5
    And I wait for 2 sec
    Then I scroll to the element with xpath "//td[contains(text(),'ASK-777 ASK-362 Quiz 3')]" with offset 5
    And I wait for 5 sec