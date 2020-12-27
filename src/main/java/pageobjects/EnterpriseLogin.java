package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EnterpriseLogin {
    private WebDriver driver;
    private By enterpriseloginbutton = By.cssSelector("a.btn.sign-up-btn.enterprise-admin-btn");

    public  EnterpriseLogin (WebDriver driver){
        this.driver= driver;
    }

    public WebElement clickOnEnterPriceButton()  {
       return driver.findElement(enterpriseloginbutton);
    }
}
