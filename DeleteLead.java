package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.BaseClass;

public class DeleteLead extends BaseClass {
	public static String leadID;
	public  DeleteLead(ChromeDriver driver) {
		this.driver=driver;
	}
	public DeleteLead dClickPhone() {
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	return this;
	}
	public DeleteLead dEnterPhone(String phone) {
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phone);
	return this;
	}
	public DeleteLead dFindLead() throws InterruptedException {
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	return this;
	}
	public DeleteLead getId() {
	leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	return this;
	}
	public DeleteLead dFirstLeadClick() {
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	return this;
	}
	public DeleteLead clickDelete() {
	driver.findElement(By.linkText("Delete")).click();
	return this;
	}
	public DeleteLead dClickFindLeads() {
	driver.findElement(By.linkText("Find Leads")).click();
	return this;
	}
	public DeleteLead enterDeletedLeadId() {
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	return this;
	}
	public DeleteLead findDeleted() throws InterruptedException {
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(500);
	return this;
	}
	public DeleteLead dverify() {
	String text = driver.findElement(By.className("x-paging-info")).getText();
	String text1="No records to display";
	Assert.assertEquals(text, text1);
	System.out.println("Lead Deleted");
	return this;
	}
}
