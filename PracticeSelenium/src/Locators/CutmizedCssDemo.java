package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CutmizedCssDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		// css custimized
		//Syntax  tagName[attribute='value'] input[type='text']
		// tagname#id
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("kaverio");
		driver.findElement(By.cssSelector("input[name='passwd']")).sendKeys("87960");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		System.out.println(driver.getTitle());
	}

}