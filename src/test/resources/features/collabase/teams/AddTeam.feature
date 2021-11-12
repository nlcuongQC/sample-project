@teams @addTeam
Feature: Add team

  Background: Open Add team form
    Given Anna is at login page
    And Anna sign in to CollaBase with valid account
    And she went to Setting - Teams page
    And she opened add team form

  Scenario Outline: User create team with #COL_TM_AT_1 #COL_TM_AT_2 #COL_TM_AT_3 #COL_TM_AT_4 #COL_TM_AT_5 #COL_TM_AT_6 #COL_TM_AT_7 #COL_TM_AT_8
    When Anna creates team with info:
      | Team name   | Handle   | Description   | Managers   | Members   |
      | <Team name> | <Handle> | <Description> | <Managers> | <Members> |
    Then Anna should see add team error message "<Message>" at "<Field>"

    Examples:
      | Team name | Handle | Description                   | Managers     | Members      | Message                                         | Field            |
      |           | pcam   | This is team pcam description | Tran Van A   | Cuong Nguyen | Please enter name                               | Team name        |
      | Pcam      |        | This is team pcam description | Tran Van A   | Cuong Nguyen | Please enter handle                             | Handle           |
      | Pcam      | pcam   |                               | Tran Van A   | Cuong Nguyen | Please enter description                        | Description      |
      | Pcam      | pcam   | This is team pcam description |              |              | Please enter at least one manager or one member | Managers Members |
      | Pcam      | pcam   | This is team pcam description | Tran Van A   | Tran Van A   | User can be only member or manager              | Managers Members |
      | Pcam      | pcam   | This is team pcam description | Cuong Nguyen | Cuong Nguyen | User can be only member or manager              | Managers Members |

  Scenario: User create team with valid info #COL_TM_AT_9
    When Anna creates team with info:
      | Team name   | Handle      | Description                   | Managers   | Members      |
      | Pcam random | pcam random | This is team pcam description | Tran Van A | Cuong Nguyen |
    Then Anna should see new team is created