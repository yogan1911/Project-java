package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_alert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yogan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");

		// --------simple Alert---------
		WebElement simpleAlert = driver.findElement(By.xpath("(//button[contains(text(),'click the')])[1]"));
		simpleAlert.click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();

//--------confirm Alert---------
		WebElement alertWithOK = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		alertWithOK.click();
		WebElement button2 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		button2.click();
		driver.switchTo().alert().dismiss();

//--------Prompt Alert---------
		WebElement alertWithText = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		alertWithText.click();
		WebElement button3 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		button3.click();
		Alert promptAlert = driver.switchTo().alert();
		String alertText = promptAlert.getText();
		System.out.println(alertText);
		promptAlert.sendKeys("Yogan");
		promptAlert.accept();
	}
}
