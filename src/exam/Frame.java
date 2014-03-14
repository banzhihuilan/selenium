package exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new FirefoxDriver();
		dr.get("file:///D:/frame.html");
		Thread.sleep(1000);
		dr.switchTo().frame("f1");//页面上有f1、f2两个frame，其中f2在f1内，那么需要先到f1，然后再到f2
		dr.switchTo().frame("f2");
		dr.findElement(By.id("kw1")).sendKeys("webdriver");
		Thread.sleep(1000);
		
		// 直接跳出所有frame
		dr.switchTo().defaultContent();
		
		//到f1
		dr.switchTo().frame("f1");
		dr.findElement(By.linkText("click")).click();
		Thread.sleep(1000);
		dr.quit();
	}

}
