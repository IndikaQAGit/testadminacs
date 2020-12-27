package com.propertycapsule;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DealMaker extends BaseTest {

    @Test
    public void clickDealMakerButton() throws InterruptedException {
        pageobjects.DealMaker dealMaker = new pageobjects.DealMaker(driver);
        dealMaker.clickOnDealMakerSignButton().click();
        Thread.sleep(2000);
        dealMaker.ClickOnCloseButton().click();
        String currentURL= driver.getCurrentUrl();
        System.out.println("Current URL is " + currentURL);

        Assert.assertEquals(currentURL,prop.getProperty("DealMakerUrl"));

        String storedURL  = prop.getProperty("DealMakerUrl");
        System.out.println("Stored URL " + storedURL);
    }
}
