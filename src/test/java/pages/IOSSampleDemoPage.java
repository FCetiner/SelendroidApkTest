package pages;

import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class IOSSampleDemoPage extends BasePage{

    @AndroidFindBy(accessibility = "Text Button")
    public IOSElement textButton;

    @AndroidFindBy(accessibility = "Text Input")
    public IOSElement textInput;

   @AndroidFindBy(accessibility = "Alert Button")
    public IOSElement alertButton;

   @AndroidFindBy(accessibility = "OK")
    public IOSElement alertAcceptButton;


}
