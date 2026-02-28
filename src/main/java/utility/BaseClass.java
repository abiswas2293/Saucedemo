package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseClass {
    public static WebDriver driver;

    @BeforeTest
    public void openBrowser() throws InterruptedException, MalformedURLException {

        // Allow overriding the hub URL and browser via system properties
        // Example: -Dselenium.hub=http://192.168.1.14:4444 -Dbrowser=chrome

        //This is code is to run tests using selenium grid on firefox browser
        String huburl = System.getProperty("selenium.hub", "http://192.168.1.14:4444").trim();
        FirefoxOptions options = new FirefoxOptions();
        RemoteWebDriver remote = new RemoteWebDriver(new URL(huburl), options);
        driver = remote;

    /*    //This is run locally on firefox browser
        WebDriver driver = new FirefoxDriver();
        WebDriverManager.firefoxdriver().setup();*/

        /* String browser = System.getProperty("browser", "firefox").trim().toLowerCase();

        // Choose options based on requested browser
        RemoteWebDriver remote;
        if ("chrome".equals(browser)) {
            ChromeOptions options = new ChromeOptions();
            // add any chrome-specific options here
            remote = new RemoteWebDriver(new URL(huburl), options);
        } else {
            FirefoxOptions options = new FirefoxOptions();
            // add any firefox-specific options here
            remote = new RemoteWebDriver(new URL(huburl), options);
        }*/


        // Assign to the shared static driver


        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
    }

    /**
     * Waits for the element located by the given XPath to be visible.
     * Keeps the original method name/signature so existing calls don't break.
     *//*
    public void fluentwait(String xpath) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }
*/
    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }
}
