package exam;
//��ȡ���Զ����title���Ժ͸ö������������
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Attribute {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new FirefoxDriver();
		dr.get("file:///D:/attribute.html");
		Thread.sleep(1000);
		// ���tooltip������
		System.out.println(dr.findElement(By.id("tooltip")).getAttribute("data-original-title"));
		// ��ȡ�����ӵ�text
		System.out.println(dr.findElement(By.id("tooltip")).getText());
		Thread.sleep(1000);
        dr.quit();
		
		
		
	}

}
