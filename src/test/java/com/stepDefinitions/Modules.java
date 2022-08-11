package com.stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.constants.ApplicationConstants;
import com.pages.CTMSHomePage;
import com.pages.LoginPage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Modules {
    LoginPage loginPage = new LoginPage();
    CTMSHomePage ctmsHomePage = new CTMSHomePage();

    @Given("user has logged in with valid credentials")
    public void user_has_logged_in_with_valid_credentials() {
        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
        loginPage.usernameTextBox.sendKeys("general@teacher.com");
        loginPage.passwordTextBox.sendKeys("123456");
        loginPage.signInButton.click();

    }

    @Then("the navigation modules should be displayed")
    public void the_navigation_modules_should_be_displayed() throws IOException {

        CommonUtils.waitForVisibility(ctmsHomePage.studentInfoModule);
        String ActualStudentModules = ctmsHomePage.studentInfoModule.getText();
        String ExpectedStudentModules = "Student Information";
        Assert.assertEquals(ActualStudentModules, ExpectedStudentModules);

        String ActualFeesModule = ctmsHomePage.feesCollectionModule.getText();
        String ExpectedFeesModule = "Fees Collection";
        Assert.assertEquals(ActualFeesModule, ExpectedFeesModule);
        CucumberLogUtils.logExtentScreenshot();

        String ActualIncomeModule = ctmsHomePage.incomeModule.getText();
        String ExpectedIncomeModule = "Income";
        Assert.assertEquals(ActualIncomeModule, ExpectedIncomeModule);

        String ActualExpenseModule = ctmsHomePage.expensesModule.getText();
        String ExpectedExpenseModule = "Expenses";
        Assert.assertEquals(ActualExpenseModule, ExpectedExpenseModule);

        String ActualAcademicModule = ctmsHomePage.academicModule.getText();
        String ExpectedAcademicModule = "Academics";
        Assert.assertEquals(ActualAcademicModule, ExpectedAcademicModule);

        String ActualHumanResourceModule = ctmsHomePage.humanResourceModule.getText();
        String ExpectedHumanResourceModule = "Human Resource";
        Assert.assertEquals(ActualHumanResourceModule, ExpectedHumanResourceModule);

        String ActualHomeworkModule = ctmsHomePage.homeworkModule.getText();
        String ExpectedHomeworkModule = "Homework";
        Assert.assertEquals(ActualHomeworkModule, ExpectedHomeworkModule);

        String ActualReportsModule = ctmsHomePage.reportsModule.getText();
        String ExpectedReportsModule = "Reports";
        Assert.assertEquals(ActualReportsModule, ExpectedReportsModule);

    }
}