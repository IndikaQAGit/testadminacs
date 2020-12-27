package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DealMaker {
    private WebDriver driver;
    private By dealMakerSignupButton = By.linkText("Deal Maker Signup/Login");
    private By popUpCloseButton = By.cssSelector("i.material-icons.close");

    public DealMaker(WebDriver driver){
        this.driver = driver;
    }

    public WebElement clickOnDealMakerSignButton(){
        return driver.findElement(dealMakerSignupButton);
    }

    public WebElement ClickOnCloseButton(){
        return driver.findElement(popUpCloseButton);
    }
}
