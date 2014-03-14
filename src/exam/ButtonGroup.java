package exam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ButtonGroup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver dr=new FirefoxDriver();
		dr.get("file:///D:/button_group.html");
		Thread.sleep(1000);
		List<WebElement> buttons= dr.findElement(By.className("btn-group")).findElements(By.className("btn"));
        for(WebElement button: buttons){
        	if (button.getText().equals("second")){
        		button.click();
        		break;//用于终止某个语句块的执行，用于循环体中，可以强行退出循环
        	}
        }
        Thread.sleep(1000);
        dr.quit();
		
	}

}
