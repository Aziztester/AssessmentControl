Feature: Textual Question ASK-132


  @test1
  Scenario Outline: Alphanumerical and special characters input + Single character +1000 char
    #ASK-149  ASK-561
    Given I open url "http://local.school.portnov.com:4520/#/login"
    And I wait for 3 sec
    When I type "lfelipe@gag16dotw7t.tk" into element with xpath "//*[@id='mat-input-0']"
    And I type "12345" into element with xpath "//*[@id='mat-input-1']"
    And I click on element with xpath "//*[contains(text(),'Sign In')]"
    And I wait for 3 sec
    Then element with xpath "//h3[contains(text(),'Olga Petrova')]" should be presente
    And I wait for 3 sec
    #Creating quiz:
    When I click on element with xpath "//h5[contains(text(),'Quizzes')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be presented
    When I click on element with xpath "//*[contains(text(),'Create New Quiz')]"
    And I wait for 3 sec

    And I click on element with xpath "//*[@id='mat-radio-2']//*[@class='mat-radio-label-content']"
    And I wait for 1 sec
    And I type "<Text>" into element with xpath "//*[@id='mat-input-3']"
    And I click on element with xpath "//*[contains(text(),'Save')]"
    And I wait for 6 sec
    Then element with xpath "//*[contains(text(),'$$000SQA1auto_DONT_TOUCH')]" should be presented
    #Deleting:
    When I click on element with xpath "//*[contains(text(),'$$000SQA1auto_DONT_TOUCH')]"
    And I wait for 2 sec
    And I click on element with xpath "//mat-panel-title[contains(text(),'$$000SQA1auto_DONT_TOUCH')]/../../..//*[contains(text(),'Delete')]"
    And I wait for 2 sec
    And I click on element with xpath "//div[@class='mat-dialog-actions']//*[contains(text(),'Delete')]"
    And I wait for 3 sec

    Examples:
      | Text                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
      | Aa1$#                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |
      | k                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
      | software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance software quality assurance |
      #Put 1000 into variable!!!!!!!

  @test2
  Scenario: Text - Required field
    #ASK_152
    Given I open url "http://local.school.portnov.com:4520/#/login"
    And I wait for 3 sec
    When I type "lfelipe@gag16dotw7t.tk" into element with xpath "//*[@id='mat-input-0']"
    And I type "12345" into element with xpath "//*[@id='mat-input-1']"
    And I click on element with xpath "//*[contains(text(),'Sign In')]"
    And I wait for 3 sec
    Then element with xpath "//h3[contains(text(),'Olga Petrova')]" should be presented
    And I wait for 3 sec
    When I click on element with xpath "//h5[contains(text(),'Quizzes')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be presented
    When I click on element with xpath "//*[contains(text(),'Create New Quiz')]"
    And I wait for 3 sec
    When I type "$$000SQA1auto_DONT_TOUCH" into element with xpath "//*[@id='mat-input-2']"
    And I click on element with xpath "//*[@class='mat-icon material-icons']"
    And I click on element with xpath "//*[@id='mat-radio-2']//*[@class='mat-radio-label-content']"
    And I wait for 1 sec
    #And I type "<Text>" into element with xpath "//*[@id='mat-input-3']"
    And I click on element with xpath "//*[contains(text(),'Save')]"
    Then element with xpath "//*[@class='mat-expansion-panel-header-title error']/../../..//*[contains(text(),'This field is required')]" should be presented


  @test3
  Scenario: Text - Leading spaces
      #ASK-556
    Given I open url "http://local.school.portnov.com:4520/#/login"
    And I wait for 3 sec
    When I type "lfelipe@gag16dotw7t.tk" into element with xpath "//*[@id='mat-input-0']"
    And I type "12345" into element with xpath "//*[@id='mat-input-1']"
    And I click on element with xpath "//*[contains(text(),'Sign In')]"
    And I wait for 3 sec
    Then element with xpath "//h3[contains(text(),'Olga Petrova')]" should be presented
    And I wait for 3 sec
    When I click on element with xpath "//h5[contains(text(),'Quizzes')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be presented
    When I click on element with xpath "//*[contains(text(),'Create New Quiz')]"
    And I wait for 3 sec
    When I type "$$000SQA1auto_DONT_TOUCH" into element with xpath "//*[@id='mat-input-2']"
    And I click on element with xpath "//*[@class='mat-icon material-icons']"
    And I click on element with xpath "//*[@id='mat-radio-2']//*[@class='mat-radio-label-content']"
    And I wait for 1 sec
    And I type "⠀⠀ LeadingSpace" into element with xpath "//*[@id='mat-input-3']"
    And I click on element with xpath "//*[contains(text(),'Save')]"
    And I wait for 6 sec
    Then element with xpath "//*[contains(text(),'$$000SQA1auto_DONT_TOUCH')]" should be presented
    When I click on element with xpath "//*[contains(text(),'$$000SQA1auto_DONT_TOUCH')]"
    And I wait for 2 sec
    And I click on element with xpath "//mat-panel-title[contains(text(),'$$000SQA1auto_DONT_TOUCH')]/../../..//*[contains(text(),'Preview')]"
    And I wait for 3 sec
      #Then verify!!!!!
      #!!!!!!!!!!!!!!!!!!!!!!!!!!!
      #Deleting
    And I click on element with xpath "//*[contains(text(),'Close')]"
    And I wait for 2 sec
    And I click on element with xpath "//mat-panel-title[contains(text(),'$$000SQA1auto_DONT_TOUCH')]/../../..//*[contains(text(),'Delete')]"
    And I wait for 2 sec
    And I click on element with xpath "//div[@class='mat-dialog-actions']//*[contains(text(),'Delete')]"
    And I wait for 3 sec

  @test4
  Scenario: Text - TrailingSpace
      #ASK-557
    Given I open url "http://local.school.portnov.com:4520/#/login"
    And I wait for 3 sec
    When I type "lfelipe@gag16dotw7t.tk" into element with xpath "//*[@id='mat-input-0']"
    And I type "12345" into element with xpath "//*[@id='mat-input-1']"
    And I click on element with xpath "//*[contains(text(),'Sign In')]"
    And I wait for 3 sec
    Then element with xpath "//h3[contains(text(),'Olga Petrova')]" should be presented
    And I wait for 3 sec
    When I click on element with xpath "//h5[contains(text(),'Quizzes')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be presented
    When I click on element with xpath "//*[contains(text(),'Create New Quiz')]"
    And I wait for 3 sec
    When I type "$$000SQA1auto_DONT_TOUCH" into element with xpath "//*[@id='mat-input-2']"
    And I click on element with xpath "//*[@class='mat-icon material-icons']"
    And I click on element with xpath "//*[@id='mat-radio-2']//*[@class='mat-radio-label-content']"
    And I wait for 1 sec
    And I type "TrailingSpace⠀⠀ " into element with xpath "//*[@id='mat-input-3']"
    And I click on element with xpath "//*[contains(text(),'Save')]"
    And I wait for 6 sec
    Then element with xpath "//*[contains(text(),'$$000SQA1auto_DONT_TOUCH')]" should be presented
    When I click on element with xpath "//*[contains(text(),'$$000SQA1auto_DONT_TOUCH')]"
    And I wait for 2 sec
    And I click on element with xpath "//mat-panel-title[contains(text(),'$$000SQA1auto_DONT_TOUCH')]/../../..//*[contains(text(),'Preview')]"
    And I wait for 3 sec
      #Then verify!!!!!
      #!!!!!!!!!!!!!!!!!!!!!!!!!!!
      #Deleting
    And I click on element with xpath "//*[contains(text(),'Close')]"
    And I wait for 2 sec
    And I click on element with xpath "//mat-panel-title[contains(text(),'$$000SQA1auto_DONT_TOUCH')]/../../..//*[contains(text(),'Delete')]"
    And I wait for 2 sec
    And I click on element with xpath "//div[@class='mat-dialog-actions']//*[contains(text(),'Delete')]"
    And I wait for 3 sec


        #test5
  Scenario: Text - Whitespace  ⠀⠀ character
      #ASK-558
    Given I open url "http://local.school.portnov.com:4520/#/login"
    And I wait for 3 sec
    When I type "lfelipe@gag16dotw7t.tk" into element with xpath "//*[@id='mat-input-0']"
    And I type "12345" into element with xpath "//*[@id='mat-input-1']"
    And I click on element with xpath "//*[contains(text(),'Sign In')]"
    And I wait for 3 sec
    Then element with xpath "//h3[contains(text(),'Olga Petrova')]" should be presented
    And I wait for 3 sec
    When I click on element with xpath "//h5[contains(text(),'Quizzes')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be presented
    When I click on element with xpath "//*[contains(text(),'Create New Quiz')]"
    And I wait for 3 sec
    When I type "$$000SQA1auto_DONT_TOUCH" into element with xpath "//*[@id='mat-input-2']"
    And I click on element with xpath "//*[@class='mat-icon material-icons']"
    And I click on element with xpath "//*[@id='mat-radio-2']//*[@class='mat-radio-label-content']"
    And I wait for 1 sec
    And I type "Whitespace  ⠀⠀ character" into element with xpath "//*[@id='mat-input-3']"
    And I click on element with xpath "//*[contains(text(),'Save')]"
    And I wait for 6 sec
    Then element with xpath "//*[contains(text(),'$$000SQA1auto_DONT_TOUCH')]" should be presented
    When I click on element with xpath "//*[contains(text(),'$$000SQA1auto_DONT_TOUCH')]"
    And I wait for 2 sec
    And I click on element with xpath "//mat-panel-title[contains(text(),'$$000SQA1auto_DONT_TOUCH')]/../../..//*[contains(text(),'Preview')]"
    And I wait for 3 sec
      #Then verify!!!!!
      #!!!!!!!!!!!!!!!!!!!!!!!!!!!
      #Deleting
    And I click on element with xpath "//*[contains(text(),'Close')]"
    And I wait for 2 sec
    And I click on element with xpath "//mat-panel-title[contains(text(),'$$000SQA1auto_DONT_TOUCH')]/../../..//*[contains(text(),'Delete')]"
    And I wait for 2 sec
    And I click on element with xpath "//div[@class='mat-dialog-actions']//*[contains(text(),'Delete')]"
    And I wait for 3 sec

  #@test6 Text -  Whitespaces only   Need to specify
  #ASK-560

  #@test8  1000+1  Need to specify
  #ASK-562

  #@test9  One line
  #ASK-564








