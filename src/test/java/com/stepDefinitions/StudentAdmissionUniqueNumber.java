package com.stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.pages.StudentAdmissionPage;
import com.utils.CucumberLogUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StudentAdmissionUniqueNumber {
    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();

    @Given("fills in an existing Admission No.")
    public void fills_in_an_existing_Admission_No() throws IOException {

        studentAdmissionPage.admissionNoTextBox.sendKeys("010101");
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

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
