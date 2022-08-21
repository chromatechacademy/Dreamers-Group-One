package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class BulkDeletePage {
    

    /* Bulk Delete Button */
    @FindBy(xpath = "//a[normalize-space()='Bulk Delete']")
    public WebElement bulkDelete;

    /* Class name */
    @FindBy(xpath = "//select[@name='class_id']")
    public WebElement classNameDropDown;

    /* Section name */
    @FindBy(xpath = "//select[@name='section_id']")
    public WebElement sectionNameDropDown;

    /* Search button */
    @FindBy(xpath = "//button[normalize-space()='Search']")
    public WebElement searchButton;

    /* Delete button */
    @FindBy(xpath = "//button[normalize-space()='Delete']")
    public WebElement deleteButton;

    public WebElement bulkDeletePageDynamicXpath(String studentExisitingAdmissionNo) {

        return WebDriverUtils.driver.findElement(By.xpath("//*[contains(text(),'" + studentExisitingAdmissionNo
                + "')]/preceding-sibling::td/input[@type='checkbox']"));
    }

    public BulkDeletePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}

