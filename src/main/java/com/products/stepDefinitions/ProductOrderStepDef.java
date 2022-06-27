package com.products.stepDefinitions;

import com.products.pages.ProductsLoginPage;
import com.products.pages.ProductsMainPage;
import com.products.pages.ProductsOrderPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

import java.util.List;
import java.util.Map;

public class ProductOrderStepDef {
WebDriver driver = DriverHelper.getDriver();
ProductsLoginPage loginPage = new ProductsLoginPage(driver);
ProductsMainPage mainPage = new ProductsMainPage(driver);
ProductsOrderPage orderPage = new ProductsOrderPage(driver);


    @Given("User navigates to product homepage and Clicks Order Button")
    public void user_navigates_to_product_homepage_and_clicks_order_button() {
        driver.get(ConfigReader.readProperty("producturl"));
        loginPage.login(ConfigReader.readProperty("productusername"),ConfigReader.readProperty("productpassword"));
        mainPage.clickOrderButton();
    }
    @When("User enters the product information {string} and {string}")
    public void user_enters_the_product_information_and(String product, String quantity) {
        orderPage.sendProductInformation(product,quantity);
    }
    @When("User enters the address information {string},{string},{string},{string},{string}")
    public void user_enters_the_address_information(String name, String street, String city, String state, String zip) {
        orderPage.sendAddressInformation(name, street, city, state, zip);
    }
    @When("User enters the payment information {string},{string},{string} and process the order")
    public void user_enters_the_payment_information_and_process_the_order(String cardNumber, String expireDate, String cardType) throws InterruptedException {

       Thread.sleep(1000);
       orderPage.sendPaymentInformation(cardNumber, expireDate, cardType);
    }
    @Then("User validates the success message {string}")
    public void user_validates_the_success_message(String expectedMessage) throws InterruptedException {
      Thread.sleep(1000);
       Assert.assertEquals(expectedMessage,orderPage.getMessage());

    }
    @Then("User clicks View All Orders and validates {string},{string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void user_clicks_view_all_orders_and_validates(String name, String product, String quantity, String street, String city, String state, String zip, String cardNumber, String expireDate, String cardType) {

        mainPage.clickViewAllOrderButton();
        orderPage.validation(name, product, quantity, street, city, state, zip, cardNumber, expireDate, cardType);

    }


    @Given("User navigates to product homepage and Clicks Order Button with DataTable")
    public void user_navigates_to_product_homepage_and_clicks_order_button_with_data_table(DataTable dataTable) {

        driver.get(ConfigReader.readProperty("producturl"));
//        Map<String,String> loginCredentials = dataTable.asMap();//username=tester,password=test
//        loginPage.login(loginCredentials.get("username"),loginCredentials.get("password"));
        List<String>loginCredential = dataTable.asList();
        loginPage.login(loginCredential.get(0),loginCredential.get(1));
        mainPage.clickOrderButton();

    }
    @When("User enters the product information")
    public void user_enters_the_product_information(DataTable dataTable) {

        Map<String,String> productInformation = dataTable.asMap();
        orderPage.sendProductInformation(productInformation.get("product"),productInformation.get("quantity"));

    }
    @When("User enters the address information")
    public void user_enters_the_address_information(DataTable dataTable) {
        Map<String,String> addressInformation = dataTable.asMap();
        orderPage.sendAddressInformation(addressInformation.get("name"),addressInformation.get("street"),addressInformation.get("city"),
                addressInformation.get("state"),addressInformation.get("ZipCode"));
    }
    @When("User enters the payment information and process the order")
    public void user_enters_the_payment_information_and_process_the_order(DataTable dataTable) {
        Map<String,String> paymentInformation = dataTable.asMap();
        orderPage.sendPaymentInformation(paymentInformation.get("cardNumber"),paymentInformation.get("expireDate"),paymentInformation.get("cardType"));

    }
    @Then("User validates the success message")
    public void user_validates_the_success_message(DataTable dataTable) {

       // Map<String,String> message = dataTable.asMap();
        List<String> messageInformation = dataTable.asList();
        Assert.assertEquals(messageInformation.get(0),orderPage.getMessage());

    }
    @Then("User clicks View All Orders and validates")
    public void user_clicks_view_all_orders_and_validates(DataTable dataTable) {

        mainPage.clickViewAllOrderButton();
        Map<String,String> validationInformation = dataTable.asMap();
        orderPage.validation(validationInformation.get("name"),validationInformation.get("product"),validationInformation.get("quantity"),validationInformation.get("street"),validationInformation.get("city")
                ,validationInformation.get("state"), validationInformation.get("zip")
                ,validationInformation.get("cardNumber"),validationInformation.get("expireDate"),validationInformation.get("cardType"));
    }
}
