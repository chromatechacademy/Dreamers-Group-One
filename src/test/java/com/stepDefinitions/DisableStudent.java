package com.stepDefinitions;

import com.constants.ApplicationConstants;
import com.pages.BulkDeletePage;
import com.pages.DisableReasonPage;
import com.pages.DisabledStudentsPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.StudentAdmissionPage;
import com.pages.StudentDetailsPage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DisableStudent {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();
    StudentDetailsPage studentDetailsPage = new StudentDetailsPage();
    DisableReasonPage disableReasonPage = new DisableReasonPage();
    DisabledStudentsPage disabledStudentsPage = new DisabledStudentsPage();
    BulkDeletePage bulkDeletePage = new BulkDeletePage();

    @Given("a user is logged into the CTSMS website")
    public void a_user_is_logged_into_the_CTSMS_website() {

        /* Navigating to CTSMS Login Page */
        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);

        /* Enter Username */
        loginPage.usernameTextBox.sendKeys(ApplicationConstants.USERNAME);

        /* Enter Password */
        loginPage.passwordTextBox.sendKeys(ApplicationConstants.PASSWORD);

        /* Click the Sign In Button */
        loginPage.signInButton.click();
    }

    @When("user disables a student")
    public void user_disables_a_student() {

        /* Click on Student Information */
        homePage.studentInfoModule.click();

        /* Navigate to Student Admission */
        homePage.studentAdmissionTab.click();

        /* Enter Admission Number */
        studentAdmissionPage.admissionNoTextbox.sendKeys("234567");

        /* Selecting Class */
        CommonUtils.selectDropDownValue("SDET", studentAdmissionPage.classDropdown);

        /* Selecting Section */
        CommonUtils.selectDropDownValue("Testing Fundamentals", studentAdmissionPage.sectionDropdown);

        /* Entering Students Name */
        studentAdmissionPage.firstNameTextbox.sendKeys("TestStudent");

        /* Selecting Student Gender */
        CommonUtils.selectDropDownValue("Male", studentAdmissionPage.genderDropdown);

        /* Entering Student Date of Birth */
        studentAdmissionPage.dateOfBirthCalendar.sendKeys("11/24/2000");

        /* Selecting Guardian */
        studentAdmissionPage.fatherGuardianRadioButton.click();

        /* Entering Guardian Name */
        studentAdmissionPage.guardianNameTextbox.sendKeys("TestFather");

        /* Entering Guardian Textbox */
        studentAdmissionPage.guardianPhoneTextbox.sendKeys("1112223333");

        /* Clicking on the Save Button */
        studentAdmissionPage.saveButton.click();

        /* Navigate to Disable Reason */
        homePage.disableReasonTab.click();

        /* Entering Disable Reason Name */
        disableReasonPage.disableReasonNameTextbox.sendKeys("TestReason");

        /* Click on Save Button */
        disableReasonPage.disableReasonSaveButton.click();

        /* Navigate to Student Details */
        homePage.studentDetailsTab.click();

        /* Search for Created Student */
        studentDetailsPage.studentDetailsSearchByKeywordTextbox.sendKeys("TestStudent");

        /* Click Search */
        studentDetailsPage.studentDetailsSearchButton.click();

        /* Click on Test Student */
        studentDetailsPage.selectStudentButton.click();

        /* Click on Disble Student */
        studentDetailsPage.disableStudentButton.click();

        /* Select Yes to Disable Student */
        CommonUtils.acceptAlert();

        /* Adding a wait for visibility */
        CommonUtils.waitForVisibility(studentDetailsPage.selectReasonDropdown);

        /* Select Disabled Reason */
        CommonUtils.selectDropDownValue("TestReason", studentDetailsPage.selectReasonDropdown);

        /* Enter Disable Reason Note */
        studentDetailsPage.disableStudentNoteTextbox.sendKeys("Testing");

        /* Click on Save */
        studentDetailsPage.disableStudentSaveButton.click();

    }

    @Then("user will appear as disabled <{string}>")
    public void user_will_appear_as_disabled(String expectedDisabledStudent) {
       
        /* Wait for visibility */
        CommonUtils.waitForVisibility(homePage.disableStudentTab);

        /* Navigate to Disable  */
        homePage.disableStudentTab.click();

        /* Search Disabled Student */
        disabledStudentsPage.disableStudentSearchByKeywordTextbox.sendKeys("TestStudent");

        /* CLick Search Button */
        disabledStudentsPage.disableStudentSearchButton.click();

        /* Click on Disabled Student */
        disabledStudentsPage.disabledStudent.click();

        /* Taking Screenshot */
        CucumberLogUtils.logScreenShot();

        /* Click on Enable Button */
        disabledStudentsPage.enableButton.click();

        /* Select Yes to Enable Student */
        CommonUtils.acceptAlert();

        /* Wait for visibility */
        CommonUtils.waitForVisibility(homePage.studentDetailsTab);

        /* Navigate to Student Details */
        homePage.studentDetailsTab.click();

        /* Search for Created Student */
        studentDetailsPage.studentDetailsSearchByKeywordTextbox.sendKeys("TestStudent");

        /* Click Search */
        studentDetailsPage.studentDetailsSearchButton.click();

        /* Taking Screenshot */
        CucumberLogUtils.logScreenShot();

        /* Wait for visibility */
        CommonUtils.waitForVisibility(homePage.bulkDeleteTab);
        
        /* Navigate to Bulk Delete */
        homePage.bulkDeleteTab.click();

        /* Select Class */
        CommonUtils.selectDropDownValue("SDET", bulkDeletePage.bulkDeleteClassDropdown);

        /* Select Section */
        CommonUtils.selectDropDownValue("Testing Fundamentals", bulkDeletePage.bulkDeleteSectionDropdown);

        /* Click Search Button */
        bulkDeletePage.bulkDeleteSearchButton.click();

        /* Select Student to Delete */
        bulkDeletePage.selectStudentToDelete.click();

        /* Click Delete Button */
        bulkDeletePage.deleteButton.click();

    }
}
