@teams @searchTeam
Feature: Search team

  Background: Open Add team form
    Given Anna is at login page
    And Anna sign in to CollaBase with valid account
    And she went to Setting - Teams page
    And she opened team list page

  Scenario: User search team with invalid team #COL_TM_ST_5
    When Anna search teams with "NoTeam"
    Then Anna should see empty team error message "Have no teams yet."

  Scenario Outline: User search teams #COL_TM_ST_1 #COL_TM_ST_2 #COL_TM_ST_3 #COL_TM_ST_4
    When Anna search teams with "<Input>"
    Then Anna should see "<Result>" displayed in list
    Examples:
      | Input       | Result |
      | team-b      | @team-b |
      | cuongnguyen | @team-b |
      | Duong Ho    | @team-b |
      | Team B      | @team-b |
