package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class SearchingStudentPage {
 
    @FindBy(xpath = "//a[normalize-space()='Student Admission']")
    public static WebElement studentAddmisioElement;
   



    public SearchingStudentPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
