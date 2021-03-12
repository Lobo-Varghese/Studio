package stepdefinition;

import com.asg.utility.browserutility;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends browserutility {

	@Before
    public void beforeScenario() throws Exception{
		browserutility.OpenBrowser();
    } 
 
 @After
    public void afterScenario(){
       driver.quit();
    }
}
