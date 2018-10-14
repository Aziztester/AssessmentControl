Feature: Automate TC "Teacher Creates Quiz with 5 Multiple Choice Questions" (ASK-765)
    #Test Case: ASK-263 Teacher Creates Quiz with 5 Multiple Choice Questions
Background: Log into an existing teacher account
Given I open url "http://local.school.portnov.com:4520/#/login"
And I wait for 3 sec
Then I click on element with xpath "//input[@placeholder='Email *']"
And I type "lfelipe@gag16dotw7t.tk" into element with xpath "//input[@placeholder='Email *']"
Then I click on element with xpath "//input[@placeholder='Password *']"
Then I type "12345" into element with xpath "//input[@placeholder='Password *']"
And I wait for 3 sec
Then I click on element with xpath "//button[@type='submit']"
And I wait for 3 sec
Then I open url "http://local.school.portnov.com:4520/#/home"
And I wait for 5 sec
When I click on element with xpath "//h5[contains(text(),'Quizzes')]"
And I wait for 5 sec
Then element with xpath "//mat-card[@class='page mat-card ng-star-inserted']" should be displayed
Then I click on element with xpath "//span[contains(text(),'Create New Quiz')]"
And I wait for 3 sec

@Test-5MultipleChoiceQuestions
Scenario: Create a Quiz with 5 Multiple Choice questions
And element with xpath "//*[@placeholder = 'Title Of The Quiz *']" should be displayed
When I click on element with xpath "//*[@placeholder = 'Title Of The Quiz *']"
Then I type "ASK-263 Teacher Creates Quiz with 5 Multiple Choice Questions" into element with xpath "//*[@placeholder = 'Title Of The Quiz *']"
Then I click on element with xpath "//*[contains(text(), 'add_circle')]"
And I wait for 2 sec
  #Question 1
When I click on element with xpath "//*[contains(text(), 'Q1')]/../../..//div[contains(text(), 'Multiple-Choice')]"
Then element with xpath "//div[@class='mat-input-infix mat-form-field-infix']" should be displayed
And element with xpath "//*[contains(text(), 'Q1')]/../../..//textarea[@placeholder='Question *']" should be displayed
And I type "What is a Bug?" into element with xpath "//*[contains(text(), 'Q1')]/../../..//textarea[@placeholder='Question *']"
And I wait for 3 sec
    # input options
Then I type "Mismatch between actual and intended behaviors of the software." into element with xpath "//*[contains(text(), 'Q1')]/../../..//*[@placeholder='Option 1*']"
Then I type "Some small insect that flies around." into element with xpath "//*[contains(text(), 'Q1')]/../../..//*[@placeholder='Option 2*']"
And I wait for 3 sec
      #show correct response
And I click on element with xpath "//*[contains(text(), 'Q1')]/../../..//label[contains(text(), 'Option 1')]/../../../../../..//*[@class='answer mat-checkbox mat-accent']"
And I wait for 2 sec

Then I click on element with xpath "//*[contains(text(), 'add_circle')]"
And I wait for 5 sec
  #Question 2
Then element with xpath "//*[contains(text(), 'new empty question')]" should be displayed
And I click on element with xpath "//*[contains(text(), 'Q2')]/../../..//div[@class='mat-radio-label-content'][contains(text(), 'Multiple-Choice')]"
Then element with xpath "//*[contains(text(), 'Q2')]/../../..//textarea[@placeholder='Question *']" should be displayed
And I type "Are Java and Javascript same languages?" into element with xpath "//*[contains(text(), 'Q2')]/../../..//textarea[@placeholder='Question *']"
And I wait for 3 sec
 #   # input options
Then I type "Yes" into element with xpath "//*[contains(text(), 'Q2')]/../../..//*[@placeholder='Option 1*']"
Then I type "No" into element with xpath "//*[contains(text(), 'Q2')]/../../..//*[@placeholder='Option 2*']"
And I wait for 3 sec
 #      #show correct response
And I click on element with xpath "//*[contains(text(), 'Q2')]/../../..//label[contains(text(), 'Option 2')]/../../../../../..//*[@class='answer mat-checkbox mat-accent']"
And I wait for 2 sec
Then I click on element with xpath "//*[contains(text(), 'add_circle')]"
And I wait for 5 sec
  #Question 3
