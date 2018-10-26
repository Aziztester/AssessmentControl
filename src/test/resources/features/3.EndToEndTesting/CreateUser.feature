Feature: Create User as a Student

  @test1
  Scenario: Create User
    Given I go to Registration page
    Then I type First name
    Then I type Last name,
    Then I type Email
    And I type group code
    Then I type password
    And type password confirmation
    Then I push submit button