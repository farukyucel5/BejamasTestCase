package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BejamasPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Steps {
    BejamasPage bejamasPage=new BejamasPage();
    @Given("navigate to the website")
    public void navigateToTheWebsite() {
        bejamasPage=new BejamasPage();
        Driver.getDriver().get(ConfigReader.getProperty("bjUrl"));
    }

    @And("verify photo of the day")
    public void verifyPhotoOfTheDay() {
        bejamasPage.assertion(bejamasPage.photoOfTheDay,"Photo of the day");
    }

    @Then("verify the product list contains six items")
    public void verifyTheProductListContainsSixItems() {
        bejamasPage.assertion(bejamasPage.webElementList,4);
    }


    @And("add to cart button should come out after hovering over")
    public void addToCartButtonShouldComeOutAfterHoveringOver() {
        bejamasPage.hoveringFunction(bejamasPage.webElementList,bejamasPage.addToCartList);

    }
}
