package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement computerText;
    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement desktopsLink;
    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Notebooks'][normalize-space()='Notebooks']")
    WebElement notebooksLink;
    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Software'][normalize-space()='Software']")
    WebElement softwareLink;

    public String getComputersText(){
        log.info("Get computers text" + computerText.toString());
        //CustomListeners.test.log(Status.PASS, "Get computers text" + computerText.toString());
        return getTextFromElement(computerText);
    }

    public void clickOnDesktops(){
        log.info("Click on desktop" + desktopsLink.toString());
        //CustomListeners.test.log(Status.PASS, "Click on desktop" + desktopsLink.toString());
        clickOnElement(desktopsLink);
    }
    public void clickOnNotebooks(){
        log.info("Click on Notebooks" + notebooksLink.toString());
        //CustomListeners.test.log(Status.PASS, "Click on Notebooks" + notebooksLink.toString());
        clickOnElement(notebooksLink);
    }
    public void clickOnSoftware(){
        log.info("Click on Software" + softwareLink.toString());
        //CustomListeners.test.log(Status.PASS, "Click on Software" + softwareLink.toString());
        clickOnElement(softwareLink);
    }
}
