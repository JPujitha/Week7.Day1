package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class DuplicateLead extends BaseClass{
	public DuplicateLead(ChromeDriver driver) {
		this.driver=driver;
	}
	public DuplicateLead clickphone() {
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	return this;
}
	public DuplicateLead givephn(String phon) {
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phon);
	return this;
	}
	public DuplicateLead findl() throws InterruptedException {
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(2000);
	return this;
	}
	public DuplicateLead clickl() {
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	return this;
	}
	public DuplicateLead clickdup() {
	driver.findElement(By.linkText("Duplicate Lead")).click();
	return this;
	}
	public DuplicateLead submit() {
	driver.findElement(By.name("submitButton")).click();
	return this;
	}
}
