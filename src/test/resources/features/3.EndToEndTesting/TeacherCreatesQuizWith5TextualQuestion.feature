Feature: Automate TC for End to End Testing: Teacher Creates Quiz with 5 Textual Questions (ASK-591)
  #Test Case: ASK-296 Teacher Creates Quiz with 5 Textual Questions

  @Test-5TextualQuestions
  Scenario: Create a Quiz with 5 Textual Questions
    When I open url "http://local.school.portnov.com:4520/#/login"
    And I wait for 3 sec
    Then I click on element with xpath "//input[@placeholder='Email *']"
    And I type "lfelipe@gag16dotw7t.tk" into element with xpath "//input[@placeholder='Email *']"
    Then I click on element with xpath "//input[@placeholder='Email *']"
    Then I type "12345" into element with xpath "//input[@placeholder='Password *']"
    And I wait for 3 sec
    Then I click on element with xpath "//button[@type='submit']"
    And I wait for 3 sec
    Then I open url "http://local.school.portnov.com:4520/#/home"
    And I wait for 5 sec
    Then I click on element with xpath "//h5[contains(text(),'Quizzes')]"
    And I wait for 5 sec
    Then element with xpath "//mat-card[@class='page mat-card ng-star-inserted']" should be displayed
    Then I click on element with xpath "//span[contains(text(),'Create New Quiz')]"
    And I wait for 3 sec
    And element with xpath "//*[@placeholder ='Title Of The Quiz *']" should be displayed
    When I click on element with xpath "//*[@placeholder ='Title Of The Quiz *']"
    Then I type "SQA999" into element with xpath "//*[@placeholder ='Title Of The Quiz *']"
    When I click on element with xpath "//*[contains(text(), 'add_circle')]"
    And I wait for 3 sec
    Then element with xpath "//div[@class='mat-input-infix mat-form-field-infix']" should be displayed
    And I click on element with xpath "//*[contains(text(), 'Q1')]/../../..//div[contains(text(), 'Textual')]"
    Then element with xpath "//*[contains(text(), 'Q1')]/../../..//textarea[@placeholder='Question *']" should be displayed
    And I type "What is Software Testing?" into element with xpath "//*[contains(text(), 'Q1')]/../../..//textarea[@placeholder='Question *']"
    When I click on element with xpath "//*[contains(text(), 'add_circle')]"
    And I wait for 3 sec
    Then I click on element with xpath "//*[contains(text(), 'Q2')]/../../..//div[contains(text(), 'Textual')]"
    Then element with xpath "//*[contains(text(), 'Q2')]/../../..//textarea[@placeholder='Question *']" should be displayed
    And I type "What is Software Quality Assurance?" into element with xpath "//*[contains(text(), 'Q2')]/../../..//textarea[@placeholder='Question *']"
    When I click on element with xpath "//*[contains(text(), 'add_circle')]"
    And I wait for 3 sec
    Then I click on element with xpath "//*[contains(text(), 'Q3')]/../../..//div[contains(text(), 'Textual')]"
    Then element with xpath "//*[contains(text(), 'Q3')]/../../..//textarea[@placeholder='Question *']" should be displayed
    And I type "Explain SDLC methodology?" into element with xpath "//*[contains(text(), 'Q3')]/../../..//textarea[@placeholder='Question *']"
    When I click on element with xpath "//*[contains(text(), 'add_circle')]"
    And I wait for 3 sec
    Then I click on element with xpath "//*[contains(text(), 'Q4')]/../../..//div[contains(text(), 'Textual')]"
    Then element with xpath "//*[contains(text(), 'Q4')]/../../..//textarea[@placeholder='Question *']" should be displayed
    And I type "Explain Negative and Positive testing?" into element with xpath "//*[contains(text(), 'Q4')]/../../..//textarea[@placeholder='Question *']"
    When I click on element with xpath "//*[contains(text(), 'add_circle')]"
    And I wait for 3 sec
    Then I click on element with xpath "//*[contains(text(), 'Q5')]/../../..//div[contains(text(), 'Textual')]"
    Then element with xpath "//*[contains(text(), 'Q5')]/../../..//textarea[@placeholder='Question *']" should be displayed
    And I type "Explain Negative and Positive testing?" into element with xpath "//*[contains(text(), 'Q5')]/../../..//textarea[@placeholder='Question *']"
    When I click on element with xpath "//span[contains(text(),'Save')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be presented
    And I wait for 5 sec
    Then I scroll to the element with xpath "//mat-panel-title[contains(text(),'SQA999')]" with offset 5
    And I wait for 2 sec
    Then element with xpath "//mat-panel-title[contains(text(),'SQA999')]" should be displayed
    And I wait for 5 sec






