package com.stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.pages.AcademicsModulePage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Academic {
    AcademicsModulePage academicsPage = new AcademicsModulePage();

    @Given("clicks on the Academics module")
    public void clicks_on_the_Academics_module() {

        academicsPage.academicsModule.click();

    }

    @Then("the Academics module will be displayed with the following modules {string},{string},{string},{string},{string},{string},{string},{string}")
    public void the_Academics_module_will_be_displayed_with_the_following_modules(String ClassTimetable, String TeachersTimetable,
            String AssignClassTeacher, String PromoteStudents, String SubjectGroup, String Subjects, String Class, String Sections) throws IOException {

        String ActualClassTimetableModule = academicsPage.classTimeTableModule.getText();
        String ExpectedClassTimetableModule = ClassTimetable;
        Assert.assertEquals(ActualClassTimetableModule, ExpectedClassTimetableModule);

        CommonUtils.waitForVisibility(academicsPage.teacherTimetableModule);
        String ActualTeacherTimetableModule = academicsPage.teacherTimetableModule.getText();
        String ExpectedTeacherTimetableModule = TeachersTimetable;
        Assert.assertEquals(ActualTeacherTimetableModule, ExpectedTeacherTimetableModule);

        String ActualAssignClassTeacherModule = academicsPage.assignClassTeacherModule.getText();
        String ExpectedAssignClassTeacherModule = AssignClassTeacher;
        Assert.assertEquals(ActualAssignClassTeacherModule, ExpectedAssignClassTeacherModule);

        String ActualPromoteStudentsModule = academicsPage.promoteStudentsModule.getText();
        String ExpectedPromoteStudentsModule = PromoteStudents;
        Assert.assertEquals(ActualPromoteStudentsModule, ExpectedPromoteStudentsModule);

        String ActualSubjectGroupModule = academicsPage.subjectGroupModule.getText();
        String ExpectedSubjectGroupModule = SubjectGroup;
        Assert.assertEquals(ActualSubjectGroupModule, ExpectedSubjectGroupModule);

        String ActualSubjectsModule = academicsPage.subjectsModule.getText();
        String ExpectedSubjectsModule = Subjects;
        Assert.assertEquals(ActualSubjectsModule, ExpectedSubjectsModule);

        String ActualClassModule = academicsPage.classModule.getText();
        String ExcpectedClassModule = Class;
        Assert.assertEquals(ActualClassModule, ExcpectedClassModule);

        String ActualSectionsModule = academicsPage.sectionsModule.getText();
        String ExpectedSectionsModule = Sections;
        Assert.assertEquals(ActualSectionsModule, ExpectedSectionsModule);

        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

}
