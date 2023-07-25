package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginTestSteps extends Utility {

    @Given("I am on home page")
    public void iAmOnHomePage() {
    }

    @When("I Click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLogIn();
    }

    @And("I Enter EmailId {string}")
    public void iEnterEmailId(String email) {
        new LoginPage().enterEmail(email);
    }

    @And("I Enter Password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @Then("I verify welcome message {string}")
    public void iVerifyWelcomeMessage(String arg0) {
        Assert.assertEquals(new LoginPage().getWelcomeMessage(), "Welcome, Please Sign In!", "User is not navigated to Login Page");
    }

    @And("I Click on Login Button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginBtn();
    }

    @Then("I Verify the Error message")
    public void iVerifyTheErrorMessage() {
        Assert.assertEquals(new LoginPage().getUnsuccessfulErrorMessage(), "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found", "Error message is not displayed");
    }

    @Then("I Verify that LogOut link is display")
    public void iVerifyThatLogOutLinkIsDisplay() {
        Assert.assertTrue(new HomePage().logoutLinkDisplayed(), "Logout link is not displayed");
    }

    @And("I Click on LogOut Link")
    public void iClickOnLogOutLink() {
        new HomePage().clickOnLogOut();
    }

    @Then("I Verify that LogIn Link Display")
    public void iVerifyThatLogInLinkDisplay() throws InterruptedException {
        Assert.assertTrue(new HomePage().loginLinkDisplayed(), "Login link is not displayed");
    }

}
