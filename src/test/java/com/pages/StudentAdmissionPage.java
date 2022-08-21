package com.pages;

import com.web.WebDriverUtils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentAdmissionPage {

    // Hamburger menu link
    @FindBy(xpath = "//a[@role='button']")
    public WebElement hamburgerMenu;


    /* Student Information Module */
    @FindBy(xpath = "//a[normalize-space()='Student Information']")
    public WebElement studentInformationModule;

    /* Student Admission Module */
    @FindBy(xpath = "//a[normalize-space()='Student Admission']")
    public WebElement studentAdmissionModule;

    /* Admission No. Text Box */
    @FindBy(xpath = "//input[@name='admission_no']")
    public WebElement admissionNoTextBox;

    /* Class Drop Down */
    @FindBy(xpath = "//select[@name='class_id']")
    public WebElement classDropDown;

    /* Sections Drop Down */
    @FindBy(xpath = "//select[@name='section_id']")
    public WebElement sectionDropDown;

    /* First Name Text Box */
    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement firstNameTextBox;

    /* Gender Drop Down */
    @FindBy(xpath = "//select[@name='gender']")
    public WebElement genderDropDown;

    /* Date of Birth Text Box */
    @FindBy(xpath = "//input[@name='dob']")
    public WebElement dateOfBirthTextBox;

    /* Guardian Select */
    @FindBy(xpath = "//input[@value='other']")
    public WebElement guardianSelect;

    /* Guardian Name Text Box */
    @FindBy(xpath = "//input[@name='guardian_name']")
    public WebElement guardianNameTextBox;

    /* Guardian Phone Text Box */
    @FindBy(xpath = "//input[@name='guardian_phone']")
    public WebElement guardianPhoneTextBox;

    /* Save Button */
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    /* Admission No. Must Have Unique value Message */
    @FindBy(xpath = "//p[contains(text(),'The Admission No field must contain a unique value')]")
    public WebElement admissionNoUniquevalueMessage;

    /* Student Saved Successfully */
    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement studentSavedSuccessfully;

    public StudentAdmissionPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}