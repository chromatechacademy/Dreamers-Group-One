package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class AcademicsClassesPage {

    // Class text box
    @FindBy(xpath = "//input[@name='class']")
    public WebElement classTextBox;

    // Sections check box
    @FindBy(xpath = "//input[@value='8']")
    public WebElement sectionsCheckBox;

    // Save class button
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveClassButton;

    // Remove class button
    @FindBy(xpath = "//tbody/tr[1]/td[3]/a[2]/i[1]")
    public WebElement removeClassButton;

    // List of all class names
    @FindBy(xpath = "//*[@class='mailbox-name']")
    public List<WebElement> allClassNames;

    // CONSTRUCTOR USING PAGE FACTORY TO INITIALIZE ELEMENTS
    public AcademicsClassesPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
