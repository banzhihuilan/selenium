package exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

public class Download {
	public static void main(String[] args) throws InterruptedException {
		FirefoxProfile firefoxprofile=new FirefoxProfile();
		firefoxprofile.setPreference("browser.download.foldList", 2);
		firefoxprofile.setPreference("browser.download.manager.showWhenStarting",false);
		firefoxprofile.setPreference("browser.download.dir","D://tools");
		firefoxprofile.setPreference("browser.helperApps.neverAsk.saveToDisk","exe");
		WebDriver dr=new FirefoxDriver(firefoxprofile);
		dr.get("http://rj.baidu.com/soft/detail/14000.html?ald");
		
		dr.findElement(By.className("download")).click();
		//»Á∫Œœ¬‘ÿƒÿ£ø
		Thread.sleep(1000);
		dr.quit();
		
		
	}

}
