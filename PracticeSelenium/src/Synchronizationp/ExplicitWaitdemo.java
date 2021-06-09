package Synchronizationp;

import java.util.Arrays;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitdemo {
	//Explicit wait is not declare globally ,explicit wait to traget specific element 
	//Explicit wait comes in to 2 type 1.WebDriverWait and 2 is Fulent wait
//	pros: wait is applied only at targeted Elemnts. so no performance issues
	//con: more code
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	Thread.sleep(2000);
	String[]  items= {"Cucumber","Brocolli"," Cauliflower","Beetroot","Carrot","Tomato ","Beans " };
	additem(driver,items);
	driver.findElement(By.cssSelector("img[alt='Cart']")).click();
	driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	//explicit wait
	
	WebDriverWait w=new WebDriverWait(driver,5);
	w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
	driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");//cssselector: input.promoCode
	
	
	driver.findElement(By.className("promoBtn")).click(); //cssselector: button.promBtn
	//explicit wait
	
	w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
	System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	driver.close();
	
	
	}
	
	
	
	
	public static void additem(WebDriver driver,String[] items)
	{
		int j=0;
	List <WebElement>  product=driver.findElements(By.cssSelector("h4.product-name"));
	for(int i=0;i<product.size();i++)
	{
		//String name=product.get(i).getText();
		String[] name=product.get(i).getText().split("-");
		String formatedname=name[0].trim();
		//format it to get actual vegetable name
		//check whether name u extracted is present in or not
		//convert array in array list for easy to search
		List<String> al=Arrays.asList(items);
		
		if(al.contains(formatedname))
		//if(name.contains("Cucumber"))
		{
			  j++;
			//click on add to cart 
			//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(); 
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			//break;
			if(j==items.length)
			{
			break;
			}
		}
		}

	}

}
