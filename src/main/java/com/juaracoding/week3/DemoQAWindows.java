package com.juaracoding.week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class DemoQAWindows {
    public static void performDemoQACheckWindow(WebDriver driver) throws InterruptedException {
        String demoQAURL = "https://demo.automationtesting.in/Windows.html";
        driver.manage().window().maximize();
        driver.get(demoQAURL);

        // Click on the button to open a new window
        WebElement openWindowButton = driver.findElement(By.xpath("//button[contains(text(), 'Open New Seperate Windows')]"));
        openWindowButton.click();
        Thread.sleep(2000);

        // Get the handles of all open windows
        Set<String> windowHandles = driver.getWindowHandles();

        // Print the number of open windows
        System.out.println("Number of open windows: " + windowHandles.size());

        // Switch to the new window
        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
        }

        // Perform actions in the new window if needed

        // Switch back to the original window
        driver.switchTo().window((String) windowHandles.toArray()[0]);
    }
}
