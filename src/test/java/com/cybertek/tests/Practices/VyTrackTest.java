package com.cybertek.tests.Practices;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class VyTrackTest {


    public static class Assignment_Vytrack_US2_AC3 extends RuntimeException {
        public static void main(String[] args) throws InterruptedException {
            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.get("https://qa2.vytrack.com/user/login");
            driver.findElement(By.cssSelector("input#prependedInput")).sendKeys("user181");
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("input#prependedInput2")).sendKeys("UserUser123");
            Thread.sleep(1000);
            driver.findElement(By.cssSelector("button#_submit")).click();
            Thread.sleep(1000);
            driver.get("https://qa2.vytrack.com/entity/Extend_Entity_VehicleCosts");
            boolean VehicleCostHeadingdisplayed = driver.findElement(By.cssSelector("h1.oro-subtitle")).isDisplayed();
            if (VehicleCostHeadingdisplayed) {
                System.out.println("Able to access Vehicle Cost Page");
            } else {
                System.out.println("Unable to access Vehicle Cost Page");
            }
            WebElement dropdownForEdit = driver.findElement(By.xpath("/*[@id=\"grid-custom-entity-grid-1512186783\"]/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/a"));
            String actualDropDownForEdit = dropdownForEdit.getText();
            WebElement EditButton = driver.findElement(By.xpath("/*[@id=\"grid-custom-entity-grid-291773444\"]/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[4]/div/div/ul/li/ul/li[2]/a/i"));
            try {
                if (dropdownForEdit.isDisplayed()) {
                    System.out.println("Drop down option for Edit button is displayed");
                } else {
                    System.out.println("Drop down option for Edit button is NOT displayed");
                }
            } catch (NoSuchElementException e) {
                actualDropDownForEdit = e.getMessage();
                System.out.println("Unable to locate edit button automatically");
                System.out.println("Manually unable to edit - receiving error message");
            } finally {
                System.out.println("Unable to locate edit button automatically");
                System.out.println("Manually unable to edit - receiving error message");
            }


            Actions action = new Actions(driver);
            action.clickAndHold(EditButton);


        }
    }
}
