package com.sgsoftware.testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	xpathAbsolute();
	//	xpathRealtiveTagName();
	//	xpathRealtiveIndex();
	//	xpathRelativeOneAttribute();
	//	xpathRelativeMultiAttribute();
	//	xpathRelativeMultiAttributeWithAnd();
	//	xpathRelativeMultiAttributeWithOR();
	//	xpathRelativeAttributeValueAlone();
	//	xpathRelativeAttributeNameAlone();
	//	xpathRelativePartialMatchOfAttributeValue();
	//	xpathRelativeTextContent();
		xpathRelativePartialTextContent();
	}
	
	static void launchBrowser()
	{
		String path=System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.gecko.driver", path+"\\Library\\drivers\\geckodriver.exe");
		oBrowser=new FirefoxDriver();
	}
	
	static void navigate()
	{
		oBrowser.get("file:///F:/AUTOMATION/HTML/SAMPLE.html");
	}
	
	static void xpathAbsolute()
	{
		oBrowser.findElement(By.xpath("/html/body/div/form/input")).sendKeys("demoUser1");
	}
	
	static void  xpathRealtiveTagName()
	{
		oBrowser.findElement(By.xpath("//input")).sendKeys("demoUser1");
	}
	
	static void  xpathRealtiveIndex()
	{
		oBrowser.findElement(By.xpath("//input[2]")).sendKeys("demoUser1");
	}
	
	static void xpathRelativeOneAttribute()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit']")).click();
	}
	
	static void xpathRelativeMultiAttribute()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit'][@name='submit1btn1']")).click();
	}
	
	static void xpathRelativeMultiAttributeWithAnd()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit' and @name='submit1btn1']")).click();
	}
	
	static void xpathRelativeMultiAttributeWithOR()
	{
		oBrowser.findElement(By.xpath("//input[@value='Submit' or @name='submit1btn1']")).click();
	}
	
	static void xpathRelativeAttributeValueAlone()
	{
		oBrowser.findElement(By.xpath("//input[@*='btn1submit1button1']")).click();
	}
	
	static void xpathRelativeAttributeNameAlone()
	{
		List<WebElement> oLinks=oBrowser.findElements(By.xpath("//a[@href]"));
		System.out.println("# of Links are :"+oLinks.size());
		
		for (int i=0;i<oLinks.size();i++)
		{
			WebElement oLink=oLinks.get(i);
			
			if (oLink.getText().equals("SeleniumHQ"))
			{
				oLink.click();
				break;
			}
		}
	}
	static void xpathRelativePartialMatchOfAttributeValue()
	{
		oBrowser.findElement(By.xpath("//input[contains(@id,'btn1submit1')]")).click();
	}
	
	static void xpathRelativeTextContent()
	{
		oBrowser.findElement(By.xpath("//a[text()='SeleniumHQ']")).click();
	}
	
	static void xpathRelativePartialTextContent()
	{
		oBrowser.findElement(By.xpath("//a[starts-with(text(),'Selenium')]")).click();
	}
}
