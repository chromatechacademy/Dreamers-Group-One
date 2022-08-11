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

public class SampleTest {

    WebDriver driver = WebDriverUtils.driver;
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    
    @Given("I open site login page")
    public void openSiteLoginPage() throws IOException {
        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
        //CucumberLogUtils.logScreenShot();
        //CucumberLogUtils.logExtentScreenshot();
    }

    @When("I fill user login data")
    public void iFillUserLoginData() throws InterruptedException {
        loginPage.usernameTextBox.sendKeys("general@teacher.com");
        loginPage.passwordTextBox.sendKeys("123456");
        loginPage.signInButton.click();
        System.out.println("");
    }

    @And("I wait while dashboard page loaded")
    public void iWaitWhileDashboardPageLoaded() throws InterruptedException {
        Thread.sleep(7000);
        Assert.assertTrue("Calendar should be visible on dashboard page", dashboardPage.calendar.isDisplayed());
    }

    @And("I click on Student information item on left navigation menu")
    public void iClickOnStudentInformationItemOnLeftNavigationMenu() throws InterruptedException {
        dashboardPage.studentInfoItem.click();
        Thread.sleep(1500);
    }

    @Then("I collect Student information items to list and verify them")
    public void iCollectStudentInformationItemsToList() throws IOException {
        List<String> expected = Arrays.asList("Student Details", "Student Admission", "Disabled Students", "Bulk Delete", "Student Categories", "Student House", "Disable Reason");
        List<String> studentInfoItems = dashboardPage.getStudentInfoItems(driver);
        System.out.println(studentInfoItems);
        Assert.assertEquals("Student items size should be equal to 7", 7, studentInfoItems.size());
        Assert.assertEquals(expected,studentInfoItems);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }
}
