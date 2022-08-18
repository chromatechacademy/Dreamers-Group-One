package com.stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import com.pages.LoginPage;
import com.pages.MobilePage;
import com.utils.CucumberLogUtils;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MobileStepDef {

    LoginPage loginPage = new LoginPage();
    MobilePage mobilePage = new MobilePage();

    @When("User click on a button Chroma Tech")
    public void user_click_on_a_button_Chroma_Tech() throws IOException {
        mobilePage.menuButton.click();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

    @Then("On left navigation menu user can see modules {string} ,{string},{string},{string},{string},{string},{string},{string}")
    public void on_left_navigation_menu_user_can_see_modules(String studentInformation, String feesCollection,
            String income, String expenses, String academics, String humanResource, String homework,String reports) {

        String actualResult1 = mobilePage.moduleMenu.getText();
        Assert.assertTrue(actualResult1.contentEquals(studentInformation));

        String actualResult2 = mobilePage.moduleMenuTwo.getText();
        Assert.assertTrue(actualResult2.contentEquals(feesCollection));

        String actualResult3 = mobilePage.moduleNameThree.getText();
        Assert.assertTrue(actualResult3.contentEquals(income));

        String actualResult4 = mobilePage.moduleMenuFour.getText();
        Assert.assertTrue(actualResult4.contentEquals(expenses));

        String actualResult5 = mobilePage.moduleMenuFive.getText();
        Assert.assertTrue(actualResult5.contentEquals(academics));

        String actualResult6 = mobilePage.moduleMenuSix.getText();
        Assert.assertTrue(actualResult6.contentEquals(humanResource));

        String actualResult7 = mobilePage.moduleSeven.getText();
        Assert.assertTrue(actualResult7.contentEquals(homework));

        String actualResult8 = mobilePage.moduleOne.getText();
        Assert.assertTrue(actualResult8.contentEquals(reports));  
      }

}
