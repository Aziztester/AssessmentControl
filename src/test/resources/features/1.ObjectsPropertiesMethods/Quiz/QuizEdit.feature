Feature: Automate TC Quiz Edit
  Background: Login as a Teacher and Go to Quizzes Pafe
    Given I open url "http://local.school.portnov.com:4520/#/login"
    And I wait for 3 sec
    When I login with E-mail "lfelipe@gag16dotw7t.tk" and Password "12345"
    Then "Olga Petrova" should display at the left top corner
    When I click Menu Item "Quizzes" and wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed

  #Preparation for Quiz Edit: Create Quiz
  Scenario: Preparation: Teacher Creates a Quiz
    When I click on element with xpath "//span[contains(text(),'Create New Quiz')]"
    And I wait for 1 sec
    Then element with xpath "//input[contains(@placeholder, 'Title Of The Quiz')]" should be displayed
    When I type "ASK-844 (ASK-532) Test Quiz" into element with xpath "//input[contains(@placeholder, 'Title Of The Quiz')]"
    And I click on element with xpath "//*[contains(text(), 'add_circle')]"
    And I wait for 1 sec
    Then element with xpath "//div[contains(text(), 'Question Type')]" should be displayed
    When I click on element with xpath "//*[contains(text(), 'Q1')]/../../..//div[contains(text(), 'Textual')]"
    And I wait for 1 sec
    Then element with xpath "//*[contains(text(), 'Q1')]/../../..//textarea[@placeholder='Question *']" should be displayed
    When I type "What is Software Testing?" into element with xpath "//*[contains(text(), 'Q1')]/../../..//textarea[@placeholder='Question *']"
    Then I wait for 1 sec
    When I click on element with xpath "//span[contains(text(),'Save')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed

  #ASK-531 Quiz Edit: Change Title
  @Test-QuizEdit-ChangeTitle
  Scenario: Quiz Edit: Change Title to new, save changes, then change title to the old one
    When I scroll to the element with xpath "//*[contains(text(),'ASK-844 (ASK-532) Test Quiz')]" with offset 5
    And I click on element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../.."
    And I wait for 1 sec
    Then element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../..//*[contains(text(),'Edit')]" should be displayed
    When I click on element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../..//*[contains(text(),'Edit')]/.."
    And I wait for 1 sec
    Then element with xpath "//label[contains(text(),'Title Of The Quiz')]" should be displayed
    When I clear element with xpath "//input[contains(@placeholder, 'Title Of The Quiz')]"
    And I type "Changed Title for ASK-844 (ASK-532) Test Quiz" into element with xpath "//input[contains(@placeholder, 'Title Of The Quiz')]"
    And I click on element with xpath "//span[contains(text(), 'Save')]/.."
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed
    When I scroll to the element with xpath "//*[contains(text(),'Changed Title for ASK-844 (ASK-532) Test Quiz')]" with offset 5
    And I click on element with xpath "//*[contains(text(), 'Changed Title for ASK-844 (ASK-532) Test Quiz')]/../../.."
    And I wait for 1 sec
    Then element with xpath "//*[contains(text(), 'Changed Title for ASK-844 (ASK-532) Test Quiz')]/../../..//*[contains(text(),'Edit')]" should be displayed
    When I click on element with xpath "//*[contains(text(), 'Changed Title for ASK-844 (ASK-532) Test Quiz')]/../../..//*[contains(text(),'Edit')]/.."
    And I wait for 1 sec
    Then element with xpath "//label[contains(text(),'Title Of The Quiz')]" should be displayed
    When I clear element with xpath "//input[contains(@placeholder, 'Title Of The Quiz')]"
    And I type "ASK-844 (ASK-532) Test Quiz" into element with xpath "//input[contains(@placeholder, 'Title Of The Quiz')]"
    And I click on element with xpath "//span[contains(text(), 'Save')]/.."
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed
    When I scroll to the element with xpath "//*[contains(text(),'ASK-844 (ASK-532) Test Quiz')]" with offset 5
    And I wait for 1 sec

  #ASK-542 Quiz Edit: Change Passing Rate
  @Test-QuizEdit-ChangePassingRate
  Scenario: Quiz Edit: Change Passing Rate
    When I scroll to the element with xpath "//*[contains(text(),'ASK-844 (ASK-532) Test Quiz')]" with offset 5
    And I click on element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../.."
    And I wait for 1 sec
    Then element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../..//*[contains(text(),'Edit')]" should be displayed
    When I click on element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../..//*[contains(text(),'Edit')]/.."
    And I wait for 1 sec
    Then element with xpath "//h3[contains(text(),'Passing Rate')]" should be displayed
    When I click on element with xpath "//h3[contains(text(),'Passing Rate')]/..//span[contains(text(),'-')]/.."
    And I wait for 1 sec
    Then element with xpath "//h1[contains(text(),'74%')]" should be displayed
    When I click on element with xpath "//h3[contains(text(),'Passing Rate')]/..//span[contains(text(),'+')]/.."
    And I click on element with xpath "//h3[contains(text(),'Passing Rate')]/..//span[contains(text(),'+')]/.."
    And I wait for 1 sec
    Then element with xpath "//h1[contains(text(),'76%')]" should be displayed
    Then I wait for 1 sec
    When I click on element with xpath "//span[contains(text(),'Save')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed

  #ASK-533 Quiz Edit: Add Question
  @Test-QuizEdit-AddQuestion
  Scenario: Quiz Edit: Add Question to existing Quizz
    When I scroll to the element with xpath "//*[contains(text(),'ASK-844 (ASK-532) Test Quiz')]" with offset 5
    And I click on element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../.."
    And I wait for 1 sec
    Then element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../..//*[contains(text(),'Edit')]" should be displayed
    When I click on element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../..//*[contains(text(),'Edit')]/.."
    And I wait for 1 sec
    Then element with xpath "//label[contains(text(),'Title Of The Quiz')]" should be displayed
    When I click on element with xpath "//*[contains(text(), 'add_circle')]"
    And I wait for 2 sec
    Then element with xpath "//*[contains(text(), 'Q2')]/../../..//div[contains(text(), 'Question Type')]" should be displayed
    When I click on element with xpath "//*[contains(text(), 'Q2')]/../../..//div[contains(text(), 'Multiple-Choice')]"
    And I wait for 1 sec
    Then element with xpath "//*[contains(text(), 'Q2')]/../../..//textarea[@placeholder='Question *']" should be displayed
    When I type "Are Java and Javascript same languages?" into element with xpath "//*[contains(text(), 'Q2')]/../../..//textarea[@placeholder='Question *']"
    And I wait for 1 sec
    Then I type "Yes" into element with xpath "//*[contains(text(), 'Q2')]/../../..//*[@placeholder='Option 1*']"
    Then I type "No" into element with xpath "//*[contains(text(), 'Q2')]/../../..//*[@placeholder='Option 2*']"
    Then I click on element with xpath "//*[contains(text(), 'Q2')]/../../..//*[contains(text(), 'Option 2')]/../../../../../..//mat-checkbox"
    Then I wait for 1 sec
    When I click on element with xpath "//span[contains(text(),'Save')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed

  #ASK-540 Quiz Edit: Reorder Questions
  Scenario: Quiz Edit: Reorder Questions inside Quiz
    When I scroll to the element with xpath "//*[contains(text(),'ASK-844 (ASK-532) Test Quiz')]" with offset 5
    And I click on element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../.."
    And I wait for 1 sec
    Then element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../..//*[contains(text(),'Edit')]" should be displayed
    When I click on element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../..//*[contains(text(),'Edit')]/.."
    And I wait for 1 sec
    Then element with xpath "//label[contains(text(),'Title Of The Quiz')]" should be displayed
    When I scroll to the element with xpath "//*[contains(text(),'Q2')]/../.." with offset 5
    And I click on element with xpath "//*[contains(text(),'Q2')]/../.."
    And I wait for 1 sec
    Then element with xpath "//*[contains(text(), 'Q2')]/../../..//textarea[@placeholder='Question *']" should be displayed
    When I scroll to the element with xpath "//*[contains(text(), 'Q2')]/../../..//span[contains(text(),'Move Question Up')]" with offset 5
    And I click on element with xpath "//*[contains(text(), 'Q2')]/../../..//span[contains(text(),'Move Question Up')]/.."
    Then element with xpath "//*[contains(text(), 'Q1')]/../../..//textarea[@placeholder='Question *']" should be displayed
    Then I wait for 1 sec
    When I click on element with xpath "//span[contains(text(),'Save')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed
    When I scroll to the element with xpath "//*[contains(text(),'ASK-844 (ASK-532) Test Quiz')]" with offset 5
    And I click on element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../.."
    And I wait for 1 sec
    Then element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../..//*[contains(text(),'Edit')]" should be displayed
    When I click on element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../..//*[contains(text(),'Edit')]/.."
    And I wait for 1 sec
    Then element with xpath "//label[contains(text(),'Title Of The Quiz')]" should be displayed
    When I click on element with xpath "//*[contains(text(),'Q1')]/../.."
    And I wait for 1 sec
    Then element with xpath "//*[contains(text(), 'Q1')]/../../..//textarea[@placeholder='Question *']" should be displayed
    When I scroll to the element with xpath "//*[contains(text(), 'Q1')]/../../..//span[contains(text(),'Move Question Down')]" with offset 5
    And I click on element with xpath "//*[contains(text(), 'Q1')]/../../..//span[contains(text(),'Move Question Down')]/.."
    Then element with xpath "//*[contains(text(), 'Q2')]/../../..//textarea[@placeholder='Question *']" should be displayed
    Then I wait for 1 sec
    When I click on element with xpath "//span[contains(text(),'Save')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed

  #ASK-535 Quiz Edit: Delete Question
  @Test-QuizEdit-DeleteQuestion
  Scenario: Quiz Edit: Delete Question from existing Quizz
    When I scroll to the element with xpath "//*[contains(text(),'ASK-844 (ASK-532) Test Quiz')]" with offset 5
    And I click on element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../.."
    And I wait for 1 sec
    Then element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../..//*[contains(text(),'Edit')]" should be displayed
    When I click on element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../..//*[contains(text(),'Edit')]/.."
    And I wait for 1 sec
    Then element with xpath "//label[contains(text(),'Title Of The Quiz')]" should be displayed
    When I scroll to the element with xpath "//*[contains(text(),'Q2')]/../.." with offset 5
    And I click on element with xpath "//*[contains(text(),'Q2')]/../.."
    And I wait for 1 sec
    Then element with xpath "//*[contains(text(), 'Q2')]/../../..//textarea[@placeholder='Question *']" should be displayed
    When I scroll to the element with xpath "//*[contains(text(), 'Q2')]/../../..//*[contains(text(),'Delete Question')]" with offset 5
    And I click on element with xpath "//*[contains(text(), 'Q2')]/../../..//*[contains(text(),'Delete Question')]"
    Then element with xpath "//h1[contains(text(),'Confirmation')]" should be displayed
    When I click on element with xpath "//div[@class='mat-dialog-actions']//span[contains(text(),'Delete')]"
    Then I wait for 1 sec
    When I click on element with xpath "//span[contains(text(),'Save')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed

  #ASK-536 Quiz Edit: Change Question Type from Textual to Single-Choice
  @Test-QuizEdit-ChangeQuestionTypeFromTextualToSingle-Choice
  Scenario: Quiz Edit: Change Question Type from Textual to Single-Choice
    When I scroll to the element with xpath "//*[contains(text(),'ASK-844 (ASK-532) Test Quiz')]" with offset 5
    And I click on element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../.."
    And I wait for 1 sec
    Then element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../..//*[contains(text(),'Edit')]" should be displayed
    When I click on element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../..//*[contains(text(),'Edit')]/.."
    And I wait for 1 sec
    Then element with xpath "//label[contains(text(),'Title Of The Quiz')]" should be displayed
    When I click on element with xpath "//*[contains(text(),'Q1')]/../.."
    And I wait for 1 sec
    Then element with xpath "//*[contains(text(), 'Q1')]/../../..//div[contains(text(), 'Question Type')]" should be displayed
    When I click on element with xpath "//*[contains(text(), 'Q1')]/../../..//div[contains(text(), 'Single-Choice')]"
    And I wait for 1 sec
    Then element with xpath "//*[contains(text(), 'Q1')]/../../..//textarea[@placeholder='Question *']" should be displayed
    When I clear element with xpath "//*[contains(text(), 'Q1')]/../../..//textarea[@placeholder='Question *']"
    And I type "What is a Defect?" into element with xpath "//*[contains(text(), 'Q1')]/../../..//textarea[@placeholder='Question *']"
    Then I wait for 1 sec
    When I type "Answer 1" into element with xpath "//*[contains(text(), 'Q1')]/../../..//*[@placeholder='Option 1*']"
    Then I type "Answer 2" into element with xpath "//*[contains(text(), 'Q1')]/../../..//*[@placeholder='Option 2*']"
    Then I click on element with xpath "//*[contains(text(), 'Q1')]/../../..//*[contains(text(), 'Option 1')]/../../../../../..//div[@class='mat-radio-outer-circle']"
    Then I wait for 1 sec
    When I click on element with xpath "//span[contains(text(),'Save')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed

  #ASK-546 Quiz Edit: Reorder Options Inside a Question
