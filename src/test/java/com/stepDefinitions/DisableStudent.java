package com.stepDefinitions;

import com.constants.ApplicationConstants;
import com.pages.DisableReasonPage;
import com.pages.DisabledStudentsPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.StudentAdmissionPage;
import com.pages.StudentDetailsPage;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class DisableStudent {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();
    StudentDetailsPage studentDetailsPage = new StudentDetailsPage();
    DisableReasonPage disableReasonPage = new DisableReasonPage();
    DisabledStudentsPage disabledStudentsPage = new DisabledStudentsPage();

    @Given("a user is logged into the CTSMS website")
    public void a_user_is_logged_into_the_CTSMS_website() {
        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
        loginPage.usernameTextBox.sendKeys(ApplicationConstants.USERNAME);
        loginPage.passwordTextBox.sendKeys(ApplicationConstants.PASSWORD);
        loginPage.signInButton.click();
    }

    @When("user disables a student")
    public void user_disables_a_student() {
        
        /* Create Student */
        homePage.studentInfoModule.click();
        homePage.studentAdmissionTab.click();
        studentAdmissionPage.admissionNoTextbox.sendKeys("234567");
        //studentAdmissionPage.classDropdown;
        //studentAdmissionPage.sectionDropdown;
        studentAdmissionPage.firstNameTextbox.sendKeys("TestStudent");
        //studentAdmissionPage.genderDropdown;
        studentAdmissionPage.dateOfBirthCalendar.sendKeys("11/24/2000");
        studentAdmissionPage.fatherGuardianRadioButton.click();
        studentAdmissionPage.guardianNameTextbox.sendKeys("TestFather");
        studentAdmissionPage.guardianPhoneTextbox.sendKeys("1112223333");
        studentAdmissionPage.saveButton.click();

        /* Create Disable Reason */
        homePage.disableReasonTab.click();
        disableReasonPage.disableReasonNameTextbox.sendKeys("TestReason");
        disableReasonPage.disableReasonSaveButton.click();

        /* Disable Student */
        homePage.studentDetailsTab.click();
        studentDetailsPage.disableStudentButton.click();
        //studentDetailsPage.selectReasonDropdown.click();
        studentDetailsPage.disableStudentNoteTextbox.sendKeys("keysToSend");


        
    }
}
