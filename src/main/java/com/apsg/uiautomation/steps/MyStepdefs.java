package com.apsg.uiautomation.steps;

import com.apsg.uiautomation.support.action.*;
import com.apsg.uiautomation.support.check.*;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import com.apsg.uiautomation.util.pickWebdriver;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyStepdefs {

    public static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        driver = new pickWebdriver().getWebDriver();
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

    @Given("I open the url {string}")
    public void iOpenTheUrl(String url) {
        new openWebsite().function(url);
    }

    @When("I click on the element {string}")
    @When("I click on the button {string}")
    public void iClickOnTheElement(String selector) {
        new clickElement().function(selector);
    }

    @When("I add {string} to the inputfield {string}")
    public void iAddToTheInputfield(String text, String selector) {
        new setInputField().addInput(text, selector);
    }

    @When("I set {string} to the inputfield {string}")
    public void iSetToTheInputfield(String text, String selector) {
        new setInputField().setInput(text, selector);
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

    @When("I press {string}")
    public void iPress(String text) {
        new pressButton().function(text);
    }

    @Then("I expect that element {string} matches the text {string}")
    public void iExpectThatElementMatchesTheText(String selector, String text) {
        new checkEqualsText().function(selector, text);
    }

    @Then("I check accessibility of UI Webpage {string}")
    public void iCheckAccessibilityOfTheUIWebpage(String pageName) {
        new checkA11y().checkAccessibility();
    }

    @Then("I check accessibility of UI Webpage {string} with {string} standards to be validated")
    public void iCheckAccessibilityOfTheUIWebpageWithStandardsToBeValidated(String pageName, String std) {
        std = std.toLowerCase();
        List<String> tags = Arrays.stream(std.split("\\,")).map(String::trim).collect(Collectors.toList());
        new checkA11y().checkAccessibility(tags);
    }

    @When("I upload the file {string} at the element {string}")
    public void iUploadTheFileAtTheElement(String fileName, String selector) {
        new uploadFile().function(fileName, selector);
    }

    @When("I scroll and click on the element {string}")
    @When("I scroll down and click on the element {string}")
    public void iScrollAndClickOnTheElement(String selector) {
        new scroll().scrollDownAndClick(selector);
    }

    @When("I scroll up and click on the element {string}")
    public void iScrollUpAndClickOnTheElement(String selector) {
        new scroll().scrollUpAndClick(selector);
    }

}
