Feature: Seeing notification message, at least 8 characters!

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password correctly then click login button
    Then User should login successfully
    And User clicks Admin Tab on the menu and navigates User Management Page
    And Click on the Addbutton

  Scenario: Seeing notification message when less than 8 characters
    And user send less keys to password box
    Then Eight charachter notification message should be displayed