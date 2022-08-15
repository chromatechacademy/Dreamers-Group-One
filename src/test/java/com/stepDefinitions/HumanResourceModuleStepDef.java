package com.stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.constants.ApplicationConstants;
import com.pages.LoginPage;
import com.pages.TwoDashboardPage;
import com.utils.CucumberLogUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HumanResourceModuleStepDef {

    WebDriver driver = WebDriverUtils.driver;
    LoginPage loginPage = new LoginPage();
    TwoDashboardPage twoDashboardPage = new TwoDashboardPage();

    @Given("user is on the home page")
    public void user_is_on_the_home_page() throws IOException {
        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
        System.out.println("");
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

    @When("user logs in with username {string} and password {string}")
    public void user_logs_in_with_username_and_password(String username, String password) throws InterruptedException, IOException {
        loginPage.usernameTextBox.sendKeys(username);
        loginPage.passwordTextBox.sendKeys(password);
        loginPage.signInButton.click();
        Thread.sleep(1000);
        System.out.println("");
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }
    

    @Then("User click on Human Resource Module item on left navigation menu")
    public void user_click_on_Human_Resource_Module_item_on_left_navigation_menu() throws InterruptedException, IOException {
        twoDashboardPage.humanResource.click();
        Thread.sleep(1000);
        System.out.println("");

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

}
