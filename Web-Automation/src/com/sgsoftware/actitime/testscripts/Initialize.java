package com.sgsoftware.actitime.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initialize {
	public static WebDriver oBrowser=null;
	/**
	 * Author:
	 * Reviewer:
	 * Reviewed Date:
	 * @param 
	 * @return 
	 * purpose:
	 * Description:
	 */
	public static WebDriver launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.out.println(path);
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return oBrowser;
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
	public static void navigate(WebDriver oBrowser)
	{
		try
		{
			oBrowser.get("http://localhost:8080/login.do");
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
	public static void closeApplication(WebDriver oBrowser)
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
