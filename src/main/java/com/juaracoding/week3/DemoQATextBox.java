package com.juaracoding.week3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoQATextBox {
    public  static void performDemoQATextBox(WebDriver driver) throws InterruptedException {
//        JavascriptExecutor js = (JavascriptExecutor) driver;

        String demoQAURL = "http://demoqa.com/text-box";

        driver.manage().window().maximize();
        driver.get(demoQAURL);

        WebElement userNameInput = driver.findElement(By.id("userName"));
        WebElement userEmailInput = driver.findElement(By.id("userEmail"));
        WebElement currentAddressInput = driver.findElement(By.id("currentAddress"));
        WebElement permanentAddressInput = driver.findElement(By.id("permanentAddress"));

//        js.executeScript("window.scrollBy(0, 300)");
        Thread.sleep(1000);
        userNameInput.sendKeys("Ikrar Bagaskara");

        Thread.sleep(1000);
        userEmailInput.sendKeys("ikrarb95@gmail.com");

        Thread.sleep(1000);
        currentAddressInput.sendKeys("Kiringan, Ponggok, Polanharjo");

        Thread.sleep(1000);
        permanentAddressInput.sendKeys("Kiringan, Ponggok, Polanharjo");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.submit();

    }
}
