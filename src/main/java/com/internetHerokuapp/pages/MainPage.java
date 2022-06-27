package com.internetHerokuapp.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage {

    public MainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//li/a")
    List<WebElement> allElements ;

    public void clickElement(String element){
        for ( WebElement ele :allElements){
            if (ele.getText().trim().contains(element)){
                ele.click();
                break;
            }
        }
    }

    public String validateElements(WebDriver driver){

        return driver.getCurrentUrl();


    }
}
