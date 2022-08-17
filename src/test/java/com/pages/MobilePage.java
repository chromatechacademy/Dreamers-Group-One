package com.pages;

import org.openqa.selenium.support.PageFactory;

import com.web.WebDriverUtils;

public class MobilePage {
    




    public MobilePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
