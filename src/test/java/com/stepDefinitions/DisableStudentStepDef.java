package com.stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

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

public class DisableStudentStepDef {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();
    StudentDetailsPage studentDetailsPage = new StudentDetailsPage();
    DisableReasonPage disableReasonPage = new DisableReasonPage();
    DisabledStudentsPage disabledStudentsPage = new DisabledStudentsPage();
    BulkDeletePage bulkDeletePage = new BulkDeletePage();

    /* Student Creation */

    @When("navigates to Student Information menu")
    public void navigates_to_Student_Information_menu() {

        /* Navigates to Student Information menu */
        homePage.studentInfoModule.click();
    }

    @When("clicks on Student Admission")
    public void clicks_on_Student_Admission() {

        /* Clicks on Student Admission */
        homePage.studentAdmissionTab.click();
    }

    @When("enters Admission No {string}")
    public void enters_Admission_No(String admissionNo) {

        /* Enters Admission No */
        studentAdmissionPage.admissionNoTextbox.sendKeys(admissionNo);
    }

    @When("select Class {string} from Class dropdown")
    public void select_Class_from_Class_dropdown(String classAdmission) {

        /* Select Class from Class dropdown */
        CommonUtils.selectDropDownValue(classAdmission, studentAdmissionPage.classDropdown);
    }

    @When("selects Section {string} from Section dropdown")
    public void selects_Section_from_Section_dropdown(String sectionAdmission) {

        /* Selects Section from Section dropdown */
        CommonUtils.selectDropDownValue(sectionAdmission, studentAdmissionPage.sectionDropdown);
    }

    @When("enters students name {string} in First Name textbox")
    public void enters_students_name_in_First_Name_textbox(String firstName) {

        /* Enters students name in First Name textbox */
        studentAdmissionPage.firstNameTextbox.sendKeys(firstName);
    }

    @When("selects gender {string} from Gender dropdown")
    public void selects_gender_from_Gender_dropdown(String gender) {

        /* Selects gender from Gender dropdown */
        CommonUtils.selectDropDownValue(gender, studentAdmissionPage.genderDropdown);
    }

    @When("enters date of birth {string}")
    public void enters_date_of_birth(String dob) {

        /* Enters date of birth */
        studentAdmissionPage.dateOfBirthCalendar.sendKeys(dob);
    }

    @When("clicks radio button Father in If Guardian is,")
    public void clicks_radio_button_Father_in_If_Guardian_is() {

        /* Clicks radio button Father in If Guardian is, */
        studentAdmissionPage.fatherGuardianRadioButton.click();
    }

    @When("enters guardian name {string} into Guardian Name textbox")
    public void enters_guardian_name_into_Guardian_Name_textbox(String guardianName) {

        /* Enters guardian name into Guardian Name textbox */
        studentAdmissionPage.guardianNameTextbox.sendKeys(guardianName);
    }

