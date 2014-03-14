package exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OperateElement {
public static void main(String[] args) throws InterruptedException {
	WebDriver dr=new FirefoxDriver();
	dr.get("file:///D:/operate_element.html");
	Thread.sleep(1000);
	WebElement element=dr.findElement(By.name("q"));
	element.sendKeys("something");
	element.clear();
	dr.quit();
	
}
}