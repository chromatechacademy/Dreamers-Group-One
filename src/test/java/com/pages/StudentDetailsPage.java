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
    @FindBy(xpath = "//tr[@role='row']//a[contains(text(),'TestStudent')]")
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
    

    public StudentDetailsPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
