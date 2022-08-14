package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class HomeworkModulePage {
    @FindBy(xpath = "//span[normalize-space()='Homework']")
    public WebElement HomeworkModuleNavButton;

    @FindBy(xpath = "//a[normalize-space()='Add Homework']")
    public WebElement AddHomeWorkButton;

    public HomeworkModulePage() {
        PageFactory.initElements((WebDriverUtils.driver), this);
    }
}