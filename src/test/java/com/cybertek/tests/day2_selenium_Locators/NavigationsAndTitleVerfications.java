package com.cybertek.tests.day2_selenium_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationsAndTitleVerfications {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.findElement(By.linkText("Gmail")).click();
        Thread.sleep(1000);
        driver.navigate().to("https://youtube.com");
        driver.findElement(By.id("search-input")).click();
        driver.switchTo().activeElement().sendKeys("lol espor");
        driver.findElement(By.id("search-icon-legacy")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        driver.navigate().back();

        String expectedInTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedInTitle)){
            System.out.println("title verification Passed!!!");
        }else{
            System.out.println("title verification Failed!!!");
        }
    }
}
