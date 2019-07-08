package com.press3.createAgent;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import utility.BrowserFunctions;

public class CreateAgent extends BrowserFunctions
{
	static ExtentTest test;
	static ExtentReports report;
	static ExtentReports extent;
   @Test
	public void CreateAgent() throws InterruptedException
	{
	   
        driver.findElement(By.id("SideBarToggle4")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"SideBarToggle4\"]/ul/li[3]/a/span")).click();
        Thread.sleep(2000);
        
        //Skill & Skill Group
        driver.findElement(By.xpath("//*[@id=\"ctl01\"]/div[7]/div[1]/div[1]/h4/a/i")).click();
        Thread.sleep(1000);
        WebElement Skill = driver.findElement(By.id("txt1"));
        Skill.sendKeys("AutomationSkill1");
        Thread.sleep(1000);
        WebElement Description = driver.findElement(By.id("txtarea1"));
        Description.sendKeys("This skill was created by automation script");
        Thread.sleep(1000);
        driver.findElement(By.id("create")).click();
        Thread.sleep(500);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"ctl01\"]/div[7]/div[1]/div[1]/h4/a/i")).click();
        Thread.sleep(1000);
        WebElement Skill1 = driver.findElement(By.id("txt1"));
        Skill1.sendKeys("AutomationSkill2");
        Thread.sleep(1000);
        WebElement Description1 = driver.findElement(By.id("txtarea1"));
        Description1.sendKeys("This skill was created by automation script");
        Thread.sleep(1000);
        driver.findElement(By.id("create")).click();
        Thread.sleep(500);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@skillname='AutomationSkill2']//*[contains(@id,'delete_')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("delete")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='graphs-panel']//*[@class='btn btn-sm btn-success btn-circle pull-right creategroup']")).click();
        Thread.sleep(1000);
        WebElement skillgroup = driver.findElement(By.id("txt2"));
        skillgroup.sendKeys("AutomationGroup");
        Thread.sleep(1000);
        WebElement checkbox = driver.findElement(By.xpath("//*[@skillids=\"199\"]"));
        checkbox.click();
        Thread.sleep(1000);
        WebElement description2 = driver.findElement(By.id("txtarea2"));
        description2.sendKeys("This group was created by automation script");
        Thread.sleep(1000);      
        driver.findElement(By.id("create-group")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("create-group")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        
       //Create Agent
        //driver.findElement(By.xpath("//*[@id=\"ctl01\"]/div[7]/div[7]/div[1]/div/button")).click();
        JSONArray jsonArray=JsonData.getJsonData();
        	for(int i=0;i<jsonArray.size();i++) {
        	
        	JSONObject json=(JSONObject)jsonArray.get(i);
        	driver.findElement(By.xpath("//*[@class='graphs-panel']//*[@class='btn btn-sm btn-success btn-circle pull-right redirectpage']")).click();
            Thread.sleep(2000);
        	WebElement Displayname = driver.findElement(By.id("txtFullName"));
            Displayname.sendKeys((String)json.get("displayName"));
            WebElement Firstname = driver.findElement(By.id("txtFirstName"));
            Firstname.sendKeys((String)json.get("FirstName"));
            WebElement Lastname = driver.findElement(By.id("txtLastName"));
            Lastname.sendKeys((String)json.get("LastName"));
            WebElement Mobile = driver.findElement(By.id("txtMobile"));
            Mobile.sendKeys((String)json.get("mobile"));
            WebElement Loginid = driver.findElement(By.id("txtAgentEmail"));
            Loginid.sendKeys((String)json.get("email"));
            WebElement agentpassword = driver.findElement(By.id("txtAgentPassword"));
            agentpassword.sendKeys((String)json.get("password"));
            Thread.sleep(1000);
            Select Designation= new Select(driver.findElement(By.id("ddlDesignation")));
            Designation.selectByVisibleText("Agent");
            Thread.sleep(1000);
            Select DeviceType= new Select(driver.findElement(By.id("ddlDeviceType")));
            DeviceType.selectByVisibleText("PSTN");
            Select ProfileStatus= new Select(driver.findElement(By.id("ddlProfileStatus")));
            ProfileStatus.selectByVisibleText("Active");
            driver.findElement(By.xpath("//*[@id=\"spnSkills\"]/i")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("skill151")).click();
            Thread.sleep(1000);
            driver.findElement(By.id("skill199")).click();
            Thread.sleep(1000);
            driver.findElement(By.id("btnSaveSkills")).click();
            Select OutboundAccess = new Select(driver.findElement(By.id("ddloutBoundType")));
            OutboundAccess.selectByVisibleText("National");
            Select LoginReq = new Select(driver.findElement(By.id("ddlLoginType")));
            LoginReq.selectByVisibleText("Yes");
            Thread.sleep(1000);
            driver.findElement(By.id("divReportingMangers")).click();
            driver.findElement(By.xpath("//*[@id=\"divReportingMangers\"]/div/div/span/div/ul/li[14]/a/label/input")).click();
            Thread.sleep(1000);
            driver.findElement(By.id("divReportingSupervisors")).click();
            driver.findElement(By.xpath("//*[@id=\"divReportingSupervisors\"]/div/div/span/div/ul/li[4]/a/label/input")).click();
            Thread.sleep(1000);
            driver.findElement(By.id("btnSave")).click();
            Thread.sleep(1000);
            driver.switchTo().alert().accept();
            Thread.sleep(2000); 
            
        	}
	}
          
   @Test
   public void AgentLogin() throws InterruptedException
   {
           
	   System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Press3\\Drivers\\chromedriver.exe");
	      driver = new ChromeDriver();	           
	      driver.get("http://web.press3.io");
	      driver.manage().window().maximize();
	      Thread.sleep(3000);
	      WebElement email = driver.findElement(By.id("txtName"));
	      email.sendKeys("koushik@press3.com");
	      Thread.sleep(2000);
	      WebElement password = driver.findElement(By.id("txtPassword"));
	      password.sendKeys("Press3@123");
	      Thread.sleep(1000);
	      driver.findElement(By.id("btnLogin")).click();
	      Thread.sleep(1000);
	      driver.findElement(By.xpath("//*[@id=\"ctl01\"]/div[3]/div/div[3]/ul/li/a")).sendKeys("My Profile");
		  Thread.sleep(1000);
	      driver.findElement(By.xpath("//*[@id='ctl01']/div[3]/div/div[3]/ul/li/ul/li[1]/a")).click();
          Thread.sleep(1000);  
   }
   
   // TIME SLOT
   
     @Test       
   	public void TimeSlot() throws InterruptedException
   	{
   		driver.findElement(By.id("SideBarToggle4")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"SideBarToggle4\"]/ul/li[3]/a/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("add-new-time-slot")).click();
        Thread.sleep(1000);
        WebElement name = driver.findElement(By.id("txt-time-slot-name"));
        name.sendKeys("Automated Time Slot");
        
      //monday
        driver.findElement(By.xpath("//*[@class='module-list-time']//tr//*[@name='monday']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@class='module-list-time']//*[@name='monday']//td[3]//*[@class='input-small timepicker-input mini from form-control']")).click();
        Thread.sleep(1000);
        WebElement frommondayhourtime = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-hour']"));
        Thread.sleep(500);
        frommondayhourtime.clear();
        frommondayhourtime.sendKeys("10");
        WebElement frommondayminutetime = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-minute']"));
        Thread.sleep(500);
        frommondayminutetime.clear();
        frommondayminutetime.sendKeys("00");
        WebElement frommeridian = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-meridian']"));
        Thread.sleep(500);
        frommeridian.clear();
        frommeridian.sendKeys("AM");
        driver.findElement(By.xpath("//*[@class='module-list-time']//*[@name='monday']//td[5]//*[@class='input-small timepicker-input mini to form-control']")).click();
        Thread.sleep(1000);
        WebElement tomondayhourtime = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-hour']"));
        Thread.sleep(500);
        tomondayhourtime.clear();
        tomondayhourtime.sendKeys("07");
        WebElement tomondayminutetime = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-minute']"));
        Thread.sleep(500);
        tomondayminutetime.clear();
        tomondayminutetime.sendKeys("00");
        WebElement tomeridian = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-meridian']"));
        Thread.sleep(500);
        tomeridian.clear();
        tomeridian.sendKeys("PM");
        
      //tuesday
//        driver.findElement(By.xpath("//*[@class='module-list-time']//tr//*[@name='tuesday']")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@class='module-list-time']//*[@name='tuesday']//td[3]//*[@class='input-small timepicker-input mini from form-control']")).click();
//        Thread.sleep(1000);
//        WebElement fromtuesdayhourtime = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-hour']"));
//        Thread.sleep(500);
//        fromtuesdayhourtime.clear();
//        fromtuesdayhourtime.sendKeys("10");
//        WebElement fromtuesdayminutetime = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-minute']"));
//        Thread.sleep(500);
//        fromtuesdayminutetime.clear();
//        fromtuesdayminutetime.sendKeys("00");
//        WebElement tuefrommeridian = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-meridian']"));
//        Thread.sleep(500);
//        tuefrommeridian.clear();
//        tuefrommeridian.sendKeys("AM");
//        driver.findElement(By.xpath("//*[@class='module-list-time']//*[@name='tuesday']//td[5]//*[@class='input-small timepicker-input mini to form-control']")).click();
//        Thread.sleep(500);
//        WebElement totuesdayhourtime = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-hour']"));
//        Thread.sleep(500);
//        totuesdayhourtime.clear();
//        totuesdayhourtime.sendKeys("07");
//        WebElement totuesdayminutetime = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-minute']"));
//        Thread.sleep(500);
//        totuesdayminutetime.clear();
//        totuesdayminutetime.sendKeys("00");
//        WebElement tuetomeridian = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-meridian']"));
//        Thread.sleep(500);
//        tuetomeridian.clear();
//        tuetomeridian.sendKeys("PM");
//        
//      //wednesday
//        driver.findElement(By.xpath("//*[@class='module-list-time']//tr//*[@name='wednesday']")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@class='module-list-time']//*[@name='wednesday']//td[3]//*[@class='input-small timepicker-input mini from form-control']")).click();
//        Thread.sleep(1000);
//        WebElement fromwednesdayhourtime = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-hour']"));
//        Thread.sleep(500);
//        fromwednesdayhourtime.clear();
//        fromwednesdayhourtime.sendKeys("10");
//        WebElement fromwednesdayminutetime = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-minute']"));
//        Thread.sleep(500);
//        fromwednesdayminutetime.clear();
//        fromwednesdayminutetime.sendKeys("00");
//        WebElement wedfrommeridian = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-meridian']"));
//        Thread.sleep(500);
//        wedfrommeridian.clear();
//        wedfrommeridian.sendKeys("AM");
//        driver.findElement(By.xpath("//*[@class='module-list-time']//*[@name='wednesday']//td[5]//*[@class='input-small timepicker-input mini to form-control']")).click();
//        Thread.sleep(1000);
//        WebElement towednesdayhourtime = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-hour']"));
//        Thread.sleep(500);
//        towednesdayhourtime.clear();
//        towednesdayhourtime.sendKeys("07");
//        WebElement towednesdayminutetime = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-minute']"));
//        Thread.sleep(500);
//        towednesdayminutetime.clear();
//        towednesdayminutetime.sendKeys("00");
//        WebElement wedtomeridian = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-meridian']"));
//        Thread.sleep(500);
//        wedtomeridian.clear();
//        wedtomeridian.sendKeys("PM");
//        
//      //Thursday
//        driver.findElement(By.xpath("//*[@class='module-list-time']//tr//*[@name='thursday']")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@class='module-list-time']//*[@name='thursday']//td[3]//*[@class='input-small timepicker-input mini from form-control']")).click();
//        Thread.sleep(1000);
//        WebElement fromthursdayhourtime = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-hour']"));
//        Thread.sleep(500);
//        fromthursdayhourtime.clear();
//        fromthursdayhourtime.sendKeys("10");
//        WebElement fromthursdayminutetime = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-minute']"));
//        Thread.sleep(500);
//        fromthursdayminutetime.clear();
//        fromthursdayminutetime.sendKeys("00");
//        WebElement thufrommeridian = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-meridian']"));
//        Thread.sleep(500);
//        thufrommeridian.clear();
//        thufrommeridian.sendKeys("AM");
//        driver.findElement(By.xpath("//*[@class='module-list-time']//*[@name='thursday']//td[5]//*[@class='input-small timepicker-input mini to form-control']")).click();
//        Thread.sleep(1000);
//        WebElement tothursdayhourtime = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-hour']"));
//        Thread.sleep(500);
//        tothursdayhourtime.clear();
//        tothursdayhourtime.sendKeys("07");
//        WebElement tothursdayminutetime = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-minute']"));
//        Thread.sleep(500);
//        tothursdayminutetime.clear();
//        tothursdayminutetime.sendKeys("00");
//        WebElement thutomeridian = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-meridian']"));
//        Thread.sleep(500);
//        thutomeridian.clear();
//        thutomeridian.sendKeys("PM");
//        
//      //Friday
//        driver.findElement(By.xpath("//*[@class='module-list-time']//tr//*[@name='friday']")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@class='module-list-time']//*[@name='friday']//td[3]//*[@class='input-small timepicker-input mini from form-control']")).click();
//        Thread.sleep(1000);
//        WebElement fromfridayhourtime = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-hour']"));
//        Thread.sleep(500);
//        fromfridayhourtime.clear();
//        fromfridayhourtime.sendKeys("10");
//        WebElement fromfridayminutetime = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-minute']"));
//        Thread.sleep(500);
//        fromfridayminutetime.clear();
//        fromfridayminutetime.sendKeys("00");
//        WebElement frifrommeridian = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-meridian']"));
//        Thread.sleep(500);
//        frifrommeridian.clear();
//        frifrommeridian.sendKeys("AM");
//        driver.findElement(By.xpath("//*[@class='module-list-time']//*[@name='friday']//td[5]//*[@class='input-small timepicker-input mini to form-control']")).click();
//        Thread.sleep(1000);
//        WebElement tofridayhourtime = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-hour']"));
//        Thread.sleep(500);
//        tofridayhourtime.clear();
//        tofridayhourtime.sendKeys("07");
//        WebElement tofridayminutetime = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-minute']"));
//        Thread.sleep(500);
//        tofridayminutetime.clear();
//        tofridayminutetime.sendKeys("00");
//        WebElement fritomeridian = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-meridian']"));
//        Thread.sleep(500);
//        fritomeridian.clear();
//        fritomeridian.sendKeys("PM");
//        
//      //Saturday
//        driver.findElement(By.xpath("//*[@class='module-list-time']//tr//*[@name='saturday']")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@class='module-list-time']//*[@name='saturday']//td[3]//*[@class='input-small timepicker-input mini from form-control']")).click();
//        Thread.sleep(1000);
//        WebElement fromsaturdayhourtime = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-hour']"));
//        Thread.sleep(500);
//        fromsaturdayhourtime.clear();
//        fromsaturdayhourtime.sendKeys("10");
//        WebElement fromsaturdayminutetime = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-minute']"));
//        Thread.sleep(500);
//        fromsaturdayminutetime.clear();
//        fromsaturdayminutetime.sendKeys("00");
//        WebElement satfrommeridian = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-meridian']"));
//        Thread.sleep(500);
//        satfrommeridian.clear();
//        satfrommeridian.sendKeys("AM");
//        driver.findElement(By.xpath("//*[@class='module-list-time']//*[@name='saturday']//td[5]//*[@class='input-small timepicker-input mini to form-control']")).click();
//        Thread.sleep(1000);
//        WebElement tosaturdayhourtime = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-hour']"));
//        Thread.sleep(500);
//        tosaturdayhourtime.clear();
//        tosaturdayhourtime.sendKeys("07");
//        WebElement tosaturdayminutetime = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-minute']"));
//        Thread.sleep(500);
//        tosaturdayminutetime.clear();
//        tosaturdayminutetime.sendKeys("00");
//        WebElement sattomeridian = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-meridian']"));
//        Thread.sleep(500);
//        sattomeridian.clear();
//        sattomeridian.sendKeys("PM");
//        
//      //Sunday
//        driver.findElement(By.xpath("//*[@class='module-list-time']//tr//*[@name='sunday']")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@class='module-list-time']//*[@name='sunday']//td[3]//*[@class='input-small timepicker-input mini from form-control']")).click();
//        Thread.sleep(1000);
//        WebElement fromsundayhourtime = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-hour']"));
//        Thread.sleep(500);
//        fromsundayhourtime.clear();
//        fromsundayhourtime.sendKeys("10");
//        WebElement fromsundayminutetime = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-minute']"));
//        Thread.sleep(500);
//        fromsundayminutetime.clear();
//        fromsundayminutetime.sendKeys("00");
//        WebElement sunfrommeridian = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-meridian']"));
//        Thread.sleep(500);
//        sunfrommeridian.clear();
//        sunfrommeridian.sendKeys("AM");
//        driver.findElement(By.xpath("//*[@class='module-list-time']//*[@name='sunday']//td[5]//*[@class='input-small timepicker-input mini to form-control']")).click();
//        Thread.sleep(1000);
//        WebElement tosundayhourtime = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-hour']"));
//        Thread.sleep(500);
//        tosundayhourtime.clear();
//        tosundayhourtime.sendKeys("07");
//        WebElement tosundayminutetime = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-minute']"));
//        Thread.sleep(500);
//        tosundayminutetime.clear();
//        tosundayminutetime.sendKeys("00");
//        WebElement suntomeridian = driver.findElement(By.xpath("//*[contains(@class,'bootstrap-timepicker-widget dropdown-menu')]//tr[2]//*[@class='bootstrap-timepicker-meridian']"));
//        Thread.sleep(500);
//        suntomeridian.clear();
//        suntomeridian.sendKeys("PM");
        
        driver.findElement(By.id("btn-save-time-slot")).click();
        Thread.sleep(1000);
        Select seltimeslot = new Select(driver.findElement(By.id("sel-time-slots")));
        seltimeslot.selectByVisibleText("Automated Time Slot");
        Thread.sleep(1000);        
        driver.findElement(By.xpath("//*[@class='btn btn-success'][@id='btn-del-time-slot']")).click();
        Thread.sleep(1000); 
        driver.switchTo().alert().accept();
   	}
   	
     @Test
     public void Assignagents() throws InterruptedException
    	{
    	 
		
		 
		  
		  ExtentHtmlReporter reporter=new ExtentHtmlReporter("E:\\automation1.html");
			
		    extent = new ExtentReports();
		    
		    extent.attachReporter(reporter);
		    ExtentTest logger=extent.createTest("Assignagents");
		    logger.log(Status.PASS, "Success");
    	 
    	 
    	 
    	 Thread.sleep(1000);
    	 driver.findElement(By.id("SideBarToggle4")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@id='SideBarToggle4']/ul/li[3]/a/span")).click();
         Thread.sleep(2000);
         Select selteamlead = new Select(driver.findElement(By.id("Supervisor_list")));
         selteamlead.selectByVisibleText("Sypervisor QA");
         Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@class='col-sm-3']//*[@value='1058']//i")).click();
         Thread.sleep(2000);
         driver.findElement(By.xpath("//*[@class='col-sm-4 margin-left-30']//*[@value='1058']//i")).click();
         Thread.sleep(500);
         
    	}
}
        
    

