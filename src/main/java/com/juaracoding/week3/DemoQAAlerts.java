package com.juaracoding.week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoQAAlerts {
    public static void performDemoQACheckAlerts(WebDriver driver) throws InterruptedException {
        String demoQAURL = "https://demo.automationtesting.in/Alerts.html";
        driver.manage().window().maximize();
        driver.get(demoQAURL);

        WebElement clickMeButton = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
        clickMeButton.click();
        Thread.sleep(2000);

        driver.switchTo().alert().accept();
        Thread.sleep(2000);

        WebElement cancelTabLink = driver.findElement(By.xpath("//a[contains(@href, '#CancelTab')]"));
        cancelTabLink.click();
        Thread.sleep(2000);

        WebElement confirmBoxButton = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
        confirmBoxButton.click();
        Thread.sleep(2000);

        driver.switchTo().alert().accept();
        Thread.sleep(2000);

        WebElement textboxTabLink = driver.findElement(By.xpath("//a[contains(@href, '#Textbox')]"));
        textboxTabLink.click();
        Thread.sleep(2000);

        WebElement promptBoxButton = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
        promptBoxButton.click();
        Thread.sleep(2000);

        String promptText = "Ikrar Bagaskara";
        driver.switchTo().alert().sendKeys(promptText);
        driver.switchTo().alert().accept();
        Thread.sleep(6000);

    }
}
