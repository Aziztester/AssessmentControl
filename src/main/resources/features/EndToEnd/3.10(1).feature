Feature:3.10
  @EndToEnd_3.10
  Scenario:Create Quiz with 3 Textual, 3 Single- Choice, 3 Multiple-Choice question 90% passing rate.
    Given I open url"http://local.school.portnov.com:4520/#/login"
    Then Type email "7johnk@google-mail.ooo"
    And Type password "12345"
    Then Push "Sign In" button
    And Click on "Quizzes" on left navigation panel
# // Create Quiz with 3 Textual questions
    Then Push "Create new quiz" button
    And Type "Title of quiz" as "Quiz 5"
    And Push "Add Question" button
    And Select "Textual" question type
    And Type in question 1 "Full form of SQA?"
    And Push "Add question" button
    And Select "Textual" question type
    And Type in question 2 "Full form of TCP?"
    And Push "Add question" button
    And Select "Textual" question type
    And Type in question 3 "Full form of SQL"
# //Create Quiz with 3 Single- Choice questions
    And Push "Add question" button
    And Select "Single-Choice" question type
    And Type in question 4 "Full form of SQA?"
    And Type in Options "Software Quality Assurance" and "SQA"
    And Select "Option 1" as correct answer
    And Push "Add question" button
    And Select "Single-Choice" question type
    And Type in question 5 "Full form of TCP?"
    And Type in Options "Transmission Control Protocol" and "TCP"
    And Select "Option 1" as correct answer
    And Push "Add question" button
    And Select "Single-Choice" question type
    And Type in question 6 "Full form of SQL?"
    And Type in Options "Structured Query Language" and "SQL"
    And Select "Option 1" as correct answer
# //Create Quiz with 3 Multiple- Choice questions
    And Push "Add question" button
    And Select "Multiple-Choice" question type
    And Type in question 7 "Find A"
    And Push "Add Option" button "2" times
    And Type in Options "A" and "a" and "12" and "c"
    And Select "Option 1" and "Option 2"as correct answers
    And Push "Add question" button
    And Select "Multiple-Choice" question type
    And Type in question 8 "Find B"
    And Push "Add Option" button "2" times
    And Type in Options "A" and "b" and "B" and "Z"
    And Select "Option 2" and "Option 3"as correct answers
    And Push "Add question" button
    And Select "Multiple-Choice" question type
    And Type in question 9 "Find C"
    And Push "Add Option" button "2" times
    And Type in Options "A" and "b" and "C" and "c"
    And Select "Option 3" and "Option 4"as correct answers
# // 90% passing rate
    Then Push "+" button for "15" times on right side of the page to get "Passing Rate" "90%"
    And Push "Save" button
# //Verify and delete
    Then "Quiz 5" appears in the "List of Quizzes" page
    Then Click on "Quiz 5"
    And Push "Delete" button on the right side
    And Push "Delete" button on the Confirmation Pop-up





