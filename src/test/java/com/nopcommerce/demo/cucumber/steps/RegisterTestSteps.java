package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterTestSteps {
    @When("I Click on Register Link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegister();
    }

    @Then("I Verify {string} text")
    public void iVerifyText(String text) {
        Assert.assertEquals(new RegisterPage().getRegisterText(), text, "User is not navigated to register page");
    }

    @And("I Click on {string} button")
    public void iClickOnButton(String arg0) {
        new RegisterPage().clickOnRegister();
    }

    @Then("I Verify the error message {string}")
    public void iVerifyTheErrorMessage(String arg0) {
        Assert.assertEquals(new RegisterPage().getErrorFNameText(), "First name is required.", "Error message is not displayed");
        Assert.assertEquals(new RegisterPage().getErrorLNameText(), "Last name is required.", "Error message is not displayed");
        Assert.assertEquals(new RegisterPage().getEmailErrorText(), "Email is required.", "Error message is not displayed");
        Assert.assertEquals(new RegisterPage().getErrorPasswordText(), "Password is required.", "Error message is not displayed");
        Assert.assertEquals(new RegisterPage().getConfirmPasswordText(), "Password is required.", "Error message is not displayed");
    }

    @And("I Select gender {string}")
    public void iSelectGender(String text) {
        new RegisterPage().selectGender(text);
    }

    @And("I Enter firstname {string}")
    public void iEnterFirstname(String text) {
        new RegisterPage().setFirstNameField(text);
    }

    @And("I Enter lastname {string}")
    public void iEnterLastname(String text) {
        new RegisterPage().setLastNameField(text);
    }

    @And("I Select day {string}")
    public void iSelectDay(String day) {
        new RegisterPage().selectDay(day);
    }

    @And("I Select month {string}")
    public void iSelectMonth(String month) {
        new RegisterPage().selectMonth(month);
    }

    @And("I Select year {string}")
    public void iSelectYear(String year) {
        new RegisterPage().selectYear(year);
    }

    @And("I Enter email {string}")
    public void iEnterEmail(String email) {
        new RegisterPage().enterEmail(email);
    }

    @And("I Enter password {string}")
    public void iEnterPassword(String password) {
        new RegisterPage().enterPassword(password);
    }

    @And("I Enter Confirm Password {string}")
    public void iEnterConfirmPassword(String confirmPassword) {
        new RegisterPage().enterConfirmPassword(confirmPassword);
    }

    @Then("I Verify message {string}")
    public void iVerifyMessage(String arg0) {
        Assert.assertEquals(new RegisterPage().getRegistrationCompletedMsg(), "Your registration completed", "User is not registered successfully");
    }
}
