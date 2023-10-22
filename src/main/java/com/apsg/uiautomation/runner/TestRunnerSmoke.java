package com.apsg.uiautomation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/features/",
        tags = "@SmokeTest",
        glue = "com.apsg.uiautomation.steps",
        plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
)
public class TestRunnerSmoke extends AbstractTestNGCucumberTests {
}
