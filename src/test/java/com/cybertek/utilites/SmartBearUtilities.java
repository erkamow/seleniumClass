package com.cybertek.utilites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SmartBearUtilities {
    //Create a method called loginToSmartBear
    // This method simply logs in to SmartBear when you call it.
    // Accepts WebDriver type as parameter

    public static void loginToSmartBear(WebDriver driver){
        //3. Enter username: “Tester”

        WebElement usernameBox = driver.findElement(By.xpath("//input[@type='text']"));
        usernameBox.sendKeys("Tester");
        //4. Enter password: “test”
        WebElement passwordBox = driver.findElement(By.id("ctl00_MainContent_password"));
        passwordBox.sendKeys("test");
        //5. Click to Login button
        WebElement clickButton = driver.findElement(By.id("ctl00_MainContent_login_button"));
        clickButton.click();
    }
}
