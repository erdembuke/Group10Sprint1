Feature: Seeing notification message, “Already exists”

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password correctly then click login button
    Then User should login successfully
    And User clicks Admin Tab on the menu and navigates User Management Page
    And Click on the Addbutton

    Scenario: Seeing notification message, “Already exists”
      Then Verify that “Already exists” displayed