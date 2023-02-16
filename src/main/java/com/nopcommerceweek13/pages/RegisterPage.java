package com.nopcommerceweek13.pages;

import com.nopcommerceweek13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.time.Month;
import java.time.Year;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());
    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='page-title']")
    WebElement RegisterText;
    @FindBy(xpath = "//span[@class='female']")
            WebElement MaleFemaleradiobutton;
    @FindBy(xpath = "//input[@id='FirstName']")
            WebElement Firstnamefield;
    @FindBy(xpath = "//input[@id='LastName']")
            WebElement Lastnamefield;
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
            WebElement DateofbirthDay;
    @FindBy(xpath ="//select[@name='DateOfBirthMonth']")
            WebElement DateofbirthMonth;
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
            WebElement DateofbirthYear;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailField;
    @FindBy(xpath = "//input[@id='Password']")
            WebElement passwordfield;
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
            WebElement confirmPasswordfield;
    @FindBy(xpath = "//button[@id='register-button']")
            WebElement RegisterButton;
    @FindBy(xpath = "//span[@id='FirstName-error']")
            WebElement Firstnameisrequired;
    @FindBy(xpath = "//span[@id='LastName-error']")
            WebElement Lastnameisrequired;
    @FindBy(xpath = "//span[@id='Email-error']")
            WebElement Emailisrequired;
    @FindBy(xpath = "//span[@id='Password-error']")
            WebElement Passwordisrequired;
    @FindBy(id = "ConfirmPassword-error")
            WebElement ConfirmPasswordrequired;
    @FindBy(xpath = "//div[@class='result']")
            WebElement registrationCompletedMessage;
    @FindBy(xpath = "//a[@class='button-1 register-continue-button']")
            WebElement ContinueTab;

    public String RegisterText(){
        log.info("RegisterText verify"+ RegisterText.toString());
        return getTextFromElement(RegisterText);
    }
    public void selectMaleFemaleradioButton(){
        clickOnElement(MaleFemaleradiobutton);
        log.info("Click on MalefemaleButton"+ MaleFemaleradiobutton.toString());
    }
    public void enterFirstname(String Firstname) {
        sendTextToElement(Firstnamefield, Firstname);
    }
    public void enterLastname(String Lastname) {
        sendTextToElement(Lastnamefield, Lastname);
    }
    public void DateofBirthDay(String Day){
        sendTextToElement(DateofbirthDay,Day);
       log.info("select your day of birth"+DateofbirthDay.toString());

    }
    public void DateofBirthMonth(String Month){
        sendTextToElement(DateofbirthMonth,Month);
        log.info("select your month of birth"+DateofbirthMonth.toString());
    }
    public void DateofBirthYear(String Year) {
        sendTextToElement(DateofbirthYear,Year);
        log.info("select your year of birth"+DateofbirthYear.toString());
    }
    public void enterEmailId(String email){
        sendTextToElement(emailField,email);
    }
    public  void enterPassword(String password){
        sendTextToElement(passwordfield,password);
    }
    public void enterConfirmPassword(String Password){
        sendTextToElement(confirmPasswordfield,Password);
    }
    public void clickonRegisterButton() {
        log.info("click on register button"+ RegisterButton.toString());
        clickOnElement(RegisterButton);
    }
    public String verifyFirstnameisrequiredText(){
        log.info("Verify first name required"+Firstnameisrequired.toString());
        return getTextFromElement(Firstnameisrequired);
    }
    public String verifyLastnameisrequiredText() {
        log.info("Verify last name required"+Lastnameisrequired.toString());
        return getTextFromElement(Lastnameisrequired);
    }
    public String verifyEmailisrequiredText() {
        return getTextFromElement(Emailisrequired);
    }
    public String  verifyPasswordisrequiredText() {
        return getTextFromElement(Passwordisrequired);
    }
    public String verifyConfirmPasswordrequired() {
        return getTextFromElement(ConfirmPasswordrequired);
    }
    public String verifyRegistrationCompleteMsg(){
        log.info("Verify Registration Complete Text" + registrationCompletedMessage.toString());
        return getTextFromElement(registrationCompletedMessage);
    }
    public void clickonCountinueTab() {
        log.info("click on countinuetab"+ ContinueTab.toString());
        clickOnElement(ContinueTab);
    }
}






