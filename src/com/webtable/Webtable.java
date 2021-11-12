package com.webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yogan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		List<WebElement> allData = driver.findElements(By.xpath("//table/tbody/tr/td"));
		System.out.println("------All Data------");
		for (WebElement data : allData) {
			System.out.println(data.getText());
		}
		List<WebElement> rowData = driver.findElements(By.xpath("//table/tbody/tr[2]/td"));
		System.out.println("------Row Data------");
		for (WebElement data1 : rowData) {
			System.out.println(data1.getText());
		}
		List<WebElement> columnData = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		System.out.println("-------Column Data------------");
		for (WebElement data2 : columnData) {
			System.out.println(data2.getText());
		}
	WebElement particularData = driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]"));
	System.out.println("-------------Particular data--------------");
	System.out.println(particularData.getText());
	}
	
}
