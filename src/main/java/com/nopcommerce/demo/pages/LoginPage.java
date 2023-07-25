package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welComeMsg;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement logInButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement unsuccessfulLoginError;

    public void enterEmail(String email) {
        log.info("Enter email" + emailField.toString());
        //CustomListeners.test.log(Status.PASS, "Enter email" + emailField.toString());
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        log.info("Enter password" + passwordField.toString());
        //CustomListeners.test.log(Status.PASS, "Enter password" + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginBtn() {
        log.info("Click on login" + logInButton.toString());
        //CustomListeners.test.log(Status.PASS, "Click on login" + logInButton.toString());
        clickOnElement(logInButton);
    }

    public String getWelcomeMessage() {
        log.info("Get welcome message" + welComeMsg.toString());
        //CustomListeners.test.log(Status.PASS, "Get welcome message" + welComeMsg.toString());
        return getTextFromElement(welComeMsg);
    }

    public String getUnsuccessfulErrorMessage() {
        log.info("Get error message" + unsuccessfulLoginError.toString());
        //CustomListeners.test.log(Status.PASS, "Get error message" + unsuccessfulLoginError.toString());
        return getTextFromElement(unsuccessfulLoginError);
    }
}
