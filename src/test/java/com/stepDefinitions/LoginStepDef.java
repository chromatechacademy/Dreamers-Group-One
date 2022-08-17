package com.stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.constants.ApplicationConstants;
import com.pages.LoginPage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef {

    // CREATING OBJECTS OF PAGE CLASSES TO ACCESS ELEMENTS
    LoginPage loginPage = new LoginPage();

    @Given("a user is on the CTSMS login page")
    public void a_user_is_on_the_CTSMS_login_page() throws IOException {

        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);

        // Adding Screenshots to Extent and Maven report
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @When("the user logs in with username {string} and password {string}")
    public void the_user_logs_in_with_username_and_password(String username, String password) throws IOException {
        loginPage.usernameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
        loginPage.signInButton.click();
        try {
            // Thread.sleep(3000);
            CommonUtils.getWaitObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Adding Screenshots to Extent and Maven report
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("the user should be succesfully logged in and page title is {string}")
    public void the_user_should_be_succesfully_logged_in_and_page_title_is(String EXPECTED_PAGE_TITLE)
            throws IOException {

        // Getting page title and storing as String
        String actualPageTitle = WebDriverUtils.driver.getTitle();

        // Assertion to check if actual page title is the same as expected page title
        Assert.assertTrue(actualPageTitle.contentEquals(ApplicationConstants.EXPECTED_PAGE_TITLE));
        
        // Adding Screenshots to Extent and Maven report
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

}