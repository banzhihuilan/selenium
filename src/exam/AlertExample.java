package exam;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertExample {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new FirefoxDriver();
		dr.get("file:///D:/alert.html");
		dr.findElement(By.id("tooltip")).click();
		Alert alert=dr.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();	
		Thread.sleep(1000); 
		 dr.quit();
		
	}

}
