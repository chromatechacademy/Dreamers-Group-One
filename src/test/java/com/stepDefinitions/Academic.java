package com.stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.constants.ApplicationConstants;
import com.pages.AcademicsModulePage;
import com.pages.LoginPage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Academic {
    AcademicsModulePage academicsPage = new AcademicsModulePage();

    @Given("clicks on the Academics module")
    public void clicks_on_the_Academics_module() {

        academicsPage.academicsModule.click();

    }

    @Then("Academics module will be displayed")
    public void academics_module_will_be_displayed() throws IOException {

        String ActualAcademicsModule = academicsPage.academicsModule.getText();
        String ExpectedAcademicsModule = "Academics";
        Assert.assertEquals(ActualAcademicsModule, ExpectedAcademicsModule);

        String ActualClassTimetableModule = academicsPage.classTimeTableModule.getText();
        String ExpectedClassTimetableModule = "Class Timetable";
        Assert.assertEquals(ActualClassTimetableModule, ExpectedClassTimetableModule);

        CommonUtils.waitForVisibility(academicsPage.teacherTimetableModule);
        String ActualTeacherTimetableModule = academicsPage.teacherTimetableModule.getText();
        String ExpectedTeacherTimetableModule = "Teachers Timetable";
        Assert.assertEquals(ActualTeacherTimetableModule, ExpectedTeacherTimetableModule);

        String ActualAssignClassTeacherModule = academicsPage.assignClassTeacherModule.getText();
        String ExpectedAssignClassTeacherModule = "Assign Class Teacher";
        Assert.assertEquals(ActualAssignClassTeacherModule, ExpectedAssignClassTeacherModule);

        String ActualPromoteStudentsModule = academicsPage.promoteStudentsModule.getText();
        String ExpectedPromoteStudentsModule = "Promote Students";
        Assert.assertEquals(ActualPromoteStudentsModule, ExpectedPromoteStudentsModule);

        String ActualSubjectGroupModule = academicsPage.subjectGroupModule.getText();
        String ExpectedSubjectGroupModule = "Subject Group";
        Assert.assertEquals(ActualSubjectGroupModule, ExpectedSubjectGroupModule);

        String ActualSubjectsModule = academicsPage.subjectsModule.getText();
        String ExpectedSubjectsModule = "Subjects";
        Assert.assertEquals(ActualSubjectsModule, ExpectedSubjectsModule);

        String ActualClassModule = academicsPage.classModule.getText();
        String ExcpectedClassModule = "Class";
        Assert.assertEquals(ActualClassModule, ExcpectedClassModule);

        String ActualSectionsModule = academicsPage.sectionsModule.getText();
        String ExpectedSectionsModule = "Sections";
        Assert.assertEquals(ActualSectionsModule, ExpectedSectionsModule);

        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

}
