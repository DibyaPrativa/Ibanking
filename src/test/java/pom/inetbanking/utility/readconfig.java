package pom.inetbanking.utility;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;



public class readconfig {
	Properties pro;
	
	public  readconfig()
	{
	try {	
	File src=new File("./Configuration/config.properties");
	FileInputStream fis=new FileInputStream(src);
	pro=new Properties();
	pro.load(fis);
	}catch (Exception e) {
		System.out.println("Exception is" +e.getMessage());
	}
	}
	
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
		
		}
	
	public String getUsername() {
		String username=pro.getProperty("username");
		return username;
	}
	
	public String getPassword() {
		
		String password=pro.getProperty("password");
		return password;
	}
	
	public String getChromePath() {
		
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	
	
	
	
	
	
	
	
	
	
}
	


