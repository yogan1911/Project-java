package com.cssselector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yogan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		WebElement userName = driver.findElement(By.cssSelector("input#email"));
		userName.sendKeys("ygr1911@gmail.com");
		Thread.sleep(3000);
		WebElement pswd = driver.findElement(By.cssSelector("input.inputtext._9npi"));
		pswd.sendKeys("Ygr1911@4353");
		WebElement login = driver.findElement(By.cssSelector("button[name='login']"));
		login.click();
		WebElement prefix = driver.findElement(By.cssSelector("button[name^='log']"));
		String text = prefix.getText();
		System.out.println(text);
		WebElement suffix = driver.findElement(By.cssSelector("button[name$='in']"));
		String text1 = suffix.getText();
		System.out.println(text1);
		WebElement contain = driver.findElement(By.cssSelector("button[name*='og']"));
		String text2 = contain.getText();
		System.out.println(text2);
		System.out.println("Success");
		
		
	}

}
