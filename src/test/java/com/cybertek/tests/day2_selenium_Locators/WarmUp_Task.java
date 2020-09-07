package com.cybertek.tests.day2_selenium_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarmUp_Task {

    public static void main(String[] args) throws InterruptedException{

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }

        driver.navigate().refresh();

        System.out.println("====================================================");

        Thread.sleep(2000);

        driver.get("http://practice.cybertekschool.com");
        String expectedURL = "cybertekschool";
        String actualURL = driver.getCurrentUrl();
        System.out.println("actualURL = " + actualURL);
        if(actualURL.contains(expectedURL)){
            System.out.println("URL verification PASSED");
        }else{
            System.out.println("URL verification FAILED");
        }


        String expectedTitle2 = "Practice";
        String actualTitle2 = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle2);
        if(actualTitle2.contains(expectedTitle2)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }




    }
}
