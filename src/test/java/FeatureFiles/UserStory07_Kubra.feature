Feature: Seeing notification message when entering username with less than 5 character

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password correctly then click login button
    Then User should login successfully
    And User clicks Admin Tab on the menu and navigates User Management Page
    When Click on the Addbutton

    Scenario: Seeing notification message “Should be at least 5 characters”
      When enter a user name less than five characters
      Then verify that “at least 5 characters” is displayed