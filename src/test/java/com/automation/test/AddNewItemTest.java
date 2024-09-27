package com.automation.test;
import org.testng.annotations.Test;

public class AddNewItemTest extends BaseTest{
    @Test
    public void AddNewItem(){
        loginPage.openWebsite();
        loginPage.setUsernameInput();
        loginPage.setPasswordInput();
        loginPage.clickSubmit();
        homePage.SelectNewItem();
    }
}
