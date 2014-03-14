package exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonDropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new FirefoxDriver();
		dr.get("file:///D:/button_dropdown.html");
		Thread.sleep(1000);
		dr.findElement(By.linkText("Info")).click();
		( new WebDriverWait(dr,10)).until(new ExpectedCondition<Boolean>(){
			
			public Boolean apply(WebDriver d){
				return d.findElement(By.className("dropdown-menu")).isDisplayed();
			}
		});
        dr.findElement(By.className("dropdown-menu")).findElement(By.linkText("watir-webdriver")).click();
        Thread.sleep(1000);
        dr.quit();
	}
}
		
