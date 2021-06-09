package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorlocator {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("kaveri123");
		driver.findElement(By.cssSelector("input[name='pw']")).sendKeys("kavr123");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
	}

}

