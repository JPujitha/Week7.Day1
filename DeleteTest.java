package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.FindLeads;

public class DeleteTest extends BaseClass{
@BeforeClass
public void setSheetName() {
	SheetName="delete";
}

@Test(dataProvider="sendData")
public void edit(String phone ) throws InterruptedException {
	new FindLeads(driver).clickFindLead().m3()
	.dClickPhone().dEnterPhone(phone).dFindLead()
	.getId().dFirstLeadClick().clickDelete().dClickFindLeads()
	.enterDeletedLeadId().findDeleted().dverify();
}
}
