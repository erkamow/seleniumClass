package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    /*
    Task: new method creation
    method name: getDriver
    static method
    accepts string argument: browserType --> will determine what browser opens
    return type: WebDriver
     */

    public static WebDriver getDriver(String browserName) {

        if (browserName.equalsIgnoreCase("Chrome")) {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();


        }else if  (browserName.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else {
            System.out.println("Given browser does not exist. Driver = null!");
            return null;
        }

    }
}


