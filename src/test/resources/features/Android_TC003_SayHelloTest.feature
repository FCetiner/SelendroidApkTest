Feature: Selendroid apk test senaryo
  @hello
  Scenario: Kullanici say hello sayfasinda kendi adini yazdirabilmeli

    Given Kullanici selendroid mobil applikasyonu guncelle uyari yazisini kabul eder
    And Kullanici webview butonuna tiklar
    And Kullanici name box'ın dolu oldugunu dogrular ve isim girer
    And Kullanici prefered car bolumunden bir arac secer

