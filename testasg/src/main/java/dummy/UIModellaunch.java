package dummy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class UIModellaunch {
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://localhost:3030/projects");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement openproject=driver.findElement(By.xpath("/html/body/mdt-root/div[2]/div/studio-projects/div[2]/div[1]/div[3]/tbody/tr[1]/td[2]"));
		Actions acc=new Actions(driver);
		Thread.sleep(4000);
		acc.doubleClick(openproject).build().perform();
		Thread.sleep(4000);
		WebElement expandUImodel=driver.findElement(By.xpath("//*[@id=\'reduced-panel\']/div/div/div/div[2]/cdk-tree/cdk-nested-tree-node/div[2]/cdk-nested-tree-node[8]/div[1]/div[1]/div"));
		expandUImodel.click();
		Thread.sleep(4000);
		WebElement openUImodel=driver.findElement(By.xpath("//*[@id=\'reduced-panel\']/div/div/div/div[2]/cdk-tree/cdk-nested-tree-node/div[2]/cdk-nested-tree-node[8]/div[2]/cdk-nested-tree-node/div/div[2]"));
		openUImodel.click();
		Thread.sleep(4000);
		WebElement hideprojectpane=driver.findElement(By.xpath("//div[@class='editor-container parent']/div"));
		hideprojectpane.click();
		Thread.sleep(2000);
		WebElement hideuimodelpane=driver.findElement(By.xpath("//div[@class='gjs-pn-buttons']/span"));
		hideuimodelpane.click();	
		Thread.sleep(4000);
		//Action starts here
		// Use Actions class for tap and hold
//		WebElement findheader=driver.findElement(By.xpath("//div[@class=' gjs-block gjs-one-bg gjs-four-color-h']/div[text()='Header']"));
        WebElement findheader=driver.findElement(By.xpath("//*[@id=\"ui-modeller-canvas-b8234d2d-cf28-49f9-ae70-8edbcac3efbf\"]/div[1]/div[2]/div[4]/div[2]/div/div[2]/div/div[13]"));
		Actions builder = new Actions(driver);
        builder.clickAndHold(findheader);
        Action action=builder.build();
        Thread.sleep(2000);
     action.perform();
        Thread.sleep(2000);
//  switching to frame
        WebElement f = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(f);
		Thread.sleep(2000);
		WebElement body = driver.findElement(By.tagName("body"));
		body.click();
//		//find target place
WebElement target=driver.findElement(By.xpath("html/body/div[@id='wrapper']"));
//		WebElement target=driver.findElement(By.xpath("//*[contains(text(),\"Heading\")]"));
	builder.moveToElement(target);
		Thread.sleep(2000);
		builder.release(target);
		Thread.sleep(2000);	
		action=builder.build();
		Thread.sleep(2000);	
		action.perform();
//builder.moveToElement(target).click(target).release(target);
	}

}
