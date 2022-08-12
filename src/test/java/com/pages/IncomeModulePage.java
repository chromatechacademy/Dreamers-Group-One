package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class IncomeModulePage {
   
   
    @FindBy(xpath = "//span[normalize-space()='Income']")
    public WebElement IncomeModuleNavButton;

    @FindBy(xpath = "//a[normalize-space()='Add Income']")
    public WebElement AddIncomeButton;

    // @FindBy(xpath = "//a[normalize-space()='Search Income']")
    public WebElement SearchIncomeButton;

    @FindBy(xpath = "//a[normalize-space()='Income Head']")
    public WebElement IncomeHeadButton;

    public IncomeModulePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
