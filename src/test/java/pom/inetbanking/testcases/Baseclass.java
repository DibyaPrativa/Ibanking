package pom.inetbanking.testcases;




import org.apache.commons.lang3.RandomStringUtils;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import pom.inetbanking.utility.readconfig;

//import freemarker.log.Logger;

public class Baseclass {
	readconfig readconfigss=new readconfig();
	
	public String baseURL=readconfigss.getApplicationURL();
	public String username=readconfigss.getUsername();
	public String password=readconfigss.getPassword();
	public static WebDriver driver;
	
	//public static Logger Logger;
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		
		if(br.equals("chrome")) {
		
		System.setProperty("webdriver.chrome.driver", readconfigss.getChromePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		}
		
		//Logger logger=org.apache.log4j.Logger.getLogger("ibanking");
		//PropertyConfigurator.configure("log4j.properties");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(baseURL);
		
	}
	@AfterClass
	public void teardown() {
		
		driver.quit();
	}
	
	public String randomeString() {
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return generatedstring;
		
	}
	
	public static String randomenum() {
		String generatedstring2=RandomStringUtils.randomNumeric(4);
		return generatedstring2;
		
		
	}

}
