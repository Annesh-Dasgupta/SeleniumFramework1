package com.annesh.Drivers;

import com.annesh.Utils.Propertyreader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.Locale;

public class DriverManager {
    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        DriverManager.driver = driver;
    }

    public static void init() {
        String browser = Propertyreader.readkey("browser");
            if(driver == null) {
                switch (browser) {
                    case "Chrome":
                        ChromeOptions chromeOptions = new ChromeOptions();
                        chromeOptions.addArguments("-start-maximize");
                        chromeOptions.addArguments("-incognito");
                        driver = new ChromeDriver(chromeOptions);
                        break;
                    case "Edge":
                        EdgeOptions edgeOptions = new EdgeOptions();
                        edgeOptions.addArguments("-start-maximize");
                        edgeOptions.addArguments("-incognito");
                        driver = new EdgeDriver(edgeOptions);
                        break;
                    case "Firefox":
                        FirefoxOptions firefoxOptions = new FirefoxOptions();
                        firefoxOptions.addArguments("-start-maximize");
                        driver = new FirefoxDriver(firefoxOptions);
                        break;
                    default:
                        System.out.println("No broswer found");

                }
            }
    }
    public static void down(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
        
    }


}
