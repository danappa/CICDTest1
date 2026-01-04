package tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AppTest {

    @Test
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
}
