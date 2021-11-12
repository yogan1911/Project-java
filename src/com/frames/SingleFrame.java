package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yogan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
		WebElement singleFrame = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(singleFrame);
		//driver.switchTo().frame("singleframe");

		WebElement yog = driver.findElement(By.xpath("//input[@type='text']"));
		driver.switchTo().frame(yog);
		yog.sendKeys("Yogan");
		System.out.println("success");
		
//		driver.switchTo().defaultContent();
//		
//		WebElement nestedFrame = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
//		nestedFrame.click();
//		WebElement outerFrame = driver
//				.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width: 600px']"));
//		driver.switchTo().frame(outerFrame);
//		WebElement innerFrame = driver
//				.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
//		driver.switchTo().frame(innerFrame);
//		Thread.sleep(2000);
//		WebElement inputBox2 = driver.findElement(By.xpath("//input[@type='text']"));
//		inputBox2.sendKeys("Gandhi");
//		System.out.println("done");
	}
}
