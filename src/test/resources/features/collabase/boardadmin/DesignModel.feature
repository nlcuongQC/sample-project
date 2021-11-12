@boardAdmin @designNewModel
Feature: Design model for board

  Background: Go to board admin page
    Given Anna was logged in Collabase as workspace owner
    And Anna go to board admin page
    And she prepare to create new model

  Scenario: Change main model #COL_BM_DMFB_5
    When Anna create new main model with valid name
    And she create another main model with valid name
    Then Anna should see the created model in Model Relations
    And she should see the created model is Main model
    And she should see old main model is not main model

  Scenario: Create property without name #COL_BM_DMFB_6
    When Anna create new main model with valid name
    And she let the property name is blank
    Then she should see the create property error message "Please enter field's name" at the created model

  Scenario Outline: Create property basic types #COL_BM_DMFB_7 #COL_BM_DMFB_8 #COL_BM_DMFB_9 #COL_BM_DMFB_11 #COL_BM_DMFB_12 #COL_BM_DMFB_13 #COL_BM_DMFB_15
    When Anna create new main model with valid name
    And she input default property name
    And she create new property with type is "<Type>"
    Then she should see the created property with type is "<Type>"
    Examples:
      | Type          |
      | Text          |
      | Number        |
      | Long content  |
      | Files & Media |
      | Time          |
      | Date          |
      | Date & Time   |
      | Percent       |

  Scenario: Create property with link to model same board #COL_BM_DC_LTM_1
    When Anna create new main model with valid name
    And she input default property name
    And she create new model with valid name
    And she link main model with new model same board
    Then she should see the created property is linked to new model

  Scenario: Create property with link to model from another board #COL_BM_DC_LTM_2
    When Anna create new main model with valid name
    And she input default property name
    And she add a model from another board
    And she link main model with model from another board
    Then she should see the created property is linked to added model

  Scenario: Remove linked to model #COL_BM_DC_LTM_3
    When Anna create two linked model
    And she delete property "Link to model(s)"
    Then she should see the "Link to model(s)" property is deleted