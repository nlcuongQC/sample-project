@authentication @signin
Feature: Sign in

  Scenario Outline: User sign in CollaBase with invalid info #CO_COL_AUTH_38 #CO_COL_AUTH_39
    Given Anna is at login page
    When Anna sign in to CollaBase with email "<Email>" and password "<Password>"
    Then Anna should see signin error message "<Message>" at field "<Field message>"
    Examples:
      | Email               | Password | Message                                | Field message |
      |                     | 123456   | Please enter an email address          | Email         |
      | regtest@yopmail.com |          | Password must be at least 6 characters | Password      |
      | regtest@yopmail.com | 123      | Password must be at least 6 characters | Password      |

  Scenario: User sign in CollaBase with wrong password #CO_COL_AUTH_37 #CO_COL_AUTH_40
    Given Anna is at login page
    When Anna sign in to CollaBase with wrong password
    Then Anna should see signin error message "Email or password is not valid"


  Scenario: User sign in CollaBase with valid info #CO_COL_AUTH_41
    Given Anna is at login page
    When Anna sign in to CollaBase with valid account
    Then Anna should see the message
        """
        Select a workspace
        """