package pom.inetbanking.testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageobject.AddCustomerPage;
import com.inetbanking.pageobject.Loginpage;

public class Tc_Addnewcustomer_002 extends Baseclass
{

	@Test
	public void addnewcustomer() throws InterruptedException {
		
		Loginpage lp=new Loginpage(driver);
		lp.setusername(username);
		lp.setpassword(password);
		lp.clicksubmit();
		
		
		AddCustomerPage addcust=new AddCustomerPage(driver);
		Thread.sleep(2000);
		
		addcust.clickaddnewcustomer();
		
		addcust.custname("chiku");
		addcust.custgender("male");
		addcust.custdob("12", "12", "1995");
		Thread.sleep(3000);
		addcust.custaddress("india");
		addcust.custcity("cuttack");
		addcust.custstate("odisha");
		addcust.custpin("753012");
		addcust.custtelephone("9114877612");
		
		//String generated=RandomStringUtils.randomAlphabetic(8);
		String email=randomeString()+"@gmail.com";
		addcust.custmailid(email);
		
		addcust.custpassword("abcdef");
		addcust.custsubmit();
		Thread.sleep(3000);
		boolean res=driver.getPageSource().contains("Customer Registered Succesfully!!!");
		if(res==true) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
				
	}
	

	
	

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
