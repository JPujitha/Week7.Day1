package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class clickCreateLead extends BaseClass{
	public clickCreateLead(ChromeDriver driver) {
		this.driver=driver;

	}
	public CreateLead clickCreate() throws InterruptedException {
		driver.findElement(By.linkText("Create Lead")).click();
		Thread.sleep(2000);
		return new CreateLead(driver);

	}

}
