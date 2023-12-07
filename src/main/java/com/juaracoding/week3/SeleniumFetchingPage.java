package com.juaracoding.week3;


import org.openqa.selenium.WebDriver;

public class SeleniumFetchingPage {
    public  static void performFetchingPage(WebDriver driver) throws InterruptedException {
        String juaraCodingURL = "https://juaracoding.com";
        String juaraCodingContact = "https://juaracoding.com/contact";
        String juaraCodingEvent = "https://event.juaracoding.co.id";

//      Get the google
        driver.manage().window().maximize();
        driver.get(juaraCodingURL);


//      For give time between
        Thread.sleep(2000);

//      Navigate to sub domain doodle.goole
        driver.navigate().to(juaraCodingContact);
        Thread.sleep(1000);

//      Navigating backward in browser history
        driver.navigate().back();
        Thread.sleep(1000);

//      Navigating forward in browser history
        driver.navigate().forward();
        Thread.sleep(1000);

//      Refresh the page
        driver.navigate().refresh();

        Thread.sleep(1000);

        driver.get(juaraCodingEvent);

        Thread.sleep(1000);
    }
}
