package com.stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.constants.ApplicationConstants;
import com.pages.IncomeModulePage;
import com.pages.LoginPage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class IncomeModuleStepDef {

    LoginPage loginPage = new LoginPage();
    IncomeModulePage incomeModulePage = new IncomeModulePage();


    @Given("a user is logged into the CTSMS portal")
    public void a_user_is_logged_into_the_CTSMS_portal() throws IOException {

        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);

        loginPage.usernameTextBox.sendKeys(ApplicationConstants.USERNAME);
        loginPage.passwordTextBox.sendKeys(ApplicationConstants.PASSWORD);
        loginPage.signInButton.click();

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();


    }

    @Given("the user is on the CTSMS home page")
    public void the_user_is_on_the_CTSMS_home_page() throws IOException {
        // Getting page title and storing as String
        String actualPageTitle = WebDriverUtils.driver.getTitle();

        // Assertion to check if actual page title is the same as expected page title
        Assert.assertTrue(actualPageTitle.contentEquals(ApplicationConstants.EXPECTED_PAGE_TITLE));

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

       
    }

    @When("the user clicks {string} on the sidebar navigation menu")
    public void the_user_clicks_on_the_sidebar_navigation_menu(String string) throws InterruptedException, IOException {

        // Wait for sidenav to become clickable
        CommonUtils.waitForClickability(incomeModulePage.IncomeModuleNavButton);

        // // Click "Income" on sidenav
        incomeModulePage.IncomeModuleNavButton.click();

        Thread.sleep(3000);
        
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
        
    }

    @Then("the page displays the following menu items: {string}, {string}, {string}")
    public void the_page_displays_the_following_menu_items(String addIncome, String searchIncome, String incomeHead) throws IOException {
    
        addIncome = incomeModulePage.AddIncomeButton.getText();

        Assert.assertTrue(addIncome.contentEquals("Add Income"));
        Assert.assertTrue(searchIncome.contentEquals("Search Income"));
        Assert.assertTrue(incomeHead.contentEquals("Income Head"));

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

}
