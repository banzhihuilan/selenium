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
	        /*��������������html�ļ���������jquery��������ִ��jsʱ����ʹ��jquery��$()��fadeIn()�ȷ�����
	         * �������Ե�ҳ��û�ð���jquery�Ļ�����Щ��������Ч�ġ�
	         */
	        Thread.sleep(1000);
	        dr.quit();
		 }
}

