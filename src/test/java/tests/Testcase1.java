package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Testcase1 {

    @Test(testName = "Firmst testcase")
    public void shouldAnswerWithTrue() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        WebDriver driver = new ChromeDriver(options);
        System.out.println("Test started executing!...........................");
        driver.get("https://www.google.com");
        System.out.println("Test execution completed!...........................");
        driver.get("https://www.google.com");
        assertTrue(true);
    }

    @Test(testName = "Second testcase")
    public void printResultInConsole() {
        System.out.println("===== TEST EXECUTION STARTED =====");
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum of numbers is: " + sum);

        System.out.println("===== TEST EXECUTION COMPLETED =====");

        Assert.assertEquals(sum, 30);
    }
}
