package Assignment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class AssignmentI {
	
	WebDriver driver;

	/*@Test
	public void CheckSearchBox() throws InterruptedException //testcase3
	{
		
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("cam");
	Thread.sleep(2000);
	List<WebElement> options=driver.findElements(By.xpath("//ul[@id='ebay-autocomplete'] /li"));
	
	for(WebElement option:options)
	{
		if(option.getText().equalsIgnoreCase("camera"))
				{
			option.click();
			break;
				}
		
	}
	
	driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
	  
	
	driver.navigate().back();
	//driver.findElement(By.xpath("//input[@id='gh-ac']")).clear();
		
	}
	
  @Test
  public void XCheckSerachCategory() {  //TestCase 4
		WebElement staticDropdown=driver.findElement(By.id("gh-cat"));
		System.out.println("All Categories Printed:"+staticDropdown.getText());
		
		Select dropdown=new Select(staticDropdown);
		dropdown.selectByIndex(3);
		
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
	
		driver.navigate().back();
      //	dropdown.selectByValue("0");
  }
  @Test
  public void MyeBayLink() throws InterruptedException //TestCase2
  {
	  Actions act=new Actions(driver);

	  act.moveToElement(driver.findElement(By.xpath("//header/div[@id='gh-top']/ul[@id='gh-eb']/li[@id='gh-eb-My']/div[1]/a[1]"))).build().perform();
	  List <WebElement> mybayoption=driver.findElements(By.xpath("//div[@class='gh-submenu gh-eb-o']/ul[1]//li"));
	  System.out.println("MyeBayLink Option Avialble:");
	  for(WebElement w:mybayoption)
	  {
		  System.out.println(w.getText());
	  }

	   Random r=new Random();
	   int x=r.nextInt(mybayoption.size());
	   Thread.sleep(2000);
	   mybayoption.get(x).click();
		 System.out.println("x value is"+x); 
		 System.out.println(driver.getTitle());
		 driver.navigate().back();
  }
  @Test
  public void MoveMouse() throws InterruptedException
  {
	   Actions act=new Actions(driver);
	   act.moveToElement( driver.findElement(By.partialLinkText("Fashion"))).build().perform();
	 
	   List<WebElement> suboptions=driver.findElements(By.xpath("//body/div[@id='mainContent']/div[1]/ul[1]/li[4]/div[2]/div[1]/nav/ul/li/a"));
	   System.out.println("Fashion all option Printed:");
	   for(WebElement w1:suboptions)
		   {
			   System.out.println(w1.getText());
		   }
		
		   Random r=new Random();
		   int x=r.nextInt(suboptions.size());
		   Thread.sleep(2000);
			 suboptions.get(x).click();
			 System.out.println("x value is"+x); 
			 System.out.println(driver.getTitle());
			 driver.navigate().back();
  }
 
	@Test
	public void ValidateAdvanceSerach() throws InterruptedException //TestCase5
	{
		driver.findElement(By.partialLinkText("Advanced")).click();
		driver.findElement(By.cssSelector("input#_nkw")).sendKeys("Watch");
		driver.findElement(By.cssSelector("input#_ex_kw")).sendKeys("Camera");
		
		WebElement staticDropdown=driver.findElement(By.xpath("//select[@id='e1-1']"));
		System.out.println("All Categories Printed:"+staticDropdown.getText());
		Thread.sleep(2000);
		Select dropdown=new Select(staticDropdown);
	//	dropdown.selectByValue('Jewelry & Watches');
		dropdown.selectByValue("281");
		List <WebElement> w=driver.findElements(By.xpath("//fieldset[@class='checkbox-set'][1]/label"));
		
		for(WebElement e:w)
		{
			System.out.println(e.getText());
			e.click();
			System.out.println(e.isEnabled());
		}
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.PAGE_DOWN);
		
		driver.findElement(By.cssSelector("input#_mPrRngCbx")).click();
		driver.findElement(By.xpath("//input[@class='price'][1]")).sendKeys("1000");
		driver.findElement(By.xpath("//input[@class='price'][2]")).sendKeys("10000");
		
List <WebElement> w1=driver.findElements(By.xpath("//fieldset[@class='checkbox-set'][2]/label"));

		for(WebElement e1:w1)
		{
			System.out.println(e1.getText());
			
			System.out.println(e1.isEnabled());
		}
		driver.findElement(By.xpath("//fieldset[@class='checkbox-set'][2]/label[2]")).click();
		driver.findElement(By.xpath("//input[@id='LH_ItemConditionNew']")).click();
		
          driver.findElement(By.cssSelector("input#LH_NOB")).click();
          driver.findElement(By.cssSelector("input#LH_MIL")).click();
		driver.findElement(By.cssSelector("input#LH_Time")).click();
		
		WebElement dropdown1=driver.findElement(By.xpath("//select[@name='_ftrt']"));
		Thread.sleep(2000);
		Select drop1=new Select(dropdown1);
		drop1.selectByIndex(2);
		
	WebElement d=driver.findElement(By.xpath("//select[@name='_ftrv']"));
		
		Select dr=new Select(d);
		dr.selectByValue("168");
		
		
		//driver.findElement(By.name("_sabdlo")).sendKeys("");
		//driver.findElement(By.name("_sabdhi")).sendKeys("");
		driver.findElement(By.cssSelector("input#LH_FS")).click();
		driver.findElement(By.xpath("//input[@id='LH_LocatedInRadio']")).click();
		driver.findElement(By.id("_salicSelect")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> options=driver.findElements(By.xpath("//select[@id='_salicSelect']"));
		
		for(WebElement option:options)
		{
			if(option.getText().equalsIgnoreCase("India"))
					{
				option.click();
				break;
					}
		}
		//WebElement s=driver.findElement(By.id("_salicSelect"));
		//Thread.sleep(2000);
		//Select i=new Select(s);
		//i.selectByValue("95");
		driver.findElement(By.xpath("//input[@id='_fss']")).click();
		WebElement s1=driver.findElement(By.xpath("//select[@id='LH_IPP']"));
		Thread.sleep(2000);
		Select i2=new Select(s1);
		i2.selectByValue("200");
		driver.findElement(By.id("searchBtnLowerLnk")).click();
		//driver.findElement(By.xpath("//input[@id='gh-ac']")).clear();
		
	} */
		
	@Test
	public void AddCart() throws InterruptedException//Testcase6
	{
		Thread.sleep(2000);
	//driver.findElement(By.tagName("svg")).click();
		driver.findElement(By.xpath("//header/div[@id='gh-top']/ul[@id='gh-eb']/li[@id='gh-minicart-hover']/div[1]/a[1]/*[1]")).click();
	driver.findElement(By.partialLinkText("Start shopping")).click();
	}
	@Test
	public void ValidatewTestCase7() throws InterruptedException//testcase 7
	{
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("Camera");
		driver.findElement(By.id("gh-btn")).click();
		driver.findElement(By.xpath("//div[@class='btn__icon']")).click();
		
		driver.findElement(By.xpath("//body[1]/div[4]/div[5]/div[1]/div[1]/div[1]/div[3]/div[2]/span[1]/span[1]/span[1]/div[1]/button[1]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[6]/div[1]/div[2]/div[3]/form[1]/div[1]/fieldset[3]/div[1]/label[1]/input[1]")).click();
		driver.findElement(By.id("e1-3")).click();
		driver.navigate().back();
		
	}
	
  @BeforeTest
  public void beforeTest() {
	  String WebBrowserName;
		System.out.println("Enter Browser Name U want to open");//TestCase1
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Google"+"\n"+"2.FireBox");
		WebBrowserName=sc.next();
		System.out.println("U r choice is:"+WebBrowserName);
		switch(WebBrowserName)
		{
		case "Google":   System.setProperty("webdriver.chrome.driver","E:\\Chrome90\\chromedriver_win32\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		  driver=new ChromeDriver();
		 
		    break;
			
		
		case "FireBox": System.setProperty("webdriver.gecko.driver","D:\\fireboxDriver\\geckodriver-v0.29.1-win32\\geckodriver.exe");
		  driver=new FirefoxDriver();
		  
			break;
		}
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
