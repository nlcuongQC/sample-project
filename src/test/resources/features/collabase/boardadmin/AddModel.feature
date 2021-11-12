@boardAdmin @addNewModel
Feature: Add new model

  Background: Go to board admin page
    Given Anna was logged in Collabase as workspace owner
    And Anna go to board admin page
    And she prepare to create new model

  Scenario: Without name #COL_BM_ANM_7
    When Anna create new model without name
    Then she should see create model error message "Please enter model's name" at field Name

  Scenario: Duplicate name #COL_BM_ANM_8
    When Anna create new model with a duplicate name
    Then she should see the duplicate model error message is "duplicate model"

  Scenario: Create a new main model #COL_BM_ANM_9
    When Anna create new main model with valid name
    Then Anna should see the created model in Model Relations
    And she should see the created model is Main model

    Scenario: Create a new not main model #COL_BM_ANM_10
      When Anna create new model with valid name
      Then Anna should see the created model in Model Relations

