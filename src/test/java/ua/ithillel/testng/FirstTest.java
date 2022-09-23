package ua.ithillel.testng;

import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTest {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class");
    }

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("Before Groups");
    }

    public void afterGroups() {
        System.out.println("After Groups");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @Test
    public void testOne() {
        System.out.println("Test One");
        Assert.assertTrue(true);
    }

    @Test
    public void testTwo() {
        System.out.println("Test Two");
    }
}
