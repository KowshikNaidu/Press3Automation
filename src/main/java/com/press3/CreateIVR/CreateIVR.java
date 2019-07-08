package com.press3.CreateIVR;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utility.BrowserFunctions;

@Test
public class CreateIVR extends BrowserFunctions
{
 
	public void CreateIVR() throws InterruptedException 
	{
	
    driver.findElement(By.id("SideBarToggle4")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"SideBarToggle4\"]/ul/li[4]/a/span")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("lblCreateNewIVR")).click();
    Thread.sleep(1000);
    WebElement studioname = driver.findElement(By.id("txtStudioName"));
    studioname.sendKeys("Automated IVR8");
    Thread.sleep(500);
    driver.findElement(By.xpath("//*[@class=\"table no-border\"]//tr[2]//label[2]//input")).click();
    Thread.sleep(1000);
    Select purpose = new Select(driver.findElement(By.id("selStudioPurpose")));
    purpose.selectByVisibleText("Testing");
    Thread.sleep(500);
//    WebElement purposetext = driver.findElement(By.id("txtStudioPurpose"));
//    purposetext.sendKeys("Automation");
//    Thread.sleep(500);
    Select callerid = new Select(driver.findElement(By.id("selCallerIdNumbers")));
    callerid.selectByVisibleText("04023008690");
    Thread.sleep(500);
    driver.findElement(By.id("btnSaveStudioDetails")).click(); 
    
    Set<String> allWindowHandles = driver.getWindowHandles();
    String w1 = (String) allWindowHandles.toArray()[0];
    String w2 = (String) allWindowHandles.toArray()[1]; 
    driver.switchTo().window(w2);
    Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@class=\"ui-widget-content node next-step ui-draggable ui-droppable\"]//tr[3]//td[2]//div[2]")).click();
    Thread.sleep(500);
    driver.findElement(By.id("pl_msg")).click();
    Thread.sleep(1000);
    WebElement upload = driver.findElement(By.xpath("//*[@class=\"module-list\"]//div[1]//input"));
    upload.sendKeys("E:\\Urban Dart Welcome Clip.mp3");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"ivr_popups\"]/div[1]//*[@class=\"btn green module-save\"]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@class=\"ui-widget-content node next-step ui-draggable ui-droppable\"]//tr[3]//td[2]//div[2]")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("ring")).click();
    Thread.sleep(1000);
    Select skillgroup = new Select(driver.findElement(By.id("selSkillGroup_3")));
    skillgroup.selectByVisibleText("feedback");
    Thread.sleep(500);
    Select ringgroup = new Select(driver.findElement(By.id("selRing_3")));
    ringgroup.selectByVisibleText("Circular Call Distribution");
    Thread.sleep(1000);
    WebElement waitclip = driver.findElement(By.xpath("//*[@id=\"ivr_popups\"]/div[2]//*[@class=\"flUpload_11\"]"));
    waitclip.sendKeys("E:\\urban dart wait clip.mp3");
    Thread.sleep(1000);
