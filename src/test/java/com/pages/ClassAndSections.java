package com.pages;

import com.web.WebDriverUtils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClassAndSections {

    /** Academics module */
    @FindBy(xpath = "//span[normalize-space()='Academics']")
    public WebElement academicsModule;

    /** Class module */
    @FindBy(xpath = "//a[normalize-space()='Class']")
    public WebElement classModule;

    /** Cyber Security Section Networking Fundamentals */
    @FindBy(xpath = "//div[contains(text(),'Networking Fundamentals')]")
    public WebElement networkingFundamentals;

    /** Cyber Security Section Linux Fundamentals */
    @FindBy(xpath = "//div[contains(text(),'Linux Fundamentals')]")
    public WebElement linuxFundamentals;

    /** CIA Triad */
    @FindBy(xpath = "//div[contains(text(),'CIA Triad')]")
    public WebElement ciaTriad;

    /** Penetration Testing/Ethical Hacking */
    @FindBy(xpath = "//div[contains(text(),'Penetration Testing/Ethical Hacking')]")
    public WebElement penetrationTestingEthicalHacking;

    /** Cyber Security Section Testing Fundamentals */
    @FindBy(xpath = "//div[contains(text(),'Testing Fundamentals')]")
    public WebElement testingFundamentals;

    /** SDLC Methodologies */
    @FindBy(xpath = "//div[contains(text(),'SDLC Methodologies')]")
    public WebElement sdlcMethodologies; 

    /** Selenium Test Automation */
    @FindBy(xpath = "//div[contains(text(),'Selenium Test Automation')]")
    public WebElement seleniumTestAutomation; 

    /** Cucumber Fundamentals */
    @FindBy(xpath = "//div[contains(text(),'Cucumber Fundamentals')]")
    public WebElement cucumberFundamentals; 

    /** API Testing */
    @FindBy(xpath = "//div[contains(text(),'API Testing')]")
    public WebElement apiTesting; 

    /** Git/Github */
    @FindBy (xpath = "//div[contains(text(),'Git/GitHub')]")
    public WebElement gitGithub; 

    /** Java 11 for Cool People */
    @FindBy (xpath = "//div[contains(text(),'Java 11 for Cool People')]")
    public WebElement java11ForCoolPeople; 

    /** Mobile Test Automation */
    @FindBy (xpath = "//div[contains(text(),'Mobile Test Automation')]")
    public WebElement mobileTestAutomation; 

    /** Accessibility Testing */
    @FindBy(xpath = "//div[contains(text(),'Accessibility Testing')]")
    public WebElement accessibilityTesting; 

    /** Database Testing */
    @FindBy(xpath = "//div[contains(text(),'Database Testing')]")
    public WebElement databaseTesting; 

    public ClassAndSections() {
        PageFactory.initElements(WebDriverUtils.driver, this);

    }

}