Then element with xpath "//*[contains(text(), 'Q3')]/../../..//div[@class='mat-radio-label-content'][contains(text(), 'Multiple-Choice')]" should be displayed
And I click on element with xpath "//*[contains(text(), 'Q3')]/../../..//div[contains(text(), 'Multiple-Choice')]"
Then element with xpath "//*[contains(text(), 'Q3')]/../../..//textarea[@placeholder='Question *']" should be displayed
And I type "What is a prime objective of a bug tracking database?" into element with xpath "//*[contains(text(), 'Q3')]/../../..//textarea[@placeholder='Question *']"
And I wait for 3 sec
    # input options
Then I type "Tracking the bugs" into element with xpath "//*[contains(text(), 'Q3')]/../../..//*[@placeholder='Option 1*']"
Then I type "To get a bug fixed" into element with xpath "//*[contains(text(), 'Q3')]/../../..//*[@placeholder='Option 2*']"
And I wait for 3 sec
 #      #show correct response
And I click on element with xpath "//*[contains(text(), 'Q3')]/../../..//label[contains(text(), 'Option 2')]/../../../../../..//*[@class='answer mat-checkbox mat-accent']"
And I wait for 2 sec
Then I click on element with xpath "//*[contains(text(), 'add_circle')]"
And I wait for 5 sec
  #Question 4
Then element with xpath "//*[contains(text(), 'Q4')]/../../..//div[@class='mat-radio-label-content'][contains(text(), 'Multiple-Choice')]" should be displayed
And I click on element with xpath "//*[contains(text(), 'Q4')]/../../..//div[contains(text(), 'Multiple-Choice')]"
Then element with xpath "//*[contains(text(), 'Q4')]/../../..//textarea[@placeholder='Question *']" should be displayed
And I type "Who can assign/change a severity in a bug report?" into element with xpath "//*[contains(text(), 'Q4')]/../../..//textarea[@placeholder='Question *']"
And I wait for 3 sec
    # input options
Then I type "Development Manager" into element with xpath "//*[contains(text(), 'Q4')]/../../..//*[@placeholder='Option 1*']"
Then I type "Tester" into element with xpath "//*[contains(text(), 'Q4')]/../../..//*[@placeholder='Option 2*']"
And I wait for 3 sec
       #show correct response
And I click on element with xpath "//*[contains(text(), 'Q4')]/../../..//label[contains(text(), 'Option 2')]/../../../../../..//*[@class='answer mat-checkbox mat-accent']"
And I wait for 2 sec
Then I click on element with xpath "//*[contains(text(), 'add_circle')]"
And I wait for 5 sec
  #Question 5
Then element with xpath "//*[contains(text(), 'Q5')]/../../..//div[@class='mat-radio-label-content'][contains(text(), 'Multiple-Choice')]" should be displayed
And I click on element with xpath "//*[contains(text(), 'Q5')]/../../..//div[contains(text(), 'Multiple-Choice')]"
Then element with xpath "//*[contains(text(), 'Q5')]/../../..//textarea[@placeholder='Question *']" should be displayed
And I type "What does SQL stand for?" into element with xpath "//*[contains(text(), 'Q5')]/../../..//textarea[@placeholder='Question *']"
And I wait for 3 sec
    # input options
Then I type "Structural Query Language" into element with xpath "//*[contains(text(), 'Q5')]/../../..//*[@placeholder='Option 1*']"
Then I type "Standard Query Language" into element with xpath "//*[contains(text(), 'Q5')]/../../..//*[@placeholder='Option 2*']"
And I wait for 3 sec
       #show correct response
And I click on element with xpath "//*[contains(text(), 'Q5')]/../../..//label[contains(text(), 'Option 1')]/../../../../../..//*[@class='answer mat-checkbox mat-accent']"
And I wait for 2 sec
    # save quiz
Then I click on element with xpath "//span[contains(text(),'Save')]"
And I wait for 5 sec
Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be presented
And I wait for 5 sec
Then I scroll to the element with xpath "//mat-panel-title[contains(text(),'ASK-263 Teacher Creates Quiz with 5 Multiple Choice Questions')]" with offset 5
And I wait for 2 sec
Then element with xpath "//mat-panel-title[contains(text(),'ASK-263 Teacher Creates Quiz with 5 Multiple Choice Questions')]" should be displayed
And I wait for 5 sec