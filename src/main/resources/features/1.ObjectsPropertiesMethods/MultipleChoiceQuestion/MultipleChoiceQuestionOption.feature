Feature: Multiple-choice question - option

  Scenario: mutiple-choice question  - option - Alphanumerical & Sp. char. (Happy path)
    Given  Navigate to login page  "login"
    Then I create the quiz with Alphanumerical and special character "happy" path
    And  I verify the quiz present in "QUIZLIST" and delete

  Scenario: mutiple-choice question  - option - Single Character checkout master
    Given  Navigate to login page  "login"
    Then I create the quiz with "singlecharacter" option
    And I verify the quiz present in "QUIZLIST" and delete
    And I verify the quiz present in "QUIZLIST" and delete

  Scenario: mutiple-choice question  - option - zero Character
    Given  Navigate to login page  "login"
    Then  create the quiz with "zerocharacter" option
    And I check the "errormessage" and logout

  Scenario: mutiple-choice question  - option - Leading Space Character
    Given  Navigate to login page  "login"
    Then  create  quiz with "leadingspace" option
    And I verify the quiz present in "QUIZLIST" and delete

  Scenario: mutiple-choice question  - option - trailing Space Character
    Given  Navigate to login page  "login"
    Then I create  quiz with "trailingingspace" option
    And I verify the quiz present in "QUIZLIST" and delete

  Scenario: mutiple-choice question  - option - white Space Character
    Given  Navigate to login page  "login"
    Then I created the quiz with "whitespace" option
    And I verify the quiz present in "QUIZLIST" and delete


  Scenario: mutiple-choice question  - option -  Multiple spaces in between characters
    Given  Navigate to login page  "login"
    Then I created the quiz with "multiplespaces" between characters option
    And I verify the quiz present in "QUIZLIST" and delete

  Scenario: mutiple-choice question  - option - max 1000 characters
    Given  Navigate to login page  "login"
    Then I created the quiz with max "1000characters"
    And I verify the quiz present in "QUIZLIST" and delete

  Scenario: mutiple-choice question  - option - Options filled out and selected
    Given  Navigate to login page  "login"
    Then I created the quiz with "alltheoptions" selected
    And I verify the quiz present in "QUIZLIST" and delete

  Scenario: mutiple-choice question  - option - Options filled out but not selected
    Given  Navigate to login page  "login"
    Then created the quiz with "alltheoptionsnotselected" selected
    And I check the "errormessage" and logout


  Scenario: mutiple-choice question  - option - Options not  filled out but all selected
    Given  Navigate to login page  "login"
    Then created the quiz with "alltheoptionsnotfilledout" but all selected
    And I check the "errormessage" and logout


  Scenario: mutiple-choice question  - option - Options not  filled out and nothing selected
    Given  Navigate to login page  "login"
    Then created the quiz with "alltheoptionsnotfilledout" and nothing selected
    And I check the "errormessage" and logout

  Scenario: mutiple-choice question  - option - Select "Include "Other" text area option for this question?
    Given  Navigate to login page  "login"
    Then created the quiz including "othertextarea" option
    And I verify the quiz present in "QUIZLIST" and delete


  Scenario: mutiple-choice question  - option - Select add the option for this question
    Given  Navigate to login page  "login"
    Then created  quiz including " Addtheoption" option
    And I check the "errormessage" and logout


  Scenario: mutiple-choice question  - option - Max number of the options
    Given  Navigate to login page  "login"
    Then created  quiz with " maxnoofoption" option
    And I check the "errormessage" and logout

  Scenario: mutiple-choice question  - option - delete the options
    Given  Navigate to login page  "login"
    Then created  quiz with "deletetheoption" in it
    And I verify the quiz present in "QUIZLIST" and delete

  Scenario: mutiple-choice question  - option -One of option is not filled out
    Given  Navigate to login page  "login"
    Then created  quiz with "oneoptionnotfilledout"
    And I verify the quiz present in "QUIZLIST" and delete

  Scenario: mutiple-choice question  - option -reorder option in question
    Given  Navigate to login page  "login"
    Then create quiz with "reorderoptioninquestion"
    And I verify the quiz present in "QUIZLIST" and delete