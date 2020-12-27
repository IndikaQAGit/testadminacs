package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TourBook {
    private WebDriver driver;
    private By tourBook = By.linkText("Tourbooks");

    public TourBook(WebDriver driver){
        this.driver = driver;
    }

    public WebElement findTourBook() {
        return driver.findElement(tourBook);
    }
}