//    JavascriptExecutor js = (JavascriptExecutor) driver;  
//    js.executeScript("javascript:window.scrollBy(0,500)");
    Thread.sleep(1000);
    WebElement busyclip = driver.findElement(By.xpath("//*[@id=\"ivr_popups\"]/div[2]//*[@class=\"flUpload_11_busy_clip\"]"));
    busyclip.sendKeys("E:\\Urban Dart Busy Clip.mp3");
    Thread.sleep(1000);
    WebElement holdclip = driver.findElement(By.xpath("//*[@id=\"ivr_popups\"]/div[2]//*[@class=\"flUpload_11_hold_clip\"]"));
    holdclip.sendKeys("E:\\urban dart wait clip.mp3");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"ivr_popups\"]/div[2]//*[@class=\"btn green module-save\"]")).click();
    Thread.sleep(1000);
    WebElement targetLocator = driver.findElement(By.xpath("//*[@p_id='3']//td[2][contains(@class,'nodecontent')]//*[@class='nodename']"));
    targetLocator.click();
    WebElement sourceLocator = driver.findElement(By.xpath("//*[@class=\"fa fa-ban\"]"));
    sourceLocator.click();
    
    Thread.sleep(1000);  
    driver.findElement(By.id("save-btn")).click();
    Thread.sleep(500);
    driver.switchTo().alert().accept();
    
   
 	}
	
	
	
	
	public void MenuIVR() throws InterruptedException
	{
		driver.findElement(By.id("SideBarToggle4")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"SideBarToggle4\"]/ul/li[4]/a/span")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("lblCreateNewIVR")).click();
	    Thread.sleep(1000);
	    WebElement studioname1 = driver.findElement(By.id("txtStudioName"));
	    studioname1.sendKeys("Automated IVR0");
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//*[@class=\"table no-border\"]//tr[2]//label[2]//input")).click();
	    Thread.sleep(1000);
	    Select purpose1 = new Select(driver.findElement(By.id("selStudioPurpose")));
	    purpose1.selectByVisibleText("Testing");
	    Thread.sleep(500);	
	    
	    Select callerid1 = new Select(driver.findElement(By.id("selCallerIdNumbers")));
	    callerid1.selectByVisibleText("04023008655");
	    Thread.sleep(500);
	    driver.findElement(By.id("btnSaveStudioDetails")).click(); 
	    
	    Set<String> allWindowHandles = driver.getWindowHandles();
	    String w1 = (String) allWindowHandles.toArray()[0];
	    String w2 = (String) allWindowHandles.toArray()[1]; 
	    driver.switchTo().window(w2);
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@class=\"ui-widget-content node next-step ui-draggable ui-droppable\"]//tr[3]//td[2]//div[2]")).click();
	    Thread.sleep(500);
	    driver.findElement(By.id("pl_msg")).click();
	    Thread.sleep(1000);
	    WebElement upload1 = driver.findElement(By.xpath("//*[@class=\"module-list\"]//div[1]//input"));
	    upload1.sendKeys("E:\\Urban Dart Welcome Clip.mp3");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"ivr_popups\"]/div[1]//*[@class=\"btn green module-save\"]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@class=\"ui-widget-content node next-step ui-draggable ui-droppable\"]//tr[3]//td[2]//div[2]")).click();
	    Thread.sleep(500);
	    driver.findElement(By.id("menu")).click();
	    Thread.sleep(1000);
	    WebElement menuname = driver.findElement(By.name("txtMenuName_3"));
	    menuname.sendKeys("Automated Demo");
	    Thread.sleep(500);
	    WebElement grtclip = driver.findElement(By.xpath("//*[@id='fileupload_div_GttMsg']//input[2]"));
	    grtclip.sendKeys("E:\\AT Menu clip.mp3");
	    Thread.sleep(500);
	    WebElement key = driver.findElement(By.xpath("//*[@class='module-left']//div[3]//*[@class='opt form-control']"));
	    key.sendKeys("1");
	    Thread.sleep(500);
	    WebElement keyvalue = driver.findElement(By.xpath("//*[@class='module-left']//div[3]//*[@class='opt_val form-control']"));
	    keyvalue.sendKeys("Feedback");
	    Thread.sleep(500);
	    WebElement key1 = driver.findElement(By.xpath("//*[@class='module-left']//div[5]//*[@class='opt form-control']"));
	    key1.sendKeys("2");
	    Thread.sleep(500);
	    WebElement keyvalue1 = driver.findElement(By.xpath("//*[@class='module-left']//div[5]//*[@class='opt_val form-control']"));
	    keyvalue1.sendKeys("Complaint");
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//*[@class='module-left']//*[@class='btn btn-default btn-sm addmore font-green']")).click();
	    Thread.sleep(500);
	    WebElement key2 = driver.findElement(By.xpath("//*[@class='module-left']//div[7]//*[@class='opt form-control']"));
	    key2.sendKeys("3");
	    Thread.sleep(500);
	    WebElement keyvalue2 = driver.findElement(By.xpath("//*[@class='module-left']//div[7]//*[@class='opt_val form-control']"));
	    keyvalue2.sendKeys("Enquiry");
	    Thread.sleep(500);
	    driver.findElement(By.xpath("//*[@class='invalid-key module-left']//label[2]//*[@value='text']")).click();
	    Thread.sleep(500);
	    Select got = new Select(driver.findElement(By.xpath("//*[@class='margin-top-15']//*[@class='form-control input-inline']")));
	    got.selectByVisibleText("2");
	    driver.findElement(By.xpath("//*[@class='modal-footer']//*[@class='btn green module-save']")).click();
	    JavascriptExecutor js = (JavascriptExecutor) driver;  
	    js.executeScript("javascript:window.scrollBy(0,500)");
	    Thread.sleep(1000);
	    
	    //menu 1 feedback
	    driver.findElement(By.xpath("//*[@p_id='5']//td[2][contains(@class,'nodecontent')]//*[@class='nodename']")).click();
	    Thread.sleep(500);
	    driver.findElement(By.id("ring")).click();
	    Thread.sleep(1000);
	    Select skillgroup = new Select(driver.findElement(By.xpath("//*[@id='ivr_popups']//*[@class='skillGroupclass form-control']")));
	    skillgroup.selectByVisibleText("feedback");
	    Thread.sleep(500);
	    Select ringgroup = new Select(driver.findElement(By.xpath("//*[@id='ivr_popups']//*[@class='ringstrategy form-control']")));
	    ringgroup.selectByVisibleText("Circular Call Distribution");
	    Thread.sleep(1000);
	    WebElement waitclip = driver.findElement(By.xpath("//*[@id='module_6']//*[@class='modal-body']//*[@class='flUpload_11']"));
	    waitclip.sendKeys("E:\\urban dart wait clip.mp3");
	    Thread.sleep(1000);
	    WebElement busyclip = driver.findElement(By.xpath("//*[@id='module_6']//*[@class='modal-body']//*[@class='flUpload_11_busy_clip']"));
	    busyclip.sendKeys("E:\\Urban Dart Busy Clip.mp3");
	    Thread.sleep(1000);
	    WebElement holdclip = driver.findElement(By.xpath("//*[@id='module_6']//*[@class='modal-body']//*[@class='flUpload_11_hold_clip']"));
	    holdclip.sendKeys("E:\\urban dart wait clip.mp3");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id='module_6']//*[@class='modal-body']//*[@class='btn green module-save']")).click();
	    Thread.sleep(1000);
	    WebElement targetLocator = driver.findElement(By.xpath("//*[@id='12'][@p_id='6']//td[2][contains(@class, 'nodecontent')]//*[@class='nodename']"));
	    targetLocator.click();
	    WebElement sourceLocator = driver.findElement(By.xpath("//*[@class=\"fa fa-ban\"]"));
	    sourceLocator.click();
	    Thread.sleep(1000);
	    
	    //menu 2 Complaint
	    driver.findElement(By.xpath("//*[@p_id='7']//td[2][contains(@class,'nodecontent')]//*[@class='nodename']")).click();
	    driver.findElement(By.id("ring")).click();
	    Thread.sleep(1000);
	    Select skillgroup1 = new Select(driver.findElement(By.id("selSkillGroup_8")));
	    skillgroup1.selectByVisibleText("Complaint");
	    Thread.sleep(500);
	    Select ringgroup1 = new Select(driver.findElement(By.id("selRing_8")));
	    ringgroup1.selectByVisibleText("Circular Call Distribution");
	    Thread.sleep(1000);
	    WebElement waitclip1 = driver.findElement(By.xpath("//*[@id='module_8']//*[@class='modal-body']//*[@class='flUpload_11']"));
	    waitclip1.sendKeys("E:\\urban dart wait clip.mp3");
	    Thread.sleep(1000);
	    WebElement busyclip1 = driver.findElement(By.xpath("//*[@id='module_8']//*[@class='modal-body']//*[@class='flUpload_11_busy_clip']"));
	    busyclip1.sendKeys("E:\\Urban Dart Busy Clip.mp3");
	    Thread.sleep(1000);
	    WebElement holdclip1 = driver.findElement(By.xpath("//*[@id='module_8']//*[@class='modal-body']//*[@class='flUpload_11_hold_clip']"));
	    holdclip1.sendKeys("E:\\urban dart wait clip.mp3");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id='module_8']//*[@class='modal-body']//*[@class='btn green module-save']")).click();
	    Thread.sleep(1000);
	    WebElement targetLocator1 = driver.findElement(By.xpath("//*[@id='13'][@p_id='8']//td[2][contains(@class, 'nodecontent')]//*[@class='nodename']"));
	    targetLocator1.click();
	    WebElement sourceLocator1 = driver.findElement(By.xpath("//*[@class=\"fa fa-ban\"]"));
	    sourceLocator1.click();
	    Thread.sleep(1000);
	    
	    //menu 3 Enquiry
	    driver.findElement(By.xpath("//*[@p_id='9']//td[2][contains(@class,'nodecontent')]//*[@class='nodename']")).click();
	    driver.findElement(By.id("ring")).click();
	    Thread.sleep(1000);
	    Select skillgroup2 = new Select(driver.findElement(By.id("selSkillGroup_10")));
	    skillgroup2.selectByVisibleText("Enquiry");
	    Thread.sleep(500);
	    Select ringgroup2 = new Select(driver.findElement(By.id("selRing_10")));
	    ringgroup2.selectByVisibleText("Circular Call Distribution");
	    Thread.sleep(1000);
	    WebElement waitclip2 = driver.findElement(By.xpath("//*[@id='module_10']//*[@class='modal-body']//*[@class='flUpload_11']"));
	    waitclip2.sendKeys("E:\\urban dart wait clip.mp3");
	    Thread.sleep(1000);
	    WebElement busyclip2 = driver.findElement(By.xpath("//*[@id='module_10']//*[@class='modal-body']//*[@class='flUpload_11_busy_clip']"));
	    busyclip2.sendKeys("E:\\Urban Dart Busy Clip.mp3");
	    Thread.sleep(1000);
	    WebElement holdclip2 = driver.findElement(By.xpath("//*[@id='module_10']//*[@class='modal-body']//*[@class='flUpload_11_hold_clip']"));
	    holdclip2.sendKeys("E:\\urban dart wait clip.mp3");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id='module_10']//*[@class='modal-body']//*[@class='btn green module-save']")).click();
	    Thread.sleep(1000);
	    WebElement targetLocator2 = driver.findElement(By.xpath("//*[@id='14'][@p_id='10']//td[2][contains(@class, 'nodecontent')]//*[@class='nodename']"));
	    targetLocator2.click();
	    WebElement sourceLocator2 = driver.findElement(By.xpath("//*[@class=\"fa fa-ban\"]"));
	    sourceLocator2.click();
	    
	    
	    Thread.sleep(1000);  
	    driver.findElement(By.id("save-btn")).click();
	    Thread.sleep(500);
	    driver.switchTo().alert().accept();
	}
	
	
	
	
	
	@Test
	public void Agntlogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Press3\\Drivers\\chromedriver.exe");
	      driver = new ChromeDriver();	           
	      driver.get("http://qa.press3.com");
	      driver.manage().window().maximize();
	      Thread.sleep(3000);
	      WebElement email = driver.findElement(By.id("txtName"));
	      email.sendKeys("automationagent@press3.com");
	      Thread.sleep(2000);
	      WebElement password = driver.findElement(By.id("txtPassword"));
	      password.sendKeys("Press3@123");
	      Thread.sleep(1000);
	      driver.findElement(By.id("btnLogin")).click();
	      Thread.sleep(5000);
	      
	      
	      RestAssured.baseURI ="http://192.168.75.75:8888/v0.1/";
	      RequestSpecification request = RestAssured.given();
	      
	      Map<String,String> requestParams = new HashMap<String, String>();
	      requestParams.put("source", "Press3"); // Cast
	      requestParams.put("fromNumber", "9666361639");
	      requestParams.put("toNumber", "04023008610");
	      
	   
	      request.body(requestParams.toString());
	      Response response = request.post("Mock/");
	      System.out.println(response.getBody().asString());
	      
	      Map<String,String> requestParams1 = new HashMap<String, String>();
	      requestParams1.put(" ", " "); // Cast
	      request.body(requestParams1.toString());
	      Response response1 = request.post("Mock/");
	      
	}
	
	@Test
	public void OutboundIVR() throws InterruptedException
	{
		 driver.findElement(By.id("SideBarToggle4")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[@id=\"SideBarToggle4\"]/ul/li[4]/a/span")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.id("lblCreateNewIVR")).click();
		    Thread.sleep(1000);
		    WebElement studioname = driver.findElement(By.id("txtStudioName"));
		    studioname.sendKeys("Automated IVR6");
		    Thread.sleep(500);
		    Select purpose = new Select(driver.findElement(By.id("selStudioPurpose")));
		    purpose.selectByVisibleText("Voice Broadcast");
		    Thread.sleep(500);
		    driver.findElement(By.id("btnSaveStudioDetails")).click(); 
		    
		    Set<String> allWindowHandles = driver.getWindowHandles();
		    String w1 = (String) allWindowHandles.toArray()[0];
		    String w2 = (String) allWindowHandles.toArray()[1]; 
		    driver.switchTo().window(w2);
		    
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//*[@class=\"ui-widget-content node next-step ui-draggable ui-droppable\"]//tr[3]//td[2]//div[2]")).click();
		    Thread.sleep(500);
		    driver.findElement(By.id("pl_msg")).click();
		    Thread.sleep(1000);
		    WebElement upload = driver.findElement(By.xpath("//*[@class=\"module-list\"]//div[1]//input"));
		    upload.sendKeys("E:\\Urban Dart Welcome Clip.mp3");
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//*[@id=\"ivr_popups\"]/div[1]//*[@class=\"btn green module-save\"]")).click();
		    Thread.sleep(1000);
		    WebElement sourceLocator = driver.findElement(By.xpath("//*[@id='endflow']"));
		    WebElement targetLocator = driver.findElement(By.xpath("//*[@p_id='2']//td[2][contains(@class, 'nodecontent')]"));
		    Actions action = new Actions(driver);
		    action.dragAndDrop(sourceLocator,targetLocator).build().perform();
	}
	

}