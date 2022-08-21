package com.stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.pages.StudentAdmissionPage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StudentAdmissionUniqueNumber {
    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();

    @When("on the Student Admission Page user will enter in an exisiting studnet Information {string},{string},{string},{string},{string},{string},{string},{string}")
    public void on_the_Student_Admission_Page_user_will_enter_in_an_exisiting_studnet_Information(String AdmissionNo,
            String SDETClass, String TestingSection, String FirstName, String Gender, String DoB, String GuardianName,
            String GuardianPhoneNumber) throws IOException {

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

    @When("clicks save")
    public void clicks_save() {

        studentAdmissionPage.saveButton.click();

    }

    @Then("the user will get a message saying {string}")
    public void the_user_will_get_a_message_saying(String NotAUniqueNo) throws IOException {

        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

        String ActualAdmissionNoUniquevalueMessage = studentAdmissionPage.admissionNoUniquevalueMessage.getText();
        String ExpectedAdmissionNoUniquevalueMessage = NotAUniqueNo;
        Assert.assertEquals(ActualAdmissionNoUniquevalueMessage, ExpectedAdmissionNoUniquevalueMessage);

    }

}
