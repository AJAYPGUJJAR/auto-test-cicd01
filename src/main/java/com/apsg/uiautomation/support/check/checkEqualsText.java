package com.apsg.uiautomation.support.check;

import com.apsg.uiautomation.support.action.getJsonValue;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class checkEqualsText {

    public void function(String selector, String expectedText) {
        WebElement element = new getJsonValue().getJsonWebElement(selector);
        expectedText = new getJsonValue().getJsonText(expectedText);
        String actualText = element.getText();

        if(!expectedText.equals(actualText)) {
            System.err.println("Expected Text = "+expectedText+"\nActual Text = "+actualText);
            Assert.fail();
        }
    }

}
