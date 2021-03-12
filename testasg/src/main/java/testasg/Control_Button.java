package testasg;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.asg.utility.FileUtilities;
import com.asg.utility.browserutility;

public class Control_Button extends browserutility {

	public void buttonPropertyID() throws InterruptedException, IOException
	{
		WebElement frame=driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frame);
		Thread.sleep(4000);
		WebElement clickontheButton=driver.findElement(By.xpath("//button[@label='Click Me']"));
		clickontheButton.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(4000);
		WebElement buttonidproperty=driver.findElement(By.xpath("//div[@title='Id']//following::div[1]//input"));
		Thread.sleep(2000);
		buttonidproperty.clear();
		ArrayList<String> getID=FileUtilities.getdata("Button-Single");
		String ID=getID.get(1);
		buttonidproperty.sendKeys(ID);
//		buttonidproperty.sendKeys("button-a67687");
	}
}
