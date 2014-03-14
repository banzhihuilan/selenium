package exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Css {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new FirefoxDriver();
		dr.get("file:///D:/css.html");
		Thread.sleep(1000);
		
		System.out.println(dr.findElement(By.id("tooltip")).getCssValue("color"));
		System.out.println(dr.findElement(By.tagName("h3")).getCssValue("font-size"));
		Thread.sleep(1000);
        dr.quit();
		
	}

}
