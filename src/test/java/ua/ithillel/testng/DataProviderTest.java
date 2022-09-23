package ua.ithillel.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ua.ithillel.data.DataProviders;

public class DataProviderTest {

    @DataProvider
    public Object[][] createData() {
        return new Object[][]{
                {"Andrii", 36},
                {"Alex", 37},
        };
    }

    @Test(dataProvider = "createData")
    public void testData(String name, int age) {
        System.out.println(name + " " + age);
    }

    @Test(dataProviderClass = DataProviders.class, dataProvider = "myDataProvider")
    public void test(String s, int i) {
        System.out.println(s + i);
    }
}
