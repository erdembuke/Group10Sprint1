Feature: addButton display Functionality
  Background:
    Given Navigate to OrangeHRM
    When Enter username and password correctly then click login button
    Then User should login successfully
    And User clicks Admin Tab on the menu and navigates User Management Page

    Scenario: addButton user should see
      When user click the addButton
      Then user should see addBtn displayed
