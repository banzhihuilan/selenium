package exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navs {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new FirefoxDriver();
		dr.get("file:///D:/navs.html");
		Thread.sleep(1000);
		//ͨ��ul��λ��li
		dr.findElement(By.className("nav")).findElement(By.linkText("About")).click();//��֧�ָ�������
		//ֱ�Ӷ�λlink
		Thread.sleep(1000);
		dr.findElement(By.linkText("Home")).click();
		Thread.sleep(1000);
		dr.quit();
		
	}

}
