package com.stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.pages.BulkDeletePage;
import com.pages.DisableReasonPage;
import com.pages.DisabledStudentsPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.StudentAdmissionPage;
import com.pages.StudentDetailsPage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddingMultipleStudentsStepDef {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();
    StudentDetailsPage studentDetailsPage = new StudentDetailsPage();
    DisableReasonPage disableReasonPage = new DisableReasonPage();
    DisabledStudentsPage disabledStudentsPage = new DisabledStudentsPage();
    BulkDeletePage bulkDeletePage = new BulkDeletePage();

    @When("admits student with the information {string},{string},{string},{string},{string},{string}")
    public void admits_student_with_the_information(String admissionNumber, String firstName, String studentClass,
            String gender,
            String section, String dateOfBirth) {

        studentAdmissionPage.admissionNoTextbox.sendKeys(admissionNumber);

        studentAdmissionPage.firstNameTextbox.sendKeys(firstName);

        CommonUtils.selectDropDownValue(studentClass, studentAdmissionPage.classDropdown);

        CommonUtils.selectDropDownValue(gender, studentAdmissionPage.genderDropdown);

        CommonUtils.selectDropDownValue(section, studentAdmissionPage.sectionDropdown);

        studentAdmissionPage.dateOfBirthCalendar.sendKeys(dateOfBirth);
    }

    @When("selects other for guardian")
    public void selects_other_for_guardian() {

        studentAdmissionPage.otherGuardianRadioButton.click();
    }

    @When("enters guardian information {string},{string},{string},{string},{string},{string},{string}")
    public void enters_guardian_information(String fatherName, String fatherPhone, String motherName,
            String motherPhone,
            String guardianName, String guardianRelation, String guardianPhone) throws IOException {

        studentAdmissionPage.fatherNameTextbox.sendKeys(fatherName);

        studentAdmissionPage.fatherPhoneTextbox.sendKeys(fatherPhone);

        studentAdmissionPage.motherNameTextbox.sendKeys(motherName);

        studentAdmissionPage.motherPhoneTextbox.sendKeys(motherPhone);

        studentAdmissionPage.guardianNameTextbox.sendKeys(guardianName);

        studentAdmissionPage.guardianPhoneTextbox.sendKeys(guardianPhone);

        CucumberLogUtils.logScreenShot();

        CucumberLogUtils.logExtentScreenshot();

        studentAdmissionPage.saveButton.click();

    }

    @Then("student is succefully admitted and user sees message {string}")
    public void student_is_succefully_admitted_and_user_sees_message(String expectedResult) throws IOException {

        CucumberLogUtils.logScreenShot();

        CucumberLogUtils.logExtentScreenshot();

        String actualResult = studentAdmissionPage.sucessfulStudentAdmissionMessage.getText();

        Assert.assertTrue(actualResult.contentEquals(expectedResult));

    }

    @Then("user deletes student record with class {string} and section {string} and admission number {string}")
    public void user_deletes_student_record_with_class_and_section_and_admission_number(String studentClass,
            String studentSection,
            String admissionNumber) throws IOException {

        homePage.bulkDeleteTab.click();

        CommonUtils.selectDropDownValue(studentClass, bulkDeletePage.bulkDeleteClassDropdown);

        CommonUtils.selectDropDownValue(studentSection, bulkDeletePage.bulkDeleteSectionDropdown);

        bulkDeletePage.bulkDeleteSearchButton.click();

        bulkDeletePage.bulkDeleteDynamicXpath(admissionNumber).click();

        CucumberLogUtils.logScreenShot();

        CucumberLogUtils.logExtentScreenshot();

        bulkDeletePage.deleteButton.click();

        CommonUtils.acceptAlert();
    }

}
