package exam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleLocates {
	public static void main(String[] args) throws InterruptedException{
		WebDriver dr=new FirefoxDriver();//���������
		dr.get("file:///D:/checkbox.html");
		Thread.sleep(2000);
		// ѡ�����е�checkbox��ȫ������
		List<WebElement> els= dr.findElements(By.cssSelector("input[type=checkbox]"));
		for (WebElement e : els){
			e.click();
		}
		dr.navigate().refresh();
		System.out.println(els.size());// ��ӡ��ǰҳ�����ж��ٸ�checkbox
		// ѡ��ҳ�������е�input��Ȼ����й��˳����е�checkbox����ѡ֮
		/*
		List<WebElement> inputs = dr.findElements(By.tagName("input"));
		for(WebElement input : inputs){
		if(input.getAttribute("type").equals("checkbox")){
		input.click();
		}
		}
       */
		// ��ҳ�������1��checkbox�Ĺ���ȥ��	
		 els.get(els.size()-1).click();
		 els.clear();
		
	}
	
}

