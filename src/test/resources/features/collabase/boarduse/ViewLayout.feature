@boarduse @viewLayout
Feature: View layout

  Background: Login to workspace
    Given Anna was logged in Collabase as workspace owner
    And she choose workspace for board use
    And she is in dashboard page

  Scenario: Find with no result #COL_BU_VL_3
    When Anna choose board "Board without link" in sidebar
    And she open View by form
    And she reset view
    And she search board item with "Nothinghere"
    Then she should see no item in list board item

  Scenario Outline: Find with valid result #COL_BU_VL_4 #COL_BU_VL_19 #COL_BU_VL_20 #COL_BU_VL_22
    When she open View by form
    And she reset view
    And Anna search board item with "<Value>"
    Then she should see item with "<Type>"
    Examples:
      | Type         | Value        |
      | Text         | Name         |
      | Long content | Long         |
      | Number       | 123456       |
      | Checkbox     | Option A     |
      | Dropdown     | Dropdown 1   |
      | Tag          | Tag A        |
      | Radio        | Radio 2      |
      | Person       | Cường Nguyễn |
      | Date         | 2021-09-07   |
      | Time         | 14:00        |
      | Percent      | 25           |
      | Formula      | 246912       |

  Scenario: Set view by untick all option #COL_BU_VL_14
    When Anna choose board "Board without link" in sidebar
    And she open View by form
    And she reset view
    And she untick all options
    And she submit View by form
    Then she should see error message for empty View by option

  Scenario: Set view by some properties #COL_BU_VL_15
    When Anna choose board "Board without link" in sidebar
    And she open View by form
    And she reset view
    And she untick some options
    And she submit View by form
    Then she should see unticked properties is not displayed

  Scenario: Set view with property Link to model #COL_BU_VL_16
    When Anna choose board "Board with link same board" in sidebar
    And she open View by form
    Then she should see property "Link to model" is not displayed in View by

  Scenario: Set view with property Multiple #COL_BU_VL_17
    When Anna choose board "Board without link" in sidebar
    And she open View by form
    Then she should see property "Multiple" is not displayed in View by

  Scenario: Reset view #COL_BU_VL_18
    When Anna choose board "Board without link" in sidebar
    And she open View by form
    And she untick some options
    And she reset view
    And she submit View by form
    Then she should not see error message for empty View by option
