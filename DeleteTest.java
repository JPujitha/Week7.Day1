package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.FindLeads;

public class DeleteTest extends BaseClass{
	@BeforeTest
public void setSheetName() {
	SheetName="delete";
}

@Test(dataProvider="sendData")
public void delete(String phone ) throws InterruptedException {
	new FindLeads(driver).clickFindLead().m3()
	.dClickPhone().dEnterPhone(phone).dFindLead()
	.getId().dFirstLeadClick().clickDelete().dClickFindLeads()
	.enterDeletedLeadId().findDeleted().dverify();
}
}
