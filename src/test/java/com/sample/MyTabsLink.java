package com.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MyTabsLink {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Pravin Singh\\Desktop\\Chrome\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com/");
        List<WebElement> link = driver.findElements(By.tagName("a"));
        System.out.println("Total link size of the page: " + link.size());

        for (WebElement element: link){
            System.out.println(element.getAttribute("href"));
            System.out.println(element.getText());
        }
        driver.close();
    }
}
