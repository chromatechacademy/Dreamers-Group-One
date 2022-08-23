package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class HumanResourcePage {

    @FindBy(xpath = "//span[normalize-space()='Human Resource']")
    public WebElement humanResource;

    @FindBy(xpath = "//ul[@class='treeview-menu menu-open']")
    public WebElement humanResourceMenu;
   

    public HumanResourcePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

}
