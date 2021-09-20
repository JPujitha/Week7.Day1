package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class EditLead extends BaseClass{
	public EditLead(ChromeDriver driver) {
		this.driver=driver;
	}
	public EditLead clickphone() {
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	return this;
	}
	public EditLead givephone(String ephn) {
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(ephn);
	return this;
	}
	public EditLead clickfind() throws InterruptedException {
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(3000);
	return this;
	}
	public EditLead clickonlead() {
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	return this;
	}
	public EditLead clickedit() {
	driver.findElement(By.linkText("Edit")).click();
	return this;
	}
	public EditLead updatecmpny(String ecmpny) {
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(ecmpny);
	return this;
	}
	public EditLead submit() {
	driver.findElement(By.name("submitButton")).click();
	return this;
	}
}
