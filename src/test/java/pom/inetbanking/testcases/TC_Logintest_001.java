package pom.inetbanking.testcases;



//import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageobject.Loginpage;

public class TC_Logintest_001 extends Baseclass


{
	@Test
	public void loginTest() {
		driver.get(baseURL);
	//Logger.info("url is opened");
		
		
		Loginpage lp=new Loginpage(driver);
		lp.setusername(username);
		//Logger.info("enter user name");
		lp.setpassword(password);
		//Logger.info("enter password");
		
		/*lp.clicksubmit();
		//Logger.info("log in passed");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		}
		
		else 
		{
			Assert.assertTrue(false);
		}*/
		
		
	}

}
