Feature: Ess non-Create Functionality
  Background:
    Given Navigate to OrangeHRM
    When Enter username and password correctly then click login button
    Then User should login successfully
    And User clicks Admin Tab on the menu and navigates User Management Page

    Scenario: Saving without filling the form
      When Click on the Addbutton
      Then Click on SaveButton
      And Verify that you are not registered