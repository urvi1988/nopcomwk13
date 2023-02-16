package com.nopcommerceweek13.pages;

import com.nopcommerceweek13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());
    public ComputerPage(){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//ul[@class='top-menu notmobile']/li[1]")
    WebElement ComputersText;
    @FindBy(xpath =  "//div[@class='page-body']/div[1]/div[1]/div[1]/div[1]/h2/a")  //(//div[@class='item-grid']/div[1]")
    WebElement Desktopslink;
    @FindBy(xpath = "//div[@class='item-grid']/div[2]")
    WebElement Notebookslink;
    @FindBy(xpath = "//div[@class='item-grid']/div[3]")
    WebElement Softwarelink;

    public String getComputersText(){
       return getTextFromElement(ComputersText);

    }
    public void clickonDesktopslink(){
        clickOnElement(Desktopslink);
        log.info("Click on Desktopslink"+ Desktopslink.toString());

    }
    public void clickonNoteBookslink(){
        clickOnElement(Notebookslink);
        log.info("Click on Notebooks"+Notebookslink.toString());
    }
    public void clickonSoftware(){
        clickOnElement(Softwarelink);
        log.info("Click on Software"+Softwarelink.toString());
    }

}

