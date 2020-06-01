package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebAPI {

    // All the setup and helper method will be here

    public static WebDriver driver = null;

    public static void setUp(String url) {

        System.setProperty("webdriver.chrome.drive", "BrowserDriver\\Windows\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait((10), TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
    }

    public WebDriver getLocalDriver(String OS, String browserName) {


        if (browserName.equalsIgnoreCase("chrome")) {


        } else if (browserName.equalsIgnoreCase("chrome-option")) {

        } else if (browserName.equalsIgnoreCase("firefox")) {
        }

        return driver;


    }
}
