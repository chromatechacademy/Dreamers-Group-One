package com.stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.pages.BulkDeletePage;
import com.pages.StudentAdmissionPage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StudentAdmissionStepDef {
    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();
    BulkDeletePage bulkDeletePage = new BulkDeletePage();

    @Given("clicks on the Student Information module")
    public void clicks_on_the_Student_Information_module() throws IOException {

        studentAdmissionPage.studentInformationModule.click();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

    @Given("clicks on Student Admission module")
    public void clicks_on_Student_Admission_module() throws IOException {

        studentAdmissionPage.studentAdmissionModule.click();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

    @When("fills in all required Information {string},{string},{string},{string},{string},{string},{string},{string}")
    public void fills_in_all_required_Information(String AdmissionNo, String SDETClass, String TestingSection,
            String FirstName,
            String Gender, String DoB, String GuardianName, String GuardianPhoneNumber) throws IOException {

        studentAdmissionPage.admissionNoTextBox.sendKeys(AdmissionNo);
        studentAdmissionPage.classDropDown.click();
        CommonUtils.selectDropDownValue(SDETClass, studentAdmissionPage.classDropDown);
        studentAdmissionPage.sectionDropDown.click();
        CommonUtils.selectDropDownValue(TestingSection, studentAdmissionPage.sectionDropDown);
        studentAdmissionPage.firstNameTextBox.sendKeys(FirstName);
        studentAdmissionPage.genderDropDown.click();
        CommonUtils.selectDropDownValue(Gender, studentAdmissionPage.genderDropDown);
        studentAdmissionPage.dateOfBirthTextBox.sendKeys(DoB);
        studentAdmissionPage.guardianSelect.click();
        studentAdmissionPage.guardianNameTextBox.sendKeys(GuardianName);
        studentAdmissionPage.guardianPhoneTextBox.sendKeys(GuardianPhoneNumber);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

    @Given("clicks Save")
    public void clicks_Save() {

        studentAdmissionPage.saveButton.click();

    }

    @Then("user will have created a Student and user will see {string}")
    public void user_will_have_created_a_Student_and_user_will_see(String RecordSaved) throws IOException {

        String AcutalStudentSavedSuccessfully = studentAdmissionPage.studentSavedSuccessfully.getText();
        String ExpectedStudentSavedSuccessfully = RecordSaved;
        Assert.assertEquals(AcutalStudentSavedSuccessfully, ExpectedStudentSavedSuccessfully);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

    @Then("user deletes student records with class {string} and section {string} and admission no {string}")
    public void user_deletes_student_records_with_class_and_section_and_admission_no(String Class, String Section,
            String AdmissionNo) {

        // CommonUtils.waitForVisibility(bulkDeletePage.bulkDelete);
        bulkDeletePage.bulkDelete.click();
        CommonUtils.selectDropDownValue(Class, bulkDeletePage.classNameDropDown);
        CommonUtils.selectDropDownValue(Section, bulkDeletePage.sectionNameDropDown);
        bulkDeletePage.searchButton.click();
        bulkDeletePage.bulkDeletePageDynamicXpath(AdmissionNo).click();
        bulkDeletePage.deleteButton.click();
        CommonUtils.acceptAlert();

    }

}