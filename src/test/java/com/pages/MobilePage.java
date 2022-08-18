package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class MobilePage {
    
@FindBy(xpath = "//span[normalize-space()='Student Information']")
public WebElement moduleMenu;

@FindBy(xpath = "//span[normalize-space()='Fees Collection']")
public WebElement moduleMenuTwo;

@FindBy(xpath = "//span[normalize-space()='Income']")
public WebElement moduleNameThree;

@FindBy(xpath = "//span[normalize-space()='Expenses']")
public WebElement moduleMenuFour;

@FindBy(xpath = "//span[normalize-space()='Academics']")
public WebElement moduleMenuFive;



    public MobilePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
