package TestNG_RerunFailed;

import org.testng.annotations.Test;

public class SampleTest {

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void testMethod() {
        System.out.println("Running test…");
        assert false; // failing intentionally
    }
}