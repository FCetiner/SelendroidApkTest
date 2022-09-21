package utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {
    private static String userName = "ferhattask_9jNpVc";
    private static String accessKey = "q15Hb6atZnGoZ2p1Xxve";
    private Driver() {
    }
    private static AndroidDriver<AndroidElement> androidDriver;
    private static IOSDriver<IOSElement> iosDriver;


    public static AndroidDriver<AndroidElement> get(){
        if (androidDriver ==null){
            String platform = ConfigurationReader.get("platform");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            switch (platform){
                case "browserstack-Android":
                    capabilities.setCapability("platformName", "android");
                    capabilities.setCapability("platformVersion", "9.0");
                    capabilities.setCapability("deviceName", "Google Pixel 3");
                    capabilities.setCapability("app", "bs://05a384baca03a133d115bcc3bc2a20b93e4a451b");
                    try {
                        androidDriver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), capabilities);
                        Driver.get().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                    }catch (MalformedURLException e){
                        e.printStackTrace();
                    }
                    break;
                    case "browserstack-IOS":
                    capabilities.setCapability("platformName", "ios");
                    capabilities.setCapability("platformVersion", "12");
                    capabilities.setCapability("deviceName", "iPhone XS");
                    capabilities.setCapability("app", "bs://444bd0308813ae0dc236f8cd461c02d3afa7901d");
                    try {
                         iosDriver = new IOSDriver<IOSElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), capabilities);

                        Driver.get().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                    }catch (MalformedURLException e){
                        e.printStackTrace();
                    }
                    break;
                case "android":

                    capabilities.setCapability("platformName", "Android");
               //todo     capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"chrome");
                    capabilities.setCapability("platformVersion", "11.0");
                    capabilities.setCapability("deviceName", "Pixel_2");
                    capabilities.setCapability("automationName", "UiAutomator2");
                    capabilities.setCapability("app", "C:\\Users\\Ferhat\\IdeaProjects\\selendroidAppTest\\selendroid-test-app-0.17.0.apk");
                    try {
                        androidDriver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), capabilities);
                        Driver.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                    }catch (MalformedURLException e){
                        e.printStackTrace();
                    }
                    break;
                default:

            }
        }
        return androidDriver;
    }

    public static void closeDriver() {
        if (androidDriver !=null){
            androidDriver.quit();
            androidDriver =null;
        }
    }
}