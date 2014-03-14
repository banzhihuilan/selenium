package exam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseBrowser {
	public static void main(String[] args){
		WebDriver dr=new FirefoxDriver();
		System.out.println("browser will be closed.");
		//dr.close();关闭当前的浏览器窗口
		dr.quit(); //不仅关闭窗口，还会彻底的退出webdriver，释放与driver server之间的连接。所以简单来说quit是更加彻底的close，quit会更好的释放资源。
		System.out.println("browser is closed.");
	}

}
