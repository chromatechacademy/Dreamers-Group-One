package com.stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import com.pages.ExpenseModulePage;
import com.pages.LoginPage;
import com.utils.CucumberLogUtils;
import com.web.CommonUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Expenses {
    LoginPage loginPage = new LoginPage();
    ExpenseModulePage expensePage = new ExpenseModulePage();

    @Given("clicks on the Expenses module")
    public void clicks_on_the_Expenses_module() throws IOException {

        expensePage.expensesModule.click();

    }

    @Then("Expenses module will be displayed with the following {string},{string},{string}")
    public void expenses_module_will_be_displayed_with_the_following(String AddExpense, String SearchExpense, String ExpenseHead) throws IOException {

        CommonUtils.waitForVisibility(expensePage.addExpenseModule);
        String ActualAddExpenseModule = expensePage.addExpenseModule.getText();
        String ExpectedAddExpenseModule = AddExpense;
        Assert.assertEquals(ActualAddExpenseModule, ExpectedAddExpenseModule);

        CommonUtils.waitForVisibility(expensePage.searchExpenseModule);
        String ActualSearchExpenseModule = expensePage.searchExpenseModule.getText();
        String ExpectedSearchExpenseModule = SearchExpense;
        Assert.assertEquals(ActualSearchExpenseModule, ExpectedSearchExpenseModule);

        String ActualExpenseHeadModule = expensePage.expenseHeadModule.getText();
        String ExpectedExpenseHeadModule = ExpenseHead;
        Assert.assertEquals(ActualExpenseHeadModule, ExpectedExpenseHeadModule);
        
        CucumberLogUtils.logScreenShot();
        CucumberLogUtils.logExtentScreenshot();

    }

}
