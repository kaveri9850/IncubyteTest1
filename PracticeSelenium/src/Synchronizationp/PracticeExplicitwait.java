package Synchronizationp;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeExplicitwait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","E:\\Chrome90\\chromedriver_win32\\chromedriver.exe");
		WebDriver   driver=new ChromeDriver();
		/*   driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");
		   driver.findElement(By.linkText("Click to load get data via Ajax!")).click();
		   WebDriverWait w=new WebDriverWait(driver,3);
		   w.until(ExpectedConditions.elementToBeClickable(By.id("results")));
		  System.out.println(driver.findElement(By.id("results")).getText());
		   driver.close();*/
		driver.get("http://the-internet.herokuapp.com/");
		//driver.findElement(By.cssSelector(".body")).sendKeys(Keys.DOWN);
		/*driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> win=driver.getWindowHandles();
		Iterator <String> it=win.iterator();
		String parent= it.next();
		String child=it.next();
		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']//h3")).getText());
		driver.close();
		driver.switchTo().window(parent);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']//h3")).getText());*/
		driver.findElement(By.linkText("Nested Frames")).click();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		
		System.out.println(driver.findElement(By.id("content")).getText());
		
		
		
		
		
		   
		
		   
		  
		   
		   
		   
		   

	}

}
