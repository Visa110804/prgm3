package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class webpagetest {

    private static WebDriver driver;

    @BeforeTest
    public void openBrowser() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(10000); // Wait for browser to load
        driver.get("https://jssateb.ac.in/");
    }

    @Test
    public void checkTitle() {
        String title = driver.getTitle();
        assertTrue(title.contains("JSS"), "Title should contain 'JSS'");
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
