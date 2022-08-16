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

public class DisableStudent {

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

        homePage.studentInfoModule.click();
    }

    @When("clicks on Student Admission")
    public void clicks_on_Student_Admission() {

        homePage.studentAdmissionTab.click();
    }

    @When("enters Admission No {string}")
    public void enters_Admission_No(String admissionNo) {

        studentAdmissionPage.admissionNoTextbox.sendKeys(admissionNo);
    }

    @When("select Class {string} from Class dropdown")
    public void select_Class_from_Class_dropdown(String classAdmission) {

        CommonUtils.selectDropDownValue(classAdmission, studentAdmissionPage.classDropdown);
    }

    @When("selects Section {string} from Section dropdown")
    public void selects_Section_from_Section_dropdown(String sectionAdmission) {

        CommonUtils.selectDropDownValue(sectionAdmission, studentAdmissionPage.sectionDropdown);
    }

    @When("enters students name {string} in First Name textbox")
    public void enters_students_name_in_First_Name_textbox(String firstName) {

        studentAdmissionPage.firstNameTextbox.sendKeys(firstName);
    }

    @When("selects gender {string} from Gender dropdown")
    public void selects_gender_from_Gender_dropdown(String gender) {

        CommonUtils.selectDropDownValue(gender, studentAdmissionPage.genderDropdown);
    }

    @When("enters date of birth {string}")
    public void enters_date_of_birth(String dob) {

        studentAdmissionPage.dateOfBirthCalendar.sendKeys(dob);
    }

    @When("clicks radio button Father in If Guardian is,")
    public void clicks_radio_button_Father_in_If_Guardian_is() {

        studentAdmissionPage.fatherGuardianRadioButton.click();
    }

    @When("enters guardian name {string} into Guardian Name textbox")
    public void enters_guardian_name_into_Guardian_Name_textbox(String guardianName) {

        studentAdmissionPage.guardianNameTextbox.sendKeys(guardianName);
    }

    @When("enters guardian phone {string}")
    public void enters_guardian_phone(String guardianPhone) throws IOException {

        studentAdmissionPage.guardianPhoneTextbox.sendKeys(guardianPhone);

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("user clicks on the save button")
    public void user_clicks_on_the_save_button() {

        studentAdmissionPage.saveButton.click();
    }

    @Then("sucessful student admission message will display {string}")
    public void sucessful_student_admission_message_will_display(String expectedResults) throws IOException {

        String actualResults = studentAdmissionPage.sucessfulStudentAdmissionMessage.getText();
        Assert.assertTrue(actualResults.contentEquals(expectedResults));

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    /* Creation of Disable Reason */

    @Given("a teacher is on the Disable Reason page")
    public void a_teacher_is_on_the_Disable_Reason_page() throws IOException {

        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
        loginPage.usernameTextBox.sendKeys(ApplicationConstants.USERNAME);
        loginPage.passwordTextBox.sendKeys(ApplicationConstants.PASSWORD);
        loginPage.signInButton.click();
        homePage.studentInfoModule.click();
        homePage.disableReasonTab.click();

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("a teacher enters disable reason name {string} into the add name textbox")
    public void a_teacher_enters_disable_reason_name_into_the_add_name_textbox(String disableReasonName)
            throws IOException {

        disableReasonPage.disableReasonNameTextbox.sendKeys(disableReasonName);

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("clicks on the add reason save button")
    public void clicks_on_the_add_reason_save_button() {

        disableReasonPage.disableReasonSaveButton.click();
    }

    @Then("a Disable Reason is created {string} and will display the added test reason {string}")
    public void a_Disable_Reason_is_created_and_will_display_the_added_test_reason(String disableReason,
            String expectedResult) throws IOException {

        String actualResult = disableReasonPage.testReasonDynamicXPATH(disableReason).getText();
        Assert.assertTrue(actualResult.contentEquals(expectedResult));

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    /* Disable Student */

    @Given("a teacher is on the Student Details page")
    public void a_teacher_is_on_the_Student_Details_page() throws IOException {

        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
        loginPage.usernameTextBox.sendKeys(ApplicationConstants.USERNAME);
        loginPage.passwordTextBox.sendKeys(ApplicationConstants.PASSWORD);
        loginPage.signInButton.click();
        homePage.studentInfoModule.click();
        homePage.studentDetailsTab.click();

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("the teacher enters student name {string} into the keyword search textbox")
    public void the_teacher_enters_student_name_into_the_keyword_search_textbox(String studentName) throws IOException {

        studentDetailsPage.studentDetailsSearchByKeywordTextbox.sendKeys(studentName);

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("clicks on the keyword search button")
    public void clicks_on_the_keyword_search_button() throws IOException {

        studentDetailsPage.studentDetailsSearchButton.click();

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("clicks on student")
    public void clicks_on_student() throws IOException {

        CommonUtils.waitForClickability(studentDetailsPage.selectStudentButton);
        studentDetailsPage.selectStudentButton.click();

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("clicks the red thumbs down icon")
    public void clicks_the_red_thumbs_down_icon() {

        studentDetailsPage.disableStudentButton.click();
    }

    @When("accepts the chrome alert")
    public void accepts_the_chrome_alert() {

        CommonUtils.acceptAlert();
    }

    @When("selects disable reason")
    public void selects_disable_reason() throws IOException {

        CommonUtils.waitForVisibility(studentDetailsPage.selectReasonDropdown);
        CommonUtils.selectDropDownValue("Test Reason", studentDetailsPage.selectReasonDropdown);

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("clicks on the disable student save button")
    public void clicks_on_the_disable_student_save_button() {

        studentDetailsPage.disableStudentSaveButton.click();
    }

    @Then("the student record will be disabled and display Disable Reason {string}")
    public void the_student_record_will_be_disabled_and_display_Disable_Reason(String expectedResult)
            throws IOException {

        String actualResult = disabledStudentsPage.displayedTestReason.getText();
        Assert.assertTrue(actualResult.contentEquals(expectedResult));

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    /* Enable Student */

    @Given("a teacher is on the Disabled Students page")
    public void a_teacher_is_on_the_Disabled_Students_page() throws IOException {

        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
        loginPage.usernameTextBox.sendKeys(ApplicationConstants.USERNAME);
        loginPage.passwordTextBox.sendKeys(ApplicationConstants.PASSWORD);
        loginPage.signInButton.click();
        homePage.studentInfoModule.click();
        homePage.disableStudentTab.click();

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("a teacher enters disabled student {string} into the keyword textbox")
    public void a_teacher_enters_disabled_student_into_the_keyword_textbox(String disabledStudent) throws IOException {

        disabledStudentsPage.disableStudentSearchByKeywordTextbox.sendKeys(disabledStudent);

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("clicks on the disabled student keyword search button")
    public void clicks_on_the_disabled_student_keyword_search_button() throws IOException {

        disabledStudentsPage.disableStudentSearchButton.click();

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("clicks on disabled student while on the Disabled Students page")
    public void clicks_on_disabled_student_while_on_the_Disabled_Students_page() throws IOException {

        CommonUtils.waitForVisibility(disabledStudentsPage.disabledStudent);
        disabledStudentsPage.disabledStudent.click();

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("clicks on the green thumbs up icon")
    public void clicks_on_the_green_thumbs_up_icon() {

        disabledStudentsPage.enableButton.click();
    }

    @When("accepts the alert")
    public void accepts_the_alert() {

        CommonUtils.acceptAlert();
    }

    @When("navigates to the Student Details")
    public void navigates_to_the_Student_Details() throws InterruptedException {

        Thread.sleep(2000);
        homePage.studentDetailsTab.click();
    }

    @When("enters student name {string} into the keyword search textbox")
    public void enters_student_name_into_the_keyword_search_textbox(String studentName) throws IOException {

        CommonUtils.waitForVisibility(studentDetailsPage.studentDetailsSearchByKeywordTextbox);
        studentDetailsPage.studentDetailsSearchByKeywordTextbox.sendKeys(studentName);

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("the student will display on the Student Details page {string}")
    public void the_student_will_display_on_the_Student_Details_page(String expectedResult) throws IOException {

        String actualResult = studentDetailsPage.selectStudentButton.getText();

        Assert.assertTrue(actualResult.contentEquals(expectedResult));

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("the teacher deletes Disable Reason {string}")
    public void the_teacher_deletes_Disable_Reason(String disableReason) throws IOException {

        homePage.disableReasonTab.click();
        disableReasonPage.deleteDisableReasonDynamicXPATH(disableReason).click();
        CommonUtils.acceptAlert();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("deletes student record with class {string} and section {string} and admission number {string}")
    public void deletes_student_record_with_class_and_section_and_admission_number(String studentClass,
            String studentSection,
            String admissionNo) {

        homePage.bulkDeleteTab.click();
        CommonUtils.selectDropDownValue(studentClass, bulkDeletePage.bulkDeleteClassDropdown);
        CommonUtils.selectDropDownValue(studentSection, bulkDeletePage.bulkDeleteSectionDropdown);
        bulkDeletePage.bulkDeleteSearchButton.click();
        bulkDeletePage.bulkDeleteDynamicXpath(admissionNo).click();
        bulkDeletePage.deleteButton.click();
        CommonUtils.acceptAlert();
    }

}
