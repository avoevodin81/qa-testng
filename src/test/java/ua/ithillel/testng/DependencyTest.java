package ua.ithillel.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {

    @Test()
    public void testVariables() {
        int a = 5;
        int b = 0;
        Assert.assertTrue(a < b);
    }

    @Test(dependsOnMethods = {"testVariables"}, alwaysRun = true)
    public void test2() {
        Assert.assertTrue(true);
    }
}
