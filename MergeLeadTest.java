package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.MergeLead;

public class MergeLeadTest extends BaseClass {
	@BeforeTest
	public void setSheetName() {
		SheetName = "merge";
	}

	@Test(dataProvider = "sendData")
	public void mergeLead(String fname, String name) throws InterruptedException {
		new MergeLead(driver).clickMergeLead().fromLead(fname).toLead(name).clickMerge().handleAlert()
				.clickTofindLead();
	}

}
