package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_scroll {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yogan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
//		js.executeScript("window.scrollBy(0,3000)");
//		Thread.sleep(5000);
//		js.executeScript("window.scrollBy(0,-1500)");
//		System.out.println("Scroll Success");
//		
		
		WebElement twitter = driver.findElement(By.xpath("//a[text()='Twitter']"));
		js.executeScript("arguments[0].scrollIntoView();", twitter);
		Thread.sleep(3000);
		WebElement celebrate = driver.findElement(By.xpath("//h2[@class='a-color-base headline truncate-2line']"));
		js.executeScript("arguments[0].scrollIntoView();", celebrate);
		System.out.println("success");
		  
	}

}
