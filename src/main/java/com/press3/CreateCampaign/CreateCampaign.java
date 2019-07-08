package com.press3.CreateCampaign;

import org.testng.annotations.Test;
/**
 * Hello world!
 *
 */
import java.util.Set;
import utility.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.*;
public class CreateCampaign extends BrowserFunctions
{
 
	@Test
	public void CreateCampaign() throws InterruptedException 
	{
	
    driver.findElement(By.id("SideBarToggle4")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"SideBarToggle4\"]/ul/li[7]/a/span")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"ctl01\"]/div[7]/div/div[1]/div[1]/div/div/a[2]")).click();
    Thread.sleep(1000);
    WebElement Campaignname = driver.findElement(By.id("txt-campaign-name"));
    Campaignname.sendKeys("Automation Campaign");
    Select attempts = new Select(driver.findElement(By.id("ddl-max-dial-attempts")));
    attempts.selectByVisibleText("2");
    Thread.sleep(1000);
    WebElement description = driver.findElement(By.id("txt-area-campaign-description"));
    description.sendKeys("This Campaign was created by Automation Script");
    Thread.sleep(1000);
    Select timezone = new Select(driver.findElement(By.id("ddl-timeZone")));
    timezone.selectByVisibleText("UTC +05:30");
    Thread.sleep(1000);
    Select callrecording = new Select(driver.findElement(By.id("ddl-is-call-record")));
    callrecording.selectByVisibleText("Enable");
    Thread.sleep(1000);
    Select callerid = new Select(driver.findElement(By.id("ddl-callerid")));
    callerid.selectByVisibleText("04039363900");
    Thread.sleep(1000);
    Select contactdisplay = new Select(driver.findElement(By.id("ddl-contact-display-type")));
    contactdisplay.selectByVisibleText("Full Display");
    Thread.sleep(1000);
    WebElement handletime = driver.findElement(By.id("txt-target-call-handle-time"));
    handletime.sendKeys("20");
    WebElement ringlimit = driver.findElement(By.id("txt-ring-limit"));
    ringlimit.sendKeys("10");
    driver.findElement(By.id("btn-next")).click();
    Thread.sleep(1000);
    Select distributiontype = new Select(driver.findElement(By.id("ddl-agent-distribution-type")));
    distributiontype.selectByVisibleText("Dedicated");
    Thread.sleep(1000);
    Select selectagents = new Select(driver.findElement(By.id("ddl-select-agents")));
    selectagents.selectByVisibleText("Agents");
    WebElement search = driver.findElement(By.id("txt-search-agents"));
    search.sendKeys("kous");
    driver.findElement(By.xpath("//*[@agent-id=\"3278\"]//input")).click();
    Thread.sleep(500);
    driver.findElement(By.id("txt-search-agents")).clear();
    WebElement search1 = driver.findElement(By.id("txt-search-agents"));
    search1.sendKeys("pri");
    driver.findElement(By.xpath("//*[@agent-id=\"3238\"]//input")).click();
    driver.findElement(By.id("btn-next")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"call_disposition\"]/div/div/div[1]/div[1]/ul/li[1]/label/input")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("btn-next")).click();
    Thread.sleep(1000);
    WebElement upload = driver.findElement(By.id("excelUploadFile"));
    upload.sendKeys("E:\\Campaign Callers New.xlsx");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"upl_cont\"]/div[1]/div[2]/div/label[1]/input")).click();
    Thread.sleep(1000);
    Select contacts = new Select(driver.findElement(By.id("ddl_Mobile_Sheet1")));
    contacts.selectByVisibleText("Number");
    Thread.sleep(1000);
    driver.findElement(By.id("btn-next")).click();
    Thread.sleep(5000);
    
    }
	
	//Voice Broadcast
	@Test
	public void VoiceBroadcast() throws InterruptedException
	{

		driver.findElement(By.id("SideBarToggle4")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"SideBarToggle4\"]/ul/li[7]/a/span")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"ctl01\"]/div[7]/div/div[1]/div[2]/div/div/a[2]")).click();
	    Thread.sleep(1000);
	    WebElement Campaignname = driver.findElement(By.id("txt-campaign-name"));
	    Campaignname.sendKeys("Automation Broadcast");
	    Thread.sleep(1000);
	    Select attempts = new Select(driver.findElement(By.id("ddl-max-dial-attempts")));
	    attempts.selectByVisibleText("2");
	    Thread.sleep(1000);
	    WebElement description = driver.findElement(By.id("txt-area-campaign-description"));
	    description.sendKeys("This Broadcast was created by Automation Script");
	    Thread.sleep(1000);
	    Select timezone = new Select(driver.findElement(By.id("ddl-timeZone")));
	    timezone.selectByVisibleText("GMT530");
	    Thread.sleep(1000);
	    Select callerid = new Select(driver.findElement(By.id("ddl-callerid")));
	    callerid.selectByVisibleText("04071044459");
	    Thread.sleep(1000);
	    WebElement ringlimit = driver.findElement(By.id("txt-ring-limit"));
	    ringlimit.sendKeys("10");
	    driver.findElement(By.id("btn-next")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"step\"]/div/label/input")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("btn-next")).click();
	    WebElement upload = driver.findElement(By.id("excelUploadFile"));
	    upload.sendKeys("E:\\Campaign Callers New.xlsx");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"upl_cont\"]/div[1]/div[2]/div/label[1]/input")).click();
	    Thread.sleep(1000);
	    Select contacts = new Select(driver.findElement(By.id("ddl_Contacts_Sheet1")));
	    contacts.selectByVisibleText("Number");
	    Thread.sleep(1000);
	    driver.findElement(By.id("btn-next")).click();
	    Thread.sleep(5000);
	    	    
	}
	@Test
	public void IvrSurvey() throws InterruptedException
	{
		driver.findElement(By.id("SideBarToggle4")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"SideBarToggle4\"]/ul/li[7]/a/span")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"ctl01\"]/div[7]/div/div[2]/div[1]/div/div/a[2]")).click();
	    Thread.sleep(2000);
	    WebElement Campaignname = driver.findElement(By.id("txt-campaign-name"));
	    Campaignname.sendKeys("Auto Survey");
	    Thread.sleep(1000);
	    Select attempts = new Select(driver.findElement(By.id("ddl-max-dial-attempts")));
	    attempts.selectByVisibleText("2");
	    Thread.sleep(1000);
	    WebElement description = driver.findElement(By.id("txt-area-campaign-description"));
	    description.sendKeys("This Survey was created by Automation Script");
	    Thread.sleep(1000);
	    Select timezone = new Select(driver.findElement(By.id("ddl-timeZone")));
	    timezone.selectByVisibleText("GMT530");
	    Thread.sleep(1000);
	    Select callerid = new Select(driver.findElement(By.id("ddl-callerid")));
	    callerid.selectByVisibleText("04071044459");
	    Thread.sleep(1000);
	    WebElement ringlimit = driver.findElement(By.id("txt-ring-limit"));
	    ringlimit.sendKeys("10");
	    driver.findElement(By.id("btn-next")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"step\"]/div/label/input")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("btn-next")).click();
	    WebElement upload = driver.findElement(By.id("excelUploadFile"));
	    upload.sendKeys("E:\\Campaign Callers New.xlsx");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"upl_cont\"]/div[1]/div[2]/div/label[1]/input")).click();
	    Thread.sleep(1000);
	    Select contacts = new Select(driver.findElement(By.id("ddl_Contacts_Sheet1")));
	    contacts.selectByVisibleText("Number");
	    Thread.sleep(1000);
	    driver.findElement(By.id("btn-next")).click();
	    Thread.sleep(5000); 
	}
	@Test
	public void IvrConnect() throws InterruptedException
	{
		driver.findElement(By.id("SideBarToggle4")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"SideBarToggle4\"]/ul/li[7]/a/span")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"ctl01\"]/div[7]/div/div[2]/div[2]/div/div/a[2]")).click();
	    Thread.sleep(1000);
	    WebElement Campaignname = driver.findElement(By.id("txt-campaign-name"));
	    Campaignname.sendKeys("Automation Ivr Connect");
	    Select attempts = new Select(driver.findElement(By.id("ddl-max-dial-attempts")));
	    attempts.selectByVisibleText("2");
	    Thread.sleep(1000);
	    WebElement description = driver.findElement(By.id("txt-area-campaign-description"));
	    description.sendKeys("This Ivr Connect was created by Automation Script");
	    Thread.sleep(1000);
	    Select timezone = new Select(driver.findElement(By.id("ddl-timeZone")));
	    timezone.selectByVisibleText("GMT530");
	    Thread.sleep(1000);
	    Select callrecording = new Select(driver.findElement(By.id("ddl-is-call-record")));
	    callrecording.selectByVisibleText("Enable");
	    Thread.sleep(1000);
	    Select callerid = new Select(driver.findElement(By.id("ddl-callerid")));
	    callerid.selectByVisibleText("04071044459");
	    Thread.sleep(1000);
	    Select contactdisplay = new Select(driver.findElement(By.id("ddl-contact-display-type")));
	    contactdisplay.selectByVisibleText("Full Display");
	    Thread.sleep(1000);
	    WebElement handletime = driver.findElement(By.id("txt-target-call-handle-time"));
	    handletime.sendKeys("20");
	    WebElement ringlimit = driver.findElement(By.id("txt-ring-limit"));
	    ringlimit.sendKeys("10");
	    driver.findElement(By.id("btn-next")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"step\"]/div/label/input")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("btn-next")).click();
	    Select distributiontype = new Select(driver.findElement(By.id("ddl-agent-distribution-type")));
	    distributiontype.selectByVisibleText("Dedicated");
	    Thread.sleep(1000);
	    Select selectagents = new Select(driver.findElement(By.id("ddl-select-agents")));
	    selectagents.selectByVisibleText("Agents");
	    WebElement search = driver.findElement(By.id("txt-search-agents"));
	    search.sendKeys("kous");
	    driver.findElement(By.xpath("//*[@id=\"div-agents\"]/ul[25]/li/label/input")).click();
	    Thread.sleep(500);
	    driver.findElement(By.id("txt-search-agents")).clear();
	    WebElement search1 = driver.findElement(By.id("txt-search-agents"));
	    search1.sendKeys("pri");
	    driver.findElement(By.xpath("//*[@id=\"div-agents\"]/ul[30]/li/label/input")).click();
	    driver.findElement(By.id("btn-next")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"call_disposition\"]/div/div/div[1]/div[1]/ul/li[1]/label/input")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("btn-next")).click();
	    Thread.sleep(1000);
	    WebElement upload = driver.findElement(By.id("excelUploadFile"));
	    upload.sendKeys("E:\\Campaign Callers New.xlsx");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@id=\"upl_cont\"]/div[1]/div[2]/div/label[1]/input")).click();
	    Thread.sleep(1000);
	    Select contacts = new Select(driver.findElement(By.id("ddl_Contacts_Sheet1")));
	    contacts.selectByVisibleText("Number");
	    Thread.sleep(1000);
	    driver.findElement(By.id("btn-next")).click();
	    Thread.sleep(5000);
	}
}


