package com.sgsoftware.actitime.testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Users {
	
	/**
	 * Author:
	 * Reviewer:
	 * Reviewed Date:
	 * @param 
	 * @return 
	 * purpose:
	 * Description:
	 */
	public static void createUser(WebDriver oBrowser)
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
	
	/**
	 * Author:
	 * Reviewer:
	 * Reviewed Date:
	 * @param 
	 * @return 
	 * purpose:
	 * Description:
	 */
	public static void modifyUser(WebDriver oBrowser)
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='User1, demo']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("password")).sendKeys("Sample123");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Sample123");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * Reviewer:
	 * Reviewed Date:
	 * @param 
	 * @return 
	 * purpose:
	 * Description:
	 */
	public static void deleteUser(WebDriver oBrowser)
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

}
