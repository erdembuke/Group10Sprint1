Feature: User Management Page

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password correctly then click login button
    Then User should login successfully

  Scenario: User could navigate User Management page after login
    And User clicks Admin Tab on the menu and navigates User Management Page