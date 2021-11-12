package com.selenium;

import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class absolute {

	public static void main(String[] args) throws IOException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yogan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/selenium-xpath.html");
		Actions ac = new Actions(driver);
		WebElement testingTab = driver.findElement(By.xpath("/html/body/div[2]/div/div/h4/b[1]"));
		ac.contextClick(testingTab).build().perform();
		Robot r3 = new Robot();
		r3.keyPress(KeyEvent.VK_DOWN);
		r3.keyRelease(KeyEvent.VK_DOWN);
		r3.keyPress(KeyEvent.VK_ENTER);
		r3.keyRelease(KeyEvent.VK_ENTER);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement webTab = driver.findElement(By.xpath("(/html/body/div[2]/div/div/h4[2]/b[1])[3]"));
		ac.contextClick(webTab).build().perform();
		Robot r4 = new Robot();
		r4.keyPress(KeyEvent.VK_DOWN);
		r4.keyRelease(KeyEvent.VK_DOWN);
		r4.keyPress(KeyEvent.VK_ENTER);
		r4.keyRelease(KeyEvent.VK_ENTER);

		WebElement perfTest = driver.findElement(By.xpath("(/html/body/div[2]/div/div/h4[3]/b[1])[3]"));
		ac.contextClick(perfTest).build().perform();
		Robot r2 = new Robot();
		r2.keyPress(KeyEvent.VK_DOWN);
		r2.keyRelease(KeyEvent.VK_DOWN);
		r2.keyPress(KeyEvent.VK_ENTER);
		r2.keyRelease(KeyEvent.VK_ENTER);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Yogan\\eclipse-workspace\\SeleniumProject\\Screenshot\\absolute.png");
		FileUtils.copyFile(source, destination);
		System.out.println("success");

	}

}
