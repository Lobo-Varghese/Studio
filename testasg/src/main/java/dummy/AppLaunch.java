package dummy;

import java.awt.Frame;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppLaunch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://localhost:3030/projects");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement createnowbutton=driver.findElement(By.xpath("//button[contains(text(),'Create Now')]"));
		if(createnowbutton.isDisplayed()){
			createnowbutton.click();
			Thread.sleep(1000);
			WebElement nametextbox=driver.findElement(By.id("role-input-box"));
			nametextbox.clear();
			nametextbox.sendKeys("Namekey");
			WebElement savebutton=driver.findElement(By.xpath("//span[contains(text(),'SAVE')]"));
			savebutton.click();
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebDriverWait wb=new WebDriverWait(driver, 30);
//	        wb.until(ExpectedConditions.)
		}
		else
		{
//			WebElement addicon=driver.findElement(By.className("plus-add-icon"));
//			addicon.click();
//			Thread.sleep(2000);
//			WebElement nametextbox=driver.findElement(By.id("role-input-box"));
//			nametextbox.clear();
//			nametextbox.sendKeys("Namekey4");
//			WebElement savebutton=driver.findElement(By.xpath("//span[contains(text(),'SAVE')]"));
//			savebutton.click();
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
			driver.switchTo().defaultContent();
			Actions builder=new Actions(driver);			
			WebElement findheader=driver.findElement(By.xpath("//div[@class=' gjs-block gjs-one-bg gjs-four-color-h']/div[text()='Header']"));
			
			builder.clickAndHold(findheader);
			Action action = builder.build();
			action.perform();
			
			WebElement f = driver.findElement(By.tagName("iframe"));
			driver.switchTo().frame(f);
			
Thread.sleep(2000);			
	WebElement target=driver.findElement(By.xpath("//*[@id='wrapper']"));

//			Actions act1=action.moveToElement(driver.findElement(By.xpath("//*[@id='wrapper']")));
//			act1.release(driver.findElement(By.xpath("//*[@id='wrapper']"))).build().perform();
//			builder.moveToElement(target);
//			builder.release(target);     
//			action = builder.build();
//			action.perform();
			/*
			 * Thread.sleep(2000); JavascriptExecutor js = (JavascriptExecutor) driver; js.
			 * executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');"
			 * , target);
			 * 
			 * //act.clickAndHold(findheader).moveToElement(target).release(target).build().
			 * perform();
			 * 
			 * // // // act.dragAndDrop(findheader, target).build().perform();
			 * 
			 * // grab your element Actions builder = new Actions(driver);
			 * 
			 * WebElement findheader=driver.findElement(By.
			 * xpath("//div[@class=' gjs-block gjs-one-bg gjs-four-color-h']/div[text()='Header']"
			 * )); JavascriptExecutor js1 = (JavascriptExecutor) driver; 
			 * js1.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');",findheader);
			 *  Thread.sleep(6000); Actions action =
			 * builder.clickAndHold(findheader); builder.build(); action.perform();
			 * 
			 * // switch to the frame (you havent told webdriver to un-grab
			 * driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
			 * //switching frames
			 * 
			 * // move and drop Actions builder1 = new Actions(driver); //
			 * driver.navigate().refresh(); // Thread.sleep(4000); Actions action1 =
			 * builder.moveToElement(driver.findElement(By.xpath("//*[@id='wrapper']")));
			 * builder1.release(driver.findElement(By.xpath("//*[@id='wrapper']")));
			 * builder1.build(); action1.perform();
			 */
			
			

		}


	}

}


//
//
//driver.navigate().refresh();
//Thread.sleep(4000);
//WebElement expandUImodel1=driver.findElement(By.xpath("//*[@id=\'reduced-panel\']/div/div/div/div[2]/cdk-tree/cdk-nested-tree-node/div[2]/cdk-nested-tree-node[8]/div[1]/div[1]/div"));
//expandUImodel1.click();
//Thread.sleep(4000);
//WebElement openUImodel1=driver.findElement(By.xpath("//*[@id=\'reduced-panel\']/div/div/div/div[2]/cdk-tree/cdk-nested-tree-node/div[2]/cdk-nested-tree-node[8]/div[2]/cdk-nested-tree-node/div/div[2]"));
//openUImodel1.click();
//Thread.sleep(4000);