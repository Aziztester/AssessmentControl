Feature: Automation of Test Case for Quiz-Passing Rate (ASK-242)
      #Test Cases ASK-243, ASK-244
  Background: Log into an existing teacher account
    #Teacher Account 3.1 in Test Data
    Given I open url "http://local.school.portnov.com:4520/#/login"
    And I wait for 3 sec
    Then I click on element with xpath "//input[@placeholder='Email *']"
    And I type "lfelipe@gag16dotw7t.tk" into element with xpath "//input[@placeholder='Email *']"
    Then I click on element with xpath "//input[@placeholder='Password *']"
    Then I type "12345" into element with xpath "//input[@placeholder='Password *']"
    And I wait for 3 sec
    Then I click on element with xpath "//button[@type='submit']"
    And I wait for 5 sec

    Then element with xpath "//p[contains(text(),'TEACHER')]" should be displayed
    When I click on element with xpath "//h5[contains(text(),'Quizzes')]"
    And I wait for 5 sec
    Then element with xpath "//mat-card[@class='page mat-card ng-star-inserted']" should be displayed
    Then I click on element with xpath "//span[contains(text(),'Create New Quiz')]"
    And I wait for 2 sec
    And element with xpath "//*[@placeholder = 'Title Of The Quiz *']" should be displayed
    When I click on element with xpath "//*[@placeholder = 'Title Of The Quiz *']"
    Then I type "Sample Quiz1" into element with xpath "//*[@placeholder = 'Title Of The Quiz *']"
    Then I click on element with xpath "//div[@class='controls ng-star-inserted']//span[@class='mat-button-wrapper']"

    Then element with xpath "//*[contains(text(), 'Q1')]" should be displayed
    And I click on element with xpath "//*[contains(text(),'Question Type')]/..//*[contains(text(),'Textual')]"
    And I wait for 1 sec
    And element with xpath "//mat-panel-title[contains(text(),'Q1')]" should be displayed
    Then I click on element with xpath "//textarea[@placeholder='Question *']"
    And I type "Explain SDLC methodology" into element with xpath "//textarea[@placeholder='Question *']"
    Then I move the slider to rate 75
    Then I click on element with xpath "//span[contains(text(), 'Save')]"
    And I wait for 5 sec
    And element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed

  @Test1
  Scenario: Passing Rate (1st time)
    Then I scroll to the element with xpath "//mat-panel-title[contains(text(),'Sample Quiz1')]" with offset 3
    Then I click on element with xpath "//mat-panel-title[contains(text(),'Sample Quiz1')]"
    Then element with xpath "//mat-panel-title[contains(text(),'Sample Quiz1')]/../../..//td[contains(text(),'75')]" should be displayed
    Then I click on element with xpath "//mat-panel-title[contains(text(),'Sample Quiz1')]/../../..//span[contains(text(),'Delete')]"
    Then element with xpath "//h1[contains(text(),'Confirmation')]" should be displayed
    Then I click on element with xpath "//h1[contains(text(),'Confirmation')]/..//*[contains(text(),'Delete')]"
    And I wait for 5 sec

  @Test2
  Scenario: Passing Rate (after Edit with modification)
    Then I scroll to the element with xpath "//mat-panel-title[contains(text(),'Sample Quiz1')]" with offset 3
    Then I click on element with xpath "//mat-panel-title[contains(text(),'Sample Quiz1')]"
    Then element with xpath "//mat-panel-title[contains(text(),'Sample Quiz1')]/../../..//td[contains(text(),'Total Questions:')]" should be displayed
    Then I click on element with xpath "//mat-panel-title[contains(text(),'Sample Quiz1')]/../../..//span[contains(text(),'Edit')]"
    Then element with xpath "//h3[contains(text(),'Passing Rate')]" should be displayed
    Then I move the slider to rate 80
    Then I click on element with xpath "//span[contains(text(), 'Save')]"
    And I wait for 5 sec
    And element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed
    Then I scroll to the element with xpath "//mat-panel-title[contains(text(),'Sample Quiz1')]" with offset 3
    Then I click on element with xpath "//mat-panel-title[contains(text(),'Sample Quiz1')]"
    Then element with xpath "//mat-panel-title[contains(text(),'Sample Quiz1')]/../../..//td[contains(text(),'80')]" should be displayed
    Then I click on element with xpath "//mat-panel-title[contains(text(),'Sample Quiz1')]/../../..//span[contains(text(),'Delete')]"
    Then element with xpath "//h1[contains(text(),'Confirmation')]" should be displayed
    Then I click on element with xpath "//h1[contains(text(),'Confirmation')]/..//*[contains(text(),'Delete')]"
    And I wait for 3 sec

  @Test3
  Scenario: Passing Rate (1st time)
    Then I scroll to the element with xpath "//mat-panel-title[contains(text(),'Sample Quiz1')]" with offset 3
    Then I click on element with xpath "//mat-panel-title[contains(text(),'Sample Quiz1')]"
    Then element with xpath "//mat-panel-title[contains(text(),'Sample Quiz1')]/../../..//td[contains(text(),'Total Questions:')]" should be displayed
    Then I click on element with xpath "//mat-panel-title[contains(text(),'Sample Quiz1')]/../../..//span[contains(text(),'Edit')]"
    And I wait for 3 sec
    Then element with xpath "//h3[contains(text(),'Passing Rate')]" should be displayed
    Then I move the slider to rate 75
    Then I click on element with xpath "//span[contains(text(), 'Save')]"
    And I wait for 5 sec
    And element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed
    Then I scroll to the element with xpath "//mat-panel-title[contains(text(),'Sample Quiz1')]" with offset 3
    Then I click on element with xpath "//mat-panel-title[contains(text(),'Sample Quiz1')]"
    Then element with xpath "//mat-panel-title[contains(text(),'Sample Quiz1')]/../../..//td[contains(text(),'75')]" should be displayed
    Then I click on element with xpath "//mat-panel-title[contains(text(),'Sample Quiz1')]/../../..//span[contains(text(),'Delete')]"
    Then element with xpath "//h1[contains(text(),'Confirmation')]" should be displayed
    Then I click on element with xpath "//h1[contains(text(),'Confirmation')]/..//*[contains(text(),'Delete')]"
    And I wait for 5 sec








