package exam;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseBrowser {
	public static void main(String[] args){
		WebDriver dr=new FirefoxDriver();
		System.out.println("browser will be closed.");
		//dr.close();�رյ�ǰ�����������
		dr.quit(); //�����رմ��ڣ����᳹�׵��˳�webdriver���ͷ���driver server֮������ӡ����Լ���˵quit�Ǹ��ӳ��׵�close��quit����õ��ͷ���Դ��
		System.out.println("browser is closed.");
	}

}
