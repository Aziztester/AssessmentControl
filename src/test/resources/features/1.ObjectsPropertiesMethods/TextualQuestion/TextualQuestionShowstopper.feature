Feature: TextualQuestion-Showstopper (ASK-395)

  @TextualQuestion-Showstopper (ASK-395)
  Scenario: TextualQuestion-Showstopper (ASK-395)
    When  Open url f rf"http://local.school.portnov.com:4520/#/login"
    Then Type email address and password
    Then Click on the element with xpath "//button[@type='submit']"
    When Click on the element "Quizzes"
    Then Click quiz "Create New Quiz" with path "//*[contains(text(),'Create New Quiz')]"
    And  Type the title of Quiz  "Textual Question: With Show-stopper" with path "//*[@id='mat-input-30']"
    And Click "Add Question" with path "//*[@class='mat-icon material-icons']"
    And Click Element "Textual" with path "//*[@id='mat-radio-2']//*[@class='mat-radio-label-content']"
    And Type question in text field with path "//*[@id='mat-input-3']"
    And Click checkbox "Is "Show-Stopper"question?" with path "//*[@class='mat-checkbox-inner-container']"
    Then Click button "Save"  with path "//*[contains(text(),'Save')]"
    Then Verify the quiz "Textual Question: With Show-stopper" with path "//*[@id='mat-expansion-panel-header-440']" is displayed
    When Choose the Quiz "//*[contains(text(), 'List of Quizzes')]/..//*[contains(text(),'Textual Question: With Show-stopper')]"
    And Click Delete with path "//*[contains(text(),'Textual Question: With Show-stopper')]/../../..//*[contains(text(),'Delete')]"
    Then Click the Confirmation with path "//div[@class='mat-dialog-actions']//button[2]"














