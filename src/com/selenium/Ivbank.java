package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ivbank {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yogan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lvbankonline.in/index.html?module=login");
		Thread.sleep(5000);
		WebElement usrname = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		usrname.sendKeys("Yogan");
		WebElement pswd = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pswd.sendKeys("Yogan@123 +");
		WebElement language = driver.findElement(By.xpath("//span[@class='oj-select-chosen']"));
		Select s2 = new Select(language);
		s2.selectByIndex(1);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Yogan\\eclipse-workspace\\SeleniumProject\\Screenshot\\loginpage.png");
		FileUtils.copyFile(source, destination);
		System.out.println("sucess");
	}

}
