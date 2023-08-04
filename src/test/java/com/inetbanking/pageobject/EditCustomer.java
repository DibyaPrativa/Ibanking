package com.inetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomer 

{
	WebDriver ldriver;
	public EditCustomer(WebDriver rdriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	
	@FindBy(linkText = "Edit Customer")
	WebElement editcustomerlink;
	
	@FindBy(name="cusid")
	WebElement txtcustomerid;
	
	@FindBy(name = "AccSubmit")
	WebElement clicksubmit3;
	
	public void editcustomer1() {
		editcustomerlink.click();
	}
	
	public void customerfield1(String ccustomerid) {
		txtcustomerid.sendKeys(ccustomerid);
	}
	
	public void editsubmitbutton() {
		clicksubmit3.click();
	}
	
	
	
}
