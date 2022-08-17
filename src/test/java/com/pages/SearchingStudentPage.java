package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class SearchingStudentPage {

    @FindBy(xpath = "//a[normalize-space()='Student Admission']")
    public static WebElement studentAddmisioElement;

    @FindBy(xpath = "//input[@name='admission_no']")
    public static WebElement admissionNumberTextBox;

    @FindBy(xpath = "//select[@name='class_id']")
    public static WebElement classTextBox;

    @FindBy(xpath = "//select[@name='section_id']")
    public static WebElement sectionTextBox;

    @FindBy(xpath = "//input[@name='firstname']")
    public static WebElement firstNameTextBox;

    @FindBy(xpath = "//select[@name='gender']")
    public static WebElement genderTextBox;

    @FindBy(xpath = "//input[@name='dob']")
    public static WebElement dataOfBirthTextBox;

    @FindBy(xpath = "//input[@value='other']")
    public static WebElement ifGuardianIsTextBox;

    @FindBy(xpath = "//input[@name='guardian_name']")
    public static WebElement guardianNameTextBox;

    @FindBy(xpath = "//input[@name='guardian_phone']")
    public static WebElement guardianPhoneTextBox;

    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public static WebElement buttonSave;

    @FindBy(xpath = "//input[@name='search_text1']")
    public static WebElement searchTextBox;

    @FindBy(xpath = "//button[@class='btn btn-flat topsidesearchbtn']")
    public static WebElement searchButton;

    @FindBy(xpath = "//td[@class='pull-right']//a[@title='Edit']")
    public static WebElement pencilButton;

    @FindBy(xpath = "//input[@name='admission_no']")
    public static WebElement admissionNew;

    public SearchingStudentPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);

    }
}
