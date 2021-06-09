package UIElementp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDroplooping {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		int i=1;
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click(); //2 adults
			i++;
			
		}
		
		int j=1;
		
		while(j<5)
		{
			driver.findElement(By.id("hrefIncChd")).click(); 
			j++;
			
		}
		
		int k=1;
		
		while(k<5)
		{
			driver.findElement(By.id("hrefIncInf")).click(); 
			k++;
			
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
