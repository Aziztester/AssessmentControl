Feature: Teacher creates 3quizzes, assign it to student. Student finds all the Quizzes (3)
  #ASK-362
  @test1
  Scenario: Teacher log in
    Given I open url "http://local.school.portnov.com:4520/#/login"
    And I wait for 3 sec
    When I type "lfelipe@gag16dotw7t.tk" into element with xpath "//*[@id='mat-input-0']"
    And I type "12345" into element with xpath "//*[@id='mat-input-1']"
    And I click on element with xpath "//*[contains(text(),'Sign In')]"
    And I wait for 3 sec
    Then element with xpath "//h3[contains(text(),'Olga Petrova')]" should be presented
    And I wait for 3 sec
    #Creatin quizz1
    When I click on element with xpath "//h5[contains(text(),'Quizzes')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be presented
    When I click on element with xpath "//*[contains(text(),'Create New Quiz')]"
    And I wait for 3 sec
    When I type "$$000SQA1auto_DONT_TOUCH" into element with xpath "//*[@id='mat-input-2']"
    And I click on element with xpath "//*[@class='mat-icon material-icons']"
    And I click on element with xpath "//*[@id='mat-radio-2']//*[@class='mat-radio-label-content']"
    And I wait for 1 sec
    And I type "111" into element with xpath "//*[@id='mat-input-3']"
    And I click on element with xpath "//*[@class='form-controls-container ng-star-inserted']//*[@class='controls']//button[2]"
    And I wait for 6 sec
    #Creating asignment
    And I click on element with xpath "//h5[contains(text(),'Assignments')]"
    And I wait for 6 sec
    And I click on element with xpath "//*[contains(text(),'Create New Assignment')]"
    And I wait for 2 sec
    And I click on element with xpath "//*[@class='mat-select-placeholder ng-tns-c30-4670 ng-star-inserted']"
    And I wait for 2 sec
    And I click on element with xpath "//*[contains(text(),'$$000SQA1auto_DONT_TOUCH')]"
    And I wait for 6 sec












    

    



