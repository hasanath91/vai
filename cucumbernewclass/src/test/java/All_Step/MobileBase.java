package All_Step;

public class MobileBase extends MobileTest{
	
	AndroidDrive<AndroidElement>driver;
	
	public AndroidDrive<AndroidElement>getdriver(){
		capbilities.setCapability("MobileCapabilityType.DEVICE_NAME,"name");
		capbilities.setCapability("MobileCapabilityType.PLATFORM_NAME,"IOS");"
	    capbilities.setCapability("MobileCapabilityType.PLATFORM_VERSION,"11.4");
		capbilities.setCapability("MobileCapabilityType.APP,app.getAbsoulutepath();"
		driver=new AndroidDrive();
		return driver;
	}

}
 