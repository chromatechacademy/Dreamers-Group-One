package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class MobilePage {
    
@FindBy(xpath = "//a[@role='button']")
public WebElement menuButton;


@FindBy(xpath = "//ul[@class='sidebar-menu verttop']")
public WebElement chromaTechMenu;


    public MobilePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
