package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.IOSSampleDemoPage;

public class IOSStepdefinition {
    IOSSampleDemoPage ios=new IOSSampleDemoPage();

    @Given("Kullanici sample ios app de text butonuna tiklar")
    public void kullanici_sample_ios_app_de_text_butonuna_tiklar() {
        ios.textButton.click();
    }

    @Given("Kullanici {string} yazisini gonderir ve gonderildigini dogrular")
    public void kullanici_yazisini_gonderir_ve_gonderildigini_dogrular(String message) {
       ios.textInput.sendKeys(message);
        Assert.assertEquals("gonderilen mesaj yazilmadi",message,ios.textInput.getText());
    }


    @Given("Kullanici alert butonunu tiklar")
    public void kullaniciAlertButonunuTiklar() {
        ios.alertButton.click();
    }

    @And("Kullanici acilan alert te ok tusuna basar")
    public void kullaniciAcilanAlertTeOkTusunaBasar() {
        ios.alertAcceptButton.click();
    }
}
