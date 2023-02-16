package com.nopcommerceweek13.testsuite;

import com.nopcommerceweek13.pages.HomePage;
import com.nopcommerceweek13.pages.LoginPage;
import com.nopcommerceweek13.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessFully() {
        homePage.clickOnLoginLink();
        String actualMsg = loginPage.getWelcomeText();
        String expectedMsg = "Welcome, Please Sign In!";
        Assert.assertEquals(actualMsg, expectedMsg, "Login page verified");
    }

    @Test
    public void verifyTheErrorMessageWithInValidCredentials(){
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("apple2.banana@gmail.com");
        loginPage.enterPassword("Apple1234@");
        loginPage.clickOnLoginButton();
        String actualMsg= loginPage.getErrorMessage();
        String expectedMsg="Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertEquals(actualMsg,expectedMsg,"Error message verified");
    }

    @Test
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("apple.mango@gmail.com");
        loginPage.enterPassword("mango123@");
        loginPage.clickOnLoginButton();
        homePage.verifylogoutext();
      //  String actualMsg =loginPage.
      //  String expectedMsg = "Log out";
       // Assert.assertEquals(actualMsg,expectedMsg,"Logout text verified");
    }
    @Test
    public void VerifyThatUserShouldLogOutSuccessFully() {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("apple.mango@gmail.com");
        loginPage.enterPassword("mango123@");
        loginPage.clickOnLoginButton();
        homePage.logOutLink();
        homePage.verifyLoginLink();


    }
}