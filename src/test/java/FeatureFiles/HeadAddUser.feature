Feature: Head Add User button verify

  Background:
    Given Navigate to OrangeHRM
    When Enter username and password correctly then click login button
    Then User should login successfully
    And User clicks Admin Tab on the menu and navigates User Management Page

    Scenario: Head Add User verify
      When User click Add buton on the page User Management Page
      Then Verify Add User heading is displayed