Feature: User Forgot Password Test
  ASK-1056

  Scenario: Forgot Password -User valid Email address
  ASK-953
    Given  Navigate to login page "login" and  push forgot password button
  Then Enter valid email in Email field and Push the "RequestPasswordReset" button
    Then Follow the ResetPassword link and enter "newPassword"
    And login with "newresetpassword"



  Scenario:Forgot Password- User Email doesnot exist in database
    ASK-955
    Given  Navigate to login page "login" and  push forgot password button
    Then enter valid email but "emailnotregisteredindatabase"
    And Verify the "error" message


    Scenario: Forgot Password- User Email required
      ASK-954
      Given  Navigate to login page "login" and  push forgot password button
      Then leave "blank" in email field and push Request Password Reset button
      And then verify "theerror" message



  Scenario: Forgot Password- User invalid Email address
          ASK-959
    Given  Navigate to login page "login" and  push forgot password button
    Then enter "invalidemail" in email field
    And also verify the "error" message


          Scenario: Forgot Password - Enter old passwod......This is a bug till now
            ASK-963