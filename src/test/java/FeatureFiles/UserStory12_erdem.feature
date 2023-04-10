Feature: Password notification message
  Background:
    Given Navigate to OrangeHRM
    When Enter username and password correctly then click login button
    Then  User should login successfully
    And User clicks Admin Tab on the menu and navigates User Management Page
    And Click on the Addbutton

    Scenario: Input password without lower case character
      And User fills password field without lower case character
      Then User see must contain lower case notification
