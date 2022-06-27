package com.products.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.DriverHelper;

public class ProductsLoginPage {

    public ProductsLoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "ctl00_MainContent_username")
    WebElement username ;

    @FindBy(id = "ctl00_MainContent_password")
    WebElement password ;

    @FindBy(id = "ctl00_MainContent_login_button")
    WebElement loginButton ;



    public void login (String username ,String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        loginButton.click();
    }

}
