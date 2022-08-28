package com.library;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class Utility {

    public static void captureScreenshot(WebDriver driver, String screenshotName) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;

        File source= ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("./Screenshot/" + screenshotName + ".png"));
    }
}
