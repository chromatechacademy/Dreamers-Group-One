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
        homePage.classModuleLink.click();
    }

    @Given("adds class {string}")
    public void adds_class(String newClassName) throws InterruptedException, IOException {

        academicsClassesPage.classTextBox.sendKeys(newClassName);

        academicsClassesPage.sectionsCheckBox.click();

        academicsClassesPage.saveClassButton.click();

        CommonUtils.getWaitObject(60);

        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

    @Given("deletes class {string}")
    public void deletes_class(String newClassName) throws IOException {

        academicsClassesPage.removeClassButton.click();

        CommonUtils.acceptAlert();

        CommonUtils.getWaitObject(60);

        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

    @Then("the {string} class should be deleted")
    public void the_class_should_be_deleted(String newClassName) throws IOException {

        for (int i = 0; i < academicsSectionPage.allSectionNames.size();i++) {
            academicsClassesPage.allClassNames.get(i);

            Assert.assertFalse(academicsSectionPage.allSectionNames.get(i).getText().contentEquals(newClassName));
        }

        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

}
