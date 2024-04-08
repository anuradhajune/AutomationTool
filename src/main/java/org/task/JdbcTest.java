package org.task;

import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JdbcTest extends BaseClass {
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
	public void testCase19() throws InterruptedException {
		// password field allows alphanumeric
		String query="select * from employees";
		String id="employee_id";
		String value="";
		String Firstname="first_name";
		
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
		Map<Integer, String> mp=JdbcConnection(query,id,Firstname);
		for (Map.Entry<Integer,String> entry : mp.entrySet())  {
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue());
            value=entry.getValue();
            break;
		
    } 
		fillTextbox(g.getFirstname(),value);
		elementWait(g.getLastname());
		fillTextbox(g.getLastname(), "raja");
		elementWait(g.getPassword());
		fillTextbox(g.getPassword(), "anu123");
		Thread.sleep(2000);
		//btnClk(g.getjoinforfree());

		
		
       Thread.sleep(2000);
	}


}
