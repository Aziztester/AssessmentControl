Feature: Teacher Creates Quiz with 3 Textual Questions (ASK-591)

  @Test-5TextualQuestions
  Scenario: Create a Quiz with 3 Textual, 3 Single- Choice, 3 Multiple-Choice question + Show Stopper
     When I open url f rf"http://local.school.portnov.com:4520/#/login"
     Then I type email address and password
     Then I click on the element with xpath "//button[@type='submit']"
     Then I open Quizzes Tab
     Then list of quizzes should be displayed

     Then I create a new Quiz
     And the Title of the Quize field should be displayed
     And I type the Title into a Title of the quiz field
     And I click on Add question button
     Then the quiz form opens


     Then I choose Textual question type
     Then I type first textual question
     And click on add a question button

     Then I choose a 2 Textual question type
     And I type a second question
     And I click on add a question button

     Then I choose a Textual question type
     And I type a third question
     And click on add question button

##single-choice1
     When I choose a Single question type
     Then aa question field appears
     Then I type a first single choice question
##options
     And I type a first option answer
     And I type a second option answer
     And I choose a first option as a true
     And click on add a question button

##single-choice2
     When I choose a 2 Single question type
     Then I type a second single choice question
     And I type a first option answerr
     And I type a second option answerr
     And I choose a first option as a truee
# #click on option 1
     And I click on add question buttonn

# #single-choice3
     When I choose a third Single question
     And I type a third Single choice question
     And I type a first option answerrr
     And I type a second option answerrr
     And I choose a first option as a trueee
#Showstopper select
     And I select a showstopper option
     And I click on add question buttonnn


#Multiple Choice 1
     When I choose a first Multiple question
     And I type a first Multiple question
     And I type a first option answer r
     And I type a second option answer r
     And I choose a first option as a true e
     Then I click on Add question button nn

#Multiple Chice 2
     When I choose a second Multiple question
     And I type a second Multiple question
     And I type a first option answer rd
     And I type a second option answer rd
     And I choose a second option as a true
     Then I click on Add question button nnn

#Multiple Chice 3
     When I choose a second Multiple question n
     And I type a second Multiple question nn
     And I type a first option answer rdd
     And I type a second option answer rdd
     And I choose a second option as a true e



