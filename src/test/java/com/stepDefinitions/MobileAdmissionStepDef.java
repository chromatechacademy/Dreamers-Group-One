package com.stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.pages.BulkDeletePage;
import com.pages.MobileAdmissionPage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MobileAdmissionStepDef {

    // Instantiating Page objects
    MobileAdmissionPage mobileStudentAdmissionPage = new MobileAdmissionPage();
    BulkDeletePage bulkDeletePage = new BulkDeletePage();

    @Given("clicks on the Student Information module")
    public void clicks_on_the_Student_Information_module() throws IOException {
        
        // Clicking hamburger menu to expand sidenav
        mobileStudentAdmissionPage.hamburgerMenu.click();

        // Clicking student information module
        CommonUtils.waitForClickability(mobileStudentAdmissionPage.studentInformationModule);
        mobileStudentAdmissionPage.studentInformationModule.click();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

    @Given("clicks on Student Admission module")
    public void clicks_on_Student_Admission_module() throws IOException {

        mobileStudentAdmissionPage.studentAdmissionModule.click();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

    @When("fills in all required Information {string},{string},{string},{string},{string},{string},{string},{string}")
    public void fills_in_all_required_Information(String AdmissionNo, String SDETClass, String TestingSection,
            String FirstName,
            String Gender, String DoB, String GuardianName, String GuardianPhoneNumber) throws IOException {

        mobileStudentAdmissionPage.admissionNoTextBox.sendKeys(AdmissionNo);
        mobileStudentAdmissionPage.classDropDown.click();
        CommonUtils.selectDropDownValue(SDETClass, mobileStudentAdmissionPage.classDropDown);
        mobileStudentAdmissionPage.sectionDropDown.click();
        CommonUtils.selectDropDownValue(TestingSection, mobileStudentAdmissionPage.sectionDropDown);
        mobileStudentAdmissionPage.firstNameTextBox.sendKeys(FirstName);
        mobileStudentAdmissionPage.genderDropDown.click();
        CommonUtils.selectDropDownValue(Gender, mobileStudentAdmissionPage.genderDropDown);
        mobileStudentAdmissionPage.dateOfBirthTextBox.sendKeys(DoB);
        mobileStudentAdmissionPage.guardianSelect.click();
        mobileStudentAdmissionPage.guardianNameTextBox.sendKeys(GuardianName);
        mobileStudentAdmissionPage.guardianPhoneTextBox.sendKeys(GuardianPhoneNumber);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

    @Given("clicks Save")
    public void clicks_Save() {

        mobileStudentAdmissionPage.saveButton.click();

    }

    @Then("user will have created a Student and user will see {string}")
    public void user_will_have_created_a_Student_and_user_will_see(String RecordSaved) throws IOException, InterruptedException {

        // CommonUtils.getWaitObject();

        Thread.sleep(3000);

        String AcutalStudentSavedSuccessfully = mobileStudentAdmissionPage.studentSavedSuccessfully.getText();

        Thread.sleep(3000);

        System.out.println(mobileStudentAdmissionPage.studentSavedSuccessfully.getText());

        Thread.sleep(3000);


        String ExpectedStudentSavedSuccessfully = RecordSaved;
        Assert.assertEquals(AcutalStudentSavedSuccessfully, ExpectedStudentSavedSuccessfully);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

    @Then("user deletes student records with class {string} and section {string} and admission no {string}")
    public void user_deletes_student_records_with_class_and_section_and_admission_no(String Class, String Section,
            String AdmissionNo) throws InterruptedException {
        
        // Clicking hamburger menu to expand sidenav
        mobileStudentAdmissionPage.hamburgerMenu.click();

        CommonUtils.waitForVisibility(bulkDeletePage.bulkDelete);
        CommonUtils.waitForClickability(bulkDeletePage.bulkDelete);
        bulkDeletePage.bulkDelete.click();
        CommonUtils.waitForVisibility(bulkDeletePage.classNameDropDown);
        CommonUtils.selectDropDownValue(Class, bulkDeletePage.classNameDropDown);
        CommonUtils.waitForVisibility(bulkDeletePage.sectionNameDropDown);
        CommonUtils.selectDropDownValue(Section, bulkDeletePage.sectionNameDropDown);

        CommonUtils.waitForClickability(bulkDeletePage.searchButton);
        bulkDeletePage.searchButton.click();
        Thread.sleep(3000);
        CommonUtils.waitForClickability(bulkDeletePage.bulkDeletePageDynamicXpath(AdmissionNo));
        Thread.sleep(3000);
        bulkDeletePage.bulkDeletePageDynamicXpath(AdmissionNo).click();
        Thread.sleep(3000);
        CommonUtils.waitForClickability(bulkDeletePage.deleteButton);
        bulkDeletePage.deleteButton.click();
        Thread.sleep(3000);
        CommonUtils.acceptAlert();

        // Verify student is delete, assertFalse(StudentAdmission)

    }

}