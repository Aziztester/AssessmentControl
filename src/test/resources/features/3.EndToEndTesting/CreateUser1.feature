Feature: Create User as a Student

  @test1
  Scenario: Create User and login as student
    Given I go to Registration page
    Then I type First name
    Then I type Last name,
    Then I type Email
    And I type group code
    Then I type password
    And type password confirmation
    Then I push submit button
    And I open Email
    Then I confirm email address
    Then I go to Registration page
    Then I type Email
    And I type password
    Then I push submit button