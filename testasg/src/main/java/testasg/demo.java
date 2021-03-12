package testasg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	WebDriver driver;
	public void openbrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\chromdriver\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(8000);
		driver.manage().window().maximize();
	}
	
	public void scenario1() throws InterruptedException {
		List<WebElement> findnoofcolumns=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		int noofcolumns=findnoofcolumns.size();
		System.out.println("No of Columns" + noofcolumns);
		Thread.sleep(3000);
		List<WebElement> findnoofrows=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
		int noofrows=findnoofrows.size();
		System.out.println("No of Rows" + noofrows);
		Thread.sleep(3000);
		String firstxpath="//*[@id=\"leftcontainer\"]/table/tbody/tr[";
		String lastxpath="]/td[1]";
		String coldata="]/td[3]";		
		for (int i = 1; i < noofrows; i++) {
			String fullpath=firstxpath+i+lastxpath;
			
			//*[@id="leftcontainer"]/table/tbody/tr[6]/td[3]
			WebElement name=driver.findElement(By.xpath(fullpath));
			String a=name.getText();
			String aftertrim=a.trim();
//			System.out.println(aftertrim);
			if(aftertrim.contains("Bank"))
			{
				String col=firstxpath+i+coldata;
				System.out.println("Name found"+ a);
				WebElement name1=driver.findElement(By.xpath(col));
				String a1=name1.getText();
				System.out.println("Data for Bank"+ a1);
				break;
			}
//			else
//			{
//				System.out.println("Not Found");
//			}
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
demo dm=new demo();
dm.openbrowser();
dm.scenario1();
	}

}
