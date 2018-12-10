Feature: Assignment - Create (ASK-966)

  Background: Open login page
    Given V get url "http://local.school.portnov.com:4520/#/login"

  Scenario: Assignment - Create (ASK-967)
    When V login as teacher "VladimirTeacher.test@gmail.com" with password "12345"
    Then V verify "//p[contains(text(),'TEACHER')]" is displayed
    When V open Assignments list
    And V wait for "//*[contains(text(),'List of Assignments')]"
    And V wait for 1000 msec
    And V click on element with xpath "//*[contains(text(),'Create New Assignment')]"
    And V assign quiz "Q" to student "Vladimir Student"
    And V wait for "//*[contains(text(),'List of Assignments')]"
    Then V verify if quiz "Q" assigned to student "Vladimir Student" in the List of Assignments

  Scenario: Assignment-Missing Quiz (ASK-1044)
    When V login as teacher "VladimirTeacher.test@gmail.com" with password "12345"
    Then V verify "//p[contains(text(),'TEACHER')]" is displayed
    When V open quizzes list
    And V wait for "//*[contains(text(),'List of Quizzes')]"
    And V create quiz "SQA"
    And V create 1 textual question "Explain SDLC methodology?"
    And V save
    And V click on element with xpath "(//mat-panel-title[contains(text(),'SQA')])[1]"
    And I wait for 1 sec
    And V click on element with xpath "(//mat-panel-title[contains(text(),'SQA')])[1]/../../..//*[contains(text(),'Delete')]"
    And V wait for "//div[@class='mat-dialog-actions']//*[contains(text(),'Delete')]"
    And V click on element with xpath "//div[@class='mat-dialog-actions']//*[contains(text(),'Delete')]"
    And I wait for 1 sec
    Then V verify "//*[contains(text(),'SQA')]" is not displayed
    When V open Assignments list
    Then V verify "//*[contains(text(),'List of Assignments')]" is displayed
    When I wait for 1 sec
    When V click on element with xpath "//*[contains(text(),'Create New Assignment')]"
    And V click on element with xpath "(//mat-form-field)[2]"
    Then V verify "//div[@id='cdk-overlay-0']//*[contains(text(),'Q2')]" is not displayed

  Scenario: Assignment-Missing Group (ASK-1042)
    When V login as teacher "VladimirTeacher.test@gmail.com" with password "12345"
    Then V verify "//p[contains(text(),'TEACHER')]" is displayed
    When V open Assignments list
    When I wait for 1 sec
    When V click on element with xpath "//*[contains(text(),'Create New Assignment')]"
    And I wait for 1 sec
    And V click on element with xpath "(//mat-form-field)[1]"
    Then V verify "//div[@id='cdk-overlay-0']//*[contains(text(),'4222')]" is not displayed

  Scenario: Assignment-Missing Student (ASK-1043)
    When I wait for 1 sec
    And V delete account "Vladimir TestActivation", if exist
    And V logout
    And I wait for 3 sec
    When V click on element with xpath "//*[contains(text(),'Register Now')]"
    And V type "Vladimir" into the element with xpath "//*[@placeholder='First Name']"
    And V type "TestActivation" into the element with xpath "//*[@placeholder='Last Name']"
    And V type "vladimir.testactivation@yandex.com" into the element with xpath "//*[@placeholder='Email']"
    And V type "V001" into the element with xpath "//*[@placeholder='Group Code']"
    And V type "12345" into the element with xpath "//*[@placeholder='Password']"
    And V type "12345" into the element with xpath "//*[@placeholder='Confirm Password']"
    And V click on element with xpath "//*[@type='submit']"
    And V wait for "//*[contains(text(),'You have been Registered.')]"
    Then V verify "//*[contains(text(),'You have been Registered.')]" is displayed
    When V get url "https://mail.yandex.com/"
    And V wait for "(//*[contains(text(),'Log in')])[1]/.."
    And V click on element with xpath "(//*[contains(text(),'Log in')])[1]/.."
    And V login to yandex mail with login "vladimir.testactivation@yandex.com" and password "TestActivation" and activate account
    When V get url "http://local.school.portnov.com:4520/#/login"
    And V delete account "Vladimir TestActivation", if exist
    And V open Assignments list
    And I wait for 1 sec
    And V click on element with xpath "//span[contains(text(),'Create New Assignment')]/.."
    And I wait for 1 sec
    And V click on element with xpath "//*[@placeholder='Group Filter']"
    And I wait for 1 sec
    And V click on element with xpath "//span[@class='mat-option-text'][contains(text(),'V001')]"
    And I wait for 1 sec
    Then V verify that student "Vladimir TestActivation" is not in the list




#    And I wait for 3 sec
