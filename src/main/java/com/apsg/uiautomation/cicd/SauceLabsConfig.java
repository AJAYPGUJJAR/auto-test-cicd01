package com.apsg.uiautomation.cicd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class SauceLabsConfig {

    WebDriver driver;
    URL url = null;

    public WebDriver function() {
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("Windows 11");
        browserOptions.setBrowserVersion("latest");
        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("username", "");
        sauceOptions.put("accessKey", "");
        sauceOptions.put("build", "");
        sauceOptions.put("name", "UI Test Automation");
        browserOptions.setCapability("sauce:options", sauceOptions);
        try {
            url = new URL("");
        } catch (Exception e) {
            System.out.println("System did not load SauceLabs");
        }
        driver = new RemoteWebDriver(url, browserOptions);
        return driver;
    }

}
