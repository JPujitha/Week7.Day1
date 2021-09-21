package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.BaseClass;

public class MergeLead extends BaseClass {
	public static String leadId ;
	public MergeLead(ChromeDriver driver) {
		this.driver=driver;
	}
	public MergeLead clickMergeLead() {
	driver.findElement(By.linkText("Merge Leads")).click();
	return this;
	}
	
	public MergeLead fromLead(String fname) throws InterruptedException {
	driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	Set<String> allWindows = driver.getWindowHandles();
	List<String> allhandles = new ArrayList<String>(allWindows);
	driver.switchTo().window(allhandles.get(1));
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(fname);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(20000);
	leadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	driver.switchTo().window(allhandles.get(0));
	return this;
	}
	
	public MergeLead toLead(String name) throws InterruptedException {
	driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	Set<String> allWindows2 = driver.getWindowHandles();
	List<String> allhandles2 = new ArrayList<String>(allWindows2);
	driver.switchTo().window(allhandles2.get(1));
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(name);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	driver.switchTo().window(allhandles2.get(0));
	return this;
	}
	
	public MergeLead clickMerge() {
	driver.findElement(By.xpath("//a[text()='Merge']")).click();
	return this;
	}
	
	public MergeLead handleAlert() {
	driver.switchTo().alert().accept();
	return this;
	}
	
	public MergeLead clickTofindLead() throws InterruptedException {
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(1000);
	String text = driver.findElement(By.className("x-paging-info")).getText();
	String Expected="No records to display";
	Assert.assertEquals(Expected, text);
	System.out.println("Text matched");
	return this;
}


}
