package com.press3.outbound;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class Outbound
{

	public static void main( String[] args ) throws InterruptedException
    {
        
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Inbound\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();	             
        driver.get("http://web.press3.io");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement email = driver.findElement(By.id("txtName"));
        email.sendKeys("koushikagent@press3.com");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Koushik@1");
        Thread.sleep(1000);
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(1000);
      
        //CRM
        
        driver.findElement(By.id("SideBarToggle3")).click();
       Set<String> allWindowHandles = driver.getWindowHandles();
       String w1= (String) allWindowHandles.toArray()[0];
        String w2= (String) allWindowHandles.toArray()[1];
       driver.switchTo().window(w2);
        Thread.sleep(1000);
        WebElement search = driver.findElement(By.id("txtSearch"));
        search.sendKeys("priya sagar");
        Thread.sleep(1000);
        driver.findElement(By.id("btnSearch")).click();
        Thread.sleep(2000);
        WebElement ele =driver.findElement(By.xpath("//*[@id='callersDetails']//*[@class='btn btn-xs btn-success f_11 btn-outbound-call pull-right']"));
        Thread.sleep(2000);
        ele.click();
        
//        System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\pressThree\\geckodriver.exe");
//        WebDriver driver1= new FirefoxDriver();
//        driver1.get("http://web.press3.io");
//        Thread.sleep(4000);
//        WebElement email1 = driver1.findElement(By.id("txtName"));
//        email1.sendKeys("priyaagent@press3.com");
//        Thread.sleep(2000);
//        WebElement password1 = driver1.findElement(By.id("txtPassword"));
//        password1.sendKeys("Priyanka@1");
//        Thread.sleep(1000);
//        driver1.findElement(By.id("btnLogin")).click();
//        Thread.sleep(1000);
        
        
        
        //AGENT LOGIN
        
//        System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.24.0-win64\\geckodriver.exe");
//        WebDriver driver1 = new FirefoxDriver();
//        driver1.get("web.press3.io");
//        Thread.sleep(3000);
        
        
        //System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\pressThree\\chromedriver.exe");
        
        
        //-----REFERENCE-----
  //      List<WebElement> call = driver.findElements(By.xpath("//*[@id='callersDetails']//*[@class='btn btn-xs btn-success f_11 btn-outbound-call pull-right']"));
  //      Thread.sleep(2000);       
  //     System.out.println(call.size());
  //      for (WebElement sss : call) {
  //      	sss.click();
  //     	 Thread.sleep(4000);
  //		break;		}
  
  //  driver.quit();


		//Call History

//		driver.findElement(By.id("SideBarToggle2")).click();
//		driver.findElement(By.partialLinkText("Call History")).click();
//		Set<String> allWindowHandles = driver.getWindowHandles();
//		String w1= (String) allWindowHandles.toArray()[0];
//		String w2= (String) allWindowHandles.toArray()[1];
//		driver.switchTo().window(w2);
//		Thread.sleep(2000);
//		WebElement search = driver.findElement(By.id("txtSearch"));
//		search.sendKeys("Ais");
//		Thread.sleep(2000);
//		WebElement ele= driver.findElement(By.xpath("//*[@class='col-sm-9 col-md-10']//*[@id='tblCallHistory']//*[@class='btn btn-xs btn-success f_11 btn-outbound-call pull-right']"));
//		Thread.sleep(2000);
//		ele.click();
//		Thread.sleep(5000);
//		driver.quit();
//		
		
    }
}


