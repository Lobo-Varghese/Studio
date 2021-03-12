package dummy;

import java.awt.Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class processmodellaunch {
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
	WebElement expandPMmodel=driver.findElement(By.xpath("//*[@id=\"reduced-panel\"]/div/div/div/div[2]/cdk-tree/cdk-nested-tree-node/div[2]/cdk-nested-tree-node[5]/div[1]/div[1]/div"));
	expandPMmodel.click();
	Thread.sleep(4000);
	WebElement openPMmodel=driver.findElement(By.xpath("//*[@id=\'reduced-panel\']/div/div/div/div[2]/cdk-tree/cdk-nested-tree-node/div[2]/cdk-nested-tree-node[5]/div[2]/cdk-nested-tree-node/div/div[2]"));
	openPMmodel.click();
	Thread.sleep(4000);
	WebElement From=driver.findElement(By.xpath("//*[@class='bpmn-panel-elem-img start-event-img']"));	
    
    //Element on which need to drop.		
    WebElement To=driver.findElement(By.xpath("//*[@id='SvgjsRect1013']"));					
    		
    //Using Action class for drag and drop.		
    Actions act=new Actions(driver);					

//Dragged and dropped.		
    act.dragAndDrop(From, To).build().perform();
	}
}
