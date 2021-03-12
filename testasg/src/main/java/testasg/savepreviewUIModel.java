package testasg;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.asg.utility.browserutility;

public class savepreviewUIModel extends browserutility {

	public void savepreview() throws InterruptedException {
//	WebElement savebutton = driver.findElement(By.xpath("//*[@id=\"mat-tab-content-0-0\"]/div/div[2]/div[3]/mat-toolbar/mat-toolbar-row/div[1]/span"));
//	savebutton.click();
	WebElement previewbutton=driver.findElement(By.xpath("//*[@id=\"preview\"]/span"));
//	WebDriverWait wait = new WebDriverWait(driver, 30);
//wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//*[@id=\"preview\"]/span"))));
//Thread.sleep(45000);
Thread.sleep(10000);
	driver.findElement(By.xpath("//*[@id=\"preview\"]/span")).click();
	boolean pb=previewbutton.isEnabled();
	if (pb==true) {
		previewbutton.click();
	}
	else
	{
		System.out.println("Not enabled");
	}
	}
	
	public WebElement verifypreviewcontent(String expected) throws InterruptedException
	{
		Thread.sleep(10000);
		ArrayList<String> al=new ArrayList<String>(driver.getWindowHandles());
//		Set<String> s= driver.getWindowHandles();
		driver.switchTo().window(al.get(1));
		WebElement actual=driver.findElement(By.id("header-pqikobz9cgj"));
		System.out.println("Header text "+actual.getText());
		Assert.assertEquals(actual.getText(), expected);
		return actual;
	}
}