    @When("enters guardian phone {string}")
    public void enters_guardian_phone(String guardianPhone) throws IOException {

        /* Enters guardian phone */
        studentAdmissionPage.guardianPhoneTextbox.sendKeys(guardianPhone);

        /* Take Screenshot */
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("user clicks on the save button")
    public void user_clicks_on_the_save_button() {

        /* User clicks on the save button */
        studentAdmissionPage.saveButton.click();
    }

    @Then("sucessful student admission message will display {string}")
    public void sucessful_student_admission_message_will_display(String expectedResults) throws IOException {

        /* Assertion */
        String actualResults = studentAdmissionPage.sucessfulStudentAdmissionMessage.getText();
        Assert.assertTrue(actualResults.contentEquals(expectedResults));

        /* Taking Screenshot */
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    /* Creation of Disable Reason */

    @Given("a teacher is on the Disable Reason page")
    public void a_teacher_is_on_the_Disable_Reason_page() throws IOException {

        /* Navigating to Login Page */
        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);

        /* Enter username and password */
        loginPage.usernameTextBox.sendKeys(ApplicationConstants.USERNAME);
        loginPage.passwordTextBox.sendKeys(ApplicationConstants.PASSWORD);

        /* Click Sign In Button */
        loginPage.signInButton.click();

        /* Click on Student Information Module */
        homePage.studentInfoModule.click();

        /* Click on Disable Reason Tab */
        homePage.disableReasonTab.click();

        /* Take Screenshot */
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("a teacher enters disable reason name {string} into the add name textbox")
    public void a_teacher_enters_disable_reason_name_into_the_add_name_textbox(String disableReasonName)
            throws IOException {

        /* Enter Disable Reason Name */
        disableReasonPage.disableReasonNameTextbox.sendKeys(disableReasonName);

        /* Take Screenshot */
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("clicks on the add reason save button")
    public void clicks_on_the_add_reason_save_button() {

        /* Click Disable Reason Save Button */
        disableReasonPage.disableReasonSaveButton.click();
    }

    @Then("a Disable Reason is created {string} and will display the added test reason {string}")
    public void a_Disable_Reason_is_created_and_will_display_the_added_test_reason(String disableReason,
            String expectedResult) throws IOException {

        /* Assertion */
        String actualResult = disableReasonPage.testReasonDynamicXPATH(disableReason).getText();
        Assert.assertTrue(actualResult.contentEquals(expectedResult));

        /* Screenshot */
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    /* Disable Student */

    @Given("a teacher is on the Student Details page")
    public void a_teacher_is_on_the_Student_Details_page() throws IOException {

        /* Navigate to Login Page */
        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);

        /* Enter username and password */
        loginPage.usernameTextBox.sendKeys(ApplicationConstants.USERNAME);
        loginPage.passwordTextBox.sendKeys(ApplicationConstants.PASSWORD);

        /* Click on Sign In Button */
        loginPage.signInButton.click();

        /* Click on Student Information Module */
        homePage.studentInfoModule.click();

        /* Click on Student Details Tab */
        homePage.studentDetailsTab.click();

        /* Take Screenshot */
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("the teacher enters student name {string} into the keyword search textbox")
    public void the_teacher_enters_student_name_into_the_keyword_search_textbox(String studentName) throws IOException {

        /* Enter Student Name into Search by Keyword Textbox */
        studentDetailsPage.studentDetailsSearchByKeywordTextbox.sendKeys(studentName);

        /* Take Screenshot */
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("clicks on the keyword search button")
    public void clicks_on_the_keyword_search_button() throws IOException {

        /* Click on Search by Keyword Search Button */
        studentDetailsPage.studentDetailsSearchButton.click();

        /* Take Screenshot */
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("clicks on student")
    public void clicks_on_student() throws IOException {

        /* Waiting for clickability */
        CommonUtils.waitForClickability(studentDetailsPage.selectStudentButton);

        /* Click on Desired Student */
        studentDetailsPage.selectStudentButton.click();

        /* Take Screenshot */
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("clicks the red thumbs down icon")
    public void clicks_the_red_thumbs_down_icon() {

        /* Click on Disable Button */
        studentDetailsPage.disableStudentButton.click();
    }

    @When("accepts the chrome alert")
    public void accepts_the_chrome_alert() {

        /* Accept Alert */
        CommonUtils.acceptAlert();
    }

    @When("selects disable reason")
    public void selects_disable_reason() throws IOException {

        /* Wait for Visibilty */
        CommonUtils.waitForVisibility(studentDetailsPage.selectReasonDropdown);

        /* Select Disable Reason from Dropdown */
        CommonUtils.selectDropDownValue("Test Reason", studentDetailsPage.selectReasonDropdown);

        /* Take Screenshot */
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("clicks on the disable student save button")
    public void clicks_on_the_disable_student_save_button() {

        /* Click on Save Button */
        studentDetailsPage.disableStudentSaveButton.click();
    }

    @Then("the student record will be disabled and display Disable Reason {string}")
    public void the_student_record_will_be_disabled_and_display_Disable_Reason(String expectedResult)
            throws IOException {

        /* Assertion */
        String actualResult = disabledStudentsPage.displayedTestReason.getText();
        Assert.assertTrue(actualResult.contentEquals(expectedResult));

        /* Take Screenshot */
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    /* Enable Student */

    @Given("a teacher is on the Disabled Students page")
    public void a_teacher_is_on_the_Disabled_Students_page() throws IOException {

        /* Navigate to Login Page */
        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);

        /* Enter Username and Password */
        loginPage.usernameTextBox.sendKeys(ApplicationConstants.USERNAME);
        loginPage.passwordTextBox.sendKeys(ApplicationConstants.PASSWORD);

        /* Click on Sign In Button */
        loginPage.signInButton.click();

        /* CLick on Student Information Module */
        homePage.studentInfoModule.click();

        /* Click on Disabled Student Tab */
        homePage.disableStudentTab.click();

        /* Take Screenshot */
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("a teacher enters disabled student {string} into the keyword textbox")
    public void a_teacher_enters_disabled_student_into_the_keyword_textbox(String disabledStudent) throws IOException {

        /* Enter Student Name */
        disabledStudentsPage.disableStudentSearchByKeywordTextbox.sendKeys(disabledStudent);

        /* Take Screenshot */
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("clicks on the disabled student keyword search button")
    public void clicks_on_the_disabled_student_keyword_search_button() throws IOException {

        /* Click on Search Button */
        disabledStudentsPage.disableStudentSearchButton.click();

        /* Take Screenshot */
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("clicks on disabled student while on the Disabled Students page")
    public void clicks_on_disabled_student_while_on_the_Disabled_Students_page() throws IOException {

        /* Wait for Visibility */
        CommonUtils.waitForVisibility(disabledStudentsPage.disabledStudent);

        /* Click on Disabled Student */
        disabledStudentsPage.disabledStudent.click();

        /* Take Screenshot */
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("clicks on the green thumbs up icon")
    public void clicks_on_the_green_thumbs_up_icon() {

        /* Click on Enable Button */
        disabledStudentsPage.enableButton.click();
    }

    @When("accepts the alert")
    public void accepts_the_alert() {

        /* Accept Alert */
        CommonUtils.acceptAlert();
    }

    @When("navigates to the Student Details")
    public void navigates_to_the_Student_Details() throws InterruptedException {

        /* Wait */
        Thread.sleep(2000);

        /* Click on Student Details Tab */
        homePage.studentDetailsTab.click();
    }

    @When("enters student name {string} into the keyword search textbox")
    public void enters_student_name_into_the_keyword_search_textbox(String studentName) throws IOException {

        /* Wait for Visibility */
        CommonUtils.waitForVisibility(studentDetailsPage.studentDetailsSearchByKeywordTextbox);

        /* Enter Student Name in Search By Keyword Textbox */
        studentDetailsPage.studentDetailsSearchByKeywordTextbox.sendKeys(studentName);

        /* Take Screenshot */
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("the student will display on the Student Details page {string}")
    public void the_student_will_display_on_the_Student_Details_page(String expectedResult) throws IOException {

        /* Assertion */
        String actualResult = studentDetailsPage.selectStudentButton.getText();
        Assert.assertTrue(actualResult.contentEquals(expectedResult));

        /* Take Screenshot */
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("the teacher deletes Disable Reason {string}")
    public void the_teacher_deletes_Disable_Reason(String disableReason) throws IOException {

        /* Click on Disable Reason Tab */
        homePage.disableReasonTab.click();

        /* Click on Disable Reason */
        disableReasonPage.deleteDisableReasonDynamicXPATH(disableReason).click();

        /* Accept Alert */
        CommonUtils.acceptAlert();

        /* Take Screenshot */
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("deletes student record with class {string} and section {string} and admission number {string}")
    public void deletes_student_record_with_class_and_section_and_admission_number(String studentClass,
            String studentSection,
            String admissionNo) {

        /* Click on Bulk Delete Tab */
        homePage.bulkDeleteTab.click();

        /* Select Student Class */
        CommonUtils.selectDropDownValue(studentClass, bulkDeletePage.bulkDeleteClassDropdown);

        /* Select Student Section */
        CommonUtils.selectDropDownValue(studentSection, bulkDeletePage.bulkDeleteSectionDropdown);

        /* Click on Search Button */
        bulkDeletePage.bulkDeleteSearchButton.click();

        /* Click Checkbox Associated to Admission No */
        bulkDeletePage.bulkDeleteDynamicXpath(admissionNo).click();

        /* Click on Delete Button */
        bulkDeletePage.deleteButton.click();

        /* Accept Alert */
        CommonUtils.acceptAlert();
    }

}
