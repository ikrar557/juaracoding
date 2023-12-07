package com.juaracoding.week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoQAiFrame {
    public static void performDemoQACheckiFrame(WebDriver driver) throws InterruptedException {
        String demoQAURL = "https://demo.automationtesting.in/Frames.html";
        driver.manage().window().maximize();
        driver.get(demoQAURL);

        driver.switchTo().frame(0);

        WebElement inputField = driver.findElement(By.xpath("//input[@type='text']"));
        inputField.sendKeys("Ikrar");

        driver.switchTo().defaultContent();

        WebElement multipleFramesLink = driver.findElement(By.xpath("//a[contains(@href, '#Multiple')]"));
        multipleFramesLink.click();
        Thread.sleep(2000);

        driver.switchTo().frame(1);
        driver.switchTo().frame(0);

        WebElement nestedInputField = driver.findElement(By.xpath("//input[@type='text']"));
        nestedInputField.sendKeys("Nested Frame Ikrar");

        driver.switchTo().defaultContent();
        Thread.sleep(3500);
    }
}
