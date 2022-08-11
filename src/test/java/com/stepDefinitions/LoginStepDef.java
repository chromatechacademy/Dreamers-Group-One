package com.stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.constants.ApplicationConstants;
import com.pages.LoginPage;
import com.utils.CucumberLogUtils;
import com.utils.ScreenShots;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

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
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Then("the teacher should be succesfully logged in")
    public void the_teacher_should_be_succesfully_logged_in() {
        
        // Attaching screenshot to Extent report
        try {
            CucumberLogUtils.logExtentScreenshot();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Attaching screenshot to Cucumber HTML report
        CucumberLogUtils.logScreenShot();

    }

}