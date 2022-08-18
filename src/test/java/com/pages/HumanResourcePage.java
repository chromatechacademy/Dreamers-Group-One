package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class HumanResourcePage {



    public static Object HumanResourceModule;
    @FindBy(xpath = "//span[normalize-space()='Human Resource']")
    public WebElement humanResource;

    @FindBy(xpath = "//li[@class='active']//a[normalize-space()='Staff Directory']")
    public WebElement staffDirectoryTab;

    @FindBy(xpath = "//ul[@class='treeview-menu']//a[normalize-space()='Staff Attendance']")
    public WebElement staffAttendanceTab;

    @FindBy(xpath = "//a[normalize-space()='Payroll']")
    public WebElement payrollTab;

    @FindBy(xpath = "//a[normalize-space()='Approve Leave Request']")
    public WebElement approveTab;

    @FindBy(xpath = "//a[normalize-space()='Apply Leave']")
    public WebElement applyTab;

    @FindBy(xpath = "//a[normalize-space()='Leave Type']")
    public WebElement leaveTab;

    @FindBy(xpath = "//a[normalize-space()='Teachers Rating']")
    public WebElement teacherTab;

    @FindBy(xpath = "//a[normalize-space()='Department']")
    public WebElement departmentTab;

    @FindBy(xpath = "//a[normalize-space()='Designation']")
    public WebElement designationTab;









    public HumanResourcePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }



}
