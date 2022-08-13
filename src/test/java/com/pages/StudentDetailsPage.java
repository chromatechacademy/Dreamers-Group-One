package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class StudentDetailsPage {
    
    /* Student Details Search by Keyword Textbox */
    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement studentDetailsSearchByKeywordTextbox;

    /* Student Details Search Button */
    @FindBy(xpath = "//button[@value='search_full']")
    public WebElement studentDetailsSearchButton;

    /* Select Student Button */
    @FindBy(partialLinkText = "TestStudent")
    public WebElement selectStudentButton;

    /* Disable Student Button */
    @FindBy(xpath = "//i[@class='fa fa-thumbs-o-down']")
    public WebElement disableStudentButton;

    /* Select Reason Dropdown */
    @FindBy(xpath = "//select[@name='reason']")
    public WebElement selectReasonDropdown;

    /* Disable Student Note Textbox */
    @FindBy(xpath = "//textarea[@name='note']")
    public WebElement disableStudentNoteTextbox;

    /* Disable Student Save Button */
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[5]/div[1]/div[1]/form[1]/div[2]/div[1]/button[1]")
    public WebElement disableStudentSaveButton;

    public StudentDetailsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
