package com.Press2.GenSet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.support.ui.Select;
import org.testng.*;
import utility.*;

/**
* Hello world!
*
*/
public class Gset extends BrowserFunctions
{
//public static void main( String[] args ) throws InterruptedException

//SLA
@Test
public void Gnset() throws InterruptedException
{
 	      
  driver.findElement(By.id("SideBarToggle4")).click();
      Thread.sleep(2000);
           driver.findElement(By.xpath("//*[@id=\"SideBarToggle4\"]/ul/li[1]/a")).click();
           Thread.sleep(2000);
      WebElement slat = driver.findElement(By.id("SLAThresholdInSeconds"));
      slat.clear();
      slat.sendKeys("30");
      Thread.sleep(2000);
      Select ssstype = new Select(driver.findElement(By.id("selSLAType")));
      ssstype.selectByVisibleText("Select SLA Type");
      Thread.sleep(2000);
      Select stype = new Select(driver.findElement(By.id("selSLAType")));
      stype.selectByVisibleText("Positively Impact");
      Thread.sleep(2000);
      driver.findElement(By.id("DailExtension")).click();
      Thread.sleep(1000);
      WebElement tsla = driver.findElement(By.id("SLATargetPercentage"));
      tsla.clear();
      tsla.sendKeys("90");
      Thread.sleep(2000);
      driver.findElement(By.id("btnUpdateSLA")).click();
      Thread.sleep(1000);
           
}
      //SMST
     @Test
      public void Smst() throws InterruptedException
  {
      driver.findElement(By.id("SideBarToggle4")).click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("//*[@id='SideBarToggle4']/ul/li[1]/a/span")).click();
      Thread.sleep(1000);
      driver.findElement(By.xpath("//*[@id='headingTwo']/h4/a")).click();
      Thread.sleep(1000);
      driver.findElement(By.id("lnkAddSmsTemplate")).click();
      Thread.sleep(2000);
      WebElement smst = driver.findElement(By.id("txtSmsTemplateName"));
      smst.sendKeys("Happy");
      Thread.sleep(2000);
      WebElement smsc = driver.findElement(By.id("txtSmsTemplateContent"));
      smsc.sendKeys("Happy with Press3");
      Thread.sleep(2000);
      driver.findElement(By.id("btnSaveSmsTemplate")).click();
      Thread.sleep(2000);
      Select smss = new Select(driver.findElement(By.id("selSmsTemplate")));
      smss.selectByVisibleText("Happy");
      Thread.sleep(2000);
      WebElement upsms = driver.findElement(By.id("smsContent"));
      upsms.sendKeys(" Thank you for calling press3");
      Thread.sleep(2000);
      driver.findElement(By.id("btnUpdateSmsTemplate")).click();
      Thread.sleep(2000);
      Select del = new Select(driver.findElement(By.id("selSmsTemplate")));
      del.selectByVisibleText("Happy");
      Thread.sleep(1000);
      driver.findElement(By.id("btnDeleteSmsTemplate")).click();
      Thread.sleep(2000);
      driver.findElement(By.id("btnCnfm")).click();
      Thread.sleep(2000);
    
  
      //EmailT
      
   
      driver.findElement(By.xpath("//*[@id=\"collapseTwo\"]/div/div/ul/li[2]/a")).click();
      Thread.sleep(1000);
      driver.findElement(By.id("lnkAddEmailTemplate")).click();
      Thread.sleep(2000);
      WebElement etn = driver.findElement(By.id("txtEmailTemplateName"));
      etn.sendKeys("Welcome Email");
      Thread.sleep(2000);
      WebElement ets = driver.findElement(By.id("txtEmailTemplateSubject"));
      ets.sendKeys("Email for welcome");
      Thread.sleep(2000);
      WebElement etc = driver.findElement(By.xpath("//*[@id=\"newEmailTemplateModal\"]/div[2]/div/div[2]/table/tbody/tr[3]/td[2]/div/div"));
      etc.sendKeys("Welcome to Press3, we are glad you opted for Press3");
      Thread.sleep(2000);
      driver.findElement(By.id("btnSaveEmailTemplate")).click();
      Thread.sleep(2000);
      Select emails = new Select(driver.findElement(By.id("selEmailTemplate")));
      emails.selectByVisibleText("Welcome Email");
      Thread.sleep(2000);    
      WebElement upemail = driver.findElement(By.xpath("//*[@id=\"tab_15_2\"]/div/div[3]/div/div"));
      upemail.sendKeys(" Thank You");
      Thread.sleep(2000);
      driver.findElement(By.id("btnUpdateEmailTemplate")).click();
      Thread.sleep(2000);    
      Select demail = new Select(driver.findElement(By.id("selEmailTemplate")));
      demail.selectByVisibleText("Welcome Email");
      Thread.sleep(1000);
      driver.findElement(By.id("btnDeleteEmailTemplate")).click();
      Thread.sleep(2000);
      driver.findElement(By.id("btnCnfm")).click();
      Thread.sleep(2000);
   	  
       }
      
     
      //Ticket Management
      
      
      //Status
      @Test
      public void Tm() throws InterruptedException
      {  
   	driver.findElement(By.id("SideBarToggle4")).click();
   Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"SideBarToggle4\"]/ul/li[1]/a")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id='headingFive']/h4/a")).click();
       Thread.sleep(5000);
       
