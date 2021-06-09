package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssRegularExpressionDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		// Regular Exression Css Syntax  tagName[Attribute*='value']      input[name*='username']
		
		driver.findElement(By.cssSelector("input[type*='tex']")).sendKeys("kaveri123");
		driver.findElement(By.cssSelector("input[name*='pass']")).sendKeys("kaveri1234");
		driver.findElement(By.cssSelector("input[name*='procee']")).click();
	}
	

}
