package com.sgsoftware.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathAxesDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	demoFollowingSibling();
	//	demoFollowing();
	//	demoPrecedingSibling();
	//	demoPreceding();
	//	demoDescendant();
	//	demoAncestor();
		selectDropDown();
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
		oBrowser.get("file:///F:/AUTOMATION/HTML/WebTableHTML.html");
	}
	
	static void demoFollowingSibling()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td/following-sibling::td/following-sibling::td/following-sibling::td/input")).sendKeys("12500");
	}

	static void demoFollowing()
	{
		oBrowser.findElement(By.xpath("//td[text;()='Bhagath Singh']/following::tr[1]/td[6]/input")).sendKeys("12500");
	}
	
	static void demoPrecedingSibling()
	{
		oBrowser.findElement(By.xpath("//td[contains(text(),'Indian Freedom Fighter')]/preceding-sibling::td/preceding-sibling::td/input")).click();
	}
	
	static void demoPreceding()
	{
		oBrowser.findElement(By.xpath("//td[contains(text(),'Indian Freedom Fighter')]/preceding::tr[1]/td[1]/input")).click();
	}
	
	static void demoDescendant()
	{
		oBrowser.findElement(By.xpath("//table/tbody/descendant::tr[3]/descendant::td[6]/descendant::input")).sendKeys("12500");
	}
	
	static void demoAncestor()
	{
		oBrowser.findElement(By.xpath("//input[@id='edit3']/ancestor::td/preceding-sibling::td/preceding-sibling::td/preceding-sibling::td/preceding-sibling::td/preceding-sibling::td/input")).click();
	}
	
	static void selectDropDown()
	{
		WebElement oList=oBrowser.findElement(By.id("list1"));
		
		Select oSelect=new Select(oList);
		oSelect.selectByVisibleText("Bangalore");
	}
}
