package exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
public class LevelLocate {
public static void main(String[] args) throws InterruptedException {
	WebDriver dr=new FirefoxDriver();
	dr.get("file:///D:/level_locate.html");
	Thread.sleep(1000);
	dr.findElement(By.linkText("Link1")).click();
	
	(new WebDriverWait(dr, 10)).until(new ExpectedCondition<Boolean>(){
		public Boolean apply(WebDriver d){
		return d.findElement(By.id("dropdown1")).isDisplayed();
		}
		} );

	
	WebElement ul=dr.findElement(By.id("dropdown1"));
	//ul.findElement(By.linkText("Another action")).click();
	WebElement menu=ul.findElement(By.linkText("Another action"));
	Actions action=new Actions(dr);
	action.moveToElement(menu).perform();//movetoElement模拟把鼠标移动到某个具体的测试对象上
	dr.quit();
	
}
}
