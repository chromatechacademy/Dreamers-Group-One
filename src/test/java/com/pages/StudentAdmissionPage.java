package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.CommonUtils;
import com.web.WebDriverUtils;

public class StudentAdmissionPage {
    
    /* Admission No* Textbox */
    @FindBy(xpath = "//input[@name='admission_no']")
    public WebElement admissionNoTextbox;

    /* Class Dropdown */
    @FindBy(xpath = "//select[@name='class_id']")
    public WebElement classDropdown;

    /* Section Dropdown */
    @FindBy(xpath = "//select[@name='section_id']")
    public WebElement sectionDropdown;

    /* First Name Textbox */
    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstNameTextbox;

    /* Gender Dropdown */
    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderDropdown;

    /* Date of Birth Calendar */
    @FindBy(xpath = "//input[@name='dob']")
    public WebElement dateOfBirthCalendar;

    /* Father Guardian Radio Button */
    @FindBy(xpath = "//input[@value='father']")
    public WebElement fatherGuardianRadioButton;

    /* Guardian Name Textbox */
    @FindBy(xpath = "//input[@name='guardian_name']")
    public WebElement guardianNameTextbox;

    /* Guardian Phone Textbox */
    @FindBy(xpath = "//input[@name='guardian_phone']")
    public WebElement guardianPhoneTextbox;

    /* Save Button */
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    public StudentAdmissionPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
