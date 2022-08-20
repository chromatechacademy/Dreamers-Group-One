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

    // Instantiating Page objects
    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();
    BulkDeletePage bulkDeletePage = new BulkDeletePage();

    @Given("clicks on the Student Information module")
    public void clicks_on_the_Student_Information_module() throws IOException {

        CommonUtils.waitForClickability(studentAdmissionPage.hamburgerMenu);

        // Clicking hamburger menu to expand sidenav
        studentAdmissionPage.hamburgerMenu.click();

        // Clicking student information module
        CommonUtils.waitForClickability(studentAdmissionPage.studentInformationModule);
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
            String Gender, String DoB, String GuardianName, String GuardianPhoneNumber) throws IOException, InterruptedException {

        studentAdmissionPage.admissionNoTextBox.sendKeys(AdmissionNo);

        CommonUtils.waitForVisibility(studentAdmissionPage.classDropDown);
        CommonUtils.waitForClickability(studentAdmissionPage.classDropDown);

        studentAdmissionPage.classDropDown.click();
        
        // Thread.sleep(1000);

        CommonUtils.selectDropDownValue(SDETClass, studentAdmissionPage.classDropDown);

        CommonUtils.waitForVisibility(studentAdmissionPage.sectionDropDown);
        CommonUtils.waitForClickability(studentAdmissionPage.sectionDropDown);
        CommonUtils.getWaitObject();

        studentAdmissionPage.sectionDropDown.click();
        
        Thread.sleep(1000);
        
        CommonUtils.selectDropDownValue(TestingSection, studentAdmissionPage.sectionDropDown);

        studentAdmissionPage.firstNameTextBox.sendKeys(FirstName);

        studentAdmissionPage.genderDropDown.click();

        CommonUtils.selectDropDownValue(Gender, studentAdmissionPage.genderDropDown);

        studentAdmissionPage.dateOfBirthTextBox.sendKeys(DoB);

        CommonUtils.waitForClickability(studentAdmissionPage.guardianNameTextBox);
        
        studentAdmissionPage.guardianSelect.click();

        studentAdmissionPage.guardianNameTextBox.sendKeys(GuardianName);

        studentAdmissionPage.guardianPhoneTextBox.sendKeys(GuardianPhoneNumber);
        
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

    @Given("clicks Save")
    public void clicks_Save() {

        CommonUtils.waitForClickability(studentAdmissionPage.saveButton);

        studentAdmissionPage.saveButton.click();

    }

    @Then("user will have created a Student and user will see {string}")
    public void user_will_have_created_a_Student_and_user_will_see(String RecordSaved)
            throws IOException, InterruptedException {

        CommonUtils.getWaitObject();
        
        CommonUtils.waitForVisibility(studentAdmissionPage.studentSavedSuccessfully);

        String ActualStudentSavedSuccessfully = studentAdmissionPage.studentSavedSuccessfully.getText();

        CommonUtils.getWaitObject();

        String ExpectedStudentSavedSuccessfully = RecordSaved;

        // Assertion verifying student saved successfully
        Assert.assertEquals(ActualStudentSavedSuccessfully, ExpectedStudentSavedSuccessfully);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

    @Then("user deletes student records with class {string} and section {string} and admission no {string}")
    public void user_deletes_student_records_with_class_and_section_and_admission_no(String Class, String Section,
            String AdmissionNo) throws InterruptedException {

        
        CommonUtils.waitForClickability(studentAdmissionPage.hamburgerMenu);

        // Clicking hamburger menu to expand sidenav
        studentAdmissionPage.hamburgerMenu.click();
        
        CommonUtils.waitForVisibility(bulkDeletePage.bulkDelete);
        CommonUtils.waitForClickability(bulkDeletePage.bulkDelete);
        bulkDeletePage.bulkDelete.click();
        

        CommonUtils.waitForVisibility(bulkDeletePage.classNameDropDown);
        CommonUtils.selectDropDownValue(Class, bulkDeletePage.classNameDropDown);
        

        CommonUtils.waitForVisibility(bulkDeletePage.sectionNameDropDown);
        Thread.sleep(1000);
        CommonUtils.selectDropDownValue(Section, bulkDeletePage.sectionNameDropDown);
        
        CommonUtils.waitForClickability(bulkDeletePage.searchButton);
        bulkDeletePage.searchButton.click();
        
        Thread.sleep(1000);

        CommonUtils.getWaitObject();
        CommonUtils.waitForVisibility(bulkDeletePage.bulkDeletePageDynamicXpath(AdmissionNo));
        CommonUtils.waitForClickability(bulkDeletePage.bulkDeletePageDynamicXpath(AdmissionNo));
        CommonUtils.getWaitObject();
        
        CommonUtils.scrollIntoView(bulkDeletePage.bulkDeletePageDynamicXpath(AdmissionNo));
        bulkDeletePage.bulkDeletePageDynamicXpath(AdmissionNo).click();
        CommonUtils.getWaitObject();
        

        CommonUtils.waitForClickability(bulkDeletePage.deleteButton);
        bulkDeletePage.deleteButton.click();
        
        CommonUtils.getWaitObject();
        CommonUtils.acceptAlert();

    }

}