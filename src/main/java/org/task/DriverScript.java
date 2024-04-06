package org.task;


import java.io.IOException;

//import org.first.LoginPagePojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DriverScript extends BaseClass {
	
	@BeforeClass
	private void loadbrowser() {
		openedge();

	}
	@AfterClass
	private void quitbro() {
		closeBrowser();

	}
	@BeforeMethod
	private void startTime() {
		dateAndTime();

	}
	@AfterMethod
	private void endTime() {
		dateAndTime();

		
	}
	@Test
	public void testCase1() throws  InterruptedException {
		//page loaded
		launchUrl("https://www.onetravel.com/");
		OneTravelPojoClass g=new OneTravelPojoClass();
		elementWait(g.getsignup());
       Thread.sleep(2000);
	}
	@Test
	public void testCase2() throws  InterruptedException {
		//searchbar present
		launchUrl("https://www.onetravel.com/");
		OneTravelPojoClass g=new OneTravelPojoClass();
		elementWait(g.getsearchbar());
       Thread.sleep(2000);
	}
	@Test
	public void testCase3() throws InterruptedException {
		//departure  field present
		launchUrl("https://www.onetravel.com/");
		OneTravelPojoClass g=new OneTravelPojoClass();
		Thread.sleep(2000);
		btnClk(g.getdept());
       Thread.sleep(2000);
	}
	@Test
	public void testCase4() throws InterruptedException {
		// return field present
		launchUrl("https://www.onetravel.com/");
		OneTravelPojoClass g=new OneTravelPojoClass();
		Thread.sleep(2000);
		btnClk(g.getretrn());
       Thread.sleep(2000);
	}
	
	@Test
	public void testCase5() throws InterruptedException {
		// passenger field present
		launchUrl("https://www.onetravel.com/");
		OneTravelPojoClass g=new OneTravelPojoClass();
		elementWait(g.getpassenger());
       Thread.sleep(2000);
	}
	@Test
	public void testCase6() throws InterruptedException {
		// cabin field present
		launchUrl("https://www.onetravel.com/");
		OneTravelPojoClass g=new OneTravelPojoClass();
		elementWait(g.getpassenger());
       Thread.sleep(2000);
	}
	@Test
	public void testCase7() throws InterruptedException {
		// search button  present
		launchUrl("https://www.onetravel.com/");
		OneTravelPojoClass g=new OneTravelPojoClass();
		elementWait(g.getsearchbtn());
       Thread.sleep(2000);
	}
	@Test
	public void testCase8() throws InterruptedException {
		// price filter field present
		launchUrl("https://www.onetravel.com/");
		OneTravelPojoClass g=new OneTravelPojoClass();
		elementWait(g.getpassenger());
       Thread.sleep(2000);
	}
	@Test
	public void testCase9() throws InterruptedException {
		// departure filter field present
		launchUrl("https://www.onetravel.com/");
		OneTravelPojoClass g=new OneTravelPojoClass();
		elementWait(g.getsearchbtn());
       Thread.sleep(2000);
	}
	@Test
	public void testCase10() throws InterruptedException {
		// duration filter field present
		launchUrl("https://www.onetravel.com/");
		OneTravelPojoClass g=new OneTravelPojoClass();
		elementWait(g.getsearchbtn());
       Thread.sleep(2000);
	}
	@Test
	public void testCase11() throws InterruptedException {
		// firstname,last name field present
		launchUrl("https://www.onetravel.com/");
		
		OneTravelPojoClass g=new OneTravelPojoClass();
		elementWait(g.getsignup());
		btnClk(g.getsignup());
		fillTextbox(g.getEmailid(), "anu123999@gmail.com");
		Thread.sleep(2000);
		btnClk(g.getNextbtn());
		Thread.sleep(2000);
		elementWait(g.getFirstname());
		elementWait(g.getLastname());
		elementWait(g.getPassword());
		
       Thread.sleep(2000);
	}
	@Test
	public void testCase12() throws InterruptedException {
		// password field present
		launchUrl("https://www.onetravel.com/");
		
		OneTravelPojoClass g=new OneTravelPojoClass();
		elementWait(g.getsignup());
		btnClk(g.getsignup());
		fillTextbox(g.getEmailid(), "anu123845@gmail.com");
		btnClk(g.getEmailid());
		Thread.sleep(2000);
		btnClk(g.getNextbtn());
		
		//elementWait(g.getFirstname());
		//elementWait(g.getLastname());
		elementWait(g.getPassword());
		
       Thread.sleep(2000);
	}
	@Test
	public void testCase13() throws InterruptedException {
		// signup button present
		launchUrl("https://www.onetravel.com/");
		OneTravelPojoClass g=new OneTravelPojoClass();
		elementWait(g.getsignup());
       Thread.sleep(2000);
	}
	@Test
	public void testCase14() throws InterruptedException {
		// sign up button enabled
		launchUrl("https://www.onetravel.com/");
		OneTravelPojoClass g=new OneTravelPojoClass();
		eleClkWait(g.getsignup());
       Thread.sleep(2000);
	}
	@Test
	public void testCase15() throws InterruptedException {
		// email id field is present
		launchUrl("https://www.onetravel.com/");
		OneTravelPojoClass g=new OneTravelPojoClass();
		elementWait(g.getsignup());
		btnClk(g.getsignup());
		eleClkWait(g.getEmailid());
       Thread.sleep(2000);
	}
	@Test
	public void testCase16() throws InterruptedException {
		// invalid email id to email id field 
		launchUrl("https://www.onetravel.com/");
		OneTravelPojoClass g=new OneTravelPojoClass();
		elementWait(g.getsignup());

		btnClk(g.getsignup());
		fillTextbox(g.getEmailid(), "anugmail.com");
		btnClk(g.getNextbtn());
		Thread.sleep(2000);
	}
	@Test
	public void testCase17() throws InterruptedException {
		// confirm btn is present
		launchUrl("https://www.onetravel.com/");
		OneTravelPojoClass g=new OneTravelPojoClass();
		elementWait(g.getsignup());

		btnClk(g.getsignup());
		fillTextbox(g.getEmailid(), "anuasdfcgg@gmail.com");
		btnClk(g.getEmailid());
		
		btnClk(g.getNextbtn());
		Thread.sleep(2000);
	}
	@Test
	public void testCase18() throws InterruptedException {
		// invalid email id text verification
		launchUrl("https://www.onetravel.com/");
		OneTravelPojoClass g=new OneTravelPojoClass();
		elementWait(g.getsignup());

		btnClk(g.getsignup());
		fillTextbox(g.getEmailid(), "anugmail.com");
		btnClk(g.getNextbtn());
		String text=getTxt(g.geterrormesg());
		if (text.equalsIgnoreCase("Please enter a valid email address.")) {
			System.out.println("Text verification passed");
		} else {
			System.out.println("Text verification failed");
		}
       Thread.sleep(2000);
	}
	@Test
	public void testCase19() throws InterruptedException {
		// password field allows alphanumeric
		launchUrl("https://www.onetravel.com/");
		OneTravelPojoClass g=new OneTravelPojoClass();
		elementWait(g.getsignup());

		btnClk(g.getsignup());
		fillTextbox(g.getEmailid(), "anu123423@gmail.com");
		btnClk(g.getEmailid());
		Thread.sleep(2000);
		btnClk(g.getNextbtn());
		Thread.sleep(2000);
		elementWait(g.getFirstname());
		fillTextbox(g.getFirstname(), "anu");
		elementWait(g.getLastname());
		fillTextbox(g.getLastname(), "raja");
		elementWait(g.getPassword());
		fillTextbox(g.getPassword(), "anu123");
		Thread.sleep(2000);
		//btnClk(g.getjoinforfree());

		
		
       Thread.sleep(2000);
	}
	@Test
	public void testCase20() throws InterruptedException {
		// confirm btn is present
		launchUrl("https://www.onetravel.com/");
		OneTravelPojoClass g=new OneTravelPojoClass();
		elementWait(g.getsignup());

		btnClk(g.getsignup());
		fillTextbox(g.getEmailid(), "anu123asfdr@gmail.com");
		btnClk(g.getEmailid());
		Thread.sleep(2000);
		btnClk(g.getNextbtn());
		elementWait(g.getjoinforfree());
		
       Thread.sleep(2000);
	}
	@Test
	public void testCase21() throws InterruptedException {
		// password field allows blank
		launchUrl("https://www.onetravel.com/");
		OneTravelPojoClass g=new OneTravelPojoClass();
		elementWait(g.getsignup());

		btnClk(g.getsignup());
		fillTextbox(g.getEmailid(), "anu12mnhj3@gmail.com");
		Thread.sleep(2000);
		btnClk(g.getEmailid());
		Thread.sleep(2000);
		btnClk(g.getNextbtn());
		Thread.sleep(2000);
		elementWait(g.getFirstname());
		fillTextbox(g.getFirstname(), "anu");
		elementWait(g.getLastname());
		fillTextbox(g.getLastname(), "raja");
		elementWait(g.getPassword());
		fillTextbox(g.getPassword(), "     ");
		Thread.sleep(2000);
		btnClk(g.getjoinforfree());

		

       Thread.sleep(2000);
	}
	@Test
	public void testCase22() throws InterruptedException {
		// email id field allows blank
		launchUrl("https://www.onetravel.com/");
		OneTravelPojoClass g=new OneTravelPojoClass();
		elementWait(g.getsignup());

		btnClk(g.getsignup());
		fillTextbox(g.getEmailid(), "     ");
		btnClk(g.getNextbtn());
		
       Thread.sleep(2000);
	}
	@Test
	public void testCase23() throws InterruptedException {
		// round trip button is selected
		launchUrl("https://www.onetravel.com/");
		OneTravelPojoClass g=new OneTravelPojoClass();
		elementWait(g.getRoundtrip());

		//btnClk(g.getBtnlgn());
		//fillTextbox(g.getTxtuser(), getExcelData(3, 0));
		//btnClk(g.getBtnlgn());
		//btnClk(g.getBtnlgn());
		
       Thread.sleep(2000);
	}
	@Test
	public void testCase24() throws InterruptedException {
		// oneway trip button is selected
		launchUrl("https://www.onetravel.com/");
		OneTravelPojoClass g=new OneTravelPojoClass();
		elementWait(g.getOnewaytrip());
//btnClk(g.getBtnlgn());
		
       Thread.sleep(2000);
	}
	@Test
	public void testCase25() throws InterruptedException {
		// error mesg when email id field is entered wrong
		launchUrl("https://www.onetravel.com/");
		OneTravelPojoClass g=new OneTravelPojoClass();
		elementWait(g.getsignup());

		btnClk(g.getsignup());
		fillTextbox(g.getEmailid(), "anugmail.com");
		btnClk(g.getNextbtn());
		String text=getTxt(g.geterrormesg());
		if (text.equalsIgnoreCase("Please enter a valid email address.")) {
			System.out.println("Text verification passed");
		} else {
			System.out.println("Text verification failed");
		}
     
       Thread.sleep(2000);
	}




}
