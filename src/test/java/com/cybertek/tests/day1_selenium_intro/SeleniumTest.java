package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {

        // 1- Setup the driver.
        WebDriverManager.chromedriver().setup();
        // --> we just call this method from WebDriverManager dependencies to set up our browser driver.
        // System.setProperty("driver.type","path to the driver");


        // 2- Create instance of the driver
        WebDriver driver = new ChromeDriver();
        // #1 opens and empty web browser.
        // #2 creating the instance of the driver that we are going to be using.
        // #3 every browser that is opened is cache free browser.Browsing history is not saved.


        // 3- Use the driver instance to test selenium.
        driver.get("https://www.google.com");
        // #1 accepts a string as a parameter.
        // #2 gets the web page link tat we give using selenium webDriver.



        System.out.println("the title of the page is: "+driver.getTitle());
        String actualTitle = driver.getTitle();
        System.out.println("ACTUAL TITLE STRING: "+actualTitle);
        // driver.getTitle();
        // - this method does not accept any parameters.
        // - returns the title of the page as a string.
        // - returns type: String.


        String actualURL = driver.getCurrentUrl();
        System.out.println("actualURL = " + actualURL);
        // it brings you current webPage URL as https://www.google.com.



         // basic Navigations contains : back(),forward(),refresh(), and to() methods.
        Thread.sleep(2000);
        // compiler will stop executing when its arrive this codes line.

        driver.navigate().back();
        // this method will take the page to the previous page.

        Thread.sleep(3000);

        driver.navigate().forward();
        // this method will get you to the next  new  webPage.

        Thread.sleep(3000);

        driver.navigate().refresh();
        // this method will refresh your webPage.

        driver.navigate().to("https://www.facebook.com");
        // this method will get you to the next webPage which already given.

        Thread.sleep(2000);

        driver.navigate().refresh();

        Thread.sleep(1000);

        driver.navigate().to("https://www.youtube.com");

        Thread.sleep(2000);

        driver.navigate().refresh();

        driver.manage().window();
        // this method will help us to manage our webPage window.

        driver.manage().window().maximize();
        // this method will help you to maximize your window.

        driver.close();
        // just closes the last opened window.



    }
}
