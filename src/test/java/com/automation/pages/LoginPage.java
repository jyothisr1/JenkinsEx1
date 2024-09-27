package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    //input[@id='j_username']
    @FindBy(xpath = "//input[@id='j_username']")
    WebElement usernameInput;

    @FindBy(xpath = "//input[@id='j_password']")
    WebElement passwordInput;

    @FindBy(name = "Submit")
    WebElement submitButton;

    @FindBy(xpath = "//span[text()='New Item']/..")
    WebElement newItem1;

    @FindBy(id = "name")
    WebElement nameInput;

    @FindBy(className = "hudson_model_FreeStyleProject")
    WebElement freeStyle;

    @FindBy(id = "ok-button")
    WebElement okbutton;

    public void openWebsite(){
        driver.get("http://localhost:8080/");
    }
    public void setUsernameInput(){
        usernameInput.sendKeys("Jyothis");
    }
    public void setPasswordInput(){
        passwordInput.sendKeys("jyothis12");
    }
    public void clickSubmit(){
        submitButton.click();
    }
    public void setNewItem1(){
        newItem1.click();
    }
    public void setNameInput(){
        nameInput.sendKeys("project 1");
    }
    public void selectFreeStyle(){
        freeStyle.click();
    }
    public void clickOkButton(){
        okbutton.click();
    }
}
