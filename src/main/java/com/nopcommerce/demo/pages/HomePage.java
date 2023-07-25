package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @FindBy(xpath = "//a[@class='ico-login']")
    WebElement loginLink;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement registerLink;
    @CacheLookup
    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement nopcommerceLogo;
    @CacheLookup
    @FindBy(xpath = "//a[@class='ico-account']")
    WebElement myAccountLink;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logOutLink;

    public void clickTopMenuElement(String menu) {
        log.info("Click on main menu element");
        //CustomListeners.test.log(Status.PASS, "Click on main menu element");
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='" + menu + "']"));
    }

    public void clickOnLogIn() {
        log.info("Click on Log In" + loginLink.toString());
        //CustomListeners.test.log(Status.PASS, "Click on Log In" + loginLink.toString());
        clickOnElement(loginLink);
    }

    public void clickOnRegister() {
        log.info("Click on Register" + registerLink.toString());
        //CustomListeners.test.log(Status.PASS, "Click on Register" + registerLink.toString());
        clickOnElement(registerLink);
    }

    public void clickOnMyAccountLink() {
        log.info("Click on My account" + myAccountLink.toString());
        //CustomListeners.test.log(Status.PASS, "Click on My account" + myAccountLink.toString());
        clickOnElement(myAccountLink);
    }

    public void clickOnLogOut() {
        log.info("Click on Logout" + logOutLink.toString());
        //CustomListeners.test.log(Status.PASS, "Click on Logout" + logOutLink.toString());
        clickOnElement(logOutLink);
    }

    public boolean logoutLinkDisplayed() {
        log.info("Verify logout link element" + logOutLink.toString());
        //CustomListeners.test.log(Status.PASS, "Verify logout link element" + logOutLink.toString());
        return logOutLink.isDisplayed();
    }

    public boolean loginLinkDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        log.info("Verify login link element" + loginLink.toString());
        //CustomListeners.test.log(Status.PASS, "Verify login link element" + loginLink.toString());
        return loginLink.isDisplayed();
    }
}
