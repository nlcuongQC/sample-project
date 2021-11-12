@boardAdmin @closeBoard
Feature: Close board

  Background: Go to board admin page
    Given Anna was logged in Collabase as workspace owner
    And Anna go to board admin page
    And she prepare to create new model

  Scenario: Board with model linked from another board and have no data #COL_BM_CB_2
    When Anna create new main model with valid name
    And she input default property name
    And she add a model from another board
    And she link main model with model from another board
    Then she should see close board button is enabled

  Scenario: Board without model linked from another board #COL_BM_CB_3 #COL_BM_CB_5
    When Anna create new main model with valid name
    And she click to close board button
    And she confirm to close board
    Then she should see publish button is hided
    And she should see close board button is disabled