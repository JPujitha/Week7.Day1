package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.clickCreateLead;

public class CreateLeadTest extends BaseClass{
	@BeforeTest
	public void setSheetName() {
		SheetName="create";
	}
	@Test(dataProvider="sendData")
	public void leadCreate (String fname,String lname,String cmpny,String phn) throws  InterruptedException {
		new clickCreateLead(driver)
		.clickCreate()
		.entercmpny(cmpny)
		.enterFirstName(fname)
		.enterLastName(lname)
		.EnterPhone(phn)
		.clickSubmit();
	}
}
