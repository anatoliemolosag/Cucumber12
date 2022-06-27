package com.weborder.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebOrderLoginPage {

    public WebOrderLoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "Email")
    WebElement email;

    @FindBy(id ="Password")
    WebElement password;

    @FindBy(xpath = "//button[@class=\"btn btn-lg btn-primary btn-block mt-1\"]")
    WebElement signInButton;

    @FindBy(xpath = "//div[@class=\"mt-2 alert alert-danger\"]")
    WebElement message ;

    public void webOrderLogin(String email ,String password ){
        this.email.clear();
        this.email.sendKeys(email);
        this.password.clear();
        this.password.sendKeys(password);
        signInButton.click();
    }

    public String setMessage(){
        return message.getText();
    }


}
