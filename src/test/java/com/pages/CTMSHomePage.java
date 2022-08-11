package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class CTMSHomePage {

  /** Student Information Module */
  @FindBy(xpath = "//span[normalize-space()='Student Information']")
  public WebElement studentInfoModule;

  /* Fees Collection Module */
  @FindBy(xpath = "//span[normalize-space()='Fees Collection']")
  public WebElement feesCollectionModule;

  /* Income Module */
  @FindBy(xpath = "//span[normalize-space()='Income']")
  public WebElement incomeModule;

  /* Expenses Module */
  @FindBy(xpath = "//span[normalize-space()='Expenses']")
  public WebElement expensesModule;

  /* Academic Module */
  @FindBy(xpath = "//span[normalize-space()='Academics']")
  public WebElement academicModule;

  /* Human Resource Module */
  @FindBy(xpath = "//span[normalize-space()='Human Resource']")
  public WebElement humanResourceModule;

  /* Homework Module */
  @FindBy(xpath = "//span[normalize-space()='Homework']")
  public WebElement homeworkModule;

  /* Reports Module */
  @FindBy(xpath = "//span[normalize-space()='Reports']")
  public WebElement reportsModule;

  public CTMSHomePage() {
    PageFactory.initElements(WebDriverUtils.driver, this);
  }

}
