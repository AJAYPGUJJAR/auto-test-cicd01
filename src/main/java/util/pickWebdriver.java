package util;

import com.apsg.uiautomation.cicd.SauceLabsConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class pickWebdriver {
    WebDriver driver;
    SauceLabsConfig sauceLabsConfig = new SauceLabsConfig();

    public WebDriver getWebDriver() {
//        if (System.getProperty("user.dir").contains("jenkins")) {
//            driver = sauceLabsConfig.function();
//        } else {
            ChromeOptions chromeOptions = new ChromeOptions();
            System.setProperty("webdriver.chrome.silentOutput", "true");
            driver = new ChromeDriver(chromeOptions);
//        }
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }

}
