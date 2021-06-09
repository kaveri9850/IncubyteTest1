package UIElementp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderUI {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[4]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[3]/div[1]/div[3]/div[1]/div[1]/input[1]")).click();;	
		
			driver.findElement(By.xpath("//a[@value='AIP']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		//	.ui-state-default.ui-state-highlight.ui-state-active
			//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
			////body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[5]/td[3]/span[1]
			driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[5]/td[3]/span[1]")).click();

	}

}
