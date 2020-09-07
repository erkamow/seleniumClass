package com.cybertek.tests.day2_selenium_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarmUpTask_Etsy_com {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.etsy.com");
        driver.findElement(By.name("search_query")).sendKeys("wooden spoon"+ Keys.ENTER);

        String expectedTitle = "Wooden spoon";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title verification PASSED!!!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }
    }
}
