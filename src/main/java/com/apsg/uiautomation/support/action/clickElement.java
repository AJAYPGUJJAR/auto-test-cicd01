package com.apsg.uiautomation.support.action;

import org.openqa.selenium.WebElement;

public class clickElement {

    public void function(String selector) {
        WebElement element = new getJsonValue().getJsonWebElement(selector);
        element.click();
    }

}
