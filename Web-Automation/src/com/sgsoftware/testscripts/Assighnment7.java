package com.sgsoftware.testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assighnment7 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		createcust();
		createproj();
		createmulltask();
		deletemulltask();
		deleateproj();
		deletecust();
		logout();
		closeApplication();
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
		oBrowser.get("http://localhost:8080/login.do");
	}
	
	static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath(".//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void createcust()
	{
		try
		{
			oBrowser.findElement(By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[3]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath(".//*[@id='topnav']/tbody/tr[2]/td/div[3]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath(".//*[@id='ext-gen7']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Anmol7");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_commitBtn")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	private static void createproj()
	{
		try
		{
			oBrowser.findElement(By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[3]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath(".//*[@id='topnav']/tbody/tr[2]/td/div[3]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath(".//*[@id='ext-gen14']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("project7");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath(".//*[@id='ext-comp-1005']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//li//a[contains(text(),'Anmol7')]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath(".//*[@id='projectPopup_commitBtn']/div/span")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	private static void createmulltask()
	{
		try
		{
			oBrowser.findElement(By.xpath(".//*[@id='customersProjectsForm']/table/tbody/tr/td/table/tbody/tr[5]/td/table/tbody/tr[17]/td[2]/a")).click();
			Thread.sleep(2000);
//			oBrowser.findElement(By.xpath(".//*[@id='ext-gen40']")).click();
//			Thread.sleep(2000);
////			oBrowser.findElement(By.xpath(".//*[@id='ext-gen54']/td[3]")).click();
////			Thread.sleep(2000);
//			oBrowser.findElement(By.xpath("//li/a[contains(text( ),'Anmol7')]]")).click();
//			Thread.sleep(2000);
//			oBrowser.findElement(By.xpath(".//*[@id='ext-gen63']/td[3]")).click();
//			Thread.sleep(2000);
//			oBrowser.findElement(By.xpath("//li/a[contains(text(),'project7')]")).click();
//			Thread.sleep(2000);
//			oBrowser.findElement(By.xpath(".//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[1]/td[1]/input")).sendKeys("task1");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath(".//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[2]/td[1]/input")).sendKeys("task2");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("createTasksPopup_commitBtn")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	
	private static void deletemulltask()
	{
		try
		{
			oBrowser.findElement(By.xpath("//tr//td//a[contains(text(),'project7')]/following::td[3]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//tr//td//a[contains(text(),'task1')]/following::td[4]/input")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//tr//td//a[contains(text(),'task2')]/following::td[4]/input")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath(".//*[@id='tasksListForm']/table/tbody/tr[3]/td/table/tbody/tr/td/div/table/tbody/tr/td[1]/input")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("deleteTaskPopup_deleteConfirm_submitBtn")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	
	private static void deleateproj()
	{
		try
		{
			oBrowser.findElement(By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[3]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath(".//*[@id='topnav']/tbody/tr[2]/td/div[3]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//td/a[contains(text(),'project7')]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath(".//*[@id='projectPopup_deleteBtn']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath(".//*[@value='Delete Project']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
		
	}
	
	
	static void deletecust()
	{
		try
		{
			oBrowser.findElement(By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[3]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath(".//*[@id='topnav']/tbody/tr[2]/td/div[3]/a")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//td/a[contains(text(),'Anmol7')]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath(".//*[@value='Delete Customer']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
