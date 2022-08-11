package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class CTMSHomePage {

      /** Navigation Modules */
      @FindBy(xpath = "//span[normalize-space()='Student Information']")
      public  WebElement navigationModules;

      public CTMSHomePage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
      }
  
    
}
