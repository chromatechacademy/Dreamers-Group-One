package com.stepDefinitions;

import org.testng.Assert;

import com.constants.ApplicationConstants;
import com.pages.LoginPage;
import com.utils.CucumberLogUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvalidLogin {

    LoginPage loginpage = new LoginPage();

    @Given("a user is on the CTSMS web page")
    public void a_user_is_on_the_CTSMS_web_page() {

        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
        CucumberLogUtils.logScreenShot();
    }

    @When("user attempts logs in with invalid username {string} and invalid password {string}")
    public void user_attempts_logs_in_with_invalid_username_and_invalid_password(String invalidUsername,
            String invalidPassword) {

        loginpage.usernameTextBox.sendKeys(invalidUsername);
        loginpage.passwordTextBox.sendKeys(invalidPassword);
        CucumberLogUtils.logScreenShot();
        loginpage.signInButton.click();
    }

    @Then("the user should see message {string}")
    public void the_user_should_see_message(String expectedInvalidLoginMessage) {

        String actualInvalidLoginMessage = loginpage.invalidUsernameOrPasswordMessage.getText();

        Assert.assertTrue(actualInvalidLoginMessage.contentEquals(expectedInvalidLoginMessage));
        CucumberLogUtils.logScreenShot();
    }
}
