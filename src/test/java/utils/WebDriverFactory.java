package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



    /*

     WebDriver Factory;
Is used to create WebDriver(Selenium) object and return it
It will open the browser and maximize
   method;
    getDriver(String browserType)
     it will check browser type and returns object
     if browserType is firefox :
     it will set up particular browser and return new FirefoxDriver




 */
    public class WebDriverFactory {
        public static WebDriver getDriver(String browserType) {
            if (browserType.equalsIgnoreCase("chrome")) {
                WebDriverManager.chromedriver().setup();

                return new ChromeDriver();

            } else if (browserType.equalsIgnoreCase("firefox")) {

                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();

            } else {
                System.out.println("Invalid Browser = " + browserType);
                return null;
            }
        }


    }






























