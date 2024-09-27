package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    @FindBy(xpath = "//span[text()='New Item']/..")
    WebElement newItem;

    @FindBy(id = "radio-block-2")
    WebElement selectGit;

    @FindBy(xpath = "//button[text()='Add build step']")
    WebElement selectBuildStep;

    public void SelectNewItem(){
        newItem.click();
    }
    public void clickGit(){
        selectGit.click();
    }
    public void clickBuildStep(){
        selectBuildStep.click();
    }
}
