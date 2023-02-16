package com.nopcommerceweek13.pages;

import com.nopcommerceweek13.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());

    public DesktopsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='page-title']")
    WebElement DesktopsText;
    @FindBy(xpath = "//div[@class='product-sorting']")
    WebElement SortByText;
    @FindBy(xpath = "//div[@class='product-page-size']")
    WebElement DisplayText;
    @FindBy(xpath = "//a[@class='viewmode-icon list']")
    WebElement SelectProductListLocater;

    public String verifyDeskstopsText() {
        log.info("getting text from:"+DesktopsText.toString());
        return getTextFromElement(DesktopsText);
    }
    public String getSortByText(){
        log.info("getting text from:"+SortByText.toString());
        return getTextFromElement(SortByText);
    }
    public String getDisplayText(){
        log.info("getting text from:"+DisplayText.toString());
        return getTextFromElement(DisplayText);
    }
    public String getSelectProductListLocater(){
       log.info("getting text from"+SelectProductListLocater.toString());
       return getTextFromElement(SelectProductListLocater);
    }
}

