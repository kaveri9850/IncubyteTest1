package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassnameDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("kaveri@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123456");
		//driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("123456");
		//driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.linkText("Forgotten password?")).click();
	}

}
