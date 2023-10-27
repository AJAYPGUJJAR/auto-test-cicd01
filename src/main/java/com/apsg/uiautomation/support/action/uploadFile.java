package com.apsg.uiautomation.support.action;

import org.openqa.selenium.WebElement;

import java.io.File;
import java.nio.file.Paths;

public class uploadFile {

    public void function(String fileName, String selector) {
        fileName = new getJsonValue().getJsonText(fileName);
        WebElement element = new getJsonValue().getJsonWebElement(selector);
        File filePath = new File((Paths.get(fileName)).toUri());
        element.sendKeys(filePath.toString());
    }
}
