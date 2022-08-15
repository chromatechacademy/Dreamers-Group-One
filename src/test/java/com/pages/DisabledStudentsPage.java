package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class DisabledStudentsPage {
    
    /* Disable Student Search by Keyword Textbox */
    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement disableStudentSearchByKeywordTextbox;

    /* Disable Student Search Button */
    @FindBy(xpath = "//button[@value='search_full']")
    public WebElement disableStudentSearchButton;

    /* Disable Student */
    @FindBy(partialLinkText = "Test Student")
    public WebElement disabledStudent;

    /* Displayed Disabled Reason */
    @FindBy(xpath = "//span[normalize-space()='Test Reason']")
    public WebElement displayedTestReason;

    /* Enable Button */
    @FindBy(xpath = "//i[@class='fa fa-thumbs-o-up']")
    public WebElement enableButton;

    public DisabledStudentsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
