package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.FindLeads;

public class DuplicateTest extends BaseClass {
	@BeforeTest
	public void setSheetName() {
		SheetName = "delete";
	}

	@Test(dataProvider = "sendData")
	public void duplicateLead(String phon) throws InterruptedException {
		new FindLeads(driver).clickFindLead().m2().clickphone().givephn(phon).findl().clickl().clickdup().submit();
	}

}
