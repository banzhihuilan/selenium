package exam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ForwardAndBack {
	public static void main(String[] args) throws InterruptedException{
		WebDriver dr=new FirefoxDriver();
		Thread.sleep(2000);
		dr.get("http://www.baidu.com");
		Thread.sleep(1000);
		dr.get("http://www.soso.com");
		Thread.sleep(1000);
		System.out.println("now back to the first url");
		dr.navigate().back();
		Thread.sleep(1000);
		System.out.println("forward to the second url");
		dr.navigate().forward();
		Thread.sleep(1000);
		dr.quit();		
	}

}
