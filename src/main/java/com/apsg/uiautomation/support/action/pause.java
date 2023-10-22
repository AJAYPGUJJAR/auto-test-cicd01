package com.apsg.uiautomation.support.action;

public class pause {

    public void function(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            System.out.println("Timeout failed");
        }
    }

}
