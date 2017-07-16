package com.sgsoftware.testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment2 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		createUser();
		modifyUser();
		deleteUser();
		logout();
		closeApplication();
	}
	
	static void launchBrowser()
	{
		String path=System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.gecko.driver", path+"\\library\\drivers\\geckodriver.exe");
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
	
	static void createUser()
	{
		try
		{
			oBrowser.findElement(By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath(".//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Anmol1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("B H1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys("rsmath@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys("Jeeva1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("Welcome11");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome11");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void modifyUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='B H1, Anmol1']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).clear();
			oBrowser.findElement(By.name("email")).sendKeys("rhiremath@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath(".//*[@id='userDataLightBox_commitBtn']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='B H1, Anmol1']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			Alert alert=oBrowser.switchTo().alert();
			alert.accept();
			Thread.sleep(1000);
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
