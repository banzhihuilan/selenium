package exam;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleLocate {
		public static void main(String[] args) throws InterruptedException{
			WebDriver dr=new FirefoxDriver();
			dr.get("file:///D:/form.html");
			Thread.sleep(2000);
			// by id
			dr.findElement(By.id("inputEmail")).click();
			Thread.sleep(1000);
			// by name
			dr.findElement(By.name("password"));
			Thread.sleep(1000);
			// by tagname
			String form=dr.findElement(By.tagName("form")).getAttribute("class");
	        System.out.println(form);
	        Thread.sleep(1000);
	        // by link text
	        WebElement link=dr.findElement(By.linkText("register"));
	        ((JavascriptExecutor)dr).executeScript("$(arguments[0]).fadeOut().fadeIn()", link);
	        Thread.sleep(2000);
	        // by css selector 
	        WebElement div=dr.findElement(By.cssSelector(".controls"));
	        ((JavascriptExecutor)dr).executeScript("$(arguments[0]).fadeOut().fadeIn()", div);
	        /*上面例子里由于html文件中引用了jquery，所以在执行js时可以使用jquery的$()及fadeIn()等方法。
	         * 如果你测试的页面没用包含jquery的话，这些方法是无效的。
	         */
	        Thread.sleep(1000);
	        dr.quit();
		 }
}

