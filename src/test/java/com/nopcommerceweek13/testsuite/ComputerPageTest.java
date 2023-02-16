package com.nopcommerceweek13.testsuite;

import com.nopcommerceweek13.pages.*;
import com.nopcommerceweek13.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;

import javax.annotation.processing.Processor;

public class ComputerPageTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;
   ComputerPage computerPage;
   DesktopsPage desktopsPage;
   BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage= new RegisterPage();
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }
    @Test
    public void verifyUserShouldNavigateToComputerPageSuccessfully(){
        homePage.clickOncomputer();
        String actualMsg = computerPage.getComputersText();
        String expectedMsg = "Computers";
        Assert.assertEquals(actualMsg,expectedMsg,"Computers text is verified");
    }
    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        homePage.clickOncomputer();
        computerPage.clickonDesktopslink();
        String actualMsg = desktopsPage.verifyDeskstopsText();
        String expectedMsg = "Desktops";
        Assert.assertEquals(actualMsg,expectedMsg,"Desktop text is verified");
    }
    @Test(dataProvider="BuildyourOwnComputer",dataProviderClass= TestData.class)
    public void verifyThatUserShouldBuildYourOwnComputerAndAddThemToCartSuccessfully(String processor,String ram,String hdd,String os,String software){
        homePage.clickOncomputer();
        computerPage.clickonDesktopslink();
        buildYourOwnComputerPage.clickonBuildyourowncomputer();
        //buildYourOwnComputerPage.owncomputer(processor,ram,hdd,os,software);
        buildYourOwnComputerPage.selectProcessorDropdown(processor);
        buildYourOwnComputerPage.selectonRamDropdown(ram);
        buildYourOwnComputerPage.clickonRadioButtonHDD(hdd);
        buildYourOwnComputerPage.clickonRadioButtonOS(os);
        buildYourOwnComputerPage.clickonSoftwareCheckBox(software);
        buildYourOwnComputerPage.clickonAddToCartButton();
        String actualMsg1=buildYourOwnComputerPage.TheProducthasbeenaddedtoyourShoppingCartText();
        String expectedMsg1="The product has been added to your shopping cart";
        Assert.assertEquals(actualMsg1,expectedMsg1,"product added message verified");

    }
}

