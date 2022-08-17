package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    /* Father Name */
    @FindBy(xpath = "//input[@name='father_name']")
    public WebElement fatherNameTextbox;

    /* Father Phone */
    @FindBy(xpath = "//input[@name='father_phone']")
    public WebElement fatherPhoneTextbox;

    /* Mother Name */
    @FindBy(xpath = "//input[@name='mother_name']")
    public WebElement motherNameTextbox;

    /* Mother Phone */
    @FindBy(xpath = "//input[@name='mother_phone']")
    public WebElement motherPhoneTextbox;

    /* Father Guardian Radio Button */
    @FindBy(xpath = "//input[@value='father']")
    public WebElement fatherGuardianRadioButton;

    /* Other Guardian Radio Button */
    @FindBy(xpath = "//input[@value='other']")
    public WebElement otherGuardianRadioButton;

    /* Guardian Name Textbox */
    @FindBy(xpath = "//input[@name='guardian_name']")
    public WebElement guardianNameTextbox;

    /* Guardian Phone Textbox */
    @FindBy(xpath = "//input[@name='guardian_phone']")
    public WebElement guardianPhoneTextbox;

    /* Save Button */
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    /* Sucessful Student Admission Message */
    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement sucessfulStudentAdmissionMessage;

    public StudentAdmissionPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
