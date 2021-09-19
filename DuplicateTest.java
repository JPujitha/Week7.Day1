package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.FindLeads;

public class DuplicateTest extends BaseClass {
	@BeforeClass
	public void setSheetName() {
		SheetName="delete";
	}
	@Test(dataProvider="sendData")
	public void DuplicateLead(String phon) throws InterruptedException {
		new FindLeads(driver)
		.clickFindLead()
		.m2()
		.clickphone()
		.givephn(phon)
		.findl()
		.clickl()
		.clickdup().submit();
	}

}
