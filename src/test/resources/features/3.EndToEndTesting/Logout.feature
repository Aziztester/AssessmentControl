Feature: Automate TC Logout for Teacher (ASK-677)
    #Test Case: ASK-330 user logout
  Background: Login as a Teacher
    Given I open url "http://local.school.portnov.com:4520/#/login"

  @Test-LogoutFromMenuItem
    # ASK-751, ASK-752, ASK-753, ASK-754, ASK-731,
    # ASK-732, ASK-733, ASK-734, ASK-735, ASK-736
  Scenario Outline: User can Log Out from main pages
    Given I login with E-mail "<email>" and Password "<pwd>"
    Then "<uName>" should display at the left top corner
    When I click Menu Item "<menuItem>" and wait for "<pause>" sec
    Then element with xpath "<waitForItem>" should be displayed
    When I click Logout
    Then Confirmation pop-up window should display
    When I decline to Logout
    Then element with xpath "<waitForItem>" should be displayed
    When I click Logout
    Then Confirmation pop-up window should display
    When I confirm Logout
    Then element with xpath "//button[@type='submit']" should be displayed

    Examples:
| email                   | pwd   | uName         | menuItem    | pause | waitForItem                            |
| umoha@jerapah993r.gq    | 12345 | Peter Ivanov  | Home        | 1     | //span[contains(text(),'Assignments')]  |
| umoha@jerapah993r.gq    | 12345 | Peter Ivanov  | Assignments | 1     | //h4[contains(text(),'Assignments')]    |
| umoha@jerapah993r.gq    | 12345 | Peter Ivanov  | My Grades   | 2     | //h4[contains(text(),'My Grades')]        |
| umoha@jerapah993r.gq    | 12345 | Peter Ivanov  | Settings    | 5     | //h4[contains(text(),'Settings')]       |
| lfelipe@gag16dotw7t.tk  | 12345 | Olga Petrova  | Home        | 1     | //span[contains(text(),'Submissions')]  |
| lfelipe@gag16dotw7t.tk  | 12345 | Olga Petrova  | Submissions | 2     | //h4[contains(text(),'Submissions')]    |
| lfelipe@gag16dotw7t.tk  | 12345 | Olga Petrova  | Assignments | 3     | //h4[contains(text(),'Assignments')]    |
| lfelipe@gag16dotw7t.tk  | 12345 | Olga Petrova  | Quizzes     | 5     | //h4[contains(text(),'Quizzes')]        |
| lfelipe@gag16dotw7t.tk  | 12345 | Olga Petrova  | Management  | 5     | //h4[contains(text(),'Management')]     |
| lfelipe@gag16dotw7t.tk  | 12345 | Olga Petrova  | Settings    | 5     | //h4[contains(text(),'Settings')]       |

  @Test-LogoutFromTeacherSubmissionsTabs
    # ASK-737, ASK-738
  Scenario Outline: Teacher logout from Submissions page tabs
    Given I login with E-mail "lfelipe@gag16dotw7t.tk" and Password "12345"
    Then "Olga Petrova" should display at the left top corner
    When I click Menu Item "Submissions" and wait for "2" sec
    Then element with xpath "//h4[contains(text(),'Submissions')]" should be displayed
    When I click on element with xpath "<tabXpath>"
    And I wait for 1 sec
    Then element with xpath "<xpathExpected>" should be displayed
    When I click Logout
    Then Confirmation pop-up window should display
    When I decline to Logout
    Then element with xpath "<xpathExpected>" should be displayed
    When I click Logout
    Then Confirmation pop-up window should display
    When I confirm Logout
    Then element with xpath "//button[@type='submit']" should be displayed

    Examples:
      | tabXpath                                          | xpathExpected                       |
      | //div[contains(text(),'Automatically Graded')]/.. | //th[contains(text(),'Auto-Score')] |
      | //div[contains(text(),'Reviewed')]/..             | //th[text()='Graded At']            |

  @Test-LogoutFromTeacherGiveAssignment
    # ASK-739
  Scenario: Teacher can Log Out from Give Assignment form (ASK-739)
    Given I login with E-mail "lfelipe@gag16dotw7t.tk" and Password "12345"
    Then "Olga Petrova" should display at the left top corner
    When I click Menu Item "Assignments" and wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Assignments')]" should be displayed
    When I click on element with xpath "//span[contains(text(),'Create New Assignment')]"
    And I wait for 2 sec
    Then element with xpath "//h4[contains(text(),'Give Assignment')]" should be displayed
    When I click Logout
    Then Confirmation pop-up window should display
    When I decline to Logout
    Then element with xpath "//h4[contains(text(),'Give Assignment')]" should be displayed
    When I click Logout
    Then Confirmation pop-up window should display
    When I confirm Logout
    Then element with xpath "//button[@type='submit']" should be displayed

  @Test-LogoutFromTeacherSubmissionsTabs
    # ASK-743, ASK-744
  Scenario Outline: Teacher logout from Submissions page tabs -> Submission Summary
    Given I login with E-mail "lfelipe@gag16dotw7t.tk" and Password "12345"
    Then "Olga Petrova" should display at the left top corner
    When I click Menu Item "Submissions" and wait for 1 sec
    Then element with xpath "//h4[contains(text(),'Submissions')]" should be displayed
    When I click on element with xpath "<tabXpath>"
    And I wait for 1 sec
    Then element with xpath "<xpathDisplayed>" should be displayed
    When I click on element with xpath "<button>"
    And I wait for 1 sec
    Then element with xpath "//textarea[@placeholder='Teacher Summary']" should be displayed
    When I type "My summary" into element with xpath "//textarea[@placeholder='Teacher Summary']"
    And I type "My comment" into element with xpath "//textarea[@placeholder='Teacher Comment']"
    When I click Logout
    Then Confirmation pop-up window should display
    When I decline to Logout
    Then element with xpath "//textarea[@placeholder='Teacher Summary']" should be displayed
    When I click Logout
    Then Confirmation pop-up window should display
    When I confirm Logout
    Then element with xpath "//button[@type='submit']" should be displayed
  Examples:
  | tabXpath                                          | xpathDisplayed                            | button                                |
  | //div[contains(text(),'For Grade')]/..            | //mat-ink-bar[contains(@style,'left: 0')] | //span[contains(text(),'Grade')]/..   |
  | //div[contains(text(),'Automatically Graded')]/.. | //mat-ink-bar[contains(@style,'left: 1')] | //span[contains(text(),'Review')]/..  |
  | //div[contains(text(),'Reviewed')]/..             | //mat-ink-bar[contains(@style,'left: 3')] | //span[contains(text(),'Review')]/..  |

  @Test-LogoutFromUserManagementEditOptionsStudentMode
    # ASK-749
  Scenario Outline: Teacher cannot logout from User Management -> Edit Student -> Options -> Change/Delete
    Given I login with E-mail "lfelipe@gag16dotw7t.tk" and Password "12345"
    Then "Olga Petrova" should display at the left top corner
    When I click Menu Item "Management" and wait for 1 sec
    Then element with xpath "//h4[contains(text(),'Management')]" should be displayed
    When I click on element with xpath "//div[contains(text(),'Students')]"
    Then element with xpath "//mat-ink-bar[contains(@style,'left: 0')]" should be displayed
    When I click on element with xpath "//mat-list[@class='mat-list']//a[1]//mat-list-item[1]"
    And I wait for 1 sec
    Then element with xpath "//td[contains(text(),'User Role')]" should be displayed
    When I click on element with xpath "//button[@class='mat-raised-button mat-accent']"
    And I wait for 1 sec
    Then element with xpath "//button[@class='mat-menu-item']" should be displayed
    When I click on element with xpath "<button>"
    And I wait for 1 sec
    Then element with xpath "<xpathDisplayed>" should be displayed
    When I try to click on element with xpath "//h5[contains(text(),'Log Out')]"
    Then element with xpath "//td[contains(text(),'User Role')]" should be displayed
    Examples:
      | button                                                 |  xpathDisplayed                        |
      | //div[contains(@class, 'mat-menu-content')]//button[1] |  //h1[contains(text(), 's Name')]      |
      | //div[contains(@class, 'mat-menu-content')]//button[2] |  //h1[contains(text(),'Confirmation')] |
      | //div[contains(@class, 'mat-menu-content')]//button[3] |  //h1[contains(text(), 's Group')]     |
      | //div[contains(@class, 'mat-menu-content')]//button[4] |  //h1[contains(text(),'Confirmation')] |

  @Test-LogoutFromUserManagementEditOptionsTeacherMode
    # ASK-749
  Scenario Outline: Teacher cannot logout from User Management -> Edit Teacher -> Options -> Change/Delete
    Given I login with E-mail "lfelipe@gag16dotw7t.tk" and Password "12345"
    Then "Olga Petrova" should display at the left top corner
    When I click Menu Item "Management" and wait for 1 sec
    Then element with xpath "//h4[contains(text(),'Management')]" should be displayed
    When I click on element with xpath "//div[contains(text(),'Teachers')]"
    And I wait for 1 sec
    Then element with xpath "//mat-ink-bar[contains(@style,'left: 1')]" should be displayed
    When I click on element with xpath "//mat-list[@class='mat-list']//a[1]//mat-list-item[1]"
    And I wait for 1 sec
    Then element with xpath "//td[contains(text(),'User Role')]" should be displayed
    When I click on element with xpath "//button[@class='mat-raised-button mat-accent']"
    And I wait for 1 sec
    Then element with xpath "//button[@class='mat-menu-item']" should be displayed
    When I click on element with xpath "<button>"
    And I wait for 1 sec
    Then element with xpath "<xpathDisplayed>" should be displayed
    When I try to click on element with xpath "//h5[contains(text(),'Log Out')]"
    Then element with xpath "//td[contains(text(),'User Role')]" should be displayed
    Examples:
      | button                                                 |  xpathDisplayed                        |
      | //div[contains(@class, 'mat-menu-content')]//button[1] |  //h1[contains(text(), 's Name')]      |
      | //div[contains(@class, 'mat-menu-content')]//button[2] |  //h1[contains(text(),'Confirmation')] |
      | //div[contains(@class, 'mat-menu-content')]//button[3] |  //h1[contains(text(),'Confirmation')] |

  @Test-LogoutFromUserManagementEditUserMode
  Scenario Outline: Teacher can logout from User Management User Info page
    Given I login with E-mail "lfelipe@gag16dotw7t.tk" and Password "12345"
    Then "Olga Petrova" should display at the left top corner
    When I click Menu Item "Management" and wait for 1 sec
    Then element with xpath "//h4[contains(text(),'Management')]" should be displayed
    When I click on element with xpath "<tab>"
    And I wait for 1 sec
    Then element with xpath "<xpathDisplayed>" should be displayed
    When I click on element with xpath "//mat-list[@class='mat-list']//a[1]//mat-list-item[1]"
    And I wait for 1 sec
    Then element with xpath "//td[contains(text(),'User Role')]" should be displayed
    When I click Logout
    Then Confirmation pop-up window should display
    When I decline to Logout
    Then element with xpath "//td[contains(text(),'User Role')]" should be displayed
    When I click Logout
    Then Confirmation pop-up window should display
    When I confirm Logout
    Then element with xpath "//button[@type='submit']" should be displayed
    Examples:
      | tab                                 | xpathDisplayed                            |
      | //div[contains(text(),'Students')]  | //mat-ink-bar[contains(@style,'left: 0')] |
      | //div[contains(text(),'Teachers')]  | //mat-ink-bar[contains(@style,'left: 1')] |

  @Test-LogoutFromSettingsEditMode
  Scenario Outline: User cannot logout from Settings Edit mode  page (ASK-750)
    Given I login with E-mail "<email>" and Password "<pwd>"
    Then "<uName>" should display at the left top corner
    When I click on element with xpath "//h5[contains(text(),'Settings')]"
    And I wait for 1 sec
    Then element with xpath "//h4[contains(text(),'Settings')]" should be displayed
    When I click on element with xpath "<button>"
    And I wait for 1 sec
    Then element with xpath "<xpathDisplayed>" should be displayed
    When I try to click on element with xpath "//h5[contains(text(),'Log Out')]"
    Then element with xpath "<xpathDisplayed>" should be displayed
    Examples:
      | email                   | pwd   | uName         | button                                          | xpathDisplayed                      |
      | umoha@jerapah993r.gq    | 12345 | Peter Ivanov  | //span[contains(text(),'Change Your Name')]     | //h1[contains(text(), 's Name')]    |
      | umoha@jerapah993r.gq    | 12345 | Peter Ivanov  | //span[contains(text(),'Change Your Password')] | //h1[contains(text(), 'Changing Password')]  |
      | lfelipe@gag16dotw7t.tk  | 12345 | Olga Petrova  | //span[contains(text(),'Change Your Name')]     | //h1[contains(text(), 's Name')]    |
      | lfelipe@gag16dotw7t.tk  | 12345 | Olga Petrova  | //span[contains(text(),'Change Your Password')] | //h1[contains(text(), 'Changing Password')]  |

  @Test-LogoutFromTeacherSubmissionsReviewedReview
  Scenario: Teacher logout from Submissions page - Reviewed Tab Review Form (ASK-744)
    Given I login with E-mail "lfelipe@gag16dotw7t.tk" and Password "12345"
    Then "Olga Petrova" should display at the left top corner
    When I click Menu Item "Submissions" and wait for 3 sec
    Then element with xpath "//h4[contains(text(),'Submissions')]" should be displayed
    When I click on element with xpath "//div[contains(text(),'Reviewed')]"
    And I wait for 1 sec
    Then element with xpath "//th[contains(text(),'Submitted At')]" should be displayed
    When I wait for 1 sec
    And I click on element with xpath "//span[contains(text(), 'Review')]"
    Then element with xpath "//textarea[@placeholder='Teacher Summary']" should be displayed
    When I wait for 1 sec
    And I click on element with xpath "//h5[contains(text(),'Log Out')]"
    Then element with xpath "//h1[contains(text(),'Confirmation')]" should be displayed
    When I wait for 1 sec
    And I click on element with xpath "//span[contains(text(),'No, Thanks')]"
    Then element with xpath "//textarea[@placeholder='Teacher Summary']" should be displayed
    When I click Logout
    Then Confirmation pop-up window should display
    When I decline to Logout
    Then element with xpath "//textarea[@placeholder='Teacher Summary']" should be displayed
    When I click Logout
    Then Confirmation pop-up window should display
    When I confirm Logout
    Then element with xpath "//button[@type='submit']" should be displayed

  @Test-LogoutFromCreateQuizMode
  Scenario: Teacher cannot logout from Create Quiz mode (ASK-745)
    Given I login with E-mail "lfelipe@gag16dotw7t.tk" and Password "12345"
    Then "Olga Petrova" should display at the left top corner
    When I click Menu Item "Quizzes" and wait for 5 sec
    When I click on element with xpath "//h5[contains(text(),'Quizzes')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed
    When I click on element with xpath "//span[contains(text(),'Create New Quiz')]"
    And I wait for 1 sec
    Then element with xpath "//input[contains(@placeholder, 'Title Of The Quiz')]" should be displayed
    When I click Logout
    Then I wait for 1 sec
    When I click on element with xpath "//button[@aria-label='Close dialog']"
    Then I wait for 1 sec
    And I type "a" into element with xpath "//input[contains(@placeholder, 'Title Of The Quiz')]"
    When I click Logout
    Then element with xpath "//p[contains(text(),'Cannot Log out now')]" should be displayed
    And element with xpath "//span[contains(text(),'Ok')]" should be displayed
    When I wait for 1 sec
    And I click on element with xpath "//button[@aria-label='Close dialog']"
    Then I wait for 1 sec
    When I click on element with xpath "//*[contains(text(), 'add_circle')]"
    And I wait for 1 sec
    Then element with xpath "//div[contains(text(), 'Question Type')]" should be displayed
    When I click Logout
    Then element with xpath "//p[contains(text(),'Cannot Log out now')]" should be displayed
    And element with xpath "//span[contains(text(),'Ok')]" should be displayed
    When I wait for 1 sec
    And I click on element with xpath "//button[@aria-label='Close dialog']"
    Then I wait for 1 sec
    When I click on element with xpath "//*[contains(text(), 'Q1')]/../../..//div[contains(text(), 'Textual')]"
    And I wait for 1 sec
    Then element with xpath "//*[contains(text(), 'Q1')]/../../..//textarea[@placeholder='Question *']" should be displayed
    When I click Logout
    Then element with xpath "//p[contains(text(),'Cannot Log out now')]" should be displayed
    And element with xpath "//span[contains(text(),'Ok')]" should be displayed
    When I wait for 1 sec
    And I click on element with xpath "//button[@aria-label='Close dialog']"
    Then I wait for 1 sec
    When I type "What is Software Testing?" into element with xpath "//*[contains(text(), 'Q1')]/../../..//textarea[@placeholder='Question *']"
    Then I wait for 1 sec
    When I click Logout
    Then element with xpath "//p[contains(text(),'Cannot Log out now')]" should be displayed
    And element with xpath "//span[contains(text(),'Ok')]" should be displayed
    When I wait for 1 sec
    And I click on element with xpath "//button[@aria-label='Close dialog']"
    Then I wait for 1 sec
    When I click on element with xpath "//span[contains(text(),'Preview')]/.."
    Then element with xpath "//h3[contains(text(),'PREVIEW MODE')]" should be displayed
    When I click Logout
    Then I wait for 1 sec
    Then element with xpath "//h3[contains(text(),'PREVIEW MODE')]" should be displayed
    When I type "a" into element with xpath "//textarea[@placeholder='Enter your answer']"
    And I click Logout
    Then I wait for 1 sec
    When I click on element with xpath "//span[contains(text(),'Close')]/.."
    Then element with xpath "//h3[contains(text(),'PREVIEW MODE')]" should not be displayed
    And I wait for 2 sec

  @Test-LogoutFromGoToAssignment
  Scenario: Student logout from Go To Assignment mode (ASK-756)
    Given I login with E-mail "umoha@jerapah993r.gq" and Password "12345"
    Then "Peter Ivanov" should display at the left top corner
    When I click Menu Item "My Assignments" and wait for 3 sec
    Then element with xpath "//h4[contains(text(),'My Assignments')]" should be displayed
    When I click on element with xpath "//span[contains(text(),'Go To Assessment')]/.."
    Then element with xpath "//textarea[@placeholder='Enter your answer']" should be displayed
    When I type "a" into element with xpath "//textarea[@placeholder='Enter your answer']"
    When I click Logout
    Then Confirmation pop-up window should display
    When I decline to Logout
    Then element with xpath "//textarea[@placeholder='Enter your answer']" should be displayed
    When I click Logout
    Then Confirmation pop-up window should display
    When I confirm Logout
    Then element with xpath "//button[@type='submit']" should be displayed

  @Test-StudentLogoutFromGradesSetails
  Scenario: Student logout from Grade Details Page
    Given I login with E-mail "umoha@jerapah993r.gq" and Password "12345"
    Then "Peter Ivanov" should display at the left top corner
    When I click Menu Item "My Grades" and wait for 2 sec
    Then element with xpath "//h4[contains(text(),'My Grades')]" should be displayed
    When I click on element with xpath "//span[contains(text(),'Details')]/.."
    Then element with xpath "//button[@type='button']" should be displayed
    When I click Logout
    Then Confirmation pop-up window should display
    When I decline to Logout
    Then element with xpath "//textarea[@placeholder='Enter your answer']" should be displayed
    When I click Logout
    Then Confirmation pop-up window should display
    When I confirm Logout
    Then element with xpath "//button[@type='submit']" should be displayed
