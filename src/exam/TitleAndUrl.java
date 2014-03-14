package exam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleAndUrl {
	
		public static void main(String[] args) throws InterruptedException{
			WebDriver dr=new FirefoxDriver();
			Thread.sleep(2000);
			dr.get("http://www.baidu.com");
			Thread.sleep(2000);
			System.out.println("title of current page is "+dr.getCurrentUrl());
			System.out.println("title of current page is "+dr.getTitle());	
			dr.quit();
		}

}
