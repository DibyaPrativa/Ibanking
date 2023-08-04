package pom.inetbanking.testcases;

import org.testng.annotations.Test;

import com.inetbanking.pageobject.EditCustomer;
import com.inetbanking.pageobject.Loginpage;

public class Tc_EditCustomer_003 extends Baseclass

{
	@Test
	public void neweditcustomer1() throws InterruptedException {
		
		Loginpage lp=new Loginpage(driver);
		lp.setusername(username);
		lp.setpassword(password);
		lp.clicksubmit();
		Thread.sleep(2000);
	
		
		EditCustomer editcust=new EditCustomer(driver);
		editcust.editcustomer1();
		Thread.sleep(2000);
		editcust.customerfield1("86093");
		editcust.editsubmitbutton();
		
		
		
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
