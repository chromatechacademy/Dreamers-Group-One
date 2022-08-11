package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class DisabledStudentsPage {
    
    /* Disable Student Search by Keyword Textbox */
    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement disableStudentSearchByKeywordTextbox;

    public DisabledStudentsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
