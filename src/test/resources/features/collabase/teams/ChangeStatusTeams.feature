@teams @changeStatusTeam
Feature: Change status team

  Background: Open Team list page
    Given Anna is at login page
    And Anna sign in to CollaBase with valid account
    And she went to Setting - Teams page
    And she opened team list page

  Scenario: User change status activated set structure team to deactivated - #COL_TM_CST_3
    When Anna deactivate status of team "Team B"
    Then Anna should see toast error message "team must be removed from the team structure"

  Scenario: User change status activated not set structure team to deactivated - #COL_TM_CST_5
    And she opened add team form
    When Anna creates team with info:
      | Team name   | Handle      | Description                   | Managers   | Members      |
      | Pcam random | pcam random | This is team pcam description | Tran Van A | Cuong Nguyen |
    And Anna should see new team is created
    And she deactivate created team
    Then Anna should see created team is deactivated

  Scenario: User change status deactivated team to activated - #COL_TM_CST_2
    And she opened add team form
    When Anna creates team with info:
      | Team name   | Handle      | Description                   | Managers   | Members      |
      | Pcam random | pcam random | This is team pcam description | Tran Van A | Cuong Nguyen |
    And Anna should see new team is created
    And she deactivate created team
    And she activate created team
    Then Anna should see created team is activated

