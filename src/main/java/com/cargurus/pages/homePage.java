package com.cargurus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.BrowserUtils;

public class homePage {

    public homePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "carPickerUsed_makerSelect")
    WebElement selectMake ;

    @FindBy(id = "carPickerUsed_modelSelect")
    WebElement selectModel;

    @FindBy(xpath = "//input[@id=\"dealFinderZipUsedId_dealFinderForm\"]")
    WebElement zipCodeField ;

    @FindBy(id = "dealFinderForm_0")
    WebElement searchButton ;



    public void carSearch(String make , String model ,String zipCode){

        Select select = new Select(selectMake);
        select.selectByVisibleText(make);
        BrowserUtils.selectBy(selectModel,model,"text");
        zipCodeField.sendKeys(zipCode);
        searchButton.click();



    }



}
