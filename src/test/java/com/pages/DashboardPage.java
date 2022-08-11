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


    public List<String> getStudentInfoItems(WebDriver driver) {
        List<String> items = new ArrayList<>();
        for (WebElement element : driver.findElements(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[1]/ul/li"))) {
            items.add(element.getText());
        }
        return items;
    }

    public DashboardPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }




}
