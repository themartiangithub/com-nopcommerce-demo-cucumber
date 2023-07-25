@Regression
Feature: LoginPage Test

  As a user I want to verify login functionality of Nop-Commerce website

  @Smoke
  Scenario: User Should Navigate To Login Page SuccessFully.
    Given I am on home page
    When I Click on login link
    Then I verify welcome message "Welcome, Please Sign In!"

  @Sanity
  Scenario: Verify The Error Message With InValid Credentials.
    Given I am on home page
    When I Click on login link
    And I Enter EmailId "michael12@gmail.com"
    And I Enter Password "Asdf123"
    And I Click on Login Button
    Then I Verify the Error message

  @Sanity
  Scenario: Verify That User Should LogIn SuccessFully With Valid Credentials.
    Given I am on home page
    When I Click on login link
    And I Enter EmailId "michael123@gmail.com"
    And I Enter Password "Asdf1234"
    And I Click on Login Button
    Then I Verify that LogOut link is display

  Scenario: Verify That User Should LogOut SuccessFully.
    Given I am on home page
    When I Click on login link
    And I Enter EmailId "michael123@gmail.com"
    And I Enter Password "Asdf1234"
    And I Click on Login Button
    And I Click on LogOut Link
    Then I Verify that LogIn Link Display
