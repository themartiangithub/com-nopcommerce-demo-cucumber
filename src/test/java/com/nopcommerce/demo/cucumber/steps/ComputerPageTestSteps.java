package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerPageTestSteps {
    @When("I Click on Computer tab")
    public void iClickOnComputerTab() {
        new HomePage().clickTopMenuElement("Computers");
    }

    @And("I Click on Desktops link")
    public void iClickOnDesktopsLink() {
        new ComputerPage().clickOnDesktops();
    }

    @And("I Click on product name {string}")
    public void iClickOnProductName(String arg0) {
        new DesktopsPage().clickOnBuildYourComp();
    }

    @And("I Select processor {string}")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("I Select RAM {string}")
    public void iSelectRAM(String ram) {
        new BuildYourOwnComputerPage().selectRam(ram);
    }

    @And("I Select HDD {string}")
    public void iSelectHDD(String hdd) {
        new BuildYourOwnComputerPage().selectHDD(hdd);
    }

    @And("I Select OS {string}")
    public void iSelectOS(String os) {
        new BuildYourOwnComputerPage().selectOs(os);
    }

    @And("I Select Software {string}")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }

    @And("I Click on {string} Button")
    public void iClickOnButton(String arg0) {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @Then("I Verify product added message {string}")
    public void iVerifyProductAddedMessage(String arg0) {
        Assert.assertEquals(new BuildYourOwnComputerPage().getAddedToCartText(), "The product has been added to your shopping cart", "Product is not added to shopping cart.");
    }
}
