package exam;
//获取测试对象的title属性和该对象的文字内容
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Attribute {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new FirefoxDriver();
		dr.get("file:///D:/attribute.html");
		Thread.sleep(1000);
		// 获得tooltip的内容
		System.out.println(dr.findElement(By.id("tooltip")).getAttribute("data-original-title"));
		// 获取该链接的text
		System.out.println(dr.findElement(By.id("tooltip")).getText());
		Thread.sleep(1000);
        dr.quit();
		
		
		
	}

}
