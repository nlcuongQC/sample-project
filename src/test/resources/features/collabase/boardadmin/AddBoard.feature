@boardAdmin @addNewBoard
Feature: Add new board

  Background: Go to board admin page
    Given Anna was logged in Collabase as workspace owner
    And Anna go to board admin page
    And Anna open create new board page

  Scenario: Boardname is blank #COL_BM_ANB_1
    When Anna create board without board name
    Then Anna should see create board error message "Please enter board's name" at field Board name

  Scenario: Without main model #COL_BM_ANB_3
    When Anna create board without main model
    And she go back to board admin list page
    And she search for created board
    Then she should see created board with status "Drafted"
    And she should see created board with no available model message

  Scenario: No publish board #COL_BM_ANB_4
    When Anna create board with main model
    And she go back to board admin list page
    And she search for created board
    Then she should see created board with status "Drafted"
    And she should see created board with models name

  Scenario: Published board #COL_BM_ANB_5 #COL_BM_DMFB_6
    When Anna create board with main model
    And she publish board
    Then she should see publish board success message is "Publish board success"
    And she go back to board admin list page
    And she search for created board
    And she should see created board with status "Active"

