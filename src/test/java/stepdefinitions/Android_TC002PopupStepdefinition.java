package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import pages.SelendroidPage;
import utilities.Driver;

public class Android_TC002PopupStepdefinition {
SelendroidPage task=new SelendroidPage();
    @And("Display popup window yazisini tiklar")
    public void displayPopupWindowYazisiniTiklar() {
    task.showPopupButton.click();
    }

    @And("Acilan popup reddeder")
    public void acilanPopupReddeder() {
   //     Alert alert = Driver.get().switchTo().alert();
     //   alert.accept();
    //   Driver.get().switchTo().alert().accept();
   //     Driver.get().findElementById("android:id/button1").click();
   //     Driver.get().getKeyboard().sendKeys(Keys.ENTER);
   //     List<AndroidElement> els2 = (List<AndroidElement>) Driver.get().findElementsById("android:id/button1");
     //   els2.get(0).click();
        TouchAction touchAction = new TouchAction(Driver.get());
        touchAction.tap(PointOption.point(559, 1007))
                .perform();
    }


}
