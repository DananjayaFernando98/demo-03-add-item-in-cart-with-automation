package com.amazontest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazontesting {

	public static void main(String[] args) throws InterruptedException {
		
		//configuration webdriver
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Webdriver\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//goto amazon web
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);
		
		//maximize size
		driver.manage().window().maximize();
		
		//get title
		System.out.println(driver.getTitle());
		
		//goto search section and put keyword and search 
		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		searchBox.sendKeys("iphone xr");
		//searchBox.submit();
		
		//search submit
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		//choose one item
		driver.findElement(By.linkText("iPhone 13, 128GB, Product Red - Unlocked (Renewed Premium)")).click();
		
		
		//select quantity
		Select quantity = new Select(driver.findElement(By.id("quantity")));
		quantity.selectByValue("2");
		
		//add to cart
		driver.findElement(By.id("add-to-cart-button")).click();
		
		//goto cart
		driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
		//**** goto Filter section ******
		
		//select free delivery by amazon
		//driver.findElement(By.xpath("//*[@id=\"p_n_free_shipping_eligible/6966031051\"]/span/a/div/label/i")).click();
		
		//Brand choose Spigen
		//driver.findElement(By.xpath("//*[@id=\"p_89/Spigen\"]/span/a/div/label/i")).click();
		//driver.close();
		
		
		

	}

}