//	       Actions action =new Actions(driver);
//	       action.moveToElement(driver.findElement(By.className("page-footer"))).perform();
//	       By nodes =By.xpath("//*[@class='jstree-container-ul jstree-children']/li[@role='treeitem']/a[contains(@class,'jstree-anchor')]");
//	       Thread.sleep(2000);
//	       List<WebElement> elements = driver.findElements(nodes);
//	       System.out.println(elements.size());
//	       for(WebElement ele: elements) {
//	       	action.moveToElement(ele).perform();
//	       	System.out.println(ele.getText());
//	       }
       
            //Status
       
       driver.findElement(By.xpath("//*[@id=\"createStatus\"]/i")).click();
       Thread.sleep(2000);
       WebElement status = driver.findElement(By.id("txtStatusName"));
       status.sendKeys("Invalid");
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"updateStatus\"]/i")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"accountStatuses\"]/div[4]/div/div/label/input")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"deleteStatus\"]/i")).click();
       Thread.sleep(2000);
      
      //Priority
      
      driver.findElement(By.xpath("//*[@id=\"createPriority\"]/i")).click();
      Thread.sleep(2000);
      WebElement pname = driver.findElement(By.id("txtPriorityName"));
      pname.sendKeys("Trivial");
      Thread.sleep(2000);
      WebElement tcv = driver.findElement(By.id("txtClosingValue"));
      tcv.sendKeys("5");
      Thread.sleep(2000);
      Select tdd = new Select(driver.findElement(By.id("ddlTargetUnit")));
      tdd.selectByVisibleText("Days");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id=\"updatePriority\"]/i")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id=\"accountPriorities\"]/div[5]/label[1]/input")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id=\"editPriority\"]/i")).click();
      Thread.sleep(2000);
      WebElement upp = driver.findElement(By.id("txtClosingValue174"));
      upp.clear();
      upp.sendKeys("3");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id=\"updatePriority\"]/i")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id=\"accountPriorities\"]/div[5]/label[1]/input")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id=\"deletePriority\"]/i")).click();
      Thread.sleep(2000);
       
       // Notification
       
    
       driver.findElement(By.xpath("//*[@id=\"collapseFive\"]/div/div[1]/div[3]/div/div[2]/div/table/tbody/tr[2]/td[2]/label/div/div/span[3]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"collapseFive\"]/div/div[1]/div[3]/div/div[2]/div/table/tbody/tr[2]/td[3]/label/div/div/span[3]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"collapseFive\"]/div/div[1]/div[3]/div/div[2]/div/table/tbody/tr[3]/td[2]/label/div/div/span[3]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"collapseFive\"]/div/div[1]/div[3]/div/div[2]/div/table/tbody/tr[3]/td[3]/label/div/div/span[3]")).click();
       Thread.sleep(2000);
       Select sdrp = new Select(driver.findElement(By.id("ddlSMSTemplateType")));
       sdrp.selectByVisibleText("Select");
       Thread.sleep(2000);
       Select tsdp = new Select(driver.findElement(By.id("ddlSMSTemplateType")));
       tsdp.selectByVisibleText("Thank You");
       Thread.sleep(2000);
       Select sedrp = new Select(driver.findElement(By.id("ddlEmailTemplateType")));
       sedrp.selectByVisibleText("Select");
       Thread.sleep(2000);
       Select tedp = new Select(driver.findElement(By.id("ddlEmailTemplateType")));
       tedp.selectByVisibleText("hi");
       Thread.sleep(2000);
       
       
      //Category
      
