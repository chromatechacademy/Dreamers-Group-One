package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class DashboardPage {
    
    @FindBy(xpath = "//*[@id='calendar']")
    public WebElement calendar;

    @FindBy(xpath = "//*[@id=\"sibe-box\"]/ul[2]/li[1]/a/span")
    public WebElement studentInfoItem;

    @FindBy(xpath = "//ul[@class='treeview-menu menu-open']")
    public static WebElement studentMenu;



    
    

    public DashboardPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }




}
