package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class TwoDashboardPage {



    public static Object HumanResourceModule;
    @FindBy(xpath = "//span[normalize-space()='Human Resource']")
    public WebElement humanResource;




    public TwoDashboardPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }



}
