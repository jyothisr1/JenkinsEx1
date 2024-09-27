package com.automation.test;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void login(){
        loginPage.openWebsite();
        loginPage.setUsernameInput();
        loginPage.setPasswordInput();
        loginPage.clickSubmit();
        homePage.SelectNewItem();
        loginPage.setNameInput();
        loginPage.selectFreeStyle();
        loginPage.clickOkButton();
        homePage.clickGit();
        homePage.clickBuildStep();
    }
//    @Test
//    public void AddNewItem(){
//        homePage.SelectNewItem();
//    }
}
