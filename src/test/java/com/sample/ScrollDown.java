package com.sample;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Pravin Singh\\Desktop\\Chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver   = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        driver.manage().window().maximize();
        driver.get("https://google.com/");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("selenium");
        Thread.sleep(2000);
        element.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,5000)");
        Thread.sleep(5000);

        driver.close();

    }
}
