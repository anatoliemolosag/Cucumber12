package com.amazon.pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainPage {

    /*
    1-Navigate eto amazon website
    2-Search for iphone 13 case
    3-Validate the number is
    4-Validate all header has iPhone

     */

   public MainPage (WebDriver driver){
       PageFactory.initElements(driver,this);
   }

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchField ;

   @FindBy(xpath = "//span[contains(text(),'of over')]")
   WebElement results ;

   @FindBy(xpath = "//h2//a")
    List<WebElement> allHeaders ;

    public void setSearchField(String search){
        searchField.sendKeys(search, Keys.ENTER);

    }
    public int resultOfSearch(){
        String [] result = results.getText().trim().split(" ");
        int lastResult = Integer.parseInt(result[3].replace(",",""));
        return lastResult;
    }

    public void validateHeaders(String word){
        for(WebElement header : allHeaders){
            if(!header.getText().equals("")) {
                Assert.assertTrue(header.getText().contains(word));
            }
        }
    }



}
