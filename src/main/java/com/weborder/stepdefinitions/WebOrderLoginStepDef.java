package com.weborder.stepdefinitions;

import com.weborder.pages.WebOrderLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class WebOrderLoginStepDef {
    //scenario 1
    WebDriver driver =DriverHelper.getDriver();
    @Given("User navigates to the WebOrder")
    public void user_navigates_to_the_web_order() {
        WebDriverManager.chromedriver().setup();
//        driver = DriverHelper.getDriver();
        driver.get(ConfigReader.readProperty("weborderurl"));
    }

    @Then("User validates the {string} from homepage")
    public void user_validates_the_from_homepage(String expectedTitle) {
        Assert.assertEquals(expectedTitle,driver.getTitle());

    }


    @Then("User validates {string} from login page")
    public void user_validates_sign_in_failed_from_login_page(String expectedMessage) {
        WebOrderLoginPage webOrderLoginPage = new WebOrderLoginPage(driver);
        Assert.assertEquals(expectedMessage,webOrderLoginPage.setMessage().trim());


    }

    @When("User provides credentials {string} and {string} for WebOrder")
    public void user_provides_credentials_and_correct_for_web_order(String username, String password) {
        WebOrderLoginPage webOrderLoginPage = new WebOrderLoginPage(driver);
        webOrderLoginPage.webOrderLogin(username,password);
    }





}
