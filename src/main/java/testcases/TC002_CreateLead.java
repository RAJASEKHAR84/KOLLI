package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_CreateLead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC002_CreateLead";
		testDescription="Create a new Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Venkat";
		browserName="chrome";
		dataSheetName="TC003";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void CreateLead(String uName,String pwd,String CmpyName, String Fname, String Lname,String Vfname) {
		/*LoginPage lp = new LoginPage();
		lp.enterUserName();
		lp.enterPassword();
		lp.clickLogIn();*/
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRM()
		.clickLead()
		.clickCreateLead()
		.enterCmpyName(CmpyName)
		.enterFname(Fname)
		.enterLname(Lname)
		.clickCreateLeadBut()
		.verifyFname(Vfname);
		
		
		
		
		
		
		
		
	}

}
