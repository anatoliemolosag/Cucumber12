package com.products.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.ArrayList;
import java.util.List;

public class ProductsOrderPage {

    public ProductsOrderPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    WebElement product;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    WebElement quantity;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    WebElement customerName;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    WebElement street;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    WebElement state;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    WebElement city;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    WebElement zip;

    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_0")
    WebElement visaCard;

    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_1")
    WebElement masterCard;

    @FindBy(id = "ctl00_MainContent_fmwOrder_cardList_2")
    WebElement americanExpress;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    WebElement cardNumber;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    WebElement expireDate;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    WebElement processButton;

    @FindBy(xpath = "//strong")
    WebElement message;

    @FindBy(xpath = "//tr[2]/td")
    List<WebElement> allData;

    public void sendProductInformation(String productName, String quantityNumber){
        BrowserUtils.selectBy(product,productName,"text");
        quantity.clear();
        quantity.sendKeys(quantityNumber);
    }

    public void sendAddressInformation(String name , String street , String city , String state, String zip){
        this.customerName.sendKeys(name);
        this.street.sendKeys(street);
        this.city.sendKeys(city);
        this.state.sendKeys(state);
        this.zip.sendKeys(zip);

    }

    public  void  sendPaymentInformation(String cardNumber ,String expireDate,String cardType){
        this.cardNumber.sendKeys(cardNumber);
        this.expireDate.sendKeys(expireDate);
        selectCard(cardType);
        processButton.click();

    }

    public void selectCard(String cardType){
        cardType=cardType.toUpperCase();

        switch (cardType){
            case "VISA":
                visaCard.click();
                break;
            case "MASTERCARD":
                masterCard.click();
                break;
            case "AMERICAN EXPRESS":
                americanExpress.click();
                break;
            default:
                System.out.println("card name is not correct.Please provide a valid card Type.");
                break;
        }

    }



    public String getMessage(){
        return BrowserUtils.getText(message);

    }

    public void validation(String name ,String product ,String quantity , String street ,String city ,String state ,String zip ,String cardNumber,String expireDate ,String cardType){


        Assert.assertEquals(name,allData.get(1).getText());
        Assert.assertEquals(product,allData.get(2).getText());
        Assert.assertEquals(quantity,allData.get(3).getText());
        Assert.assertEquals(street,allData.get(5).getText());
        Assert.assertEquals(city,allData.get(6).getText());
        Assert.assertEquals(state,allData.get(7).getText());
        Assert.assertEquals(zip,allData.get(8).getText());
        Assert.assertEquals(cardNumber,allData.get(10).getText());
        Assert.assertEquals(expireDate,allData.get(11).getText());
        Assert.assertEquals(cardType,allData.get(9).getText());


    }


}
