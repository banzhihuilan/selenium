package exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new FirefoxDriver();
		dr.get("file:///D:/selapi.html");
		Thread.sleep(1000);
		
		Actions action=new Actions(dr);
		action.doubleClick(dr.findElement(By.id("doubleClickDiv"))).build().perform();
		Thread.sleep(1000);
		
		action.moveToElement(dr.findElement(By.id("testmouseover"))).build().perform();
		Thread.sleep(1000);
		
		WebElement element=dr.findElement(By.id("testClickAndHold"));
		action.clickAndHold(element).build().perform();
		Thread.sleep(1000);
		
		action.release(element).build().perform();
		Thread.sleep(1000);
		
		dr.quit();
		
		
	}

}
