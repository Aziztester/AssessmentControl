Feature: ASK 238 Teacher Create Quiz with 3 Textual, 3 Single-Choice,
  3 Multiple-Choice questions 75% passing rate

  @test1 ASK 238
    Scenario: ASK 238 Teacher Create Quiz with 3 Textual, 3 Single-Choice,
    3 Multiple-Choice questions 75% passing rate
      Given I go to Login page and login as a teacher POP
      #When I check if quiz "QQA BASICS" in the list of quizes If so I delete those quizzes
      When Teacher Create Quiz "QQA BASICS California" with 3 Textual, 3 Single-Choice, 3 Multiple-Choice questions
      Then I verify that the quiz "QQA BASICS California" is in the List of Qiuzzes
      And I delete "QQA BASICS California" quiz


