package com.stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.pages.StudentAdmissionPage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StudentAdmission {
    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();

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

    @Given("fills in all required Information")
    public void fills_in_all_required_Information() throws IOException {

        studentAdmissionPage.admissionNoTextBox.sendKeys("010101");
        studentAdmissionPage.classDropDown.click();
        CommonUtils.selectDropDownValue("SDET", studentAdmissionPage.classDropDown);
        studentAdmissionPage.sectionDropDown.click();
        CommonUtils.selectDropDownValue("Testing Fundamentals", studentAdmissionPage.sectionDropDown);
        studentAdmissionPage.firstNameTextBox.sendKeys("Billy");
        studentAdmissionPage.genderDropDown.click();
        CommonUtils.selectDropDownValue("Male", studentAdmissionPage.genderDropDown);
        studentAdmissionPage.dateOfBirthTextBox.sendKeys("02/05/1980");
        studentAdmissionPage.guardianSelect.click();
        studentAdmissionPage.guardianNameTextBox.sendKeys("Bob");
        studentAdmissionPage.guardianPhoneTextBox.sendKeys("309-492-4982");
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

    @Given("clicks Save")
    public void clicks_Save() throws IOException {

        studentAdmissionPage.saveButton.click();
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

    @Then("user will have created a Student")
    public void user_will_have_created_a_Student() {

        String AcutalStudentSavedSuccessfully = studentAdmissionPage.studentSavedSuccessfully.getText();
        String ExpectedStudentSavedSuccessfully = "Record Saved Successfully";
        Assert.assertEquals(AcutalStudentSavedSuccessfully, ExpectedStudentSavedSuccessfully);

    }
}