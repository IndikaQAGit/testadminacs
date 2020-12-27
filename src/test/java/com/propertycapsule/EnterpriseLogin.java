package com.propertycapsule;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EnterpriseLogin extends BaseTest {
    @Test
    public void clickEnterpriceLoginButton() throws InterruptedException {
        pageobjects.EnterpriseLogin  enterpriseLogin = new pageobjects.EnterpriseLogin(driver);
        enterpriseLogin.clickOnEnterPriceButton().click();
        Thread.sleep(20000);
        String currentURL= driver.getCurrentUrl();
        System.out.println("Current URL is " + currentURL);

        Assert.assertEquals(currentURL,prop.getProperty("EnterpriceUrl"));

        String storedURL  = prop.getProperty("EnterpriceUrl");
        System.out.println("Stored URL " + storedURL);
    }
}
