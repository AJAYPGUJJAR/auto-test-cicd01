package com.apsg.uiautomation.support.action;

import org.openqa.selenium.WebElement;

public class setInputField {

    public void addInput(String text, String selector) {
        text = new getJsonValue().getJsonText(text);
        WebElement element = new getJsonValue().getJsonWebElement(selector);
        element.sendKeys(text);
    }

    public void setInput(String text, String selector) {
        text = new getJsonValue().getJsonText(text);
        WebElement element = new getJsonValue().getJsonWebElement(selector);
        element.clear();
        element.sendKeys(text);
    }

}
