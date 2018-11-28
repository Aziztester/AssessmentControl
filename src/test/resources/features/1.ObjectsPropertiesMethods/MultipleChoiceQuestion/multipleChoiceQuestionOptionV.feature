Feature: Multiple Choice Question - Option (ASK-915)

  Background: Login as Teacher
    Given V get url "http://local.school.portnov.com:4520/#/login"
    When V login as teacher "VladimirTeacher.test@gmail.com" with password "12345"
    Then V verify "//p[contains(text(),'TEACHER')]" is displayed

  Scenario: Multiple-Choice Question: Option - Alphanumeric & Special Characters (ASK-916)
    When V open quizzes list
    Then V verify "//*[contains(text(),'Quizzes')]" is displayed
    When V create quiz "ASK-916 Quiz"
    And V choose Multiple-Choice type to create Question "1"
    And V type "Question 1" in Question field for "1" question
    And V type "SQA123#" in Option "1" field for "1" question
    And V select "1" multiple-choice option for "1" question as correct answer
    And V type "SQA456" in Option "2" field for "1" question
    And V save
    And V wait for "//*[contains(text(),'List of Quizzes')]"
    Then V verify "//*[contains(text(),'Quizzes')]" is displayed
    Then V verify "//*[contains(text(),'ASK-916 Quiz')]" is displayed

  Scenario: Multiple-Choice Question: Option - Single Character (ASK-917)
    When V open quizzes list
    Then V verify "//*[contains(text(),'Quizzes')]" is displayed
    When V create quiz "ASK-917 Quiz"
    And V choose Multiple-Choice type to create Question "1"
    And V type "Question 1" in Question field for "1" question
    And V type "1" in Option "1" field for "1" question
    And V type "1" in Option "2" field for "1" question
    And V select "1" multiple-choice option for "1" question as correct answer
    And V save
    And V wait for "//*[contains(text(),'List of Quizzes')]"
    Then V verify "//*[contains(text(),'Quizzes')]" is displayed
    Then V verify "//*[contains(text(),'ASK-917 Quiz')]" is displayed

  Scenario: Multiple-Choice Question: Option - Zero Character input (ASK-920)
    When V open quizzes list
    Then V verify "//*[contains(text(),'Quizzes')]" is displayed
    When V create quiz "ASK-920 Quiz"
    And V choose Multiple-Choice type to create Question "1"
    And V type "q" in Question field for "1" question
    And V save
    Then V question "1" option "1" should contain error message "This field is required"
    Then V question "1" option "2" should contain error message "This field is required"
    Then V verify if message "Quiz is not completed" is displayed

  Scenario: Multiple-Choice Question - Option - Leading Space (ASK-921)
    When V open quizzes list
    Then V verify "//*[contains(text(),'Quizzes')]" is displayed
    When V create quiz "ASK-921 Quiz"
    And V choose Multiple-Choice type to create Question "1"
    And V type "Question 1" in Question field for "1" question
    And V type " withaspaceonthebeginning" in Option "1" field for "1" question
    And V type "Option2" in Option "2" field for "1" question
    And V select "2" multiple-choice option for "1" question as correct answer
    And V save
    And V wait for "//*[contains(text(),'List of Quizzes')]"
    Then V verify "//*[contains(text(),'Quizzes')]" is displayed
    Then V verify "//*[contains(text(),'ASK-921 Quiz')]" is displayed
    When V open preview of Quiz "ASK-921 Quiz"
    Then V in question "1" option "1" should not contain " withaspaceonthebeginning"

    Scenario: Multiple-Choice Question: Option - Trailing Space (ASK-923)
      When V open quizzes list
      Then V verify "//*[contains(text(),'Quizzes')]" is displayed
      When V create quiz "ASK-923 Quiz"
      And V choose Multiple-Choice type to create Question "1"
      And V type "Question 1" in Question field for "1" question
      And V type "!@%^5spaces     " in Option "1" field for "1" question
      And V type "Option2" in Option "2" field for "1" question
      And V select "2" multiple-choice option for "1" question as correct answer
      And V save
      And V wait for "//*[contains(text(),'List of Quizzes')]"
      Then V verify "//*[contains(text(),'Quizzes')]" is displayed
      Then V verify "//*[contains(text(),'ASK-923 Quiz')]" is displayed
      When V open preview of Quiz "ASK-923 Quiz"
      Then V in question "1" option "1" should not contain "!@%^5spaces     "

    Scenario: Multiple-Choice Question: Option - Whitespace only (ASK-924)
      When V open quizzes list
      Then V verify "//*[contains(text(),'Quizzes')]" is displayed
      When V create quiz "ASK-924 Quiz"
      And V choose Multiple-Choice type to create Question "1"
      And V type "Question 1" in Question field for "1" question
      And V type " " in Option "1" field for "1" question
      And V type "Option2" in Option "2" field for "1" question
      And V select "2" multiple-choice option for "1" question as correct answer
      And V save
      And V wait for "//*[contains(text(),'List of Quizzes')]"
      Then V verify "//*[contains(text(),'Quizzes')]" is displayed
      Then V verify "//*[contains(text(),'ASK-924 Quiz')]" is displayed
      When V open preview of Quiz "ASK-924 Quiz"
      Then V in question "1" option "1" should not contain " "

    Scenario: Multiple-Choice Question: Option - Multiple spaces in between characters (ASK-926)
      When V open quizzes list
      Then V verify "//*[contains(text(),'Quizzes')]" is displayed
      When V create quiz "ASK-926 Quiz"
      And V choose Multiple-Choice type to create Question "1"
      And V type "Question 1" in Question field for "1" question
      And V type "456     hij   $%*" in Option "1" field for "1" question
      And V type "Option2" in Option "2" field for "1" question
      And V select "2" multiple-choice option for "1" question as correct answer
      And V save
      And V wait for "//*[contains(text(),'List of Quizzes')]"
      Then V verify "//*[contains(text(),'Quizzes')]" is displayed
      Then V verify "//*[contains(text(),'ASK-926 Quiz')]" is displayed
      When V open preview of Quiz "ASK-926 Quiz"
      Then V in question "1" option "1" should be "456     hij   $%*"

    Scenario: Multiple-Choice Question - Option - max 1000 characters (ASK-927)
      When V open quizzes list
      Then V verify "//*[contains(text(),'Quizzes')]" is displayed
      When V create quiz "ASK-927 Quiz"
      And V choose Multiple-Choice type to create Question "1"
      And V type "Question 1" in Question field for "1" question
      And V type "1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890" in Option "1" field for "1" question
      And V type "Option2" in Option "2" field for "1" question
      And V select "2" multiple-choice option for "1" question as correct answer
      And V save
      And V wait for "//*[contains(text(),'List of Quizzes')]"
      Then V verify "//*[contains(text(),'Quizzes')]" is displayed
      Then V verify "//*[contains(text(),'ASK-927 Quiz')]" is displayed
      When V open preview of Quiz "ASK-927 Quiz"
      Then V in question "1" option "1" should be "1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890"

    Scenario: Multiple-Choice Question - Option - Options filled out and selected (ASK-942)
      When V open quizzes list
      Then V verify "//*[contains(text(),'Quizzes')]" is displayed
      When V create quiz "ASK-942 Quiz"
      And V choose Multiple-Choice type to create Question "1"
      And V type "Question 1" in Question field for "1" question
      And V type "Option1" in Option "1" field for "1" question
      And V type "Option2" in Option "2" field for "1" question
      And V select "1" multiple-choice option for "1" question as correct answer
      And V select "2" multiple-choice option for "1" question as correct answer
      And V save
      And V wait for "//*[contains(text(),'List of Quizzes')]"
      Then V verify "//*[contains(text(),'Quizzes')]" is displayed
      Then V verify "//*[contains(text(),'ASK-942 Quiz')]" is displayed
      When V open preview of Quiz "ASK-942 Quiz"

    Scenario: Multiple-Choice Question - Option - Options filled out but not selected (ASK-943)
      When V open quizzes list
      Then V verify "//*[contains(text(),'Quizzes')]" is displayed
      When V create quiz "ASK-943 Quiz"
      And V choose Multiple-Choice type to create Question "1"
      And V type "Question 1" in Question field for "1" question
      And V type "Option1" in Option "1" field for "1" question
      And V type "Option2" in Option "2" field for "1" question
      And V save
      Then V verify if message "*Choose at least one correct answer" is displayed
      And V verify if message "Quiz is not completed" is displayed

    Scenario: Multiple-Choice Question - Option - Options not filled out but selected (ASK-944)
      When V open quizzes list
      Then V verify "//*[contains(text(),'Quizzes')]" is displayed
      When V create quiz "ASK-944 Quiz"
      And V choose Multiple-Choice type to create Question "1"
      And V type "Question 1" in Question field for "1" question
      And V select "1" multiple-choice option for "1" question as correct answer
      And V select "2" multiple-choice option for "1" question as correct answer
      And V save
      Then V question "1" option "1" should contain error message "This field is required"
      And V question "1" option "2" should contain error message "This field is required"
      And V verify if message "Quiz is not completed" is displayed

    Scenario: Multiple-Choice Question - Option - Options not filled out and not selected (ASK-945)
      When V open quizzes list
      Then V verify "//*[contains(text(),'Quizzes')]" is displayed
      When V create quiz "ASK-945 Quiz"
      And V choose Multiple-Choice type to create Question "1"
      And V type "Question 1" in Question field for "1" question
      And V save
      Then V question "1" option "1" should contain error message "This field is required"
      And V question "1" option "2" should contain error message "This field is required"
      And V verify if message "*Choose at least one correct answer" is displayed
      And V verify if message "Quiz is not completed" is displayed

    Scenario: Multiple-Choice Question - Option - Select "Include "Other" text area option for this question?" (ASK-946)
      When V open quizzes list
      Then V verify "//*[contains(text(),'Quizzes')]" is displayed
      When V create quiz "ASK-946 Quiz"
      And V choose Multiple-Choice type to create Question "1"
      And V type "Question 1" in Question field for "1" question
      And V type "Privet1" in Option "1" field for "1" question
      And V select "1" multiple-choice option for "1" question as correct answer
      And V select "2" multiple-choice option for "1" question as correct answer
      And V type "Privet2" in Option "2" field for "1" question
      And V select Include other text area option for Question "1"
      And V save
      And V wait for "//*[contains(text(),'List of Quizzes')]"
      Then V verify "//*[contains(text(),'Quizzes')]" is displayed
      And V verify "//*[contains(text(),'ASK-946 Quiz')]" is displayed

    Scenario: Multiple-Choice Question - Option - Add the option (ASK-947)
      When V open quizzes list
      Then V verify "//*[contains(text(),'Quizzes')]" is displayed
      When V create quiz "ASK-947 Quiz"
      And V choose Multiple-Choice type to create Question "1"
      And V type "Question 1" in Question field for "1" question
      And V add option "3" to question "1"
      Then verify if option "3" in question "1" appears

    Scenario: Multiple-Choice Question - Option - Max number of the options (ASK-948)
      When V open quizzes list
      Then V verify "//*[contains(text(),'Quizzes')]" is displayed
      When V create quiz "ASK-948 Quiz"
      And V choose Multiple-Choice type to create Question "1"
      And V type "Question 1" in Question field for "1" question
      And V add options to make "10" options in question "1"
      Then verify if option in question "1" appears "10" times

    Scenario: Multiple-Choice Question - Option - Deleting the option (ASK-949)
      When V open quizzes list
      Then V verify "//*[contains(text(),'Quizzes')]" is displayed
      When V create quiz "ASK-949 Quiz"
      And V choose Multiple-Choice type to create Question "1"
      And V type "Question 1" in Question field for "1" question
      And V add option "3" to question "1"
      And V delete option "3" in question "1"
      Then V verify that option "3" does not present in question "1"

    Scenario: Multiple-Choice Question - Option - One of option is not filled out (ASK-950)
      When V open quizzes list
      Then V verify "//*[contains(text(),'Quizzes')]" is displayed
      When V create quiz "ASK-950 Quiz"
      And V choose Multiple-Choice type to create Question "1"
      And V type "Question 1" in Question field for "1" question
      And V type "Privet" in Option "1" field for "1" question
      And V select "1" multiple-choice option for "1" question as correct answer
      And V save
      Then V question "1" option "2" should contain error message "This field is required"
      And V verify if message "Quiz is not completed" is displayed

    Scenario: Multiple-Choice Question - Option - Reorder options in Question (ASK-951)
      When V open quizzes list
      Then V verify "//*[contains(text(),'Quizzes')]" is displayed
      When V create quiz "ASK-951 Quiz"
      And V choose Multiple-Choice type to create Question "1"
      And V type "Question 1" in Question field for "1" question
      And V add option "3" to question "1"
      Then verify if option "3" in question "1" appears
      And V type "Privet1" in Option "1" field for "1" question
      And V type "Privet2" in Option "2" field for "1" question
      And V type "Privet3" in Option "3" field for "1" question
      And V move option "3" in question "1" up
      And I wait for 3 sec
      Then V verify if in option "2" text "Privet3" should be present

    Scenario: Multiple-Choice Question - Option - Max+1 number of the options (ASK-952)
      When V open quizzes list
      Then V verify "//*[contains(text(),'Quizzes')]" is displayed
      When V create quiz "ASK-948 Quiz"
      And V choose Multiple-Choice type to create Question "1"
      And V type "Question 1" in Question field for "1" question
      And V add options to make "10" options in question "1"
      Then verify if option in question "1" appears "10" times
      And V add option "11" to question "1"
      And V verify if message "Max number of options is 10" is displayed
