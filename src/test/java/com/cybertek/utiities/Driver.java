package com.cybertek.utiities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
    public class Driver {

        private Driver(){}
        private static WebDriver driver;
        public static WebDriver getDriver(){

            if (driver == null){
               String browser = ConfigurationReader.getProperty("browser");

               if (browser.equals("chrome")) {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();

                } else if (browser.equals("firefox")) {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();

                } else if (browser.equals("remote-chrome")) {
                   try {
                       // ChromeOptions chromeOptions = new ChromeOptions();
                       DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                       desiredCapabilities.setBrowserName("chrome");
                       URL gridUrl = new URL("http://18.207.174.100:4444/wd/hub");
                       driver = new RemoteWebDriver(gridUrl, desiredCapabilities);
                   } catch (Exception e){
                       e.printStackTrace();
                   }
               }
            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            return driver;
        }

        public static void closeDriver(){
            if (driver != null ){
                driver.quit();
                driver = null;
            }
        }

    }


