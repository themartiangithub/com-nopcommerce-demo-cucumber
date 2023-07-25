package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement desktopTextElement;
    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement buildYourComp;
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement sortByElement;
    @CacheLookup
    @FindBy(xpath = "//select[@id='products-pagesize']")
    WebElement displayElement;
    @CacheLookup
    @FindBy(xpath = "//h2[@class = 'product-title']/child::a")
    WebElement productList;

    public String getDesktopText(){
        log.info("Get desktop text" + desktopTextElement.toString());
        //CustomListeners.test.log(Status.PASS, "Get desktop text" + desktopTextElement.toString());
        return getTextFromElement(desktopTextElement);
    }
    public void setSortByElement(String text){
        log.info("Sort by products per page" + sortByElement.toString());
        //CustomListeners.test.log(Status.PASS, "Sort by products per page" + sortByElement.toString());
        selectByVisibleTextFromDropDown(sortByElement, text);
    }
    public void setDisplayElement(String text){
        log.info("Display products per page" + displayElement.toString());
        //CustomListeners.test.log(Status.PASS, "Display products per page" + displayElement.toString());
        selectByVisibleTextFromDropDown(displayElement, text);
    }
    public void clickOnBuildYourComp(){
        log.info("Click on build your own computer" + buildYourComp.toString());
        //CustomListeners.test.log(Status.PASS, "Click on build your own computer" + buildYourComp.toString());
        clickOnElement(buildYourComp);
    }
}
