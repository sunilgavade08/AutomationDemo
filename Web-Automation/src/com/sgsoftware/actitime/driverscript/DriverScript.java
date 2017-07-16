package com.sgsoftware.actitime.driverscript;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;

import com.sgsoftware.actitime.datatable.Datatable;
import com.sgsoftware.actitime.testscripts.Initialize;
import com.sgsoftware.actitime.testscripts.LoginLogout;
import com.sgsoftware.actitime.testscripts.Users;

public class DriverScript {
	public static WebDriver oBrowser=null;
	public static Datatable oDatatable=null;
	public static String sControllerExcelFile=null;
	public static String sScenarioExcelFile=null;
	public static void main(String[] args) {
		
		try
		{
			// Create instance for Datatable class
			oDatatable=new Datatable();
			// Provide the Controller.xlsx file path
			sControllerExcelFile=System.getProperty("user.dir")+"\\Controller\\data_Controller.xlsx";
			
			int iControllerRowCount=oDatatable.rowCount(sControllerExcelFile, "Scenarios");
			for (int tcid=0;tcid<iControllerRowCount;tcid++)
			{
				String testcaseid=oDatatable.getCellData(sControllerExcelFile, "Scenarios", "TestcaseID", tcid+2);
				String testcasename=oDatatable.getCellData(sControllerExcelFile, "Scenarios", "TestcaseName", tcid+2);
				String testcasedesc=oDatatable.getCellData(sControllerExcelFile, "Scenarios", "Description", tcid+2);
				String runStatus=oDatatable.getCellData(sControllerExcelFile, "Scenarios", "RunStatus", tcid+2);
				
				System.out.println("testcaseid  :"+testcaseid);
				System.out.println("testcasename  :"+testcasename);
				System.out.println("testcasedesc  :"+testcasedesc);
				System.out.println("runStatus  :"+runStatus);
				System.out.println("+++++++++++++++++++++");
				
				if (runStatus.equalsIgnoreCase("yes"))
				{
					oBrowser=Initialize.launchBrowser();
					
					Class driver[]=new Class[1];
					driver[0]=WebDriver.class;
					
					sScenarioExcelFile=System.getProperty("user.dir")+"\\TestScriptDataFiles\\"+testcasename+".xlsx";
					int iScenarioRowCount=oDatatable.rowCount(sScenarioExcelFile, testcaseid);
					
					for (int tsid=0;tsid<iScenarioRowCount;tsid++)
					{
						String testscriptid=oDatatable.getCellData(sScenarioExcelFile, testcaseid, "TestScriptID", tsid+2);
						String description=oDatatable.getCellData(sScenarioExcelFile, testcaseid, "Description", tsid+2);
						String methodname=oDatatable.getCellData(sScenarioExcelFile, testcaseid, "MethodName", tsid+2);
						String pkgclassname=oDatatable.getCellData(sScenarioExcelFile, testcaseid, "PackageClassName", tsid+2);
						
						System.out.println(" testscriptid  :"+testscriptid);
						System.out.println(" description  :"+description);
						System.out.println(" methodname  :"+methodname);
						System.out.println(" pkgclassname  :"+pkgclassname);
						
						Class cls=Class.forName(pkgclassname);
						Object obj=cls.newInstance();
						
						Method method=obj.getClass().getMethod(methodname, driver);
						method.invoke(obj, oBrowser);
					}
					System.out.println("+++++++++++++++++++++");
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}  // main method 

}
