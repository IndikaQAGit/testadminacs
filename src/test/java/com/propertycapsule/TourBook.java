package com.propertycapsule;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;

public class TourBook extends BaseTest {
    @Test
    public void TourBook() throws InterruptedException {

        pageobjects.TourBook tourBook = new pageobjects.TourBook(driver);
        tourBook.findTourBook().click();
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        Thread.sleep(1000);
        String tourBookUrl = driver.getCurrentUrl();
        System.out.println("Active URl " + tourBookUrl);

        Assert.assertEquals(tourBookUrl, prop.getProperty("TourBookUrl"));

        String storeURL = prop.getProperty("TourBookUrl");
        System.out.println("Stored URL " + storeURL);
    }
}
