Feature: The teacher creates a quiz with 3 textual, 3 multiple-choice, 3 single-choice questions and 75% of the passing rate
  Background: Teacher account exist
    Scenario: The teacher creates a quiz with 3 textual, 3 multiple-choice, 3 single-choice questions and 75% of the passing rate
      Given Navigate to login page "http://local.school.portnov.com:4520/#/login"
      When I type "VasyaPetrovTeacher@gmail.com" into element with xpath "//input[@id='mat-input-0']"
      And I type "123456" into element with xpath "//input[@id='mat-input-1']"
      And I click on element with xpath "//button[@type='submit']"
      And I wait for 5 sec
      Then element with xpath "//h3[text()='Vasya Petrov']" should be displayed

#      When I click on element with xpath "//h5[contains(text(),'Quizzes')]"
#      And I wait for 5 sec
#      Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed
#
#      When I click on element with xpath "//span[contains(text(),'Create New Quiz')]"
#      Then element with xpath "//input[@id='mat-input-2']" should be displayed
#
#      When I type "New quiz with 3 text,3 multiple, 3 single" into element with xpath "//input[@id='mat-input-2']"
#      Then element with xpath "//*[text()='add_circle']" should be displayed
#
#      When I click on element with xpath "//*[text()='add_circle']"
#      Then element with xpath "//div[contains(text(), 'Question Type')]" should be displayed
#
#      #3 text q
#      When I click on element with xpath "//*[@id='mat-radio-2-input']"
#      And I type "Some text for First Question" into element with xpath "//*[@id='mat-input-4']"
#      And I click on element with xpath "//*[text()='add_circle']"
#
#      When I click on element with xpath "//*[@id='mat-radio-2-input']"
#      And I type "Some text for Second Question" into element with xpath "//*[@id='mat-input-4']"
#      And I click on element with xpath "//*[text()='add_circle']"
#
#      When I click on element with xpath "//*[@id='mat-radio-2-input']"
#      And I type "Some text for Third Question" into element with xpath "//*[@id='mat-input-4']"
#      And I click on element with xpath "//*[text()='add_circle']"
#
#      #3 multiple q
#      When I click on element with xpath "//*[@id='mat-radio-8-input']"
#      And I type "Some text for First Question" into element with xpath "//*[@id='mat-input-5']"
#      And I type "Some text for First answer" into element with xpath "//*[@id='mat-input-8']"
#      And I type "Some text for Second answer" into element with xpath "//*[@id='mat-input-9']"
#      And I click on element with xpath "//mat-checkbox[@id='mat-checkbox-5']"
#      And I click on element with xpath "//mat-checkbox[@id='mat-checkbox-6']"
#      And I click on element with xpath "//*[text()='add_circle']"
#
#      When I click on element with xpath "//*[@id='mat-radio-8-input']"
#      And I type "Some text for Second Question" into element with xpath "//*[@id='mat-input-5']"
#      And I type "Some text for First answer" into element with xpath "//*[@id='mat-input-8']"
#      And I type "Some text for Second answer" into element with xpath "//*[@id='mat-input-9']"
#      And I click on element with xpath "//mat-checkbox[@id='mat-checkbox-5']"
#      And I click on element with xpath "//mat-checkbox[@id='mat-checkbox-6']"
#      And I click on element with xpath "//*[text()='add_circle']"
#
#      When I click on element with xpath "//*[@id='mat-radio-8-input']"
#      And I type "Some text for Third Question" into element with xpath "//*[@id='mat-input-5']"
#      And I type "Some text for First answer" into element with xpath "//*[@id='mat-input-8']"
#      And I type "Some text for Second answer" into element with xpath "//*[@id='mat-input-9']"
#      And I click on element with xpath "//mat-checkbox[@id='mat-checkbox-5']"
#      And I click on element with xpath "//mat-checkbox[@id='mat-checkbox-6']"
#      And I click on element with xpath "//*[text()='add_circle']"
#
#     #3 single q
#      When I click on element with xpath "//*[@id='mat-radio-7']']"
#      And I type "Some text for First Question" into element with xpath "//*[@id='mat-input-5']"
#      And I type "Some text for First answer" into element with xpath "//*[@id='mat-input-6']"
#      And I type "Some text for Second answer" into element with xpath "//*[@id='mat-input-7']"
#      And I click on element with xpath "//input[@id='mat-radio-10-input']"












