package UIElementp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckboxDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
      //  List<WebElement> options=
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).isSelected());
        	System.out.println(	driver.findElements(By.xpath("//input[@type='checkbox']")).size());
        	
        	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        	//System.out.println(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']")).isEnabled());
        	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        	//System.out.println(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']")).isEnabled());
        	System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        /*	if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
        	{
        		System.out.println(it is enable);
        		Assert.assertTrue(true);
        	}
        	else
        	{
        	Assert.assertTrue(false);
        	*/
        	
        	driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
        	
	}

}
