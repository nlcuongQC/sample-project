@authentication @forgotpassword
Feature: Forgot password

  Background: Go to forgot password page
    Given Anna is at login page
    And Anna go to forgot password page

  Scenario Outline: User reset password with invalid cases #CO_COL_AUTH_42 #CO_COL_AUTH_44 #CO_COL_AUTH_45
    When Anna input email "<Email>"
    And she submit forgot password
    Then Anna should see forgot password error message "<Message>"
    Examples:
      | Email       | Message                            |
      | mailtestcom | Please enter a valid email address |
      | space       | Please enter an email address      |
      |             | Please enter an email address      |

  Scenario: User reset password with email not in system #CO_COL_AUTH_43
    When Anna input email "testmailkhongtontai@gmail.com"
    And she submit forgot password
    Then she should see the success modal

  Scenario Outline: User reset password with valid email #CO_COL_AUTH_47
    When Anna input email "<Email>"
    And she submit forgot password
    And she should see the success modal
    And she confirm email with email "<Email>"
    And she create new password with "<Password>"
    And she sign in to CollaBase with email "<Email>" and password "<Password>"
    Then she should see the select workspace page
    Examples:
      | Email                  | Password |
      | regtest@mailinator.com | 654321   |