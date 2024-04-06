package org.task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OneTravelPojoClass extends BaseClass {
	public OneTravelPojoClass() {
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath=(".//button[@aria-label='Sign In / Join ClubMiles to unlock member only deals']"))
	private WebElement signup;
	@FindBy(xpath=".//input[@placeholder='Email Address']")
	private WebElement emailid;
	
	@FindBy(xpath=".//button[text()='Next']")
	private WebElement nextbtn;
	public WebElement getNextbtn() {
		return nextbtn;
	}
	
	
	@FindBy(xpath=".//input[@name='firstName']")
	private WebElement firstname;
	@FindBy(xpath=".//input[@name='lastName']")
	private WebElement lastname;
	@FindBy(xpath=".//input[@name='password']")
	private WebElement password;
	@FindBy(xpath=".//label[@for='roundTrip']")
	private WebElement roundtrip;
	@FindBy(xpath=".//label[@for='onewayTrip']")
	private WebElement onewaytrip;
	
	@FindBy(xpath=".//input[@id='preferredAirline']")
	private WebElement searchbar;
	@FindBy(xpath=".//input[@id='to0']")
	private WebElement retrn;
	@FindBy(xpath=".//a[@id='travellerButton']")
	private WebElement passenger;
	@FindBy(xpath=".//button[text()='Join for free']")
	private WebElement joinforfree;
	public WebElement getjoinforfree() {
		return joinforfree;
	}
	
	@FindBy(xpath=".//input[@id='searchNow']")
	private WebElement searchbtn;
	@FindBy(xpath=".//div[@class='validation-error']")
	private WebElement errormesg;
	public WebElement geterrormesg() {
		return errormesg;
	}
	
	
	@FindBy(xpath=".//input[@id='from0']")
	private WebElement dept;
	public WebElement getsearchbtn() {
		return searchbtn;
	}
	public WebElement getpassenger() {
		return passenger;
	}
	
	
	public WebElement getretrn() {
		return retrn;
	}
	
	public WebElement getdept() {
		return dept;
	}
	
	
	public WebElement getsearchbar() {
		return searchbar;
	}
	
	public WebElement getEmailid() {
		return emailid;
	}
	public WebElement getsignup() {
		return signup;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getRoundtrip() {
		return roundtrip;
	}
	public WebElement getOnewaytrip() {
		return onewaytrip;
	}
	

}