//	      driver.findElement(By.id("btnCreateRoot")).click();
//	      Thread.sleep(2000);
//	      //String rootNode = "root"+System.currentTimeMillis();
//	      String rootNode = "SchoolManagement";
//	      System.out.println(rootNode);
//	      WebElement cname = driver.findElement(By.id("txtNodeName"));
//	      cname.sendKeys(rootNode);
//	      Thread.sleep(2000);
//	      driver.findElement(By.id("btnSaveRoot")).click();
//	      Thread.sleep(2000);
//	      By nodes1 =By.xpath("//*[@class='jstree-container-ul jstree-children']/li[@role='treeitem']/a[contains(@class,'jstree-anchor')]");
//	       List<WebElement> elementsss = driver.findElements(nodes1);
//	       System.out.println(elementsss.size());
//	      // Actions action= new Actions(driver);
//	       for(WebElement ele: elementsss) {
//	       	//action.moveToElement(ele).perform();
//	       	System.out.println(ele.getText());
//	       	if(ele.getText().equalsIgnoreCase(rootNode)) {
//	       	ele.click();
//	       	break;
//	       	}
//	       }
       
//	      

//	     driver.findElement(By.id("btnCreateNode")).click();
//	      Thread.sleep(2000);
//	      WebElement nname = driver.findElement(By.id("txtNodeName"));
//	      String node = "Parents";
//	      nname.sendKeys(node);
//	      Thread.sleep(2000);
//	      Select plevel = new Select(driver.findElement(By.id("ddlCategoryPriorities")));
//	      plevel.selectByVisibleText("Medium");
//	      Thread.sleep(2000);
//	      driver.findElement(By.id("btnSaveNode")).click();
//	      Thread.sleep(2000);
//	      driver.navigate().refresh();
//	      Thread.sleep(2000);
//	      driver.findElement(By.xpath("//*[@id=\"headingFive\"]/h4/a")).click();
//	      Thread.sleep(1000);      
//	      
//	      
//	    
//	      By nodess =By.xpath("//*[@class='jstree-container-ul jstree-children']/*[contains(@class,'jstree-node')]");
//	       List<WebElement> nodesList = driver.findElements(nodess);
//	       System.out.println(nodesList.size());
//	       System.out.println(nodesList);
//	      // Actions action= new Actions(driver);
//	       for(WebElement ele: nodesList) {
//	       	//action.moveToElement(ele).perform();
//	       	
//	       	if(ele.findElement(By.xpath("")).getText().equalsIgnoreCase(rootNode))
//	       	{
//	       	action.moveToElement(ele.findElement(By.xpath("/a"))).perform();
//	       	action.moveToElement(ele.findElement(By.xpath("//*[@class='jstree-children']//a"))).perform();
//	       	ele.findElement(By.xpath("//*[@class='jstree-children']//a")).click();
//	       	break;
//	       	}
       
       	
//	       }
      
//	      WebElement child = driver.findElement(By.id("//*[@class='jstree-container-ul jstree-children']/li[6]/ul/li/a[contains(@class,'jstree-anchor')]"));
//	      child.click();
//	      Thread.sleep(2000);
//	      driver.findElement(By.id("btnEditNode")).click();
//	      Thread.sleep(2000);
//	      WebElement ename = driver.findElement(By.id("txtNodeName"));
//	      ename.sendKeys(" Meet");
//	      Thread.sleep(2000);
//	      Select uplevel = new Select(driver.findElement(By.id("ddlCategoryPriorities")));
//	      uplevel.selectByVisibleText("Low");
//	      Thread.sleep(2000);
//	      driver.findElement(By.id("btnSaveEditedNode")).click();
//	      Thread.sleep(2000);
//	      driver.findElement(By.id("//*[@class=\"jstree-container-ul jstree-children\"]//li[6]//*[@class=\"jstree-node  jstree-leaf jstree-last\"]")).click();
//           Thread.sleep(2000);
//           driver.findElement(By.id("btnRemoveNode")).click();
//	      Thread.sleep(2000);
//	      
      
//	      driver.findElement(By.partialLinkText("Test7 xyz test")).click();
//	      Thread.sleep(2000);
//	      driver.findElement(By.id("btnRemoveNode")).click();
//	      driver.switchTo().alert().accept();
//	      Thread.sleep(2000);
      
