package com.cybertek.tests.day3_ccsSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WarmUpTask_CybertekLinkVerification {

    public static void main(String[] args) throws InterruptedException{


       // WebDriverManager.chromedriver().setup();
        // WebDriver driver = new ChromeDriver();

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.findElement(By.name("email")).sendKeys("erkamafsin@afsteknik.com"+ Keys.ENTER);
        Thread.sleep(1000);

        String expectedURL = "email_sent";
        String actualURL = driver.getCurrentUrl();


        if(actualURL.contains(expectedURL)){
            System.out.println("URL verification PASSED!!!");
        }else{
            System.out.println("URL verification FAIL!!!");
        }

        WebElement confirmationMessage = driver.findElement(By.name("confirmation_message"));
        String actualText = confirmationMessage.getText();

        if(confirmationMessage.isDisplayed()){
            System.out.println("Header text value verification PASSED");
        }else {
            System.out.println("Header text value verification FAIL");
        }
    }
}
