Feature: Notification Message, Password does not match!

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password correctly then click login button
    Then User should login successfully
    And User clicks Admin Tab on the menu and navigates User Management Page
    And Click on the Addbutton

    Scenario: Seeing notification message when does not match
      And user send keys to password box
      And user send keys to confirm password box
      Then notification message should be displayed