package com.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtab {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yogan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://info.sice.indiana.edu/~hrosenba/Demo/Demo4.html");
		List<WebElement> allData = driver.findElements(By.xpath("(//table/tbody/tr/td)[4]"));
		System.out.println("------All Data------");
		for (WebElement data : allData) {
			System.out.println(data.getText());
		}
		
		
		
		
	}

}
