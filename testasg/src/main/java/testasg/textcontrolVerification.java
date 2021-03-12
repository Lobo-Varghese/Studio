package testasg;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.asg.utility.FileUtilities;
import com.asg.utility.browserutility;

public class textcontrolVerification extends browserutility{

	
	public void textPropertyID() throws InterruptedException, IOException
	{
		WebElement frame=driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frame);
		Thread.sleep(4000);
		WebElement clickonthetextbox=driver.findElement(By.xpath("//*[@label=\"Enter Text\"]"));
		clickonthetextbox.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		WebElement textidproperty=driver.findElement(By.xpath("//div[@title='Id']//following::div[1]//input"));
		Thread.sleep(2000);
		textidproperty.clear();
		ArrayList<String> getID=FileUtilities.getdata("TextBox");
		String ID=getID.get(1);
//		textidproperty.sendKeys(ID);
	}
}
