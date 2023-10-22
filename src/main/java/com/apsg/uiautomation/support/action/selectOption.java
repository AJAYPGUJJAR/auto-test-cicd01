package com.apsg.uiautomation.support.action;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class selectOption {

    public void selectOptionByIndex(int index, String selector) {
        WebElement dropdown = new getJsonValue().getJsonWebElement(selector);
        Select select = new Select(dropdown);
        select.selectByIndex(index);
    }

    public void selectOptionByValue(String value, String selector) {
        WebElement dropdown = new getJsonValue().getJsonWebElement(selector);
        Select select = new Select(dropdown);
        select.selectByValue(value);
    }

    public void selectOptionByText(String text, String selector) {
        WebElement dropdown = new getJsonValue().getJsonWebElement(selector);
        Select select = new Select(dropdown);
        select.selectByVisibleText(text);
    }

}
