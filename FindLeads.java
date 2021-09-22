package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class FindLeads extends BaseClass{
	public FindLeads(ChromeDriver driver) {
		this.driver=driver;
	}
	public  FindLeads clickFindLead() throws InterruptedException {
		driver.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(500);
		return this;
	}
	public EditLead m1() {
		return new EditLead(driver);
	}

	public DuplicateLead m2() {
		return new DuplicateLead(driver);
	}
	
	public DeleteLead m3() {
		return new DeleteLead(driver);
	}
	
}
