package com.weborder.stepdefinitions;

import com.weborder.pages.WebOrderGroupOrderPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.DriverHelper;

public class WebOrderGroupOrderStepDef {
WebDriver driver = DriverHelper.getDriver();
WebOrderGroupOrderPage webOrderGroupOrderPage = new WebOrderGroupOrderPage(driver);
    @When("User chooses delivery {string} and validates the address {string}")
    public void user_chooses_delivery_and_validates_the_address(String deliveryOption, String address) {
     webOrderGroupOrderPage.chooseTheDeliveryOption(deliveryOption,address);
    }
    @When("User sends the word {string} for Note to Invitees part")
    public void user_sends_the_word_for_note_to_invitees_part(String note) {
webOrderGroupOrderPage.sendingNote(note);
    }
    @When("User send e-mail addresses which are {string} and {string}")
    public void user_send_e_mail_addresses_which_are_and_berkay_gmail_com(String email1, String email2) {
     webOrderGroupOrderPage.sendingInviteList(email1,email2);
    }
    @When("User clicks create group oder button.")
    public void user_clicks_create_group_oder_button() {
      webOrderGroupOrderPage.clickOrderButton();
    }
    @Then("User validates the header of page is  {string}")
    public void user_validates_the_title_of_page_is(String header) {
     webOrderGroupOrderPage.validateHeader(driver , header);
    }
    @Then("User validates total participant is {int}")
    public void user_validates_total_participant_is(int expectedNumber) {
        Assert.assertEquals(expectedNumber,webOrderGroupOrderPage.getNumberOfParticipant());
       // driver.quit();
    }



}
