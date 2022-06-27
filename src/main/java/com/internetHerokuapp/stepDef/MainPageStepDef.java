package com.internetHerokuapp.stepDef;

import com.internetHerokuapp.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class MainPageStepDef {
WebDriver driver = DriverHelper.getDriver();
    MainPage mainPage = new MainPage(driver);

//    @Given("User navigates to {string}")
//    public void user_navigates_to(String url) {
//       driver.get(url);
//    }

    @When("User clicks {string}")
    public void user_clicks(String element) {

        mainPage.clickElement(element);

    }
    @Then("User validates {string}")
    public void user_validates(String Url) {

        Assert.assertEquals(Url,mainPage.validateElements(driver));


    }
}
