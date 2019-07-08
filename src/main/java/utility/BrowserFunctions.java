package utility;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BrowserFunctions {
	public WebDriver driver;

	@BeforeTest
	    public void beforeTestMethod() throws Exception
	    {
	    System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Press3\\Drivers\\chromedriver.exe");
	      driver = new ChromeDriver();	           
	      driver.get("http://qa.press3.com/");
	      driver.manage().window().maximize();
	      Thread.sleep(3000);
	      WebElement email = driver.findElement(By.id("txtName"));
	      email.sendKeys("koushikm@press3.com");
	      Thread.sleep(2000);
	      WebElement password = driver.findElement(By.id("txtPassword"));
	      password.sendKeys("Koushik@1");
	      Thread.sleep(1000);
	      driver.findElement(By.id("btnLogin")).click();
	      Thread.sleep(1000);
	      
	      
	    }
	//@AfterTest
//	public void AfterTestMethod() throws Exception
//	{
//		driver.findElement(By.xpath("//*[@id=\"ctl01\"]/div[3]/div/div[3]/ul/li/a")).sendKeys("Log Out");
//	    Thread.sleep(1000);
//	    driver.findElement(By.xpath("//*[@id=\"logout_modal\"]")).click();
//	    Thread.sleep(1000);
//	    driver.findElement(By.xpath("//*[@id=\"myModal\"]/div[2]/div/div[3]/input[1]")).click();
//	    Thread.sleep(1000);
//	    driver.quit();	
//}
	}