package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class DisableReasonPage {
    
    /* Add Disable Reason Name Textbox */
    @FindBy(xpath = "//input[@name='name']")
    public WebElement disableReasonNameTextbox;

    /* Disable Reason Save Button */
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement disableReasonSaveButton;

    /* Added Test Reason */
    @FindBy(xpath = "//tbody/tr/td[contains(text(),'Test Reason')]")
    public WebElement addedTestReason;

     /*
     * Method to Identify Added Test Reason
     * @param testReason
     * @return
     */
    public WebElement testReasonDynamicXPATH(String disableReason) {

        return WebDriverUtils.driver.findElement(By.xpath("//tbody/tr/td[contains(text(),'" + disableReason + "')]"));
    }

    /*
     * Method to Identify Added Test Reason delete button
     * @param testReason
     * @return
     */
    public WebElement deleteDisableReasonDynamicXPATH(String disableReason) {

        return WebDriverUtils.driver.findElement(By.xpath("//tbody/tr/td[contains(text(),'" + disableReason + "')]/following-sibling::td/a[2]"));
    }

    public DisableReasonPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
