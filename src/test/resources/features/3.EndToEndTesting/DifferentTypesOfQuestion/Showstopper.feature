Feature: Showstopper
  Scenario: Showstopper
    Given Navigate to web page "http://local.school.portnov.com:4520/#/login"
    Then I type email into email field
    Then I type password into password field
    Then I push "SignIn" button
    Then I click on "Quizzes"
    Then I click "Create New Quiz" button
    And  I type the Title into a Title of the quiz field
    Then I type "SQA" into the element with xpath "//input[@placeholder='Title Of The Quiz *']"
    And I click  the "Add Question" button
    Then I click on "Textual Question" button
    Then I type on the "textarea"into element with xpath "//textarea[@id='mat-input-129']"
    And I click  on the "Add Question" button
    Then I click on 2"Textual question" type
    Then I type on "textarea" into element with xpath "//textarea[@id='mat-input-129']"
    And  I click on the "Add Question" buttons
    Then I click on the 3"Textual question"type
    Then I type"textarea" into element with xpath "//textarea[@id='mat-input-129']"
    And  click on "Add question" button
    Then I choice on "single-Choice" button
    Then type "textarea" into element with "//textarea[@id='mat-input-129']"
    And  I type the "Option1"
    Then  Type the "Option2"
    Then I choose a " Option1" as  true


    Then click on the"Add question" buttons
    And I choice the 2"single-Choice" button
    Then   type the"textarea" into element with xpath "//textarea[@id='mat-input-129']"
     And  I type on the "Option1"
    Then  type "option2"
   Then i choose a "Option1" as truee

   Then click on the"Add question" button
    Then I choice on "Multiple question"
    And I type Multiple "Option1"
    Then I type a Multiple "Option2"
    Then I Type a Multiple "Option
    Then I choose a  Option2 as true
    Then   Click  "Save" button





