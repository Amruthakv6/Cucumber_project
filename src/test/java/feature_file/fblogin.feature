Feature: Facebook login
  Scenario: Verification of successful facebook login when the inputs are correct
  Given User on the user facebook login page
  When user enters valid email address or phone number
  And User enters a valid password
  Then User clicks the submit button and the user login should be successfull
