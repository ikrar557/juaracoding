package com.juaracoding.week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SeleniumConnectBrowsers {
    public static void main(String[] args) throws InterruptedException {
        // Setup Chrome
        WebDriver chromeDriver = setupChromeDriver();
        performGoogleSearch(chromeDriver, "Selenium WebDriver");
        chromeDriver.quit();

        // Setup Firefox
        WebDriver firefoxDriver = setupFirefoxDriver();
        performGoogleSearch(firefoxDriver, "Selenium WebDriver");
        firefoxDriver.quit();

        // Setup Edge
        WebDriver edgeDriver = setupEdgeDriver();
        performGoogleSearch(edgeDriver, "Selenium WebDriver");
        edgeDriver.quit();
    }

    private static WebDriver setupChromeDriver() {
        String chromePath = "C:\\Users\\Ikrar\\Browser Automated Testing\\chrome-win64\\chrome.exe";
        System.setProperty("webdriver.chrome.bin", chromePath);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ikrar\\Browser Automated Testing\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary(chromePath);
        return new ChromeDriver(chromeOptions);
    }

    private static WebDriver setupFirefoxDriver() {
        String firefoxPath = "C:\\Users\\Ikrar\\Browser Automated Testing\\Firefox Developer Edition\\firefox.exe";
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ikrar\\Browser Automated Testing\\geckodriver-v0.33.0-win64\\geckodriver.exe");
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setBinary(firefoxPath);
        return new FirefoxDriver(firefoxOptions);
    }

    private static WebDriver setupEdgeDriver() {
        String edgePath = "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe";
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Ikrar\\Browser Automated Testing\\edgedriver_win64\\msedgedriver.exe");
        EdgeOptions edgeOptions = new EdgeOptions();
        return new EdgeDriver(edgeOptions);
    }

    private static void performGoogleSearch(WebDriver driver, String searchQuery) throws InterruptedException {
        String googleUrl = "http://www.google.com";
        driver.get(googleUrl);
        driver.manage().window().maximize();
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(searchQuery);
        searchBox.submit();
        Thread.sleep(3000);
    }
}
