package com.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandles {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriverManager.chromedriver().setup();  
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		driver.findElement(By.name("q")).click();
		WebElement roshan=driver.findElement(By.name("q"));
		roshan.sendKeys("mobiles");
		
		roshan.sendKeys(Keys.DOWN);
		
		
		
		

	}

}
