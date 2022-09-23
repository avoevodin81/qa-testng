package ua.ithillel.testng;

import org.testng.annotations.Test;

public class ExceptionTest {

    @Test(expectedExceptions = ArithmeticException.class)
    public void testArithmeticsException() {
        int a = 2;
        int b = 0;
        int result = a / b;
    }
}
