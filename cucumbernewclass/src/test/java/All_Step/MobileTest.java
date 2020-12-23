package All_Step;

import java.io.File;

import org.openqa.selenium.remote.DesiredCapabilities;

public class MobileTest {
	
	
	public void setup () {
		
		File app= new File("f");
		
		DesiredCapabilities capbilities =new DesiredCapabilities();
		capbilities.setCapability("deviceName", "");
		capbilities.setCapability("platformVersion", "5.0");
		capbilities.setCapability("platformName", "IOS");
		
		
		
	}
	

}
