package Synchronizationp;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitDemo {

	public static void main(String[] args) 
	{
		//FluentWait: finds the web element repeatedly at regular intervals of time until the timeout or till the object gets found
		//unlike WebDriver wait we need to build customized wait methods based on condition
		//Both WebDriverWait and fluentWait classes implements Wait interface
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Dynamic Loading')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Example 1: Element on page that is hidden')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();
		
		
		Wait<WebDriver> w=new FluentWait<WebDriver> (driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		WebElement e=w.until(new Function<WebDriver,WebElement>() {
			public WebElement apply(WebDriver driver) {
				if(driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]")).isDisplayed())
				{
					return driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]"));
				}
				else
				{
					return null;
				}
			}
		});
		//h4[contains(text(),'Hello World!')]
		System.out.println(driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]")).getText());
		
		

		
		
	}


}
