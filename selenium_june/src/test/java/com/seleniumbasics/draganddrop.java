package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();  
		WebDriver driver=new ChromeDriver();
		driver.get("https://jquery.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);	
		
		//scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("/html/body")));
		
		driver.findElement(By.xpath("//div[@class='jqueryui small logo']")).click();
		driver.findElement(By.xpath("//a[text()='Draggable']")).click();
		
		//drag
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		Actions dragy=new Actions(driver);
		dragy.dragAndDropBy(driver.findElement(By.id("draggable")), 100, 200).build().perform();
		
	
	
	
	
	
	
	}

}
