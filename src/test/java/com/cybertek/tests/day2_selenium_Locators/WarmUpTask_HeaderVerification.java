package com.cybertek.tests.day2_selenium_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarmUpTask_HeaderVerification {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://zero.webappsecurity.com/login.html");

        String expectedText = "Log in to ZeroBank";
        String actualText = driver.findElement(By.tagName("h3")).getText();
        if(actualText.equals(expectedText)){
            System.out.println("Text verification PASSED!!!");
        }else{
            System.out.println("Text verification FAILED!!!");
        }

        driver.findElement(By.id("user_login")).sendKeys("erkamow");
        Thread.sleep(1000);
        driver.findElement(By.id("user_password")).sendKeys("14535454"+ Keys.ENTER);

        Thread.sleep(3000);

        driver.close();



    }
}
