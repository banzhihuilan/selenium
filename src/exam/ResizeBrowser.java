package exam;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ResizeBrowser {
	public static void main(String[] args) {
		WebDriver dr=new FirefoxDriver();
		dr.manage().window().setSize(new Dimension(600, 400)); //将浏览器的大小自定义为600*400
		dr.get("http://www.google.com.hk");
		try {
		Thread.sleep(5000);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
		dr.quit();  //彻底退出WebDriver
		}

}
