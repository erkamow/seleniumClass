package com.cybertek.tests.Inro_day5_TestNG_DropDowns;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropDown_Introduction {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void dropDown_test_1()throws InterruptedException{
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown
        //3. Verify “Simple dropdown” default selected value is correct
        Select simpleDropDown = new Select(driver.findElement(By.id("dropdown")));
       String actualSelectionOption = simpleDropDown.getFirstSelectedOption().getText();
       String expectedSelectionOption = "Please select an option";
        Assert.assertEquals(actualSelectionOption,expectedSelectionOption,"select option verification FAILED");

        Thread.sleep(3000);

        simpleDropDown.selectByVisibleText("Option 2");
        //Expected: “Please select an option”
        //4. Verify “State selection” default selected value is correct
        Select stateSelection = new Select(driver.findElement(By.id("state")));
        String actualStateSelection = stateSelection.getFirstSelectedOption().getText();
        String expectedStateSelection = "Select a State";
        Assert.assertEquals(actualStateSelection,expectedStateSelection,"selecting state verification FAILED");

        Thread.sleep(3000);

        stateSelection.selectByVisibleText("Georgia");

        //Expected: “Select a State”
    }
}
