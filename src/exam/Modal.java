package exam;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Modal {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new FirefoxDriver();
		dr.get("file:///D:/modal.html");
		Thread.sleep(1000);
		
		dr.findElement(By.id("show_modal")).click();
        ( new WebDriverWait(dr,10)).until(new ExpectedCondition<Boolean>(){
			
			public Boolean apply(WebDriver d){
				return d.findElement(By.id("myModal")).isDisplayed();
			}
		});
       
       WebElement link= dr.findElement(By.id("myModal")).findElement(By.id("click"));
       ((JavascriptExecutor)dr).executeScript("$(arguments[0]).click()", link);
      
        /*
        Actions action=new Actions(dr);
        action.moveToElement(dr.findElement(By.linkText("click me"))).perform();
        action.click();
       */
        Thread.sleep(1000);
        dr.quit();
		
	}

}
