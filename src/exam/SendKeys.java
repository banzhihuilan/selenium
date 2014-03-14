package exam;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SendKeys {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new FirefoxDriver();
		dr.get("file:///D:/send_keys.html");
		Thread.sleep(1000);
		
		/*
		WebElement textarea1=dr.findElement(By.cssSelector("textarea#A"));
		String text=textarea1.getAttribute("value");
		textarea1.clear();
		Thread.sleep(1000);
		WebElement textarea2=dr.findElement(By.cssSelector("textarea#B"));
		textarea2.sendKeys(text);
		*/
		
		dr.findElement(By.id("A")).sendKeys(Keys.chord(Keys.CONTROL+"a"));
		Thread.sleep(1000);
		dr.findElement(By.id("A")).sendKeys(Keys.chord(Keys.CONTROL+"x"));
		dr.findElement(By.id("B")).sendKeys(Keys.chord(Keys.CONTROL+"v"));
		dr.findElement(By.id("A")).sendKeys(Keys.chord("watir webdriver is better than selenium webdriver"));
		
		Thread.sleep(1000);
		dr.quit();
	}

}
