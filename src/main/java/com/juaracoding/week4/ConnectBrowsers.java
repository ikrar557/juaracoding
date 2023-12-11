package com.juaracoding.week4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ConnectBrowsers {

    public static WebDriver setupChromeDriver() {
        String chromePathDriver = "C:\\My Tools\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePathDriver);

        ChromeOptions chromeOptions = new ChromeOptions();
        return new ChromeDriver(chromeOptions);
    }

}
