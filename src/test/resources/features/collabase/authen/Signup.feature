@authentication @signup
Feature: Sign up

  Scenario Outline: User sign up CollaBase with invalid info #CO_COL_AUTH_20 #CO_COL_AUTH_21 #CO_COL_AUTH_22 #CO_COL_AUTH_23 #CO_COL_AUTH_24 #CO_COL_AUTH_25 #CO_COL_AUTH_26
    Given Anna is at login page
    And Anna go to signup page
    When Anna sign up to CollaBase with following info:
      | fullname   | email   | password   | confirmPassword    |
      | <Fullname> | <Email> | <Password> | <Confirm password> |
    Then Anna should see signup error message "<Message>" at field "<Field message>"
    Examples:
      | Fullname        | Email              | Password | Confirm password | Message                                | Field message    |
      | Nguyễn Lê Cường |                    | 123456   | 123456           | Please enter an email address          | Email            |
      | Nguyễn Lê Cường | testmail@gmail.com | 12345    | 12345            | Password must be at least 6 characters | Password         |
      | Nguyễn Lê Cường | testmail@gmail.com |          | 12345            | Password must be at least 6 characters | Password         |
      |                 | testmail@gmail.com | 123456   | 123456           | Please enter full name                 | Full Name        |
      | Nguyễn Lê Cường | testmail@gmail.com | 123456   | 654321           | Confirm password not match             | Confirm password |


  Scenario: User sign up CollaBase with valid info #CO_COL_AUTH_27 #CO_COL_AUTH_28
    Given Anna is at login page
    And Anna go to signup page
    When Anna sign up to CollaBase with following info:
      | fullname        | email  | password | confirmPassword |
      | Nguyễn Lê Cường | random | 123456   | 123456          |
    And Anna should see the message
          """
          Let’s go and create your
          first workspace
          """
    And she create workspace with info:
      | Workspace name | Short name |
      | Workspace A    | random     |
    And she skip invite members
    Then she should see the confirm email message "Please confirm registration from your inbox"

  Scenario: User confirm email before access workspace #CO_COL_AUTH_29
    Given Anna is at login page
    And Anna go to signup page
    When Anna sign up to CollaBase with following info:
      | fullname        | email  | password | confirmPassword |
      | Nguyễn Lê Cường | random | 123456   | 123456          |
    And Anna should see the message
          """
          Let’s go and create your
          first workspace
          """
    And she confirms signup email
    And she should see the email verification message is "You've successfully verified your email."
    And she click to Go to CollaBase dashboard button
    And she create workspace with info:
      | Workspace name | Short name |
      | Workspace A    | random     |
    And she skip invite members
    Then she should not see the the confirm email message

  Scenario: User confirm email after access workspace #CO_COL_AUTH_30
    Given Anna is at login page
    And Anna go to signup page
    When Anna sign up to CollaBase with following info:
      | fullname        | email  | password | confirmPassword |
      | Nguyễn Lê Cường | random | 123456   | 123456          |
    And Anna should see the message
          """
          Let’s go and create your
          first workspace
          """
    And she create workspace with info:
      | Workspace name | Short name |
      | Workspace A    | random     |
    And she skip invite members
    And she should see the confirm email message "Please confirm registration from your inbox"
    And she confirms signup email
    And she should see the email verification message is "You've successfully verified your email."
    And she click to Go to CollaBase dashboard button
    Then she should not see the the confirm email message

  Scenario Outline: Create password with invalid cases #CO_COL_AUTH_31 #CO_COL_AUTH_34 #CO_COL_AUTH_35
    Given Anna is at login page
    And Anna go to signup page
    When Anna sign up to CollaBase with following info:
      | fullname        | email  | password | confirmPassword |
      | Nguyễn Lê Cường | random | 123456   | 123456          |
    And Anna should see the message
          """
          Let’s go and create your
          first workspace
          """
    And she create workspace with info:
      | Workspace name | Short name |
      | Workspace A    | random     |
    And she add member with email
    And member accepts the invitation email
    And member create password with following info:
      | Fullname   | Password   | Confirm password   |
      | <Fullname> | <Password> | <Confirm password> |
    Then member should see the create password error message "<Message>" at field "<Field>"
    Examples:
      | Fullname | Password | Confirm password | Message                                | Field           |
      |          | 123456   | 123456           | Please enter full name                 | name            |
      | John Doe |          | 123456           | Password must be at least 6 characters | password        |
      | John Doe | space    | 123456           | Password must be at least 6 characters | password        |
      | John Doe | 12345    | 123456           | Password must be at least 6 characters | password        |
      | John Doe | 123456   |                  | Confirm password not match             | confirmPassword |
      | John Doe | 123456   | 654321           | Confirm password not match             | confirmPassword |

  Scenario: Create password with valid case #CO_COL_AUTH_36
    Given Anna is at login page
    And Anna go to signup page
    When Anna sign up to CollaBase with following info:
      | fullname        | email  | password | confirmPassword |
      | Nguyễn Lê Cường | random | 123456   | 123456          |
    And Anna should see the message
          """
          Let’s go and create your
          first workspace
          """
    And she create workspace with info:
      | Workspace name | Short name |
      | Workspace A    | random     |
    And she add member with email
    And member accepts the invitation email
    And member create password with following info:
      | Fullname | Password | Confirm password |
      | John Doe | 123456   | 123456           |
    Then member should see the dashboard page