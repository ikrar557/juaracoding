package com.juaracoding.week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoQACheckBox {
    public static void performDemoQACheckBox(WebDriver driver) throws InterruptedException {
        String demoQAURL = "https://demo.automationtesting.in/Register.html";
        driver.manage().window().maximize();
        driver.get(demoQAURL);

        WebElement testCheckBox = driver.findElement(By.id("checkbox1"));

        testCheckBox.click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        testCheckBox.click();

        Thread.sleep(3000);
    }
}
