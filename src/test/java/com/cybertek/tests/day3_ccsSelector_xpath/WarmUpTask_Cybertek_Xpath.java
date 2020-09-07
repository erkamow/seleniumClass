package com.cybertek.tests.day3_ccsSelector_xpath;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WarmUpTask_Cybertek_Xpath {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement button2 = driver.findElement(By.xpath("//button[@name='button2']"));
        button2.click();
    }
}
