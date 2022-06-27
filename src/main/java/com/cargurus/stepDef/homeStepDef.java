package com.cargurus.stepDef;

import com.cargurus.pages.homePage;
import com.cargurus.pages.inventoryPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.DriverHelper;

public class homeStepDef {

WebDriver driver = DriverHelper.getDriver();
    @When("User provides car {string} , {string} , {string} and  and click search button form home page")
    public void user_provides_car_information_and_click_search_button_form_home_page(String make , String model ,
                                                                                     String zipCode) {
        homePage homePage = new homePage(driver);
        homePage.carSearch(make,model,zipCode);
    }
    @Then("User validates header contains {string}")
    public void user_validates_header_contains(String expectedHeader) {
        inventoryPage inventoryPage = new inventoryPage(driver);
        Assert.assertEquals(inventoryPage.validateHeader().trim().contains(expectedHeader),true);
    }




}
