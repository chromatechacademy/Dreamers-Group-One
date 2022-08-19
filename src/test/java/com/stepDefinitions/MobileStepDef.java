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

     @When("User click on a hamburger menu on left")
    public void user_click_on_a_hamburger_menu_on_left() throws IOException, InterruptedException {

        Thread.sleep(2000);
        mobilePage.menuButton.click();
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

    @Then("On left navigation menu user can see modules")
    public void on_left_navigation_menu_user_can_see_modules(String chromaMenu) throws IOException, InterruptedException {
        Assert.assertTrue(mobilePage.chromaTechMenu.getText().contentEquals(chromaMenu));


        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();

    }

}
