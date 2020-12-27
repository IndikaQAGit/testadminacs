package com.propertycapsule;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import testbase.BasePage;

import java.io.IOException;

public class BaseTest extends BasePage {
    @BeforeTest
    public void setUpLaunch() throws IOException {
        driver = intialiseDriver();
        System.out.println("Driver is initialised");
        driver.get(prop.getProperty("URL"));
        System.out.println("Driver navigated to correct URL");
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
