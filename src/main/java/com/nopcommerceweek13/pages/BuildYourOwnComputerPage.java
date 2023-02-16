package com.nopcommerceweek13.pages;

import com.nopcommerceweek13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildYourOwnComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());
    public BuildYourOwnComputerPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement BuildYourOwnComputerText;
    @FindBy(linkText = ("Build your own computer"))
    WebElement BuildYourOwnComputer;
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement ProcessorDropdown;
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement RamDropdown;
    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement RadioButtonHDD;
    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
    WebElement RadioButtonOS;
    @FindBy(xpath ="//input[@id='product_attribute_5_10']")
    WebElement SoftwareCheckBox;
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement AddtoCartButton;
    @FindBy(xpath = "//div[@class='bar-notification success']/p")
    WebElement theProducthasbeenaddedtoyourShoppingCartText;



    public String BuildYourOwnComputerText() {
        log.info("getting text from"+ BuildYourOwnComputerText.toString());
        return getTextFromElement(BuildYourOwnComputerText);

    }
    public void clickonBuildyourowncomputer() {
        clickOnElement(BuildYourOwnComputer);
        log.info("Click on Build Your Own Computer"+ BuildYourOwnComputer.toString());
    }
    public void selectProcessorDropdown(String processor) {
       selectByVisibleTextFromDropDown(ProcessorDropdown,processor);
    }
    public void selectonRamDropdown(String ram){
       selectByVisibleTextFromDropDown(RamDropdown,ram);
    }
    public void clickonRadioButtonHDD(String hdd){
        clickOnElement(RadioButtonHDD);
        log.info("Click on ButtonHDD"+RadioButtonHDD.toString());
    }
    public void clickonRadioButtonOS(String os){
        clickOnElement(RadioButtonOS);
        log.info("Click on ButtonOS"+RadioButtonOS.toString());
    }
    public void clickonSoftwareCheckBox(String software ){
        clickOnElement(SoftwareCheckBox);
        log.info("Click on Software"+SoftwareCheckBox.toString());
    }
    public void clickonAddToCartButton(){
        clickOnElement(AddtoCartButton);
        log.info("Click on AddToCartButton"+ AddtoCartButton.toString());
    }
    public String TheProducthasbeenaddedtoyourShoppingCartText(){
        return getTextFromElement(theProducthasbeenaddedtoyourShoppingCartText);
    }
    public void owncomputer(String processor,String ram,String hdd,String os,String software){
        selectProcessorDropdown(processor);
        selectonRamDropdown(ram);
        clickonRadioButtonHDD(hdd);
        clickonRadioButtonOS(os);
        clickonSoftwareCheckBox(software);
    }


}
