package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.SelendroidPage;

public class Android_TC004DisplayTextView {
    SelendroidPage selendroidPage=new SelendroidPage();
    @Given("Kullanici display text view butonuna tiklar")
    public void kullanici_display_text_view_butonuna_tiklar() {
        selendroidPage.visibleButtonTestCD.click();
    }


    @And("Text is sometimes displayed yazisinin gorunur oldugunu dogrular")
    public void textIsSometimesDisplayedYazisininGorunurOldugunuDogrular() {
        Assert.assertTrue(selendroidPage.visibleTextView.isDisplayed());
    }
}
