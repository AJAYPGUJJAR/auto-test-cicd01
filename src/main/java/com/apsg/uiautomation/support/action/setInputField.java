package com.apsg.uiautomation.support.action;

import org.openqa.selenium.WebElement;

public class setInputField {

    public void function(String text, String selector) {
        text = new getJsonValue().getJsonText(text);
        WebElement element = new getJsonValue().getJsonWebElement(selector);
        element.sendKeys(text);
    }

}
