package exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Upload {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new FirefoxDriver();
		dr.get("file:///D:/upload_file.html");
		Thread.sleep(1000);
		
		dr.findElement(By.cssSelector("input[type='file'][name='file']")).sendKeys("D:/1.jpg");
		Thread.sleep(1000);
        dr.quit();
		
	}

}
