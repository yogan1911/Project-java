package com.selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownmenu {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Yogan\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		WebElement state = driver.findElement(By.xpath("//select[@name='States']"));
		Select s = new Select(state);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		if (s.isMultiple()) {
			s.selectByValue("Texas");
			s.selectByValue("New Jersey");
			s.selectByIndex(3);
			s.selectByVisibleText("Washington");
		}
		System.out.println("******All Options********");
		List<WebElement> options = s.getOptions();
		for (WebElement element : options) {
			System.out.println(element.getText());
		}
		System.out.println("******All Selected Options********");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement allSelected : allSelectedOptions) {
			System.out.println(allSelected.getText());
		}
		System.out.println("******First Selected Options********");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());

		System.out.println("******DeselectAll Option********");
		s.deselectAll();
//		System.out.println("******DeselectByIndex Option********");
//		s.deselectByIndex(3);
//		System.out.println("******DeselectByVisibleText Option********");
//		s.deselectByVisibleText("Washington");
//		System.out.println("******DeselectByValue Option********");
//		s.deselectByValue("New Jersey");
	}
}
