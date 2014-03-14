package exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new FirefoxDriver();
		dr.get("file:///D:/frame.html");
		Thread.sleep(1000);
		dr.switchTo().frame("f1");//ҳ������f1��f2����frame������f2��f1�ڣ���ô��Ҫ�ȵ�f1��Ȼ���ٵ�f2
		dr.switchTo().frame("f2");
		dr.findElement(By.id("kw1")).sendKeys("webdriver");
		Thread.sleep(1000);
		
		// ֱ����������frame
		dr.switchTo().defaultContent();
		
		//��f1
		dr.switchTo().frame("f1");
		dr.findElement(By.linkText("click")).click();
		Thread.sleep(1000);
		dr.quit();
	}

}
