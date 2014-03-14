package exam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get {
	public static void main(String[] args) throws InterruptedException{
		WebDriver dr=new FirefoxDriver();
		Thread.sleep(2000);
		dr.get("http://www.baidu.com");
		Thread.sleep(2000);
		dr.quit();
	}

}
