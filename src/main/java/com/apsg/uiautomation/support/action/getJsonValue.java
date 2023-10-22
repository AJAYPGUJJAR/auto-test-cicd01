package com.apsg.uiautomation.support.action;

import com.apsg.uiautomation.steps.MyStepdefs;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileReader;

public class getJsonValue {

    public WebElement getJsonWebElement(String selector) {
        String[] arr = selector.split("\\.");
        String jsonFilePath = new File("src/main/resources/testdata/" + arr[0] + ".json").getAbsolutePath();
        try {
            FileReader fileReader = new FileReader(jsonFilePath);
            Object o = new JSONParser().parse(fileReader);
            selector = ((JSONObject) ((JSONObject) o).get(arr[1])).get(arr[2]).toString();
            return MyStepdefs.driver.findElement(selector.charAt(0) == '#' ? By.cssSelector(selector) : By.xpath(selector));
        } catch (Exception ignored) {
        }
        return MyStepdefs.driver.findElement(selector.charAt(0) == '#' ? By.cssSelector(selector) : By.xpath(selector));
    }

    public String getJsonText(String selector) {
        String[] arr = selector.split("\\.");
        String jsonFilePath = new File("src/main/resources/testdata/" + arr[0] + ".json").getAbsolutePath();
        try {
            FileReader fileReader = new FileReader(jsonFilePath);
            Object o = new JSONParser().parse(fileReader);
            return ((JSONObject) ((JSONObject) o).get(arr[1])).get(arr[2]).toString();
        } catch (Exception ignored) {
        }
        return selector;
    }

}
