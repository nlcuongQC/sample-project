@boarduse @viewSingle
Feature: View single

  Background: Login to workspace
    Given Anna was logged in Collabase as workspace owner
    And she choose workspace for board use
    And she is in dashboard page

  Scenario: Allow multiple entries fields #COL_BU_VS_1
    When Anna choose board "Board without link" in sidebar
    And she open add new item form
    And she click to Add new entry button of property "Multiple"
    Then she should see another text box is created at property "Multiple"

  Scenario: Link with system model #COL_BU_VS_2
    When Anna choose board "Board with system model" in sidebar
    And she open add new item form
    And she click to "Link System" tab in add new item form
    Then she should see system model tab is displayed

  Scenario: Link with same board with field in each entry #COL_BU_VS_2
    When Anna choose board "Board with link same board" in sidebar
    And she open add new item form
    And she click to "Link to model" tab in add new item form
    Then she should see linked model tab is displayed

  Scenario: Blank required fields #COL_BU_VS_2
    When Anna choose board "Board without link" in sidebar
    And she open add new item form
    And she submit add new item
    Then she should see required error text at field "Text"
    And she should see required error text at field "Required"

  Scenario: Required fields is not blank #COL_BU_VS_5 #COL_BU_VS_6 #COL_BU_VS_9
    When Anna choose board "Board without link" in sidebar
    And she open add new item form
    And she input full valid data of board
    And she submit add new item
    Then she should see save success message is "Save success"
    And board use view layout is openned

