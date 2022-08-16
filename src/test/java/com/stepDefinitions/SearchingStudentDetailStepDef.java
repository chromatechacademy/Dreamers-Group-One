package com.stepDefinitions;

import java.io.IOException;

import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.pages.SearchingStudentPage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;

import cucumber.api.java.en.When;

public class SearchingStudentDetailStepDef {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    SearchingStudentPage searchingStudentPage = new SearchingStudentPage();

    @When("User click on Student Addmission Section")
    public void user_click_on_Student_Addmission_Section() throws InterruptedException, IOException {
        SearchingStudentPage.studentAddmisioElement.click();
        CommonUtils.waitForVisibility(SearchingStudentPage.studentAddmisioElement);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

    @When("User enters his data {string},{string},{string},{string},{string},{string},{string},{string},{string}")
    public void user_enters_his_data(String admissionNo, String clasS, String section, String firstName, String gender,
            String dateOfBirth, String ifGuardianIs, String guardianName, String guardianPhone)
            throws InterruptedException {
        SearchingStudentPage.admissionNumberTextBox.sendKeys(admissionNo);

        SearchingStudentPage.classTextBox.sendKeys(clasS);

        SearchingStudentPage.sectionTextBox.sendKeys(section);

        CommonUtils.waitForVisibility(SearchingStudentPage.sectionTextBox);

        SearchingStudentPage.firstNameTextBox.sendKeys(firstName);

        SearchingStudentPage.genderTextBox.sendKeys(gender);

        SearchingStudentPage.dataOfBirthTextBox.sendKeys(dateOfBirth);

        CommonUtils.waitForVisibility(SearchingStudentPage.dataOfBirthTextBox);

        SearchingStudentPage.ifGuardianIsTextBox.click();

        SearchingStudentPage.guardianNameTextBox.sendKeys(guardianName);

        SearchingStudentPage.guardianPhoneTextBox.sendKeys(guardianPhone);

    }

    @When("User click on a button SAVE")
    public void user_click_on_a_button_SAVE() throws IOException, InterruptedException {
        SearchingStudentPage.buttonSave.click();
        CommonUtils.waitForVisibility(SearchingStudentPage.dataOfBirthTextBox);

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("User click on a searching and enters firstName {string}")
    public void user_click_on_a_searching_and_enters_firstName(String firstName)
            throws InterruptedException, IOException {
        SearchingStudentPage.searchTextBox.sendKeys(firstName);

    }

    @When("User click on search button")
    public void user_click_on_search_button() throws IOException, InterruptedException {

        SearchingStudentPage.searchButton.click();
        CommonUtils.waitForVisibility(SearchingStudentPage.dataOfBirthTextBox);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        Thread.sleep(3000);
    }

    @When("User click on Edit button")
    public void user_click_on_Edit_button() throws IOException, InterruptedException {
        SearchingStudentPage.editButton.click();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        Thread.sleep(2000);

    }

    @When("User changes admission number {string}")
    public void user_changes_admission_number(String number) throws IOException, InterruptedException {
        SearchingStudentPage.admissionNew.sendKeys(number);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        Thread.sleep(2000);

    }

}
