Feature: Textual Question - Text

  Scenario: Text - Alphanumeric and Special Characters
    When Navigate to login page
    And Type email "5cam@bskyb.ml"
    And Type Password "12345"
    And Push Sign In button
    And Click on Quizzes on left navigational panel
    And Push Create new Quiz button
    And Type Title of the Quiz "Alphanumeric and Special Characters"
    And Click Add Question
    Then Select Textual Type of question One
    And Type text in Question "Az#@$%*!"
    And Push Save button
    Then Verify if Quiz "Alphanumeric and Special Characters" appears in the List of Quizzes
    And Delete this quiz "Alphanumeric and Special Characters"

  Scenario: Text - Required Field
    When Navigate to login page
    And Type email "5cam@bskyb.ml"
    And Type Password "12345"
    And Push Sign In button
    And Click on Quizzes on left navigational panel
    And Push Create new Quiz button
    And Type Title of the Quiz "Required field"
    And Click Add Question
    Then Select textual radio button
    And Push Save button
    Then Error messages "This field is required" and "Quiz is not completed. Check highlighted with "red" areas" appear

  Scenario: Text - Leading Spaces Leading Spaces
    When Navigate to login page
    And Type email "5cam@bskyb.ml"
    And Type Password "12345"
    And Push Sign In button
    And Click on Quizzes on left navigational panel
    And Push Create new Quiz button
    And Type Title of the Quiz "Leading Spaces"
    And Click Add Question
    Then Select textual radio button
    And Type text in Question "⠀⠀ Leading Spaces"
    And Push Save button
    Then Verify if Quiz "Leading Spaces" appears in the List of Quizzes
    And Delete this quiz "Leading Spaces"

  Scenario: Text - Trailing Spaces
    When Navigate to login page
    And Type email "5cam@bskyb.ml"
    And Type Password "12345"
    And Push Sign In button
    And Click on Quizzes on left navigational panel
    And Push Create new Quiz button
    And Type Title of the Quiz "Trailing Spaces"
    And Click Add Question
    Then Select textual radio button
    And Type text in Question "Trailing Spaces⠀⠀ "
    And Push Save button
    Then Verify if Quiz "Trailing Spaces" appears in the List of Quizzes
    And Delete this quiz "Trailing Spaces"

  Scenario: Text - Whitespaces Characters Inside
    When Navigate to login page
    And Type email "5cam@bskyb.ml"
    And Type Password "12345"
    And Push Sign In button
    And Click on Quizzes on left navigational panel
    And Push Create new Quiz button
    And Type Title of the Quiz "Whitespaces Characters"
    And Click Add Question
    Then Select textual radio button
    And Type text in Question "Whitespaces⠀⠀  Characters"
    And Push Save button
    Then Verify if Quiz "Whitespaces Characters" appears in the List of Quizzes
    And Delete this quiz "Whitespaces Characters"

  Scenario: Text - Whitespaces Only
    When Navigate to login page
    And Type email "5cam@bskyb.ml"
    And Type Password "12345"
    And Push Sign In button
    And Click on Quizzes on left navigational panel
    And Push Create new Quiz button
    And Type Title of the Quiz "Whitespaces Only"
    And Click Add Question
    Then Select textual radio button
    And Push space bar five times "     " in Question
#   And Push Save button give an errors messages "This field is required" and "Quiz is not completed. Check highlighted with "red" areas"

  Scenario: Text - Max char 1000
    When Navigate to login page
    And Type email "5cam@bskyb.ml"
    And Type Password "12345"
    And Push Sign In button
    And Click on Quizzes on left navigational panel
    Then Push Create new Quiz button
    And Type Title of the Quiz "Max char 1000"
    And Click Add Question
    And Select textual radio button
    And Type text in Question "Quiz gasdwd dhjas ...(1000)"
    And Push Save button
    Then Verify if Quiz "Max char 1000" appears in the List of Quizzes
    And Delete this quiz "Max char 1000"

  Scenario: Text - Single Character
    When Navigate to login page
    And Type email "5cam@bskyb.ml"
    And Type Password "12345"
    And Push Sign In button
    And Click on Quizzes on left navigational panel
    Then Push Create new Quiz button
    And Type Title of the Quiz "Single Character"
    And Click Add Question
    And Select textual radio button
    And Type text in Question "l"
    And Push Save button
    Then Verify if Quiz "Single Character" appears in the List of Quizzes
    And Delete this quiz "Single Character"

  Scenario: Text - Max char+1 (1001)
    When Navigate to login page
    And Type email "5cam@bskyb.ml"
    And Type Password "12345"
    And Push Sign In button
    And Click on Quizzes on left navigational panel
    Then Push Create new Quiz button
    And Type Title of the Quiz "Max char+1 (1001)"
    And Click Add Question
    And Select textual radio button
    And Type text in Question "Quiz quiz quiz...(1001)"
    And Push Save button
    Then Verify if Quiz "Max char+1 (1001)" appears in the List of Quizzes
    And Delete this quiz "Max char+1 (1001)"

  Scenario: Text - Switching to the next line with Enter
    When Navigate to login page
    And Type email "5cam@bskyb.ml"
    And Type Password "12345"
    And Push Sign In button
    And Click on Quizzes on left navigational panel
    Then Push Create new Quiz button
    And Type Title of the Quiz "Switching to the next line with Enter"
    And Click Add Question
    And Select textual radio button
    Then Type text in Question "Switching to the next line with Enter"
    And Type text in Question using "Shift+Enter" "o" "Shift+Enter" "n" "Shift+Enter" "e"
#    And Push Save button
#    Then Verify if Quiz "Switching to the next line with Enter" appears in the List of Quizzes
#    And Verify that switching to the next line input will be remove automatically
#    And Delete this quiz "Switching to the next line with Enter"