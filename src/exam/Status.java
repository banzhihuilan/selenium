package exam;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Status {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new FirefoxDriver();
		dr.get("file:///D:/status.html");
		Thread.sleep(1000);
		//是否enable
		WebElement textField=dr.findElement(By.name("user"));
		System.out.println(textField.isEnabled());
		System.out.println(dr.findElement(By.className("btn")).isEnabled());
		
		// 隐藏掉textField，判断是否显示
		((JavascriptExecutor)dr).executeScript("$(arguments[0]).hide()", textField);
		System.out.println(textField.isDisplayed());
		
		//是否选中
		WebElement radio=dr.findElement(By.name("radio"));
		radio.click();
		System.out.println(radio.isSelected());
		
		//是否存在
		try{
		dr.findElement(By.id("none"));		
		}catch(NoSuchElementException e){
			System.out.println("element does not exist");
		}
		
		Thread.sleep(1000);
        dr.quit();
	}

}
