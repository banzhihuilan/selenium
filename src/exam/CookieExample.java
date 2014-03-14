package exam;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CookieExample {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new FirefoxDriver();
		dr.get("http://www.baidu.com");
		Thread.sleep(1000);
		
		System.out.println(dr.manage().getCookies());
	    dr.manage().deleteAllCookies();
	    System.out.println(dr.manage().getCookies());
	    Cookie c1=new Cookie("BAIDUID","7E605D109D3DF094B9BB5F95394C14D9:FG=1");
	    Cookie c2=new Cookie("H_PS_PSSID","5480_1428_5224_4261_5565_4760_5516");
	    dr.manage().addCookie(c1);
	    dr.manage().addCookie(c2);
	    System.out.println(dr.manage().getCookies());
	    Thread.sleep(1000);
	    dr.quit();
	}

}
