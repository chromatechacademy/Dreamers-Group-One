package com.stepDefinitions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.constants.ApplicationConstants;
import com.pages.ExpenseModulePage;
import com.pages.LoginPage;
import com.web.CommonUtils;
import com.web.WebDriverUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Expenses {
    LoginPage loginPage = new LoginPage();
    ExpenseModulePage expensePage = new ExpenseModulePage();

    @Given("user has logged in with valid credentials")
    public void user_has_logged_in_with_valid_credentials() {
        WebDriverUtils.driver.get(ApplicationConstants.APPLICATION_URL);
        loginPage.usernameTextBox.sendKeys("general@teacher.com");
        loginPage.passwordTextBox.sendKeys("123456");
        loginPage.signInButton.click();
    }

    @Given("clicks on the Expenses module")
    public void clicks_on_the_Expenses_module() {

       expensePage.expensesModule.click();

    }

    @Then("Expenses module will be displayed")
    public void expenses_module_will_be_displayed() {

        CommonUtils.waitForVisibility(expensePage.expensesModule);
        String ActualExpenseModule = expensePage.expensesModule.getText();
        String ExpectedExpenseModule = "Expenses";
        Assert.assertEquals(ActualExpenseModule, ExpectedExpenseModule);

        CommonUtils.waitForVisibility(expensePage.addExpenseModule);
        String ActualAddExpenseModule = expensePage.addExpenseModule.getText();
        String ExpectedAddExpenseModule = "Add Expense";
        Assert.assertEquals(ActualAddExpenseModule, ExpectedAddExpenseModule);

        String ActualSearchExpenseModule = expensePage.searchExpenseModule.getText();
        String ExpectedSearchExpenseModule = "Search Expense";
        Assert.assertEquals(ActualSearchExpenseModule, ExpectedSearchExpenseModule);

        String ActualExpenseHeadModule = expensePage.expenseHeadModule.getText();
        String ExpectedExpenseHeadModule = "Expense Head";
        Assert.assertEquals(ActualExpenseHeadModule, ExpectedExpenseHeadModule);
    }

}
