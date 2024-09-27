package com.automation.test;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import org.testng.annotations.*;

public class BaseTest {
    LoginPage loginPage;
    HomePage homePage;
    @BeforeSuite
    public void setUp(){
        DriverManager.createDriver();
        ConfigReader.initConfig();
        loginPage=new LoginPage();
        homePage=new HomePage();
    }

    @AfterSuite
    public void cleanUp(){
//        DriverManager.getDriver().quit();
    }
}
