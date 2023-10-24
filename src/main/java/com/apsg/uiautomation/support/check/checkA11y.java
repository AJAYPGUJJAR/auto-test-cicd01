package com.apsg.uiautomation.support.check;

import com.apsg.uiautomation.steps.MyStepdefs;
import com.deque.html.axecore.args.AxeRunOnlyOptions;
import com.deque.html.axecore.args.AxeRunOptions;
import com.deque.html.axecore.results.Results;
import com.deque.html.axecore.selenium.AxeBuilder;

import java.util.List;

public class checkA11y {

    public Results checkAccessibility() {
        AxeBuilder axeBuilder = new AxeBuilder();
        return axeBuilder.analyze(MyStepdefs.driver);
    }

    public Results checkAccessibility(List<String> tags) {
        AxeRunOnlyOptions runOnlyOptions = new AxeRunOnlyOptions();
        runOnlyOptions.setType("tag");
        runOnlyOptions.setValues(tags);

        AxeRunOptions runOptions = new AxeRunOptions();
        runOptions.setRunOnly(runOnlyOptions);

        AxeBuilder axeBuilder = new AxeBuilder().withOptions(runOptions);
        return axeBuilder.analyze(MyStepdefs.driver);
    }

}
