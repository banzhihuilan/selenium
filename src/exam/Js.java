package exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Js {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new FirefoxDriver();
		dr.get("file:///D:/js.html");
		Thread.sleep(1000);	
		((JavascriptExecutor)dr).executeScript("$('#tooltip').fadeOut();");
		Thread.sleep(1000);
		WebElement button = dr.findElement(By.className("btn"));
		((JavascriptExecutor)dr).executeScript("$(arguments[0]).fadeOut();", button);
		Thread.sleep(1000); 
		 dr.quit();
		
	}

}
