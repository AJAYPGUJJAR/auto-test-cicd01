package com.apsg.uiautomation.support.action;

import com.apsg.uiautomation.steps.MyStepdefs;

public class openWebsite {

    public void function(String url) {
        url = new getJsonValue().getJsonText(url);
        MyStepdefs.driver.navigate().to(url);
    }

}
