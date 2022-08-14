package com.pages;

import com.github.dockerjava.api.model.Driver;
import com.stepDefinitions.FeesCollectionModuleTest;
import com.web.WebDriverUtils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FeesCollectionModule {

    /** Fees Collection module */
    @FindBy(xpath = "//span[normalize-space()='Fees Collection']")
    public WebElement feesCollectionModule;

    /** Collect Fees module */
    @FindBy(xpath = "//ul[@class='treeview-menu menu-open']//a[normalize-space()='Collect Fees']")
    public WebElement collectFeesModule;

    /** Search Fees Payment module */
    @FindBy(xpath = "//a[normalize-space()='Search Fees Payment']")
    public WebElement searchFeesPaymentModule;

    /** Search Due Fees */
    @FindBy(xpath = "//a[normalize-space()='Search Due Fees']")
    public WebElement searchDueFeesModule;

    /** Fees Master */
    @FindBy(xpath = "//a[normalize-space()='Fees Master']")
    public WebElement feesMasterModule;

    /** Fees Group */
    @FindBy(xpath = "//a[normalize-space()='Fees Group']")
    public WebElement feesGroupModule;

    /** Fees Type */
    @FindBy(xpath = "//a[normalize-space()='Fees Type']")
    public static WebElement feesTypeModule;

    /** Fees Discount */
    @FindBy(xpath = "//a[normalize-space()='Fees Discount']")
    public WebElement feesDiscountModule;

    /** Fees Carry Forward */
    @FindBy(xpath = "//a[normalize-space()='Fees Carry Forward']")
    public WebElement feesCarryForwardModule;

    /** Fees Reminder */
    @FindBy(xpath = "//a[normalize-space()='Fees Reminder']")
    public WebElement feesReminderModule;

    public FeesCollectionModule() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
