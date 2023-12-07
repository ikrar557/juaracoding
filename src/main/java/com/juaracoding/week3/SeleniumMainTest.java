package com.juaracoding.week3;

import org.openqa.selenium.WebDriver;

import static com.juaracoding.week3.DemoQAAlerts.performDemoQACheckAlerts;
import static com.juaracoding.week3.DemoQACheckBox.performDemoQACheckBox;
import static com.juaracoding.week3.DemoQATextBox.performDemoQATextBox;
import static com.juaracoding.week3.DemoQAWindows.performDemoQACheckWindow;
import static com.juaracoding.week3.DemoQAiFrame.performDemoQACheckiFrame;
import static com.juaracoding.week3.JuaraCodingSignUpForm.performSignUp;
import static com.juaracoding.week3.SeleniumConnectBrowsers.*;

public class SeleniumMainTest {
    public static void main(String[] args) throws InterruptedException {
//      Setup Brave Browser
        WebDriver braveDriver = setupBraveDriver();
        performDemoQACheckiFrame(braveDriver);
        braveDriver.quit();

        // Setup Chrome
        WebDriver chromeDriver = setupChromeDriver();
//        SeleniumFetchingPage.performFetchingPage(chromeDriver);
//        performSignUp(chromeDriver);
//        performDemoQATextBox(chromeDriver);
//        performDemoQACheckBox(chromeDriver);
//        performDemoQACheckAlerts(chromeDriver);
//        performDemoQACheckiFrame(chromeDriver);
        performDemoQACheckWindow(chromeDriver);
        chromeDriver.quit();

        // Setup Firefox
        WebDriver firefoxDriver = setupFirefoxDriver();
//        SeleniumFetchingPage.performFetchingPage(firefoxDriver);
//        performSignUp(firefoxDriver);
//        performDemoQATextBox(firefoxDriver);
//        performDemoQACheckAlerts(firefoxDriver);
//        performDemoQACheckiFrame(firefoxDriver);
        performDemoQACheckWindow(firefoxDriver);

        firefoxDriver.quit();

        // Setup Edge
        WebDriver edgeDriver = setupEdgeDriver();
//        SeleniumFetchingPage.performFetchingPage(edgeDriver);
//        performSignUp(edgeDriver);
//        performDemoQATextBox(edgeDriver);
//        performDemoQACheckAlerts(edgeDriver);
//        performDemoQACheckiFrame(edgeDriver);
        performDemoQACheckWindow(edgeDriver);
        edgeDriver.quit();
    }
}
