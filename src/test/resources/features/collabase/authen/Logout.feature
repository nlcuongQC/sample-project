@authentication @logout
Feature: Logout

  Background: Go to forgot password page
    Given Anna was logged in Collabase as workspace owner

    Scenario: User sign out CollaBase in Choose workspace page #CO_COL_AUTH_48
      And she is in Select workspace page
      When she click to Try another account link
      Then she should see the login page

    Scenario: User sign out CollaBase in Profile menu
      And she is in Workspace dashboard page
      When she clicks to user avatar
      And she click to Signout button in Profile menu
      Then Anna should see the login page

    Scenario: User sign out CollaBase in Workspace menu
      And she is in Workspace dashboard page
      When Anna clicks to Workspace name
      And she click to Signout button in Workspace menu
      Then Anna should see the login page

    Scenario: User access choose workspace page after logout #CO_COL_AUTH_49
      And she is in Select workspace page
      When she click to Try another account link
      And she access choose workspace page
      Then she should see the login page
