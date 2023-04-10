Feature: Invalid admin name notification when adding user
  Background:
    Given Navigate to OrangeHRM
    When Enter username and password correctly then click login button
    Then User should login successfully
    And User clicks Admin Tab on the menu and navigates User Management Page
    When Click on the Addbutton

    Scenario: Filling Employee name with invalid admin name
      And User fills employee name with invalid admin name
      Then User see invalid notification message
