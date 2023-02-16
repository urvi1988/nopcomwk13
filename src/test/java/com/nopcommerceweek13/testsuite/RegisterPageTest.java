package com.nopcommerceweek13.testsuite;

import com.nopcommerceweek13.pages.HomePage;

import com.nopcommerceweek13.pages.RegisterPage;
import com.nopcommerceweek13.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {

    HomePage homePage;
    RegisterPage registerPage;
    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
        registerPage = new RegisterPage();
    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
        homePage.clickOnRegisterLink();
        String actualMsg = registerPage.RegisterText();
        String expectedMsg = "Register";
        Assert.assertEquals(actualMsg,expectedMsg,"RegisterText verified");
    }
    @Test
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory(){
        homePage.clickOnRegisterLink();
        registerPage.clickonRegisterButton();
        String actualMsg = registerPage.verifyFirstnameisrequiredText();
        String expectedMsg = "First name is required.";
        Assert.assertEquals(actualMsg,expectedMsg,"Firstname is required verified");

        String actualMsg1 = registerPage.verifyLastnameisrequiredText();
        String expectedMsg1 = "Last name is required.";
        Assert.assertEquals(actualMsg1,expectedMsg1,"Lastname is required verified");

        String actualMsg2 = registerPage.verifyEmailisrequiredText();
        String expectedMsg2 = "Email is required.";
        Assert.assertEquals(actualMsg2,expectedMsg2,"Email is required verified");

        String actualMsg3 = registerPage.verifyPasswordisrequiredText();
        String expectedMsg3 = "Password is required.";
        Assert.assertEquals(actualMsg3,expectedMsg3,"Password is required verified");

        String actualMsg4= registerPage.verifyPasswordisrequiredText();
        String expectedMsg4= "Password is required.";
        Assert.assertEquals(actualMsg4,expectedMsg4,"confirm password verified");

    }
    @Test
    public void verifyThatUserShouldCreateAccountSuccessfully() {
        homePage.clickOnRegisterLink();
        registerPage.selectMaleFemaleradioButton();
        registerPage.enterFirstname("Apple1");
        registerPage.enterLastname("Banana1");
        registerPage.DateofBirthDay("13");
        registerPage.DateofBirthMonth("December");
        registerPage.DateofBirthYear("1913");
        registerPage.enterEmailId("apple1.banana@gmail.com");
        registerPage.enterPassword("apple1234@");
        registerPage.enterConfirmPassword("apple1234@");
        registerPage.clickonRegisterButton();

        String actualMsg = registerPage.verifyRegistrationCompleteMsg();
        String expectedMsg = "Your registration completed";
        Assert.assertEquals(actualMsg,expectedMsg,"Your registration completed verified");
    }

}

