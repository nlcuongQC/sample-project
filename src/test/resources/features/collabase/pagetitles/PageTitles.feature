@pageTitles
Feature: Page titles

  Background: Login to workspace
    Given Anna is at login page

  Scenario: Signup page #COL_OWD_1
    When Anna go to signup page
    Then she should see page title is "Sign Up | CollaBase"
    And url ends with "/sign-up"

  Scenario: Signin page #COL_OWD_1
    Then she should see page title is "Sign In | CollaBase"
    And url ends with "/sign-in"

  Scenario: Workspace select page #COL_OWD_1
    When Anna sign in to CollaBase with valid account
    Then she should see page title is "Workspace Select | CollaBase"
    And url ends with "/workspace/select"

  Scenario: Forgot password page #COL_OWD_1
    When Anna go to forgot password page
    Then she should see page title is "Reset Password | CollaBase"
    And url ends with "/reset-password"

  Scenario: Signout page #COL_OWD_1
    When Anna sign in to CollaBase with valid account
    And Workspace select page is opened
    And she click to Try another account link
    Then she should see page title is "Logout | CollaBase"
    And url ends with "/logout"

  Scenario: General board page #COL_OWD_2
    When Anna sign in to CollaBase with valid account
    And she choose workspace
    Then she should see page title is "LinkAnother | CollaBase"
    And url ends with "/b/516/linkanother"

  Scenario: List board management page #COL_OWD_5
    When Anna sign in to CollaBase with valid account
    And she go back to board admin list page
    Then she should see page title is "Workspace C | CollaBase"
    And url ends with "/wpc/boards"

  Scenario: General setting page #COL_OWD_6
    When Anna sign in to CollaBase with valid account
    And she go back to board admin list page
    Then she should see page title is "General Settings on Workspace C | CollaBase"
    And url ends with "/wpc/settings/general"

  Scenario: Teams setting page #COL_OWD_6
    When Anna sign in to CollaBase with valid account
    And she go back to board admin list page
    Then she should see page title is "Team Settings on Workspace C | CollaBase"
    And url ends with "/ocg_team/settings/team"
