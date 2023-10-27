package com.apsg.uiautomation.support.action;

import com.apsg.uiautomation.steps.MyStepdefs;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class scroll {

    clickElement clickElement = new clickElement();
    pressButton pressButton = new pressButton();

    public void function(String selector) {
        WebElement element = new getJsonValue().getJsonWebElement(selector);
        ((JavascriptExecutor) MyStepdefs.driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void scrollDownAndClick(String selector) {
        MyStepdefs.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        for (int i = 0; i < 5; i++) {
            try {
                clickElement.function(selector);
            } catch (Exception e) {
                pressButton.function("PAGE_DOWN");
            }
        }
        MyStepdefs.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public void scrollUpAndClick(String selector) {
        MyStepdefs.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        for (int i = 0; i < 5; i++) {
            try {
                clickElement.function(selector);
            } catch (Exception e) {
                pressButton.function("PAGE_UP");
            }
        }
        MyStepdefs.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

}
