package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement registerTextElement;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dateOfBirthdayDropdown;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement monthOfBirthdayDropdown;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement yearOfBirthdayDropdown;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;
    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement errorFNameTextElement;
    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement errorLNameTextElement;
    @CacheLookup
    @FindBy(xpath = "//span[@data-valmsg-for='Email']")
    WebElement errorEmailTextElement;
    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement errorPasswordTextElement;
    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement errorConfirmPasswordTextElement;
    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationCompletedMsg;

    public String getRegisterText() {
        log.info("Get register text" + registerTextElement.toString());
        //CustomListeners.test.log(Status.PASS, "Get register text" + registerTextElement.toString());
        return getTextFromElement(registerTextElement);
    }

    public void selectGender(String gender) {
        log.info("Select gender");
        //CustomListeners.test.log(Status.PASS, "Select gender");
        clickOnElement(By.xpath("//div[@id='gender']/descendant::label[text()='" + gender + "']"));
    }

    public void selectDateOfBirth(String date, String month, String year) {
        log.info("Select date" + dateOfBirthdayDropdown.toString());
        log.info("Select month" + monthOfBirthdayDropdown.toString());
        log.info("Select year" + yearOfBirthdayDropdown.toString());
        //CustomListeners.test.log(Status.PASS, "Select date" + dateOfBirthdayDropdown.toString());
        //CustomListeners.test.log(Status.PASS, "Select month" + monthOfBirthdayDropdown.toString());
        //CustomListeners.test.log(Status.PASS, "Select year" + yearOfBirthdayDropdown.toString());
        selectByVisibleTextFromDropDown(dateOfBirthdayDropdown, date);
        selectByVisibleTextFromDropDown(monthOfBirthdayDropdown, month);
        selectByVisibleTextFromDropDown(yearOfBirthdayDropdown, year);
    }

    public void selectDay(String date){
        log.info("Select date" + dateOfBirthdayDropdown.toString());
        selectByVisibleTextFromDropDown(dateOfBirthdayDropdown, date);
    }

    public void selectMonth(String month){
        log.info("Select month" + monthOfBirthdayDropdown.toString());
        selectByVisibleTextFromDropDown(monthOfBirthdayDropdown, month);
    }

    public void selectYear(String year){
        log.info("Select year" + yearOfBirthdayDropdown.toString());
        selectByVisibleTextFromDropDown(yearOfBirthdayDropdown, year);
    }

    public void enterEmail(String email) {
        log.info("Enter email" + emailField.toString());
        //CustomListeners.test.log(Status.PASS, "Enter email" + emailField.toString());
        sendTextToElement(emailField, email);
    }

    public void setFirstNameField(String firstName) {
        log.info("Enter First name" + firstNameField.toString());
        //CustomListeners.test.log(Status.PASS, "Enter First name" + firstNameField.toString());
        sendTextToElement(firstNameField, firstName);
    }

    public void setLastNameField(String lastName) {
        log.info("Enter Last name" + lastNameField.toString());
        //CustomListeners.test.log(Status.PASS, "Enter Last name" + lastNameField.toString());
        sendTextToElement(lastNameField, lastName);
    }

    public void enterPassword(String password) {
        log.info("Enter password" + passwordField.toString());
        //CustomListeners.test.log(Status.PASS, "Enter password" + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String cfrmPassword) {
        log.info("Enter confirm password" + confirmPassword.toString());
        //CustomListeners.test.log(Status.PASS, "Enter confirm password" + confirmPassword.toString());
        sendTextToElement(confirmPassword, cfrmPassword);
    }

    public void clickOnRegister() {
        log.info("Click on register" + registerButton.toString());
        //CustomListeners.test.log(Status.PASS, "Click on register" + registerButton.toString());
        clickOnElement(registerButton);
    }

    public String getErrorFNameText() {
        log.info("Get first name error text" + errorFNameTextElement.toString());
        //CustomListeners.test.log(Status.PASS, "Get first name error text" + errorFNameTextElement.toString());
        return getTextFromElement(errorFNameTextElement);
    }

    public String getErrorLNameText() {
        log.info("Get last name error text" + errorLNameTextElement.toString());
        //CustomListeners.test.log(Status.PASS, "Get last name error text" + errorLNameTextElement.toString());
        return getTextFromElement(errorLNameTextElement);
    }

    public String getEmailErrorText() {
        log.info("Get email error text" + errorEmailTextElement.toString());
        //CustomListeners.test.log(Status.PASS, "Get email error text" + errorEmailTextElement.toString());
        return getTextFromElement(errorEmailTextElement);
    }

    public String getErrorPasswordText() {
        log.info("Get password error text" + errorPasswordTextElement.toString());
        //CustomListeners.test.log(Status.PASS, "Get password error text" + errorPasswordTextElement.toString());
        return getTextFromElement(errorPasswordTextElement);
    }

    public String getConfirmPasswordText() {
        log.info("Get confirm password error text" + errorConfirmPasswordTextElement.toString());
        //CustomListeners.test.log(Status.PASS, "Get confirm password error text" + errorConfirmPasswordTextElement.toString());
        return getTextFromElement(errorConfirmPasswordTextElement);
    }

    public String getRegistrationCompletedMsg() {
        log.info("Get registration complete text" + registrationCompletedMsg.toString());
        //CustomListeners.test.log(Status.PASS, "Get registration complete text" + registrationCompletedMsg.toString());
        return getTextFromElement(registrationCompletedMsg);
    }
}
