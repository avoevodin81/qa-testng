package ua.ithillel.testng;

import org.testng.annotations.Test;

public class PriorityTest {

    @Test(priority = 1)
    public void testOne() {
        System.out.println("one");
    }

    @Test(priority = 2)
    public void testTwo() {
        System.out.println("two");
    }

    @Test(priority = 3)
    public void testThree() {
        System.out.println("three");
    }
}
