package exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new FirefoxDriver();
		dr.get("file:///D:/wait.html");
		Thread.sleep(1000);	
		dr.findElement(By.id("btn")).click();
		(new WebDriverWait(dr,10)).until(new ExpectedCondition<Boolean>(){
			public Boolean apply(WebDriver d){
				return d.findElement(By.className("label")).isDisplayed();
			}	
		});
		
		
		Thread.sleep(1000); 
		 dr.quit();
		
	}

}
