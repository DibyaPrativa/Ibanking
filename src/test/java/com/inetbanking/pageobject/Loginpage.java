package com.inetbanking.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
WebDriver ldriver;

public Loginpage(WebDriver rdriver) 
{
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
}
	
@FindBy(name="uid")
@CacheLookup
WebElement txtusername;

@FindBy(name="password")
@CacheLookup
WebElement txtpassword;

@FindBy(name="btnLogin")
@CacheLookup
WebElement btnlogin;

public void setusername(String uname) {
	txtusername.sendKeys(uname);
	
}

public void setpassword(String pwd) {
	txtpassword.sendKeys(pwd);
}

public void clicksubmit() {
	btnlogin.click();
}

	
}
