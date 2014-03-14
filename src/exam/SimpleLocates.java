package exam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleLocates {
	public static void main(String[] args) throws InterruptedException{
		WebDriver dr=new FirefoxDriver();//启动浏览器
		dr.get("file:///D:/checkbox.html");
		Thread.sleep(2000);
		// 选择所有的checkbox并全部勾上
		List<WebElement> els= dr.findElements(By.cssSelector("input[type=checkbox]"));
		for (WebElement e : els){
			e.click();
		}
		dr.navigate().refresh();
		System.out.println(els.size());// 打印当前页面上有多少个checkbox
		// 选择页面上所有的input，然后从中过滤出所有的checkbox并勾选之
		/*
		List<WebElement> inputs = dr.findElements(By.tagName("input"));
		for(WebElement input : inputs){
		if(input.getAttribute("type").equals("checkbox")){
		input.click();
		}
		}
       */
		// 把页面上最后1个checkbox的勾给去掉	
		 els.get(els.size()-1).click();
		 els.clear();
		
	}
	
}

