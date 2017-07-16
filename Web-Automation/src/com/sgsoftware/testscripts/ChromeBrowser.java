package com.sgsoftware.testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeBrowser {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		createUser();
		deleteUser();
		logout();
		closeApplication();
	}
	
	static void launchBrowser()
	{
		String path=System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();
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
			
			oBrowser.manage().window().maximize();
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
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath(".//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("User1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("email")).sendKeys("demo@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("Welcome1");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome1");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='User1, demo']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert alert=oBrowser.switchTo().alert();
			alert.accept();
			Thread.sleep(5000);
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
			Thread.sleep(5000);
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
