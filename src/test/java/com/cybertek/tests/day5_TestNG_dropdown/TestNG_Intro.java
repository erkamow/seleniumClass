package com.cybertek.tests.day5_TestNG_dropdown;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {
    @BeforeClass
    public void setUpClass(){
        System.out.println("Before class is Running");
    }
    @AfterClass
    public void tearDownClass(){
        System.out.println("After class is Running");
    }
    @BeforeMethod
    public void setUpMethod(){
        System.out.println("Before method is Running");
    }
    @AfterMethod
    public void tearDown(){
        System.out.println("After method is Running");
    }
    @Test
    public void test1(){
        System.out.println("Test1 is Running");
    }
    @Test
    public void test2(){
        System.out.println("Test2 is Running");
    }
    @Test
    public void Test3(){
        String str1 = "Erkam";
        String str2 = "Erkam";
        String str3 = "kubra";

        Assert.assertTrue(str1.equals(str2));
        Assert.assertTrue(str2.equals(str3),"str2 is not equal to str3");

        Assert.assertEquals(str1,str2,"str1 is equals to str2");
    }
}
