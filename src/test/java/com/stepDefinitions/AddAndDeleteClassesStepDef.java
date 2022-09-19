package com.stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.pages.AcademicsClassesPage;
import com.pages.AcademicsSectionPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AddAndDeleteClassesStepDef {

    // CREATING OBJECTS OF PAGE CLASSES TO ACCESS ELEMENTS
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    AcademicsClassesPage academicsClassesPage = new AcademicsClassesPage();
    AcademicsSectionPage academicsSectionPage = new AcademicsSectionPage();

    @Given("navigates to class module")
    public void navigates_to_class_module() {
        
        CommonUtils.waitForClickability(homePage.classModuleLink);

        // Click 'Class' in 'Academics' module
        homePage.classModuleLink.click();
    }

    @Given("adds class {string}")
    public void adds_class(String newClassName) throws InterruptedException, IOException {

        // Send newly created class name to class text box
        academicsClassesPage.classTextBox.sendKeys(newClassName);

        // Click the section to add the class too
        academicsClassesPage.sectionsCheckBox.click();

        // Click save button
        academicsClassesPage.saveClassButton.click();

        CommonUtils.getWaitObject();

        // Adding Screenshots to Extent and Maven report
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

    @Given("deletes class {string}")
    public void deletes_class(String newClassName) throws IOException {

        // Click the 'x' to remove the newly created class
        academicsClassesPage.removeClassButton.click();

        // Accept alert to confirm class deletion
        CommonUtils.acceptAlert();

        CommonUtils.getWaitObject();

        // Adding Screenshots to Extent and Maven report
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

    @Then("the {string} class should be deleted")
    public void the_class_should_be_deleted(String newClassName) throws IOException, InterruptedException {

        Thread.sleep(1000);

        // Iterate through a list of all class names
        for (int i = 0; i < academicsClassesPage.allClassNames.size(); i++) {
            
            Thread.sleep(1000);
            
            CommonUtils.getWaitObject();

            // Get the newly created class name
            academicsClassesPage.allClassNames.get(i);

            // Check of the newly created class is deleted
            Assert.assertFalse(academicsSectionPage.allSectionNames.get(i).getText().contentEquals(newClassName));
        }

        // Adding Screenshots to Extent and Maven report
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

}
