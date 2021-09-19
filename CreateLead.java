package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class CreateLead extends BaseClass{
	
	public CreateLead(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public CreateLead entercmpny(String cmpny) {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cmpny);
	return this;
	}
	public CreateLead enterFirstName(String fname) {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	return this;
	}
	public CreateLead enterLastName(String lname) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	return this;
	}
	public CreateLead EnterPhone(String phn) {
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phn);
	return this;
	}
	public CreateLead clickSubmit() {
	driver.findElement(By.name("submitButton")).click();
	return this;
	}
}
