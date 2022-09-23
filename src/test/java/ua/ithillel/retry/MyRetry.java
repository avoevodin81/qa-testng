package ua.ithillel.retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetry implements IRetryAnalyzer {
    private int retryCount = 0;
    public static final int maxRetryCount = 3;

    @Override
    public boolean retry(ITestResult result) {
        boolean isRetry = Boolean.parseBoolean(System.getProperty("isRetry"));

        if (isRetry) {
            if (retryCount < maxRetryCount) {
                retryCount++;
                return true;
            }
        }
        return false;
    }
}
