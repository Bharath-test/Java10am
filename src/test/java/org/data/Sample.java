package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Java10am\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String titlename = driver.getTitle();
		System.out.println("Title : "+ titlename);
		
		
		
		WebElement txtUser = driver.findElement(By.id("email"));
		txtUser.sendKeys("Greens@123");
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("Greens");
		
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
		
		
		
		
		
		
		
		
		
	}

}
