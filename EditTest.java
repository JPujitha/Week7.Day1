package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.FindLeads;

public class EditTest extends BaseClass{
	@BeforeClass
	public void setSheetName() {
		SheetName="edit";
	}
	@Test(dataProvider="sendData")
	public void leadEdit(String cmpny,String phn) throws InterruptedException {
		new FindLeads(driver)
		.clickFindLead().m1()
		.clickphone()
		.givephone(phn)
		.clickfind()
		.clickonlead()
		.clickedit()
		.updatecmpny(cmpny)
		.submit();

			}

}
