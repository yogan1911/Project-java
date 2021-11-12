package com.selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class absolutepath {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yogan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/selenium-xpath.html");
		WebElement testingTab = driver.findElement(By.xpath("/html/body/div[2]/div/div/h4/b[1]"));
		

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement webTab = driver.findElement(By.xpath("(/html/body/div[2]/div/div/h4[2]/b[1])[3]"));
	

		WebElement perfTest = driver.findElement(By.xpath("(/html/body/div[2]/div/div/h4[3]/b[1])[3]"));
		
		 
		System.out.println("success");
	}

}
