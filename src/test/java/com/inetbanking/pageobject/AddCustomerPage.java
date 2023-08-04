package com.inetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  AddCustomerPage 
{
	WebDriver ldriver;
	public AddCustomerPage(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	////a[.='New Customer']
	///html/body/div[3]/div/ul/li[2]/a
	@FindBy(linkText = "New Customer" )
	@CacheLookup
	WebElement linkaddnewcutomer;
	
	@FindBy(name ="name")
	@CacheLookup
	WebElement txtcustomername;
	
	@FindBy(name = "rad1")
	@CacheLookup
	WebElement rdgender;
	
	@FindBy(id="dob")
	@CacheLookup
	WebElement txtdob;
	
	@FindBy(name="addr")
	@CacheLookup
	WebElement txtaddress;
	
	@FindBy(name="city")
	@CacheLookup
	WebElement txtcity;
	
	@FindBy(name="state")
	@CacheLookup
	WebElement txtstate;
	
	@FindBy(name="pinno")
	@CacheLookup
	WebElement txtpin;
	
	@FindBy(name="telephoneno")
	@CacheLookup
	WebElement txtphone;
	
	@FindBy(name="emailid")
	@CacheLookup
	WebElement txtemailaddress;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtpassword1;
	
	@FindBy(name="sub")
	@CacheLookup
	WebElement submitbutton2;
	
	
	public void clickaddnewcustomer() {
		linkaddnewcutomer.click();
	}
	
	public void custname(String cname) {
		txtcustomername.sendKeys(cname);
		
	}
	
	public void custgender(String cgender) {
		rdgender.click();
	}
	
	public void custdob(String mm,String dd,String yy)
	{
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
	}
	
	public void custaddress(String caddress) {
		txtaddress.sendKeys(caddress);
	}
	
	public void custcity(String ccity) {
		txtcity.sendKeys(ccity);
	}
	
	public void custstate(String cstate) {
		txtstate.sendKeys(cstate);
	}
	
	public void custpin(String cpin) {
		txtpin.sendKeys(cpin);
	}
	
	public void custtelephone(String ctellphone) {
		txtphone.sendKeys(ctellphone);
	}
	
	public void custmailid(String cmailid) {
		txtemailaddress.sendKeys(cmailid);
	}
	
	public void custpassword(String cpassword) {
		txtpassword1.sendKeys(cpassword);
	}
	
	public void custsubmit() {
		submitbutton2.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
