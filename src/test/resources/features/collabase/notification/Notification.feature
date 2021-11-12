@notification
Feature: Notification

  Background: Login to workspace
    Given Anna was logged in Collabase as workspace owner
    And she choose workspace for notification
    And she is in dashboard page

  Scenario: Create board #COL_IAN_CIAN_1 #COL_IAN_CIAN_2
    When Anna prepare to create board
    And she create board with main model
    And she logout with profile menu
    Then Peter was logged in Collabase as admin
    And he choose workspace for notification
    And he open notification modal
    And Peter should see add board notification

  Scenario: Close board #COL_IAN_CIAN_3
    When Anna prepare a board with assigned member
    And she close prepared board
    And she logout with profile menu
    Then Peter was logged in Collabase as admin
    And he choose workspace for notification
    And he open notification modal
    And Peter should see closed board notification