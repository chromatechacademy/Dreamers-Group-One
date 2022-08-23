package com.stepDefinitions;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.constants.ApplicationConstants;
import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.utils.CucumberLogUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StudentInfoModuleStepDef {

    WebDriver driver = WebDriverUtils.driver;
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Given("User is on the home page")
    public void openSiteLoginPage() throws IOException {
        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();
    }

    @When("User enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) throws IOException {
        loginPage.usernameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

    @When("User click on a button SingIn")
    public void user_click_on_a_button_SingIn() throws IOException {
        loginPage.signInButton.click();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

    @And("User wait while dashboard page loaded")
    public void iWaitWhileDashboardPageLoaded() throws InterruptedException, IOException {
        Thread.sleep(7000);
        Assert.assertTrue("Calendar should be visible on dashboard page", dashboardPage.calendar.isDisplayed());
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @And("User click on Student information item on left navigation menu")
    public void iClickOnStudentInformationItemOnLeftNavigationMenu() throws InterruptedException, IOException {
        dashboardPage.studentInfoItem.click();
        Thread.sleep(1000);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("User collect Student information items to list and verify them")
    public void user_collect_Student_information_items_to_list_and_verify_them(String studInfMenu) throws IOException {
        Assert.assertTrue(dashboardPage.studentMenu.getText().contentEquals(studInfMenu));

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();


    }

}
