package com.cybertek.tests.day3_ccsSelector_xpath;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WarmUpTask_Amazon_cssSelector {
    public static void main(String[] args) {

        /*

        1. Open Chrome browser
        2. Go to https://www.amazon.com3.
        TC #3: Amazon link number verification
        Enter search term (use cssSelectorto locate search box)
        4. Verify title contains search term
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https:/www.amazon.com");

       // WebElement searchBox = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        WebElement searchBox = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));

        searchBox.sendKeys("wooden spoon"+ Keys.ENTER);

        WebElement findAGift = driver.findElement(By.cssSelector("a.nav-a "));

        findAGift.click();


    }
}
