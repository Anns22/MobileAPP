package Appium.Android;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstallAPK {

    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();

        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0"); // Version is a string here
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554"); // Use the correct device name or emulator name
        dc.setCapability("autoGrantPermissions", "true");
        // Set the path to your APK file
        dc.setCapability(MobileCapabilityType.APP, "C:\\Users\\ACS\\Downloads\\app-armeabi-v7a-release (2).apk");

        URL url = new URL("http://0.0.0.0:4723/wd/hub");

        AndroidDriver driver = new AndroidDriver(url, dc); // Specify the generic type for AndroidDriver
        System.out.println("Done");
        
        // Now, you can perform mobile app testing using the specified APK file.
        
        //driver.findElement(By.xpath("//android.widget.Button[@text='Allow']"));

    }
}


        
        
    