#  @Test-QuizEdit-ReorderOptionsInsideQuestion
#  Scenario: Quiz Edit: Reorder Options Inside a Question
#    When I scroll to the element with xpath "//*[contains(text(),'ASK-844 (ASK-532) Test Quiz')]" with offset 5
#    And I click on element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../.."
#    And I wait for 1 sec
#    Then element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../..//*[contains(text(),'Edit')]" should be displayed
#    When I click on element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../..//*[contains(text(),'Edit')]/.."
#    And I wait for 1 sec
#    Then element with xpath "//label[contains(text(),'Title Of The Quiz')]" should be displayed
#    When I click on element with xpath "//*[contains(text(),'Q1')]/../.."
#    And I wait for 1 sec
#    Then element with xpath "//*[contains(text(), 'Q1')]/../../..//div[contains(text(), 'Question Type')]" should be displayed
#    When I click on element with xpath "//*[contains(text(), 'Q1')]/../../..//*[contains(text(), 'Option 2')]/../../../../../..//button"
#    And I wait for 1 sec
#    Then element with xpath "//span[contains(text(), 'Move option up')]" should be displayed
#    When I click on element with xpath "//span[contains(text(), 'Move option up')]/.."
#    Then Element with xpath "//*[contains(text(), 'Q1')]/../../..//*[contains(text(), 'Option 1')]/../../../.." should contain text "Answer 2"
#    And I wait for 1 sec
#    When I click on element with xpath "//*[contains(text(), 'Q1')]/../../..//*[contains(text(), 'Option 1')]/../../../../../..//button"
#    And I wait for 1 sec
#    Then element with xpath "//span[contains(text(), 'Move option down')]" should be displayed
#    When I click on element with xpath "//span[contains(text(), 'Move option down')]/.."
#    Then Element with xpath "//*[contains(text(), 'Q1')]/../../..//*[contains(text(), 'Option 2')]/../../../..//textarea" should contain text "Answer 2"
#    And I wait for 1 sec

  #ASK-548-1 Quiz Edit: Add Option Inside a Simple-Choice Question
  @Test-QuizEdit-AddOptionInsideSimple-ChoiceQuestion
  Scenario: Quiz Edit: Add Option Inside a Simple-Choice Question
    When I scroll to the element with xpath "//*[contains(text(),'ASK-844 (ASK-532) Test Quiz')]" with offset 5
    And I click on element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../.."
    And I wait for 1 sec
    Then element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../..//*[contains(text(),'Edit')]" should be displayed
    When I click on element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../..//*[contains(text(),'Edit')]/.."
    And I wait for 1 sec
    Then element with xpath "//label[contains(text(),'Title Of The Quiz')]" should be displayed
    When I click on element with xpath "//*[contains(text(),'Q1')]/../.."
    And I wait for 1 sec
    Then element with xpath "//*[contains(text(), 'Q1')]/../../..//div[contains(text(), 'Question Type')]" should be displayed
    When I scroll to the element with xpath "//*[contains(text(), 'Q1')]/../../..//*[contains(text(),'Add Option')]" with offset 5
    And I click on element with xpath "//*[contains(text(), 'Q1')]/../../..//span[contains(text(),'Add Option')]/.."
    And I wait for 1 sec
    Then element with xpath "//*[contains(text(), 'Q1')]/../../..//*[contains(text(), 'Option 3')]" should be displayed
    When I type "Answer 3" into element with xpath "//*[contains(text(), 'Q1')]/../../..//*[@placeholder='Option 3*']"
    When I click on element with xpath "//span[contains(text(),'Save')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed

  #ASK-548 Quiz Edit: Delete Option Inside a Simple-Choice Question
  @Test-QuizEdit-DeleteOptionFromSimple-ChoiceQuestion
  Scenario: Quiz Edit: Delete Option From Simple-Choice Question
    When I scroll to the element with xpath "//*[contains(text(),'ASK-844 (ASK-532) Test Quiz')]" with offset 5
    And I click on element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../.."
    And I wait for 1 sec
    Then element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../..//*[contains(text(),'Edit')]" should be displayed
    When I click on element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../..//*[contains(text(),'Edit')]/.."
    And I wait for 1 sec
    Then element with xpath "//label[contains(text(),'Title Of The Quiz')]" should be displayed
    When I click on element with xpath "//*[contains(text(),'Q1')]/../.."
    And I wait for 1 sec
    Then element with xpath "//*[contains(text(), 'Q1')]/../../..//div[contains(text(), 'Question Type')]" should be displayed
    When I scroll to the element with xpath "//*[contains(text(), 'Q1')]/../../..//*[contains(text(),'Option 3')]" with offset 5
    When I click on element with xpath "//*[contains(text(), 'Q1')]/../../..//*[contains(text(), 'Option 3')]/../../../../../..//button"
    And I wait for 1 sec
    Then element with xpath "//span[contains(text(), 'Delete Option')]" should be displayed
    When I click on element with xpath "//span[contains(text(), 'Delete Option')]/.."
    Then element with xpath "//*[contains(text(), 'Q1')]/../../..//div[contains(text(), 'Question Type')]" should be displayed
    Then I wait for 1 sec
    When I click on element with xpath "//span[contains(text(),'Save')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed

  #ASK-537 Quiz Edit: Change Question Type from Single-Choice to Multiple-Choice
  @Test-QuizEdit-ChangeQuestionTypeFromSingle-ChoiceToMultiple-Choice
  Scenario: Quiz Edit: Change Question Type from Single-Choice to Multiple-Choice
    When I scroll to the element with xpath "//*[contains(text(),'ASK-844 (ASK-532) Test Quiz')]" with offset 5
    And I click on element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../.."
    And I wait for 1 sec
    Then element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../..//*[contains(text(),'Edit')]" should be displayed
    When I click on element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../..//*[contains(text(),'Edit')]/.."
    And I wait for 1 sec
    Then element with xpath "//label[contains(text(),'Title Of The Quiz')]" should be displayed
    When I click on element with xpath "//*[contains(text(),'Q1')]/../.."
    And I wait for 1 sec
    Then element with xpath "//*[contains(text(), 'Q1')]/../../..//div[contains(text(), 'Question Type')]" should be displayed
    When I click on element with xpath "//*[contains(text(), 'Q1')]/../../..//div[contains(text(), 'Multiple-Choice')]"
    And I wait for 1 sec
    When I clear element with xpath "//*[contains(text(), 'Q1')]/../../..//textarea[@placeholder='Question *']"
    And I type "Are Java and Javascript same languages?" into element with xpath "//*[contains(text(), 'Q1')]/../../..//textarea[@placeholder='Question *']"
    And I wait for 1 sec
    When I clear element with xpath "//*[contains(text(), 'Q1')]/../../..//*[@placeholder='Option 1*']"
    Then I type "Yes" into element with xpath "//*[contains(text(), 'Q1')]/../../..//*[@placeholder='Option 1*']"
    When I clear element with xpath "//*[contains(text(), 'Q1')]/../../..//*[@placeholder='Option 2*']"
    Then I type "No" into element with xpath "//*[contains(text(), 'Q1')]/../../..//*[@placeholder='Option 2*']"
    Then I click on element with xpath "//*[contains(text(), 'Q1')]/../../..//*[contains(text(), 'Option 2')]/../../../../../..//mat-checkbox"
    Then I wait for 1 sec
    When I click on element with xpath "//span[contains(text(),'Save')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed

  #ASK-539 Quiz Edit: Change Question Type from Multiple-Choice to Textual
  @Test-QuizEdit-ChangeQuestionTypeFromMultiple-ChoiceToTextual
  Scenario: Quiz Edit: Change Question Type from Multiple-Choice to Textual
    When I scroll to the element with xpath "//*[contains(text(),'ASK-844 (ASK-532) Test Quiz')]" with offset 5
    And I click on element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../.."
    And I wait for 1 sec
    Then element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../..//*[contains(text(),'Edit')]" should be displayed
    When I click on element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../..//*[contains(text(),'Edit')]/.."
    And I wait for 1 sec
    Then element with xpath "//label[contains(text(),'Title Of The Quiz')]" should be displayed
    When I click on element with xpath "//*[contains(text(),'Q1')]/../.."
    And I wait for 1 sec
    Then element with xpath "//*[contains(text(), 'Q1')]/../../..//div[contains(text(), 'Question Type')]" should be displayed
    When I click on element with xpath "//*[contains(text(), 'Q1')]/../../..//div[contains(text(), 'Textual')]"
    And I wait for 1 sec
    Then element with xpath "//h1[contains(text(),'Confirmation')]" should be displayed
    When I click on element with xpath "//div[@class='mat-dialog-actions']//span[contains(text(),'Switch')]"
    And I wait for 1 sec
    When I clear element with xpath "//*[contains(text(), 'Q1')]/../../..//textarea[@placeholder='Question *']"
    When I type "What is Software Testing?" into element with xpath "//*[contains(text(), 'Q1')]/../../..//textarea[@placeholder='Question *']"
    Then I wait for 1 sec
    When I click on element with xpath "//span[contains(text(),'Save')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed

  # Delete Quiz Tested after Testing
  Scenario: Teacher deletes Quiz
    When I scroll to the element with xpath "//*[contains(text(),'ASK-844 (ASK-532) Test Quiz')]" with offset 5
    And I click on element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../.."
    Then element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../..//*[contains(text(), 'Delete')]" should be displayed
    When I click on element with xpath "//*[contains(text(), 'ASK-844 (ASK-532) Test Quiz')]/../../..//*[contains(text(), 'Delete')]"
    Then element with xpath "//h1[contains(text(),'Confirmation')]" should be displayed
    When I click on element with xpath "//div[@class='mat-dialog-actions']//span[contains(text(),'Delete')]"
    And I wait for 1 sec
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed