package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class BulkDeletePage {
    
    /* Class Dropdown */
    @FindBy(xpath = "//select[@name='class_id']")
    public WebElement bulkDeleteClassDropdown;

    /* Section Dropdown */
    @FindBy(xpath = "//select[@name='section_id']")
    public WebElement bulkDeleteSectionDropdown;

    /* Search Button */
    @FindBy(xpath = "//button[normalize-space()='Search']")
    public WebElement bulkDeleteSearchButton;

    /* Student to Delete */
    @FindBy(partialLinkText = "TestStudent")
    public WebElement studentToDelete;

    /* Common xpath for Student to Delete  */
   

    /* Delete Button */
    @FindBy(xpath = "//button[normalize-space()='Delete']")
    public WebElement deleteButton;

    public BulkDeletePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
