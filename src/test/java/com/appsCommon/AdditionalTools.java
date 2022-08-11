package com.appsCommon;

import com.constants.ApplicationConstants;
import com.pages.DisableReasonPage;
import com.pages.DisabledStudentsPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.StudentAdmissionPage;
import com.pages.StudentDetailsPage;
import com.web.WebDriverUtils;

public class AdditionalTools {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    StudentAdmissionPage studentAdmissionPage = new StudentAdmissionPage();
    StudentDetailsPage studentDetailsPage = new StudentDetailsPage();
    DisableReasonPage disableReasonPage = new DisableReasonPage();
    DisabledStudentsPage disabledStudentsPage = new DisabledStudentsPage();

    public static void login() {
        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
        loginPage.usernameTextBox.sendKeys(ApplicationConstants.USERNAME);
        loginPage.passwordTextBox.sendKeys(ApplicationConstants.PASSWORD);
        loginPage.signInButton.click();
    }

    public static void createStudent() {

    }
}
