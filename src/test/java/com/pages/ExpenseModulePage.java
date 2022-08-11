package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class ExpenseModulePage {
    
/* Expenses Module */
@FindBy(xpath = "//span[normalize-space()='Expenses']")
public WebElement expensesModule;

/* Add Expense Module */
@FindBy(xpath = "//a[normalize-space()='Add Expense']//i[contains(@class,'fa fa-angle-double-right')]")
public WebElement addExpenseModule;

/* Search Expense Module */
@FindBy(xpath = "//a[normalize-space()='Search Expense']")
public WebElement searchExpenseModule;

/* Expense Head Module */
@FindBy(xpath = "//a[normalize-space()='Expense Head']")
public WebElement expenseHeadModule;










    public ExpenseModulePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
      }
}
