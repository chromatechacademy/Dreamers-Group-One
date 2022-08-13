package com.stepDefinitions;

import org.testng.Assert;

import com.pages.StudentAdmissionPage;
import com.web.CommonUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StudentAdmissionUniqueNumber {
    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();

    @Given("clicks on the Student Information module")
    public void clicks_on_the_Student_Information_module() {
        studentAdmissionPage.studentInformationModule.click();
    }

    @Given("clicks on Student Admission module")
    public void clicks_on_Student_Admission_module() {
        studentAdmissionPage.studentAdmissionModule.click();
    }

    @When("user is on Students Admission page and enters in a existing Admission No.")
    public void user_is_on_Students_Admission_page_and_enters_in_a_existing_Admission_No() {



    }

    @When("all other required information is filled in")
    public void all_other_required_information_is_filled_in() {
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
        studentAdmissionPage.saveButton.click();
        

    }

    @Then("the user will not be able to admit a student with an already existing admission number")
    public void the_user_will_not_be_able_to_admit_a_student_with_an_already_existing_admission_number() {

        String ActualAdmissionNoUniquevalueMessage = studentAdmissionPage.admissionNoUniquevalueMessage.getText();
        String ExpectedAdmissionNoUniquevalueMessage = "The Admission No field must contain a unique value";
        Assert.assertEquals(ActualAdmissionNoUniquevalueMessage, ExpectedAdmissionNoUniquevalueMessage);

    }
}
