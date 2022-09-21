package stepdefinitions;

import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.SelendroidPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Android_TC003SayHelloTestStepDefinition {
    SelendroidPage selendroidPage =new SelendroidPage();
    WebDriverWait wait = new WebDriverWait(Driver.get(), 10);


    @And("Kullanici webview butonuna tiklar")
    public void kullaniciWebviewButonunaTiklar() {
        selendroidPage.webviewButton.click();
    }

    @And("Kullanici name box'ın dolu oldugunu dogrular ve isim girer")
    public void kullaniciNameBoxInDoluOldugunuDogrularVeIsimGirer() {
        wait.until(ExpectedConditions.visibilityOf(selendroidPage.goToHomeScreenButton));
       Driver.get().switchTo().window("WEBVIEW");
        Assert.assertNotNull(selendroidPage.nameInputBox);
        selendroidPage.nameInputBox.clear();
        selendroidPage.nameInputBox.sendKeys(ConfigurationReader.get("nameHello"));
    }

    @And("Kullanici prefered car bolumunden bir arac secer")
    public void kullaniciPreferedCarBolumundenBirAracSecer() {
        selendroidPage.preferredCarButton.click();
        selendroidPage.mercedesChoise.click();
        selendroidPage.sendMeYourNameButton.click();
    }


}
