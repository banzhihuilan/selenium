package exam;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Form {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new FirefoxDriver();
		dr.get("file:///D:/form.html");
		Thread.sleep(1000);	
		dr.findElement(By.cssSelector("input[type='checkbox']")).click();
		Thread.sleep(1000);
		dr.findElement(By.cssSelector("input[type='radio']")).click();
		Thread.sleep(1000);
		Select select=new Select(dr.findElement(By.cssSelector("label.select>select")));
		select.selectByIndex(1);
		Thread.sleep(1000);
		dr.findElement(By.className("btn")).click();
		Alert alert=dr.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(1000);
        dr.quit();
		
	}

}
