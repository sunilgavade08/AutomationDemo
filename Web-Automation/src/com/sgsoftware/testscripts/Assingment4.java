package com.sgsoftware.testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assingment4 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		createcust();
		updatecust();
		deletecust();
          logout();
		closeApplication();
	}
	
	static void launchBrowser()
	{
		String path=System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.gecko.driver", path+"\\Library\\Drivers\\geckodriver.exe");
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
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Anmol4");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerLightBox_commitBtn")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	static void updatecust()
	{
		try
		{
			oBrowser.findElement(By.xpath("//td/a[contains(text(),'Anmol4')]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath(".//*[@id='customerLightBox_descriptionField']")).sendKeys("patience");
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
			oBrowser.findElement(By.xpath("//td/a[contains (text( ), 'Anmol4') ]")).click();
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
