package com.propertycapsule;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Launch extends BaseTest {
    @Test
    public void doLogin() throws InterruptedException {
        String realURL = driver.getCurrentUrl();
        System.out.println(realURL);

        Assert.assertEquals(realURL,prop.getProperty("URL"));

        System.out.println(prop.getProperty("URL"));
    }
}
