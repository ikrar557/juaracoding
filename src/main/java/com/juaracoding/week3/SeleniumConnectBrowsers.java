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


    public static WebDriver setupChromeDriver() {
        String chromePath = "C:\\Users\\Ikrar\\Browser Automated Testing\\chrome-win64\\chrome.exe";
        System.setProperty("webdriver.chrome.bin", chromePath);

        String chromePathDriver = "C:\\Users\\Ikrar\\Browser Automated Testing\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromePathDriver);

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary(chromePath);
        return new ChromeDriver(chromeOptions);
    }

    public static WebDriver setupBraveDriver() {
        String bravePath = "C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe";
        System.setProperty("webdriver.chrome.bin", bravePath);

        String chromeDriverPath = "C:\\Users\\Ikrar\\Browser Automated Testing\\chromedriver-win64\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary(bravePath);

        return new ChromeDriver(chromeOptions);
    }

    public static WebDriver setupFirefoxDriver() {
        String firefoxPath = "C:\\Users\\Ikrar\\Browser Automated Testing\\Firefox Developer Edition\\firefox.exe";
        String firefoxPathDriver = "C:\\Users\\Ikrar\\Browser Automated Testing\\geckodriver-v0.33.0-win64\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver", firefoxPathDriver);

        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setBinary(firefoxPath);
        return new FirefoxDriver(firefoxOptions);
    }

    public static WebDriver setupEdgeDriver() {
        String edgePathDriver = "C:\\Users\\Ikrar\\Browser Automated Testing\\edgedriver_win64\\msedgedriver.exe";
        System.setProperty("webdriver.edge.driver", edgePathDriver);

        EdgeOptions edgeOptions = new EdgeOptions();
        return new EdgeDriver(edgeOptions);
    }
}
