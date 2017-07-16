package com.sgsoftware.actitime.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginLogout {
	/**
	 * Author:
	 * Reviewer:
	 * Reviewed Date:
	 * @param 
	 * @return 
	 * purpose:
	 * Description:
	 */
	public static void login(WebDriver oBrowser)
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
	
	/**
	 * Author:
	 * Reviewer:
	 * Reviewed Date:
	 * @param 
	 * @return 
	 * purpose:
	 * Description:
	 */
	public static void logout(WebDriver oBrowser)
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

}
