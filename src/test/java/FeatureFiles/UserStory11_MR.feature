
Feature: Head "Add User"

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password correctly then click login button
    Then User should login successfully
    And User clicks Admin Tab on the menu and navigates User Management Page
    When Click on the Addbutton

  Scenario: “Add User” heading is displayed
    When  user verify that “Add User” heading is displayed
