package testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BasePage {
    public WebDriver driver;
    public Properties prop;

    public WebDriver intialiseDriver() throws IOException {
        prop = new Properties();// invoke the property file
        ClassLoader classLoader = getClass().getClassLoader();
        FileInputStream file = new FileInputStream(classLoader.getResource("configuration.properties.").getPath());//path of created prop file
        prop.load(file);//to load the propfile
        String BrowserName = prop.getProperty("Browser");
        System.out.println("Browser from property file is loaded");
        System.out.println(BrowserName);
        System.out.println("Browser from property file has been loaded.");
        if (BrowserName.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", prop.getProperty("chromedriverpath"));
            driver = new ChromeDriver();
        }

        if(BrowserName.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver",prop.getProperty("firefoxdriverpath"));
            driver= new FirefoxDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}
