package ua.ithillel.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrizedTest {

//    @Test
//    @Parameters("name")
//    public void test(String name) {
//        System.out.println(name);
//    }

    @Test
    public void test() {
        String name = System.getProperty("name");
        System.out.println(name);
    }
}
