package com.cybertek.tests.Inro_day5_TestNG_DropDowns;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDown_Introduction {

    WebDriver driver;

    @AfterMethod
    public void closing_Webs(){
        driver.close();
    }

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
    @Test
    public void dropDown_test_2()throws InterruptedException{
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown
       // 3. Select Illinois
        Select stateSelection2 = new Select(driver.findElement(By.id("state")));
        stateSelection2.selectByVisibleText("Illinois");
        Thread.sleep(2000);
        // 4. Select Virginia
        stateSelection2.selectByValue("VA");
        Thread.sleep(2000);
       // 5. Select California
        stateSelection2.selectByVisibleText("California");
        String actualSelectedState = stateSelection2.getFirstSelectedOption().getText();
        String expectedSelectedState = "California";
        Assert.assertEquals(actualSelectedState,expectedSelectedState,"last selected option verification failed");
        // 6. Verify final selected option is California.
       // Use all Select options. (visible text, value, index)
    }
    @Test
    public void dropDown_test_3()throws InterruptedException{
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/dropdown
        //3. Select “December 1st, 1921” and verify it is selected.
        Select selectYear = new Select(driver.findElement(By.id("year")));
        selectYear.selectByVisibleText("1921");
        String actualYear = selectYear.getFirstSelectedOption().getText();
        String expectedYear = "1921";
        Assert.assertEquals(actualYear,expectedYear,"year verification failed");
        Thread.sleep(2000);
        //Select year using : visible text
        Select selectMonth = new Select(driver.findElement(By.id("month")));
        selectMonth.selectByValue("11");
        String actualMonth = selectMonth.getFirstSelectedOption().getText();
        String expectedMonth = "December";
        Assert.assertEquals(actualMonth,expectedMonth,"month verification failed");
        Thread.sleep(2000);
        Select selectDay = new Select(driver.findElement(By.id("day")));
        selectDay.selectByValue("1");
        String actualDay = selectDay.getFirstSelectedOption().getText();
        String expectedDay = "1";
        Assert.assertEquals(actualDay,expectedDay,"day verification failed");
        //Select month using : value attribute
        //Select day using : index number
    }
    @Test
    public void multiple_value_select_dropDown(){
        Select multipleSelectDropDown = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
         // creating a list of web elements to store all of the options inside of this dropdown
        List<WebElement> allOptions = multipleSelectDropDown.getOptions();
        for(WebElement eachOption : allOptions){
            eachOption.click();
            // print all selected option
            System.out.println("Selected: "+ eachOption.getText());
            // asserting each option to verify selected or not
            Assert.assertTrue(eachOption.isSelected(),"The option: "+eachOption.getText()+"is not selected!");
        }
        multipleSelectDropDown.deselectAll();
        for(WebElement eachOption2 : allOptions){
           // Assert.assertTrue(!eachOption2.isSelected());
            Assert.assertFalse(eachOption2.isSelected());
        }

    }
    @Test
    public void dropDown_test_5(){
        //3. Click to non-select dropdown
        WebElement webSiteDropDown = driver.findElement(By.xpath("//div[@class='dropdown']/a"));
        webSiteDropDown.click();
        //4. Select Facebook from dropdown
        WebElement facebookLink = driver.findElement(By.xpath("//a[.='Facebook']"));
        facebookLink.click();
        //5. Verify title is “Facebook - Log In or Sign Up”
        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook - Log In or Sign Up";
        Assert.assertEquals(actualTitle,expectedTitle,"title verification failed!");

    }

}
