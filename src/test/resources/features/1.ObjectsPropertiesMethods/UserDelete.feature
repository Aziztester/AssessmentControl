@delete
Feature:  Automate TC for User Method: delete task ASK-566 test set ASK-113
  #ASK-117  Delete student
@delete_student
Scenario: Delete student (create student, confirm e-mail, login as a teacher, delete student)
  Given I open url "https://generator.email/"
  And I find "Email Generator - temp mail, fake email" that has title with xpath "//title[contains(text(),'Email Generator')]"
  Then I click on element with xpath "//button[contains(text(),'Generate new e-mail')]"
  And I wait for 2 sec
  Then I click on element with xpath "//button[@id='copbtn']"

  Then I open url "http://local.school.portnov.com:4520/#/registration"
  And I wait for 3 sec
  Then I click on element with xpath "//input[@placeholder='First Name']"
  And I type "Specific" into element with xpath "//input[@placeholder='First Name']"
  Then I click on element with xpath "//input[@placeholder='Last Name']"
  And I type "User1$#" into element with xpath "//input[@placeholder='Last Name']"
  Then I click on element with xpath "//input[@placeholder='Email']"
  And "Paste" should be disabled for in pop-up menu on element with xpath "//input[@placeholder='Email']"
  Then I click on element with xpath "//input[@placeholder='Group Code']"
  And I type "Aa1$#" into element with xpath "//input[@placeholder='Group Code']"
  Then I click on element with xpath "//input[@placeholder='Password']"
  And I type "123Aa$#" into element with xpath "//input[@placeholder='Password']"
  Then I click on element with xpath "//input[@placeholder='Confirm Password']"
  And I type "123Aa$#" into element with xpath "//input[@placeholder='Confirm Password']"
  Then I click on element with xpath "//button[@type='submit']"
  And I wait for 3 sec
  Then element with xpath "//*[contains(text(),'You have been Registered.')]" should be displayed

  #And I open url "https://generator.email/"
  #And I find "Email Generator - temp mail, fake email" that has title with xpath "//title[contains(text(),'Email Generator')]"
  #And I wait for 1 sec
  #And I click on element with xpath "//span[contains(text(),'Refresh')]"
  #And I wait for 10 sec
  #And I click on element with xpath "//a[contains(text(),'Confirm email')]"
  #And I wait for 3 sec

  #And element with xpath "//*[contains(text(),'You Account was Activated!')]" should be displayed
  #And I wait for 6 sec
  #And I click on element with xpath "//span[contains(text(),'Login with Credentials')]"

  Then I open url "http://local.school.portnov.com:4520/#/login"
  And I find "Assessment Control @ Portnov" that has title with xpath "//title[contains(text(),'Assessment Control')]"
  And I wait for 2 sec
  Then I click on element with xpath "//input[@placeholder='Email *']"
  And I type "lfelipe@gag16dotw7t.tk" into element with xpath "//input[@placeholder='Email *']"
  Then I click on element with xpath "//input[@placeholder='Password *']"
  Then I type "12345" into element with xpath "//input[@placeholder='Password *']"
  Then I click on element with xpath "//button[@type='submit']"
  Then I open url "http://local.school.portnov.com:4520/#/home"
  And I wait for 2 sec
  And I click on element with xpath "//h5[contains(text(),'Management')]"
  And I wait for 2 sec
  #Then I should see element with xpath "//h4[contains(text(),'Management')]" should be disabled
  And I click on element with xpath "//*[text()='Specific User1$#']"
  And I wait for 2 sec
  Then I click on element with xpath "//span[@class='mat-button-wrapper']"
  And I wait for 2 sec
  And I click on element with xpath "//*[text()='delete']"
  And I click on element with xpath "//span[contains(text(),'Delete')]"
  And I wait for 5 sec
  Then element with xpath "//mat-card[@class='page mat-card']" should be displayed


  #ASK-143  Delete teacher
  @delete_teacher
  Scenario: Delete teacher (create student, confirm e-mail, login as a teacher, change student role to teacher, delete teacher)
    Given I open url "https://generator.email/"
    And I find "Email Generator - temp mail, fake email" that has title with xpath "//title[contains(text(),'Email Generator')]"
    Then I click on element with xpath "//button[contains(text(),'Generate new e-mail')]"
    And I wait for 2 sec
    Then I click on element with xpath "//button[@id='copbtn']"

    Then I open url "http://local.school.portnov.com:4520/#/registration"
    And I wait for 3 sec
    Then I click on element with xpath "//input[@placeholder='First Name']"
    And I type "Specific" into element with xpath "//input[@placeholder='First Name']"
    Then I click on element with xpath "//input[@placeholder='Last Name']"
    And I type "User1$#" into element with xpath "//input[@placeholder='Last Name']"
    Then I click on element with xpath "//input[@placeholder='Email']"
    And "Paste" should be disabled for in pop-up menu on element with xpath "//input[@placeholder='Email']"
    Then I click on element with xpath "//input[@placeholder='Group Code']"
    And I type "Aa1$#" into element with xpath "//input[@placeholder='Group Code']"
    Then I click on element with xpath "//input[@placeholder='Password']"
    And I type "123Aa$#" into element with xpath "//input[@placeholder='Password']"
    Then I click on element with xpath "//input[@placeholder='Confirm Password']"
    And I type "123Aa$#" into element with xpath "//input[@placeholder='Confirm Password']"
    Then I click on element with xpath "//button[@type='submit']"
    And I wait for 3 sec
    Then element with xpath "//*[contains(text(),'You have been Registered.')]" should be displayed

  #And I open url "https://generator.email/"
  #And I find "Email Generator - temp mail, fake email" that has title with xpath "//title[contains(text(),'Email Generator')]"
  #And I wait for 1 sec
  #And I click on element with xpath "//span[contains(text(),'Refresh')]"
  #And I wait for 10 sec
  #And I click on element with xpath "//a[contains(text(),'Confirm email')]"
  #And I wait for 3 sec

  #And element with xpath "//*[contains(text(),'You Account was Activated!')]" should be displayed
  #And I wait for 6 sec
  #And I click on element with xpath "//span[contains(text(),'Login with Credentials')]"

    Then I open url "http://local.school.portnov.com:4520/#/login"
    And I find "Assessment Control @ Portnov" that has title with xpath "//title[contains(text(),'Assessment Control')]"
    And I wait for 2 sec
    Then I click on element with xpath "//input[@placeholder='Email *']"
    And I type "lfelipe@gag16dotw7t.tk" into element with xpath "//input[@placeholder='Email *']"
    Then I click on element with xpath "//input[@placeholder='Password *']"
    Then I type "12345" into element with xpath "//input[@placeholder='Password *']"
    Then I click on element with xpath "//button[@type='submit']"
    Then I open url "http://local.school.portnov.com:4520/#/home"
    And I wait for 2 sec
    And I click on element with xpath "//h5[contains(text(),'Management')]"
    And I wait for 2 sec
  #Then I should see element with xpath "//h4[contains(text(),'Management')]" should be disabled
    And I click on element with xpath "//*[text()='Specific User1$#']"
    And I wait for 2 sec
    Then I click on element with xpath "//span[@class='mat-button-wrapper']"
    And I wait for 2 sec
    Then I click on element with xpath "//*[@class='mat-icon material-icons'][contains(text(),'school')]"
    And I click on element with xpath "//span[contains(text(),'Change Role')]"
    And I wait for 2 sec
    Then I click on element with xpath "//span[@class='mat-button-wrapper']"
    And I wait for 2 sec
    And I click on element with xpath "//*[text()='delete']"
    And I click on element with xpath "//span[contains(text(),'Delete')]"
    And I wait for 5 sec
    Then element with xpath "//mat-card[@class='page mat-card']" should be displayed