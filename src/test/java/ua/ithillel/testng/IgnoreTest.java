package ua.ithillel.testng;

import org.testng.annotations.Test;

public class IgnoreTest {

    @Test(enabled = false)
    public void testOne() {
        System.out.println("Test one");
    }

    @Test
    public void testTwo() {
        System.out.println("Test two");
    }
}
