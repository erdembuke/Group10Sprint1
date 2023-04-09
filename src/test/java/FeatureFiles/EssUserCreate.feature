Feature: Ess Create Functinality
  Background:
    Given Navigate to OrangeHRM
    When Enter username and password correctly then click login button
    Then User should login successfully
    And User clicks Admin Tab on the menu and navigates User Management Page

    Scenario:Fillout the form all textbox
      When Click on the Addbutton
      And Fill up the form with required information
      And Click on SaveButton
      Then Verify That ESS user on the List

