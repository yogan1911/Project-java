package com.selenium;
//URL : https://www.redbus.in/
//NOTE: NOTE: Enter from and to textbox.

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedbusLog {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yogan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
		WebElement from = driver.findElement(By.id("src"));
		from.sendKeys("Chennai");
		WebElement to = driver.findElement(By.id("dest"));
		to.sendKeys("Theni");
		WebElement textValue = driver.findElement(By.xpath("//div[contains(text(),'Why Book')]"));
		String text = textValue.getText();
		System.out.println(text);
		
	}

}
