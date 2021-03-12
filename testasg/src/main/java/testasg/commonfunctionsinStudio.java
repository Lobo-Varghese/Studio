package testasg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.asg.utility.browserutility;

public class commonfunctionsinStudio extends browserutility {
	
	
	public void Expandfolder(String foldername) throws Exception {		
		WebElement UImodelname=driver.findElement(By.xpath("//div[@title='"+foldername+"']"));
		Thread.sleep(4000);		
		UImodelname.click();		
	}	
	
	public void openUImodel(String name) throws Exception {			
		WebElement UImodelname=driver.findElement(By.xpath("//div[@title='"+name+"']"));
		Thread.sleep(4000);		
		UImodelname.click();		
	}
}
