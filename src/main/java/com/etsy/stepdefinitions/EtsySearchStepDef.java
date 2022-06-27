package com.etsy.stepdefinitions;

import com.etsy.pages.EtsyMainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class EtsySearchStepDef {


WebDriver driver = DriverHelper.getDriver();
EtsyMainPage etsyMainPage = new EtsyMainPage(driver);

    @Given("User navigates to {string}")
    public void user_navigates_to(String url) {
       driver.get(url);
    }

    @When("User searches for {string}")
    public void user_searches_for(String word) {
    etsyMainPage.searchItem(word);
    }

    @Then("User sees the tile is {string}")
    public void user_sees_the_tile_is(String expectedTitle) throws InterruptedException {
        Thread.sleep(1000);
        //Assert.assertEquals(expectedTitle,driver.getTitle());
        Assert.assertEquals(expectedTitle,driver.getTitle());
    }
}
