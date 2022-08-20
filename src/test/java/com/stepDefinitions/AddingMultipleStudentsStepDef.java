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

        /* Enter Admission No */
        studentAdmissionPage.admissionNoTextbox.sendKeys(admissionNumber);

        /* Enter Student First Name */
        studentAdmissionPage.firstNameTextbox.sendKeys(firstName);

        /* Select Student Class */
        CommonUtils.selectDropDownValue(studentClass, studentAdmissionPage.classDropdown);

        /* Select Student Gender */
        CommonUtils.selectDropDownValue(gender, studentAdmissionPage.genderDropdown);

        /* Select Student Section */
        CommonUtils.selectDropDownValue(section, studentAdmissionPage.sectionDropdown);

        /* Enter Date of Birth */
        studentAdmissionPage.dateOfBirthCalendar.sendKeys(dateOfBirth);
    }

    @When("selects other for guardian")
    public void selects_other_for_guardian() {

        /* Select other for Guardian */
        studentAdmissionPage.otherGuardianRadioButton.click();
    }

    @When("enters guardian information {string},{string},{string},{string},{string},{string},{string}")
    public void enters_guardian_information(String fatherName, String fatherPhone, String motherName,
            String motherPhone,
            String guardianName, String guardianRelation, String guardianPhone) throws IOException {

        /* Enter Father First Name */
        studentAdmissionPage.fatherNameTextbox.sendKeys(fatherName);

        /* Enter Father Phone No */
        studentAdmissionPage.fatherPhoneTextbox.sendKeys(fatherPhone);

        /* Enter Mother First Name */
        studentAdmissionPage.motherNameTextbox.sendKeys(motherName);

        /* Enter Mother Phone No */
        studentAdmissionPage.motherPhoneTextbox.sendKeys(motherPhone);

        /* Enter Guardian Name */
        studentAdmissionPage.guardianNameTextbox.sendKeys(guardianName);

        /* Enter Guardian Phone No */
        studentAdmissionPage.guardianPhoneTextbox.sendKeys(guardianPhone);

        /* Take Screenshot */
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

        /* Click on Save Button */
        studentAdmissionPage.saveButton.click();

    }

    @Then("student is succefully admitted and user sees message {string}")
    public void student_is_succefully_admitted_and_user_sees_message(String expectedResult) throws IOException {

        /* Take Screenshot */
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

        /* Assertion */
        String actualResult = studentAdmissionPage.sucessfulStudentAdmissionMessage.getText();
        Assert.assertTrue(actualResult.contentEquals(expectedResult));

    }

    @Then("user deletes student record with class {string} and section {string} and admission number {string}")
    public void user_deletes_student_record_with_class_and_section_and_admission_number(String studentClass,
            String studentSection,
            String admissionNumber) throws IOException {

        /* Click on Bulk Delete Tab */
        homePage.bulkDeleteTab.click();

        /* Select Student Class */
        CommonUtils.selectDropDownValue(studentClass, bulkDeletePage.bulkDeleteClassDropdown);

        /* Select Student Section */
        CommonUtils.selectDropDownValue(studentSection, bulkDeletePage.bulkDeleteSectionDropdown);

        /* Click on Search Button */
        bulkDeletePage.bulkDeleteSearchButton.click();

        /* Click Checkbox Associated to Admission No */
        bulkDeletePage.bulkDeleteDynamicXpath(admissionNumber).click();

        /* Take Screenshot */
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

        /* Click on Delete Button */
        bulkDeletePage.deleteButton.click();

        /* Accept Alert */
        CommonUtils.acceptAlert();
    }

}
