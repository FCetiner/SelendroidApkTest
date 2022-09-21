package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.SelendroidPage;
import utilities.Driver;
import utilities.ExcelUtil;

import java.io.IOException;

public class Android_TC001RegistirationStepdefinition {
SelendroidPage selendroidPage =new SelendroidPage();

   static String path="src/test/java/resources/selendroidAppTestData.xlsx";

    @Given("Kullanici selendroid mobil applikasyonu guncelle uyari yazisini kabul eder")
    public void kullaniciSelendroidMobilApplikasyonuGuncelleUyariYazisiniKabulEder() {
        selendroidPage.guncellemeUyarisiKabulButonu.click();
    }

    @Given("Kullanici start user registration butonunu tiklar")
    public void kullanici_start_user_registration_butonunu_tiklar() {
        selendroidPage.registrationButton.click();
    }
    @Given("Kullanici username olarak {string} girer")
    public void kullanici_username_olarak_girer(String userName) throws IOException {
      userName=  ExcelUtil.cellCall(path,"Sheet1",1,0).toString();
        selendroidPage.userNameBox.sendKeys(userName);
    }
    @Given("Kullanici email olarak {string} girer")
    public void kullanici_email_olarak_girer(String email) {
        email = ExcelUtil.cellCall(path,"Sheet1",1,1).toString();
        selendroidPage.emailBox.sendKeys(email);
    }
    @Given("Kullanici password plarak {string} girer")
    public void kullanici_password_plarak_girer(String password) {
        password=ExcelUtil.cellCall(path,"Sheet1",1,2).toString();
        selendroidPage.passwordBox.sendKeys(password);
    }
    @Given("Kullanici name olarak {string} girer")
    public void kullanici_name_olarak_girer(String name) {
        selendroidPage.nameBox.clear();
        name=ExcelUtil.cellCall(path,"Sheet1",1,3).toString();
        selendroidPage.nameBox.sendKeys(name);
    }

    @And("Kullanici programming language olarak {string} girer")
    public void kullaniciProgrammingLanguageOlarakGirer(String programingLanguage) {
        selendroidPage.dropClick.click();
        programingLanguage=ExcelUtil.cellCall(path,"Sheet1",1,4).toString();
        String xpath="//*[@text=\""+programingLanguage+"\"]";
        Driver.get().findElement(By.xpath(xpath)).click();
    }

    @And("Kullanici accept adds butonu secer ve register butonuna basar")
    public void kullaniciAcceptAddsButonuSecerVeRegisterButonunaBasar() {
        TouchAction touchAction = new TouchAction(Driver.get());
        touchAction.longPress(PointOption.point(528, 934))
                .moveTo(PointOption.point(552, 618))
                .release()
                .perform();

        selendroidPage.acceptButton.click();

        touchAction.longPress(PointOption.point(528, 934))
                .moveTo(PointOption.point(552, 618))
                .release()
                .perform();
    selendroidPage.registerButton.click();
    }

    @Then("Kullanici girdigi bilgilerin dogru oldugunu teyit eder")
    public void kullaniciGirdigiBilgilerinDogruOldugunuTeyitEder() {
        Assert.assertEquals("name farklı", selendroidPage.nameData.getText(),ExcelUtil.cellCall(path,"Sheet1",1,3).toString());
        Assert.assertEquals("username farklı", selendroidPage.usernameData.getText(),ExcelUtil.cellCall(path,"Sheet1",1,0).toString());
        Assert.assertEquals("password farklı", selendroidPage.passwordData.getText(),ExcelUtil.cellCall(path,"Sheet1",1,2).toString());
        Assert.assertEquals("email farklı", selendroidPage.emailData.getText(),ExcelUtil.cellCall(path,"Sheet1",1,1).toString());
        Assert.assertEquals("programlama dili farklı", selendroidPage.programingLanguageData.getText(),ExcelUtil.cellCall(path,"Sheet1",1,4).toString());
    }

    @Then("Kullanici register user butonuna basar")
    public void kullaniciRegisterUserButonunaBasar() {
        selendroidPage.registerUser.click();
    }



}
