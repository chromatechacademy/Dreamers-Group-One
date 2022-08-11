package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class DisableReasonPage {
    
    /* Add Disable Reason Name Textbox */
    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement disableReasonNameTextbox;

    /* Disable Reason Save Button */
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement disableReasonSaveButton;

    public DisableReasonPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