//	      driver.navigate().refresh();
//	      Thread.sleep(2000);                   
      } 
      
      
      //CBD

      @Test
      public void Cbd() throws InterruptedException
      {
   	  
      driver.findElement(By.id("SideBarToggle4")).click();
  Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id=\"SideBarToggle4\"]/ul/li[1]/a")).click();
      Thread.sleep(2000);   
          
          
      driver.findElement(By.xpath("//*[@id=\"headingFour\"]/h4/a")).click();
      Thread.sleep(2000);
      driver.findElement(By.id("btnAddField")).click();
      Thread.sleep(2000);
      WebElement fname = driver.findElement(By.id("txtFieldName"));
           fname.sendKeys("Location");
      Thread.sleep(2000);
      Select ftype = new Select(driver.findElement(By.id("ddlFieldType")));
           ftype.selectByVisibleText("Textbox");
           Thread.sleep(2000);
           Select itype = new Select(driver.findElement(By.id("ddlInputType")));
           itype.selectByVisibleText("AlphaNumerics");
           Thread.sleep(2000);
           WebElement mchar = driver.findElement(By.id("txtMaxchars"));
           mchar.sendKeys("25");
      Thread.sleep(2000);
      Select mand = new Select(driver.findElement(By.id("ddlMandatory")));
           mand.selectByVisibleText("Yes");
           Thread.sleep(2000);
           Select asc = new Select(driver.findElement(By.id("ddlSpecialchars")));
           asc.selectByVisibleText("Yes");
           Thread.sleep(2000);
           driver.findElement(By.id("btnSaveField")).click();
      Thread.sleep(2000);
      driver.findElement(By.id("btnEditField")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@class =\"row editRow\"]//*[@fieldname=\"Location\"]")).click();
      Thread.sleep(2000);
      driver.findElement(By.id("btnUpdateFields")).click();
      Thread.sleep(2000);
      driver.findElement(By.id("btnAddField")).click();
      Thread.sleep(2000);
      WebElement pname = driver.findElement(By.id("txtFieldName"));
           pname.sendKeys("World Places");
      Thread.sleep(2000);
      Select ddp = new Select(driver.findElement(By.id("ddlFieldType")));
           ddp.selectByVisibleText("Dropdown");
           Thread.sleep(2000);
           WebElement dropn = driver.findElement(By.xpath("//*[@id=\"optionsData\"]/div/input"));
           dropn.sendKeys("USA");
      Thread.sleep(2000);
      driver.findElement(By.id("addOption")).click();
      Thread.sleep(2000);
      WebElement dropm = driver.findElement(By.xpath("//*[@id=\"optionsData\"]/div[2]/input"));
           dropm.sendKeys("Australia");
      Thread.sleep(2000);
      Select mannn = new Select(driver.findElement(By.id("ddlMandatory")));
           mannn.selectByVisibleText("No");
           Thread.sleep(2000);
           driver.findElement(By.id("btnSaveField")).click();
      Thread.sleep(2000);
      driver.findElement(By.id("btnEditField")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@class =\"row editRow\"]//*[@fieldname=\"World\"]")).click();
      Thread.sleep(2000);
      driver.findElement(By.id("btnUpdateFields")).click();
      Thread.sleep(2000);
      driver.findElement(By.id("btnAddField")).click();
      Thread.sleep(2000);
      WebElement tname = driver.findElement(By.id("txtFieldName"));
           tname.sendKeys("Complete Address");
      Thread.sleep(2000);
      Select ddds = new Select(driver.findElement(By.id("ddlFieldType")));
           ddds.selectByVisibleText("Textarea");
           Thread.sleep(2000);
           WebElement machar = driver.findElement(By.id("txtareaMaxchars"));
           machar.sendKeys("30");
      Thread.sleep(2000);
      Select dddp = new Select(driver.findElement(By.id("ddlMandatory")));
           dddp.selectByVisibleText("Yes");
           Thread.sleep(2000);
           driver.findElement(By.id("btnSaveField")).click();
      Thread.sleep(2000);
      driver.findElement(By.id("btnAddFields")).click();
      Thread.sleep(2000);
      driver.findElement(By.id("btnEditField")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@class =\"row editRow\"]//*[@fieldname=\"Complete\"]")).click();
      Thread.sleep(2000);
      driver.findElement(By.id("btnUpdateFields")).click();
      Thread.sleep(2000);
    }
           
}