package com.sgsoftware.testscripts;

import java.io.File;

public class PathDemo {

	public static void main(String[] args) {
	//	createFile1();
	//	createFile2();

	}
	
	static void createFile1()
	{
		try
		{
			File f1=new File("F:\\AUTOMATION\\AUTOMATIONDEMO\\Web-Automation\\Library\\drivers\\Test.txt");
			f1.createNewFile();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
	static void createFile2()
	{
		try
		{
			String path=System.getProperty("user.dir");
			File f1=new File(path+"\\Library\\drivers\\Test123.txt");
			f1.createNewFile();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
