package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class HomePage {

    // Income module link
    @FindBy(xpath = "//span[normalize-space()='Income']")
    public WebElement IncomeModuleNavButton;

    // Add Income button
    @FindBy(xpath = "//a[normalize-space()='Add Income']")
    public WebElement AddIncomeButton;

    // Search Income button
    @FindBy(xpath = "//a[normalize-space()='Search Income']")
    public WebElement SearchIncomeButton;

    // Income Head button
    @FindBy(xpath = "//a[normalize-space()='Income Head']")
    public WebElement IncomeHeadButton;

    // Homework module link
    @FindBy(xpath = "//span[normalize-space()='Homework']")
    public WebElement HomeworkModuleNavButton;

    // Homework module button
    @FindBy(xpath = "//a[normalize-space()='Add Homework']")
    public WebElement AddHomeWorkButton;
    
    // Academics module link
    @FindBy (xpath = "//span[normalize-space()='Academics']")
    public WebElement academicsModuleLink;

    // Class module link
    @FindBy (xpath = "//a[normalize-space()='Class']")
    public WebElement classModuleLink;


    // CONSTRUCTOR USING PAGE FACTORY TO INITIALIZE ELEMENTS
    public HomePage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}