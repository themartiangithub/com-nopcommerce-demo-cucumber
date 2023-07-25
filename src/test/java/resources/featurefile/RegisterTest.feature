@Regression
Feature: RegisterPage Test

  As a user I want to verify registration functionality of Nop-Commerce website

  @Smoke
  Scenario: Verify User Should Navigate to Register Page Successfully.
    Given I am on home page
    When I Click on Register Link
    Then I Verify "Register" text

  @Sanity
  Scenario: Verify That FirstName LastName EmailPassword And ConfirmPassword Fields Are Mandatory.
    Given I am on home page
    When I Click on Register Link
    And I Click on "REGISTER" button
    Then I Verify the error message "First name is required."
    Then I Verify the error message "Last name is required."
    Then I Verify the error message "Email is required."
    Then I Verify the error message "Password is required."
    Then I Verify the error message "Password is required."

  @Sanity
  Scenario: Verify That User Should Create Account Successfully.
    Given I am on home page
    When I Click on Register Link
    And I Select gender "Female"
    And I Enter firstname "Michale"
    And I Enter lastname "Vine"
    And I Select day "10"
    And I Select month "May"
    And I Select year "1992"
    And I Enter email "michael123@gmail.com"
    And I Enter password "Asdf1234"
    And I Enter Confirm Password "Asdf1234"
    And I Click on "REGISTER" button
    Then I Verify message "Your registration completed"
