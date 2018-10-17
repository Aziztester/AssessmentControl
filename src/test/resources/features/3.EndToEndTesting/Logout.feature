Feature: Automate TC Logout for Teacher (ASK-677)
    #Test Case: ASK-362 Teacher creates 3 quizzes, assign it to student. Student finds all the Quizzes
  Background: Login as a Teacher
    Given I open url "http://local.school.portnov.com:4520/#/login"
    And I wait for 3 sec
#    Then I click on element with xpath "//input[@placeholder='Email *']"
    And I type "lfelipe@gag16dotw7t.tk" into element with xpath "//input[@placeholder='Email *']"
#    Then I click on element with xpath "//input[@placeholder='Password *']"
    Then I type "12345" into element with xpath "//input[@placeholder='Password *']"
    And I wait for 1 sec
    Then I click on element with xpath "//button[@type='submit']"
    And I wait for 3 sec

@Test-LogoutFromTeacherHome
Scenario: Teacher logout from Home page (ASK-731)
  Then I click on element with xpath "//h5[contains(text(),'Log Out')]"
  And I wait for 1 sec
  Then element with xpath "//ac-modal-confirmation[@class='ng-star-inserted']" should be displayed
  When I click on element with xpath "//span[contains(text(),'No, Thanks')]"
  Then element with xpath "//ac-home-page[@class='ng-star-inserted']" should be displayed
  And I wait for 1 sec
  Then I click on element with xpath "//h5[contains(text(),'Log Out')]"
  And I wait for 1 sec
  Then element with xpath "//ac-modal-confirmation[@class='ng-star-inserted']" should be displayed
  And I wait for 2 sec
  Then I click on element with xpath "//span[contains(text(),'Log Out')]"
  And I wait for 2 sec
  Then element with xpath "//input[@placeholder='Email *']" should be displayed
  And I wait for 2 sec

  @Test-LogoutFromTeacherAssignments
  Scenario: Teacher logout from Assignments page (ASK-733)
    Then I click on element with xpath "//h5[contains(text(),'Assignments')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Assignments')]" should be displayed
    And I click on element with xpath "//h5[contains(text(),'Log Out')]"
    Then element with xpath "//ac-modal-confirmation[@class='ng-star-inserted']" should be displayed
    And I wait for 1 sec
    When I click on element with xpath "//span[contains(text(),'No, Thanks')]"
    Then element with xpath "//h4[contains(text(),'List of Assignments')]" should be displayed
    And I wait for 1 sec
    Then I click on element with xpath "//h5[contains(text(),'Log Out')]"
    And I wait for 1 sec
    Then element with xpath "//ac-modal-confirmation[@class='ng-star-inserted']" should be displayed
    And I wait for 2 sec
    Then I click on element with xpath "//span[contains(text(),'Log Out')]"
    And I wait for 2 sec
    Then element with xpath "//input[@placeholder='Email *']" should be displayed
    And I wait for 2 sec

  @Test-LogoutFromTeacherQuizzes
  Scenario: Teacher logout from Quizzes page (ASK-734)
    Then I click on element with xpath "//h5[contains(text(),'Quizzes')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed
    And I click on element with xpath "//h5[contains(text(),'Log Out')]"
    Then element with xpath "//ac-modal-confirmation[@class='ng-star-inserted']" should be displayed
    And I wait for 1 sec
    When I click on element with xpath "//span[contains(text(),'No, Thanks')]"
    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed
    And I wait for 1 sec
    Then I click on element with xpath "//h5[contains(text(),'Log Out')]"
    And I wait for 1 sec
    Then element with xpath "//ac-modal-confirmation[@class='ng-star-inserted']" should be displayed
    And I wait for 2 sec
    Then I click on element with xpath "//span[contains(text(),'Log Out')]"
    And I wait for 2 sec
    Then element with xpath "//input[@placeholder='Email *']" should be displayed
    And I wait for 2 sec

  @Test-LogoutFromTeacherUserManagement
  Scenario: Teacher logout from User's Management page (ASK-735)
    Then I click on element with xpath "//h5[contains(text(),'Management')]"
    And I wait for 2 sec
    Then element with xpath "//h4[contains(text(),'Management')]" should be displayed
    And I click on element with xpath "//h5[contains(text(),'Log Out')]"
    Then element with xpath "//ac-modal-confirmation[@class='ng-star-inserted']" should be displayed
    And I wait for 1 sec
    When I click on element with xpath "//span[contains(text(),'No, Thanks')]"
    Then element with xpath "//h4[contains(text(),'Management')]" should be displayed
    And I wait for 1 sec
    Then I click on element with xpath "//h5[contains(text(),'Log Out')]"
    And I wait for 1 sec
    Then element with xpath "//ac-modal-confirmation[@class='ng-star-inserted']" should be displayed
    And I wait for 2 sec
    Then I click on element with xpath "//span[contains(text(),'Log Out')]"
    And I wait for 2 sec
    Then element with xpath "//input[@placeholder='Email *']" should be displayed
    And I wait for 2 sec

  @Test-LogoutFromTeacherSettings
  Scenario: Teacher logout from Settings page (ASK-736)
    When I click on element with xpath "//h5[contains(text(),'Settings')]"
    And I wait for 1 sec
    Then element with xpath "//h4[contains(text(),'Settings')]" should be displayed
    When I click on element with xpath "//h5[contains(text(),'Log Out')]"
    Then element with xpath "//ac-modal-confirmation[@class='ng-star-inserted']" should be displayed
    And I wait for 1 sec
    When I click on element with xpath "//span[contains(text(),'No, Thanks')]"
    Then element with xpath "//h4[contains(text(),'Settings')]" should be displayed
    And I wait for 1 sec
    Then I click on element with xpath "//h5[contains(text(),'Log Out')]"
    And I wait for 1 sec
    Then element with xpath "//ac-modal-confirmation[@class='ng-star-inserted']" should be displayed
    And I wait for 2 sec
    Then I click on element with xpath "//span[contains(text(),'Log Out')]"
    And I wait for 2 sec
    Then element with xpath "//input[@placeholder='Email *']" should be displayed
    And I wait for 2 sec

  @Test-LogoutFromTeacherSubmissionsForGrade
  Scenario: Teacher logout from Submissions page - For Grade Tab (ASK-732)
    Then I click on element with xpath "//h5[contains(text(),'Submissions')]"
    And I wait for 1 sec
    Then element with xpath "//h4[contains(text(),'Submissions')]" should be displayed
    And I click on element with xpath "//h5[contains(text(),'Log Out')]"
    Then element with xpath "//ac-modal-confirmation[@class='ng-star-inserted']" should be displayed
    And I wait for 1 sec
    When I click on element with xpath "//span[contains(text(),'No, Thanks')]"
    Then element with xpath "//h4[contains(text(),'Submissions')]" should be displayed
    And I wait for 1 sec
    Then I click on element with xpath "//h5[contains(text(),'Log Out')]"
    And I wait for 1 sec
    Then element with xpath "//ac-modal-confirmation[@class='ng-star-inserted']" should be displayed
    And I wait for 2 sec
    Then I click on element with xpath "//span[contains(text(),'Log Out')]"
    And I wait for 2 sec
    Then element with xpath "//input[@placeholder='Email *']" should be displayed
    And I wait for 2 sec

  @Test-LogoutFromTeacherSubmissionsAutomaticallyGraded
  Scenario: Teacher logout from Submissions page - Automatically Graded Tab (ASK-737)
    Then I click on element with xpath "//h5[contains(text(),'Submissions')]"
    And I wait for 1 sec
    Then element with xpath "//h4[contains(text(),'Submissions')]" should be displayed
    And I click on element with xpath "//div[contains(text(),'Automatically Graded')]"
    And I wait for 1 sec
    Then element with xpath "//th[contains(text(),'Submitted/Graded')]" should be displayed
    And I wait for 1 sec
    And I click on element with xpath "//h5[contains(text(),'Log Out')]"
    Then element with xpath "//ac-modal-confirmation[@class='ng-star-inserted']" should be displayed
    And I wait for 1 sec
    When I click on element with xpath "//span[contains(text(),'No, Thanks')]"
    Then element with xpath "//th[contains(text(),'Submitted/Graded')]" should be displayed
    And I wait for 1 sec
    Then I click on element with xpath "//h5[contains(text(),'Log Out')]"
    And I wait for 1 sec
    Then element with xpath "//ac-modal-confirmation[@class='ng-star-inserted']" should be displayed
    And I wait for 2 sec
    Then I click on element with xpath "//span[contains(text(),'Log Out')]"
    And I wait for 2 sec
    Then element with xpath "//input[@placeholder='Email *']" should be displayed
    And I wait for 2 sec

  @Test-LogoutFromTeacherSubmissionsReviewed
  Scenario: Teacher logout from Submissions page - Reviewed Tab (ASK-738)
    Then I click on element with xpath "//h5[contains(text(),'Submissions')]"
    And I wait for 1 sec
    Then element with xpath "//h4[contains(text(),'Submissions')]" should be displayed
    And I click on element with xpath "//div[contains(text(),'Reviewed')]"
    And I wait for 1 sec
    Then element with xpath "//th[contains(text(),'Submitted At')]" should be displayed
    And I wait for 1 sec
    And I click on element with xpath "//h5[contains(text(),'Log Out')]"
    Then element with xpath "//ac-modal-confirmation[@class='ng-star-inserted']" should be displayed
    And I wait for 1 sec
    When I click on element with xpath "//span[contains(text(),'No, Thanks')]"
    Then element with xpath "//th[contains(text(),'Submitted At')]" should be displayed
    And I wait for 1 sec
    Then I click on element with xpath "//h5[contains(text(),'Log Out')]"
    And I wait for 1 sec
    Then element with xpath "//ac-modal-confirmation[@class='ng-star-inserted']" should be displayed
    And I wait for 2 sec
    Then I click on element with xpath "//span[contains(text(),'Log Out')]"
    And I wait for 2 sec
    Then element with xpath "//input[@placeholder='Email *']" should be displayed
    And I wait for 2 sec

  @Test-LogoutFromTeacherGiveAssignment
  Scenario: Teacher logout from Give Assignment form (ASK-739)
    Then I click on element with xpath "//h5[contains(text(),'Assignments')]"
    And I wait for 5 sec
    Then element with xpath "//h4[contains(text(),'List of Assignments')]" should be displayed
    Then I click on element with xpath "//span[contains(text(),'Create New Assignment')]"
    And I wait for 2 sec
    And element with xpath "//mat-card[@class='page mat-card']" should be displayed
    And I wait for 2 sec
    And I click on element with xpath "//h5[contains(text(),'Log Out')]"
    Then element with xpath "//ac-modal-confirmation[@class='ng-star-inserted']" should be displayed
    And I wait for 1 sec
    When I click on element with xpath "//span[contains(text(),'No, Thanks')]"
    Then element with xpath "//mat-card[@class='page mat-card']" should be displayed
    And I wait for 1 sec
    Then I click on element with xpath "//h5[contains(text(),'Log Out')]"
    And I wait for 1 sec
    Then element with xpath "//ac-modal-confirmation[@class='ng-star-inserted']" should be displayed
    And I wait for 2 sec
    Then I click on element with xpath "//span[contains(text(),'Log Out')]"
    And I wait for 2 sec
    Then element with xpath "//input[@placeholder='Email *']" should be displayed
    And I wait for 2 sec

  @Test-LogoutFromTeacherSubmissionsForGradedGrade
  Scenario: Teacher logout from Submissions page - For Grade Tab Grade Form (should be written)
    Then I click on element with xpath "//h5[contains(text(),'Submissions')]"
    And I wait for 1 sec
    Then element with xpath "//h4[contains(text(),'Submissions')]" should be displayed
    And I wait for 1 sec
    Then I click on element with xpath "//span[contains(text(), 'Grade')]"
    And element with xpath "//textarea[@placeholder='Teacher Summary']" should be displayed
    And I wait for 1 sec
    Then I type "My summary" into element with xpath "//textarea[@placeholder='Teacher Summary']"
    Then I type "My comment" into element with xpath "//textarea[@placeholder='Teacher Comment']"
    And I wait for 2 sec
    And I click on element with xpath "//h5[contains(text(),'Log Out')]"
    Then element with xpath "//ac-modal-confirmation[@class='ng-star-inserted']" should be displayed
    And I wait for 1 sec
    When I click on element with xpath "//span[contains(text(),'No, Thanks')]"
    Then element with xpath "//textarea[@placeholder='Teacher Summary']" should be displayed
    And I wait for 1 sec
    Then I click on element with xpath "//h5[contains(text(),'Log Out')]"
    And I wait for 1 sec
    Then element with xpath "//ac-modal-confirmation[@class='ng-star-inserted']" should be displayed
    And I wait for 2 sec
    Then I click on element with xpath "//span[contains(text(),'Log Out')]"
    And I wait for 2 sec
    Then element with xpath "//input[@placeholder='Email *']" should be displayed
    And I wait for 2 sec

  @Test-LogoutFromTeacherSubmissionsAutomaticallyGradedReview
  Scenario: Teacher logout from Submissions page - Automatically Graded Review Form (ASK-743)
    Then I click on element with xpath "//h5[contains(text(),'Submissions')]"
    And I wait for 1 sec
    Then element with xpath "//h4[contains(text(),'Submissions')]" should be displayed
    And I click on element with xpath "//div[contains(text(),'Automatically Graded')]"
    And I wait for 1 sec
    Then element with xpath "//th[contains(text(),'Submitted At')]" should be displayed
    And I wait for 1 sec
    Then I click on element with xpath "//span[contains(text(), 'Review')]"
    And element with xpath "//textarea[@placeholder='Teacher Summary']" should be displayed
    And I wait for 1 sec
    Then I type "My summary" into element with xpath "//textarea[@placeholder='Teacher Summary']"
    Then I type "My comment" into element with xpath "//textarea[@placeholder='Teacher Comment']"
    And I wait for 2 sec
    And I click on element with xpath "//h5[contains(text(),'Log Out')]"
    Then element with xpath "//ac-modal-confirmation[@class='ng-star-inserted']" should be displayed
    And I wait for 1 sec
    When I click on element with xpath "//span[contains(text(),'No, Thanks')]"
    Then element with xpath "//textarea[@placeholder='Teacher Summary']" should be displayed
    And I wait for 1 sec
    Then I click on element with xpath "//h5[contains(text(),'Log Out')]"
    And I wait for 1 sec
    Then element with xpath "//ac-modal-confirmation[@class='ng-star-inserted']" should be displayed
    And I wait for 2 sec
    Then I click on element with xpath "//span[contains(text(),'Log Out')]"
    And I wait for 2 sec
    Then element with xpath "//input[@placeholder='Email *']" should be displayed
    And I wait for 2 sec

  @Test-LogoutFromTeacherSubmissionsReviewedReview
  Scenario: Teacher logout from Submissions page - Reviewed Tab Review Form (ASK-744)
    Then I click on element with xpath "//h5[contains(text(),'Submissions')]"
    And I wait for 1 sec
    Then element with xpath "//h4[contains(text(),'Submissions')]" should be displayed
    And I click on element with xpath "//div[contains(text(),'Reviewed')]"
    And I wait for 1 sec
    Then element with xpath "//th[contains(text(),'Submitted/Graded')]" should be displayed
    And I wait for 1 sec
    Then I click on element with xpath "//span[contains(text(), 'Review')]"
    And element with xpath "//textarea[@placeholder='Teacher Summary']" should be displayed
    And I wait for 1 sec
    Then I type "My summary" into element with xpath "//textarea[@placeholder='Teacher Summary']"
    Then I type "My comment" into element with xpath "//textarea[@placeholder='Teacher Comment']"
    And I wait for 2 sec
    And I click on element with xpath "//h5[contains(text(),'Log Out')]"
    Then element with xpath "//ac-modal-confirmation[@class='ng-star-inserted']" should be displayed
    And I wait for 1 sec
    When I click on element with xpath "//span[contains(text(),'No, Thanks')]"
    Then element with xpath "//textarea[@placeholder='Teacher Summary']" should be displayed
    And I wait for 1 sec
    Then I click on element with xpath "//h5[contains(text(),'Log Out')]"
    And I wait for 1 sec
    Then element with xpath "//ac-modal-confirmation[@class='ng-star-inserted']" should be displayed
    And I wait for 2 sec
    Then I click on element with xpath "//span[contains(text(),'Log Out')]"
    And I wait for 2 sec
    Then element with xpath "//input[@placeholder='Email *']" should be displayed
    And I wait for 2 sec

  @Test-LogoutFromPasswordEditingMode
  Scenario: Teacher logout from CreateQuizMode page (ASK-745)
    When I click on element with xpath "//h5[contains(text(),'Settings')]"
    And I wait for 1 sec
    Then element with xpath "//h4[contains(text(),'Settings')]" should be displayed
    When I click on element with xpath "//span[contains(text(),'Change Your Password')]"
    And I wait for 1 sec
    Then element with xpath "//h1[contains(text(),'Changing Password')]" should be displayed
    When I type "12345" into element with xpath "//input[@placeholder='Password']"
    And I type "abcdef" into element with xpath "//input[@placeholder='New Password']"
    And I type "abcdef" into element with xpath "//input[@placeholder='Confirm New Password']"
    And I click on element with xpath "//h5[contains(text(),'Log Out')]"
    # I stopped here! No messages, no notification that there is unsaved data... I beleive that is a bug
    Then element with xpath "//h4[contains(text(),'Settings')]" should be displayed
#    When I click on element with xpath "//*[contains(text(),'Ok')]"
#    And I click on element with xpath "//*[@placeholder = 'Title Of The Quiz *']"
#    And I type "Try..." into element with xpath "//*[@placeholder = 'Title Of The Quiz *']"
#    And I click on element with xpath "//h5[contains(text(),'Log Out')]"
#    Then element with xpath "//h1[text()='Notification']" should be displayed
#
#    Then element with xpath "//ac-modal-confirmation[@class='ng-star-inserted']" should be displayed
#    And I wait for 1 sec
#    When I click on element with xpath "//span[contains(text(),'No, Thanks')]"
#    Then element with xpath "//h4[contains(text(),'List of Quizzes')]" should be displayed
#    And I wait for 1 sec
#    Then I click on element with xpath "//h5[contains(text(),'Log Out')]"
#    And I wait for 1 sec
#    Then element with xpath "//ac-modal-confirmation[@class='ng-star-inserted']" should be displayed
#    And I wait for 2 sec
#    Then I click on element with xpath "//span[contains(text(),'Log Out')]"
#    And I wait for 2 sec
#    Then element with xpath "//input[@placeholder='Email *']" should be displayed
#    And I wait for 2 sec

