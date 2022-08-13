package com.appsCommon;

import com.constants.ApplicationConstants;
import com.pages.LoginPage;
import com.web.WebDriverUtils;

public class AdditionalTools {

    LoginPage loginPage = new LoginPage();

    public static void login() {
        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
        // loginPage.usernameTextBox.sendKeys(ApplicationConstants.USERNAME);
        // loginPage.passwordTextBox.sendKeys(ApplicationConstants.PASSWORD);
        // loginPage.signInButton.click();
    }

    public static void createStudent() {

    }
}
