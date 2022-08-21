package com.stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.constants.ApplicationConstants;
import com.pages.CTMSHomePage;
import com.pages.LoginPage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Modules {
    CTMSHomePage ctmsHomePage = new CTMSHomePage();
    LoginPage loginPage = new LoginPage();

    @Given("is on the CTSMS login page")
    public void is_on_the_CTSMS_login_page() {
        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
    }

    @When("user logs in with username {string} and password {string} and logs in")
    public void user_logs_in_with_username_and_password_and_logs_in(String username, String password)
            throws IOException {

        loginPage.usernameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
        loginPage.signInButton.click();

    }

    @Then("the following will be displayed on the CTSMS home page {string},{string},{string},{string},{string},{string},{string},{string}")
    public void the_following_will_be_displayed_on_the_CTSMS_home_page(String StudentInformation, String FeesCollection, String Income,
            String Expenses, String Academics, String HumanResource, String Homework, String Reports) throws IOException {

        CommonUtils.waitForVisibility(ctmsHomePage.studentInfoModule);
        String ActualStudentModules = ctmsHomePage.studentInfoModule.getText();
        String ExpectedStudentModules = StudentInformation;
        Assert.assertEquals(ActualStudentModules, ExpectedStudentModules);

        String ActualFeesModule = ctmsHomePage.feesCollectionModule.getText();
        String ExpectedFeesModule = FeesCollection;
        Assert.assertEquals(ActualFeesModule, ExpectedFeesModule);

        String ActualIncomeModule = ctmsHomePage.incomeModule.getText();
        String ExpectedIncomeModule = Income;
        Assert.assertEquals(ActualIncomeModule, ExpectedIncomeModule);

        String ActualExpenseModule = ctmsHomePage.expensesModule.getText();
        String ExpectedExpenseModule = Expenses;
        Assert.assertEquals(ActualExpenseModule, ExpectedExpenseModule);

        String ActualAcademicModule = ctmsHomePage.academicModule.getText();
        String ExpectedAcademicModule = Academics;
        Assert.assertEquals(ActualAcademicModule, ExpectedAcademicModule);

        String ActualHumanResourceModule = ctmsHomePage.humanResourceModule.getText();
        String ExpectedHumanResourceModule = HumanResource;
        Assert.assertEquals(ActualHumanResourceModule, ExpectedHumanResourceModule);

        String ActualHomeworkModule = ctmsHomePage.homeworkModule.getText();
        String ExpectedHomeworkModule = Homework;
        Assert.assertEquals(ActualHomeworkModule, ExpectedHomeworkModule);

        String ActualReportsModule = ctmsHomePage.reportsModule.getText();
        String ExpectedReportsModule = Reports;
        Assert.assertEquals(ActualReportsModule, ExpectedReportsModule);

        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

}