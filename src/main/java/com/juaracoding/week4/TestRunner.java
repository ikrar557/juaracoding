package com.juaracoding.week4;

import org.openqa.selenium.WebDriver;


import static com.juaracoding.week4.ConnectBrowsers.setupChromeDriver;
import static com.juaracoding.week4.saucelab.Test1.performFetchingPage;


public class TestRunner {

    public static void main(String[] args) throws InterruptedException {
        WebDriver chromeDriver = setupChromeDriver();
        performFetchingPage(chromeDriver);
        chromeDriver.quit();
    }

}
