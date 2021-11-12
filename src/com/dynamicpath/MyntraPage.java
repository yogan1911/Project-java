package com.dynamicpath;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraPage {

	private static final Object Moda = null;

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yogan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/men-tshirts");
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement tshirt = driver
				.findElement(By.xpath("(//span[@class='product-strike'])[15]//preceding-sibling::span"));
		js.executeScript("arguments[0].scrollIntoView();", tshirt);
		Thread.sleep(30000);
		WebElement offerPrice = driver
				.findElement(By.xpath("(//span[@class='product-discountedPrice'])[15]//following-sibling::span"));
		js.executeScript("arguments[0].scrollIntoView();", offerPrice);

		WebElement parent = driver
				.findElement(By.xpath("(//span[@class='product-discountedPrice'])[15]//parent::span"));
		js.executeScript("arguments[0].scrollIntoView();", parent);
		WebElement textValue = driver.findElement(By.xpath("(//h4[text()='Striped Round Neck T-shirt'])[2]"));
		String text = textValue.getText();
		System.out.println(text);
		WebElement preced = driver.findElement(By
				.xpath("(//span[@class='product-strike'])[15]//preceding::div[@class='product-imageSliderContainer']"));
		js.executeScript("arguments[0].scrollIntoView();", preced);
		WebElement ancestor = driver
				.findElement(By.xpath("(//span[@class='product-discountedPrice'])[15]//ancestor::span"));
		js.executeScript("arguments[0].scrollIntoView();", ancestor);
		WebElement child = driver.findElement(By.xpath("(//div[@class='product-productMetaInfo'])[15]//child::h3"));
		js.executeScript("arguments[0].scrollIntoView();", child);
		WebElement following = driver.findElement(By.xpath("(//div[@class='product-productMetaInfo'])[15]//following::h4"));
		js.executeScript("arguments[0].scrollIntoView();", following);

		WebElement textValue1 = driver.findElement(By.xpath("(//span[text()='1099'])[2]"));
		String text1 = textValue1.getText();
		System.out.println("Actual Price:" + String.valueOf(text1));
		WebElement textValue2 = driver.findElement(By.xpath("//span[text()='659']"));
		String text2 = textValue2.getText();
		System.out.println("Discounted Price:" + String.valueOf(text2));
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Yogan\\eclipse-workspace\\SeleniumProject\\Screenshot\\myntra.png");
		FileUtils.copyFile(source, destination);
		System.out.println("Success");

	}

}
