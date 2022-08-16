package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class AcademicsModulePage {

    /* Academics Module */
    @FindBy(xpath = "//a[normalize-space()='Academics']")
    public WebElement academicsModule;

    /* Class Timetable Module */
    @FindBy(xpath = "(//a[normalize-space()='Class Timetable'])[2]")
    public WebElement classTimeTableModule;

    /* Teacher Timetable Module */
    @FindBy(xpath = "//a[normalize-space()='Teachers Timetable']")
    public WebElement teacherTimetableModule;

    /*Assign Class Teacher Module */
    @FindBy(xpath = "//a[normalize-space()='Assign Class Teacher']")
    public WebElement assignClassTeacherModule;

    /* Promote Students Module */
    @FindBy(xpath = "//a[normalize-space()='Promote Students']")
    public WebElement promoteStudentsModule;

    /* Subject Group Module */
    @FindBy(xpath = "//a[normalize-space()='Subject Group']")
    public WebElement subjectGroupModule;

    /* Subjects Module */
    @FindBy(xpath = "//a[normalize-space()='Subjects']")
    public WebElement subjectsModule;

    /* Class Module */
    @FindBy(xpath = "//a[normalize-space()='Class']")
    public WebElement classModule;

    /* Sections Module */
    @FindBy(xpath = "//a[normalize-space()='Sections']")
    public WebElement sectionsModule;



    public AcademicsModulePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
      }
}
