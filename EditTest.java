package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.FindLeads;

public class EditTest extends BaseClass {
	@BeforeTest
	public void setSheetName() {
		SheetName = "edit";
	}

	@Test(dataProvider = "sendData")
	public void leadEdit(String ecmpny, String ephn) throws InterruptedException {
		new FindLeads(driver).clickFindLead().m1().clickphone().givephone(ephn).clickfind().clickonlead().clickedit()
				.updatecmpny(ecmpny).submit();

	}

}
