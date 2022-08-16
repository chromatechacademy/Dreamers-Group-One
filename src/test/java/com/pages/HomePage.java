package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class HomePage {

    //* Student Information Module */
    @FindBy(xpath = "//span[normalize-space()='Student Information']")
    public WebElement studentInfoModule;

    //* Student Admission Tab */
    @FindBy(xpath = "//a[normalize-space()='Student Admission']")
    public WebElement studentAdmissionTab;

    //* Student Details Tab */
    @FindBy(xpath = "//ul[@class='treeview-menu']//a[normalize-space()='Student Details']")
    public WebElement studentDetailsTab;

    //* Disabled Students Tab*/
    @FindBy(xpath = "//a[normalize-space()='Disabled Students']")
    public WebElement disableStudentTab;

    //* Disable Reason Tab */
    @FindBy(xpath = "//a[normalize-space()='Disable Reason']")
    public WebElement disableReasonTab;

    //* Bulk Delete Tab */
    @FindBy(xpath = "//a[normalize-space()='Bulk Delete']")
    public WebElement bulkDeleteTab;

    public HomePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
