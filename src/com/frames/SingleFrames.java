package com.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleFrames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yogan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
		WebElement findElement2 = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(findElement2);
		WebElement findElement = driver.findElement(By.xpath("//input[@type='text']"));
		findElement.sendKeys("Yogan");
		System.out.println("done");
		driver.switchTo().defaultContent();
		WebElement Button2 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		Button2.click();
		WebElement outframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width: 600px']"));
		driver.switchTo().frame(outframe);
		System.out.println("ok");
		Thread.sleep(2000);
		WebElement inframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(inframe);
		System.out.println("inframe ok");
		Thread.sleep(2000);
		WebElement textbox2 = driver.findElement(By.xpath("//input[@type='text']"));
		textbox2.sendKeys("Gandhi");

	}

}
