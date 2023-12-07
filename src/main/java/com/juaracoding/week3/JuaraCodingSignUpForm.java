package com.juaracoding.week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JuaraCodingSignUpForm {
    public  static void performSignUp(WebDriver driver) throws InterruptedException {

//      initialize the page
        String juaraCodingSignUp = "https://event.juaracoding.co.id/login/signup.php";
        driver.get(juaraCodingSignUp);

//      initialize web element
        WebElement usernameInput = driver.findElement(By.name("username"));
        WebElement passwordInput = driver.findElement(By.name("password"));
        WebElement firstNameInput = driver.findElement(By.id("id_firstname"));
        WebElement emailInput = driver.findElement(By.name("email"));
        WebElement email2Input = driver.findElement(By.name("email2"));
        WebElement lastNameInput = driver.findElement(By.name("lastname"));
        WebElement cityInput = driver.findElement(By.name("city"));
        WebElement countryInput = driver.findElement(By.name("country"));
        WebElement lastStudyInput = driver.findElement(By.name("profile_field_PendidikanTerakhir"));
        WebElement customPhoneInput = driver.findElement(By.name("custom_phone1"));
        WebElement customInstitutionInput = driver.findElement(By.name("custom_institution"));
        WebElement customDepartmentInput = driver.findElement(By.name("custom_department"));
        WebElement customAddressInput = driver.findElement(By.name("custom_address"));

            Thread.sleep(1000);
            usernameInput.sendKeys("ikrar557");

            Thread.sleep(1000);
            passwordInput.sendKeys("PASSWORD!23#");

            Thread.sleep(1000);
            firstNameInput.sendKeys("Ikrar");

//            Thread.sleep(1000);
//            emailInput.sendKeys("Ikrar");
//
//            Thread.sleep(1000);
//            email2Input.sendKeys("Ikrar");
//
//            Thread.sleep(1000);
//            lastNameInput.sendKeys("Ikrar");
//
//            Thread.sleep(1000);
//            cityInput.sendKeys("Ikrar");
//
//            Thread.sleep(1000);
//            countryInput.sendKeys("Ikrar");
//
//            Thread.sleep(1000);
//            lastStudyInput.sendKeys("Ikrar");
//
//            Thread.sleep(1000);
//            customPhoneInput.sendKeys("Ikrar");
//
//            Thread.sleep(1000);
//            customInstitutionInput.sendKeys("Ikrar");
//
//            Thread.sleep(1000);
//            customDepartmentInput.sendKeys("Ikrar");
//
//            Thread.sleep(1000);
//            customAddressInput.sendKeys("Ikrar");
    }
}
