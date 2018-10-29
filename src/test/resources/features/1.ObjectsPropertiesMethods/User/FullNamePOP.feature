Feature: Full Name ASK - 622 Page Object

  @testPOP1
    Scenario: First_Name - Leading space ASK 622 POP
    Given I go to Login page and login as a teacher POP
    When I change name to "Ivan*? Iv@n0v" POP
    Then I verify that the name was changed POP
    And I change name back to "Olga Petrova" POP


  @testPOP2
  Scenario: First Name (Single char) + Last Name (Single char) ASK - 627 POP
    Given I go to Login page and login as a teacher POP
    When I change name to I I POP
    Then I verify that the name was changed to "I I" POP
    And I change name back to "Olga Petrova" POP





