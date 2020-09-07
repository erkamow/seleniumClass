package com.cybertek.tests.day3_ccsSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarmUpTask_ZeroBankVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("http://zero.webappsecurity.com/login.html");
        WebElement zeroBankLinkText = driver.findElement(By.className("brand"));
        String expectedLinkText = "Zero Bank";
        String actualLinkText = zeroBankLinkText.getText();

        if(actualLinkText.equals(expectedLinkText)){
            System.out.println("Link Text verification is PASSED!!!");
        }else {
            System.out.println("Link Text verification is FAILED!!!");
        }

        String expectedInHref = "index.html";
        String actualHrefValue = zeroBankLinkText.getAttribute("href");

        if(actualHrefValue.contains(expectedInHref)){
            System.out.println("Href value verification PASSED!!!");
        }else {
            System.out.println("Href value verification FAILED!!!");
        }
    }
}
