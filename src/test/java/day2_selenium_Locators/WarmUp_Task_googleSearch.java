package day2_selenium_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarmUp_Task_googleSearch {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("apple"+ Keys.ENTER);
       // driver.findElement(By.name("q")).submit();

        String expectedTitle = "Apple";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains("apple")){
            System.out.println("title verification passed!!!");
        }else{
            System.out.println("title verification failed!!!");
        }

    }
}
