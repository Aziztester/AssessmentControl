Feature: Automate TC for User Properties: First Name

  @test1
  Scenario: First name - Alphanumerical & Special char (Happy path)
    # ASK-2
    Given I open url "http://local.school.portnov.com:4520/#/registration"
    When I type "iV@#7" into element with xpath "//*[@id='mat-input-0']"
    And I type "Ivanov" into element with xpath "//*[@id='mat-input-1']"
    And I type "ivanov@gmail.com" into element with xpath "//*[@id='mat-input-2']"
    And I type "A007" into element with xpath "//*[@id='mat-input-3']"
    And I type "12345" into element with xpath "//*[@id='mat-input-4']"
    And I type "12345" into element with xpath "//*[@id='mat-input-5']"
    And I click on element with xpath "//button[@type='submit']"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'You have been Registered.')]" should be displayed



  @test2
  Scenario: Create user with single character in First Name
    # ASK-13
    Given I open url "http://local.school.portnov.com:4520/#/registration"
    When I type "I" into element with xpath "//*[@id='mat-input-0']"
    And I type "Ivanov" into element with xpath "//*[@id='mat-input-1']"
    And I type "ivanov@gmail.com" into element with xpath "//*[@id='mat-input-2']"
    And I type "A007" into element with xpath "//*[@id='mat-input-3']"
    And I type "12345" into element with xpath "//*[@id='mat-input-4']"
    And I type "12345" into element with xpath "//*[@id='mat-input-5']"
    And I click on element with xpath "//button[@type='submit']"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'You have been Registered.')]" should be displayed

  @test3
  Scenario: First Name - Zero character input / Required field
    # ASK-3
    Given I open url "http://local.school.portnov.com:4520/#/registration"
    When I type "Ivanov" into element with xpath "//*[@id='mat-input-1']"
    And I type "ivanov@gmail.com" into element with xpath "//*[@id='mat-input-2']"
    And I type "A007" into element with xpath "//*[@id='mat-input-3']"
    And I type "12345" into element with xpath "//*[@id='mat-input-4']"
    And I type "12345" into element with xpath "//*[@id='mat-input-5']"
    And I click on element with xpath "//button[@type='submit']"
    Then element with xpath "//*[text()='This field is required']" should be displayed


  @test4
  Scenario Outline: First Name - Max Character
        # ASK-15
    Given I open url "http://local.school.portnov.com:4520/#/registration"
    When I type "<Fname>" into element with xpath "//*[@id='mat-input-0']"
    And I type "I" into element with xpath "//*[@id='mat-input-1']"
    And I type "ivanov@gmail.com" into element with xpath "//*[@id='mat-input-2']"
    And I type "A007" into element with xpath "//*[@id='mat-input-3']"
    And I type "12345" into element with xpath "//*[@id='mat-input-4']"
    And I type "12345" into element with xpath "//*[@id='mat-input-5']"
    And I click on element with xpath "//button[@type='submit']"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'You have been Registered.')]" should be displayed
    Examples:
      | Fname |
      |   IvanrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrruuuuuuuuuuuuuuuuuuIlllllllllllllllllllllllllllllllllllllllllllluuuuuuuuuuuuuuuuuuIvankuuuuuuuuuuuuuuuuuuggggggggggggggggggggggggggggggggggggggggggggggghhhhhhhhhhhhhhhhhhjjjjjjjjjjjjjjjjjjjjkkkkkkkkkkkkkkkkkkkkkk    |



  @test5
  Scenario Outline: First Name - Max character +1
        # ASK-16
    Given I open url "http://local.school.portnov.com:4520/#/registration"
    When I type "<Fname>" into element with xpath "//*[@id='mat-input-0']"
    And I type "I" into element with xpath "//*[@id='mat-input-1']"
    And I type "ivanov@gmail.com" into element with xpath "//*[@id='mat-input-2']"
    And I type "A007" into element with xpath "//*[@id='mat-input-3']"
    And I type "12345" into element with xpath "//*[@id='mat-input-4']"
    And I type "12345" into element with xpath "//*[@id='mat-input-5']"
    And I click on element with xpath "//button[@type='submit']"
    And I wait for 3 sec
    Then element with xpath "//*[contains(text(), 'too long')]" should be displayed
    #And I wait for 5 sec
    Examples:
      | Fname |
      |   IvanrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrruuuuuuuuuuuuuuuuuuIlllllllllllllllllllllllllllllllllllllllllllluuuuuuuuuuuuuuuuuuIvankuuuuuuuuuuuuuuuuuuggggggggggggggggggggggggggggggggggggggggggggggghhhhhhhhhhhhhhhhhhjjjjjjjjjjjjjjjjjjjjkkkkkkkkkkkkkkkkkkkkkkw    |

  @test6
    Scenario: First Name - Leading space
    #ASK-4
    Given I open url "http://local.school.portnov.com:4520/#/registration"
    When I type " Ivan" into element with xpath "//*[@id='mat-input-0']"
    And I type "I" into element with xpath "//*[@id='mat-input-1']"
    Then element with xpath "//*[text()='Whitespaces are not allowed']" should be displayed

  @test7
  Scenario: First Name - Trailing space
    #ASK-19
    Given I open url "http://local.school.portnov.com:4520/#/registration"
    When I type "Ivan " into element with xpath "//*[@id='mat-input-0']"
    And I type "I" into element with xpath "//*[@id='mat-input-1']"
    Then element with xpath "//*[text()='Whitespaces are not allowed']" should be displayed

  @test8
  Scenario: First Name - Space characters inside
    #ASK-20
    Given I open url "http://local.school.portnov.com:4520/#/registration"
    When I type "Iv an" into element with xpath "//*[@id='mat-input-0']"
    And I type "I" into element with xpath "//*[@id='mat-input-1']"
    Then element with xpath "//*[text()='Whitespaces are not allowed']" should be displayed

  @test11
  Scenario: Required field
    Given I open url "http://local.school.portnov.com:4520/#/forgot-password"
    And I wait for 6 sec

