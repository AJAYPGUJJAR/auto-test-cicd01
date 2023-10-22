package com.apsg.uiautomation.support.action;

import com.apsg.uiautomation.steps.MyStepdefs;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class pressButton {

    public void function(String keyName) {
        new Actions(MyStepdefs.driver).sendKeys(Keys.valueOf(keyName)).perform();
    }

}
