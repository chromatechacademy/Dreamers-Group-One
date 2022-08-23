package com.stepDefinitions;

import java.io.IOException;

import org.junit.Assert;

import com.pages.LoginPage;
import com.pages.HumanResourcePage;
import com.utils.CucumberLogUtils;

import cucumber.api.java.en.Then;

public class HumanResourceModuleStepDef {

    LoginPage loginPage = new LoginPage();
    HumanResourcePage humanResourcePage = new HumanResourcePage();

    @Then("User click on Human Resource Module item on left navigation menu")
    public void user_click_on_Human_Resource_Module_item_on_left_navigation_menu()
            throws InterruptedException, IOException {
        humanResourcePage.humanResource.click();
        Thread.sleep(1000);
        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

    @Then("the Human Resources have to display the following")
    public void the_Human_Resources_have_to_display_the_following(String humanMenu) throws IOException {
        Assert.assertTrue(humanResourcePage.humanResourceMenu.getText().contentEquals(humanMenu));

        CucumberLogUtils.logExtentScreenshot();
        CucumberLogUtils.logScreenShot();
    }

   
   
     
      }
      
     


