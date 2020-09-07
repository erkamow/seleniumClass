package com.cybertek.tests.Practices;

import com.cybertek.utilites.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Practice1 {

    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");


        driver.get("http://practice.cybertekschool.com/forgot_password");


        WebElement homeLink = driver.findElement(By.cssSelector("a.nav-link"));

        String actualLink = homeLink.getText();

        if(homeLink.isDisplayed()){
            System.out.println("Home link verification PASSED");
        }else{
            System.out.println("Home link verification FAILED");
        }
        System.out.println("===========================");

        WebElement forgotPasswordHeader = driver.findElement(By.xpath("//form[@name='forgot_password']"));

        String actualForgotPasswordHeader = forgotPasswordHeader.getText();

        if(forgotPasswordHeader.isDisplayed()){
            System.out.println("Forgot password header PASSED");
        }else {
            System.out.println("Forgot password header FAILED");
        }
        System.out.println("===============================");

        WebElement e_mailText = driver.findElement(By.xpath("//label[@for='email']"));

        String actualE_mailText = e_mailText.getText();

        if(e_mailText.isDisplayed()){
            System.out.println("E-mail text verification PASSED");
        }else {
            System.out.println("E-mail text verification FAILED");
        }
        System.out.println("=================================");

        WebElement inputBox = driver.findElement(By.xpath("//input[@name='email']"));

        String actualInputBox = inputBox.getText();

        inputBox.sendKeys("test.erkam@domain.com");

        if(inputBox.isDisplayed()){
            System.out.println("input box verification PASSED");
        }else {
            System.out.println("input verification FAILED");
        }
        System.out.println("================================");

        WebElement retrievePasswordButton = driver.findElement(By.cssSelector("button.radius"));

        String actualRetrievePasswordButton = retrievePasswordButton.getText();

        //retrievePasswordButton.click();

        if(retrievePasswordButton.isDisplayed()){
            System.out.println("retrieve button verification PASSED");
        }else {
            System.out.println("retrieve button verification FAILED");
        }
        System.out.println("================================");

        WebElement poweredByCybertekText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        String actualPoweredByCybertekText = poweredByCybertekText.getText();

        if(poweredByCybertekText.isDisplayed()){
            System.out.println("Powered by cybertek TEXT verification PASSED");
        }else {
            System.out.println("Powered by cybertek TEXT verification FAILED");
        }







    }
}
