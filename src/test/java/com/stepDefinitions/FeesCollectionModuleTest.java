package com.stepDefinitions;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.constants.ApplicationConstants;
import com.pages.FeesCollectionModule;
import com.pages.LoginPage;
import com.utils.CucumberLogUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FeesCollectionModuleTest {

    LoginPage loginPage = new LoginPage();
    FeesCollectionModule feesCollection = new FeesCollectionModule();

    @Given("Chroma Tech Academy teacher\\/admin user is logged in to the CTSMS Dashboard")
    public void chroma_Tech_Academy_teacher_admin_user_is_logged_in_to_the_CTSMS_Dashboard()
            throws InterruptedException {

        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
        loginPage.usernameTextBox.sendKeys(ApplicationConstants.USERNAME);
        loginPage.passwordTextBox.sendKeys(ApplicationConstants.PASSWORD);
        loginPage.signInButton.click();

        Thread.sleep(2000);

    }

    @When("the user selects Fees Collection module")
    public void the_user_selects_Fees_Collection_module() throws InterruptedException {

        feesCollection.feesCollectionModule.click();

    }

    @Then("the Fees Collection module contains {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_Fees_Collection_module_contains(String string, String string2, String string3, String string4,
            String string5, String string6, String string7, String string8, String string9) throws IOException {

        String actualResults1String = feesCollection.collectFeesModule.getText();
        String actualResults2String = feesCollection.searchFeesPaymentModule.getText();
        String actualResults3String = feesCollection.searchDueFeesModule.getText();
        String actualResults4String = feesCollection.feesMasterModule.getText();
        String actualResults5String = feesCollection.feesGroupModule.getText();
        String actualResults6String = feesCollection.feesTypeModule.getText();
        String actualResults7String = feesCollection.feesDiscountModule.getText();
        String actualResults8String = feesCollection.feesCarryForwardModule.getText();
        String actualResults9String = feesCollection.feesReminderModule.getText();

        String expectedResult1 = "Collect Fees";
        String expectedResult2 = "Search Fees Payment";
        String expectedResult3 = "Search Due Fees";
        String expectedResult4 = "Fees Master";
        String expectedResult5 = "Fees Group";
        String expectedResult6 = "Fees Type";
        String expectedResult7 = "Fees Discount";
        String expectedResult8 = "Fees Carry Forward";
        String expectedResult9 = "Fees Reminder";

        Assert.assertEquals(expectedResult1, actualResults1String);
        Assert.assertEquals(expectedResult2, actualResults2String);
        Assert.assertEquals(expectedResult3, actualResults3String);
        Assert.assertEquals(expectedResult4, actualResults4String);
        Assert.assertEquals(expectedResult5, actualResults5String);
        Assert.assertEquals(expectedResult6, actualResults6String);
        Assert.assertEquals(expectedResult7, actualResults7String);
        Assert.assertEquals(expectedResult8, actualResults8String);
        Assert.assertEquals(expectedResult9, actualResults9String);
        CucumberLogUtils.logScreenShot();

    }

}
