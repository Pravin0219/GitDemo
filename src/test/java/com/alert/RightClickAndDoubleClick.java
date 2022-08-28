package com.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAndDoubleClick {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pravin Singh\\Desktop\\Chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.javatpoint.com/");
      //  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("singh.pravin14@gmail.com");
      //  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Singh@12345");
      //  driver.findElement(By.xpath("//div[text()='Login' and @class='q-text qu-ellipsis qu-whiteSpace--nowrap']")).click();

        driver.findElement(By.xpath("//*[text()='Regex']")).click();

        Actions actions = new Actions(driver);
        Thread.sleep(3000);
        actions.contextClick(driver.findElement(By.xpath("//span[text()='Sahil Sharma']"))).perform();
        //driver.findElement(By.xpath())

        Thread.sleep(5000);
        driver.quit();


    }
}
