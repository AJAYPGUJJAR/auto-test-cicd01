package com.apsg.uiautomation;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/features/",
        glue = "com.apsg.uiautomation.steps"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
