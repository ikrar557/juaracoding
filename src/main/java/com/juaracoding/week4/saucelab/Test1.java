package com.juaracoding.week4.saucelab;

import org.openqa.selenium.WebDriver;

public class Test1 {
    static String sauceDemoURL = "https://www.saucedemo.com/v1";
    public  static void performFetchingPage(WebDriver driver) throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(sauceDemoURL);

        Thread.sleep(1000);

    }
}
