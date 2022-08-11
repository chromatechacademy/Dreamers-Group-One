package com.stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.constants.ApplicationConstants;
import com.pages.LoginPage;
import com.utils.CucumberLogUtils;
import com.utils.ScreenShots;
import com.web.CommonUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

public class LoginStepDef {

    LoginPage loginPage = new LoginPage();

    @Given("a teacher is on the CTSMS login page")
    public void a_a_teacher_is_on_the_CTSMS_login_page() {

        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
    }

    @When("the teacher logs in with username and password")
    public void the_teacher_logs_in_with_username_and_password() {
        loginPage.usernameTextBox.sendKeys(ApplicationConstants.USERNAME);
        loginPage.passwordTextBox.sendKeys(ApplicationConstants.PASSWORD);
        loginPage.signInButton.click();
        try {
            // Thread.sleep(3000);
            CommonUtils.getWaitObject();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Then("the teacher should be succesfully logged in and page title is {string}")
    public void the_teacher_should_be_succesfully_logged_in_and_page_title_is(String EXPECTED_PAGE_TITLE) throws IOException {

        // Getting page title and storing as String
        String actualPageTitle = WebDriverUtils.driver.getTitle();

        // Assertion to check if actual page title is the same as expected page title
        Assert.assertTrue(actualPageTitle.contentEquals(ApplicationConstants.EXPECTED_PAGE_TITLE));

        // Attaching screenshot to Extent report
        CucumberLogUtils.logExtentScreenshot();

        // Attaching screenshot to Cucumber HTML report
        CucumberLogUtils.logScreenShot();

    }

}