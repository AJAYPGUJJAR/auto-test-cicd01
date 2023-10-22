package com.apsg.uiautomation.support.action;

import com.apsg.uiautomation.steps.MyStepdefs;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class scroll {

    public void function(String selector) {
        WebElement element = new getJsonValue().getJsonWebElement(selector);
        ((JavascriptExecutor) MyStepdefs.driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

}
