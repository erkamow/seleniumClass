package com.cybertek.tests.Inro_day5_TestNG_DropDowns;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Practice {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
         driver = WebDriverFactory.getDriver("chrome");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
    }

   @Test
   public void agoogle_Title_verification(){
       //go to google


       //verify title is google
       String expectedTitle = "Google";
       String actualTitle = driver.getTitle();

       Assert.assertEquals(expectedTitle,actualTitle);

   }

   @Test
    public void bgoogleSearchTitleVerification(){
        // go to google --> this part will be taken care of in the beforeMethod
       // search apple
       WebElement searchBox = driver.findElement(By.name("q"));
       searchBox.sendKeys("apple"+ Keys.ENTER);
       // make sure title contains apple
       String expectedTitle = "apple";
       String actualTitle = driver.getTitle();

       Assert.assertTrue(actualTitle.contains(expectedTitle),"Title does not contain search value");
   }

   @AfterMethod
    public void tearDownMethod()throws InterruptedException{
        Thread.sleep(3000);
        driver.close();
   }
}
