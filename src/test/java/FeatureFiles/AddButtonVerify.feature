Feature: add button success Functionality

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password correctly then click login button
    Then User should login successfully
    And User clicks Admin Tab on the menu and navigates User Management Page

    Scenario: Add Button is displayed
      And User see AddButton