package com.apsg.uiautomation.steps;

import com.apsg.uiautomation.support.action.*;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class MyStepdefs {

    public static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

    @Given("I open url {string}")
    public void iOpenUrl(String url) {
        new openWebsite().function(url);
    }

    @When("I click on the element {string}")
    public void iClickOnTheElement(String selector) {
        new clickElement().function(selector);
    }

    @When("I add {string} to the inputfield {string}")
    public void iAddToTheInputfield(String text, String selector) {
        new setInputField().function(text, selector);
    }

    @When("I pause for {int}ms")
    public void iPauseForMs(int time) {
        new pause().function(time);
    }

    @When("I select the {int}st option for element {string}")
    @When("I select the {int}nd option for element {string}")
    @When("I select the {int}rd option for element {string}")
    @When("I select the {int}th option for element {string}")
    public void iSelectTheStOptionForElement(int index, String selector) {
        new selectOption().selectOptionByIndex(index, selector);
    }

    @When("I select the option with the value {string} for element {string}")
    public void iSelectTheOptionWithTheValueForElement(String value, String selector) {
        new selectOption().selectOptionByValue(value, selector);
    }

    @When("I select the option with the text {string} for element {string}")
    public void iSelectTheOptionWithTheTextForElement(String text, String selector) {
        new selectOption().selectOptionByText(text, selector);
    }

    @When("I scroll to element {string}")
    public void iScrollToElement(String selector) {
        new scroll().function(selector);
    }
}
