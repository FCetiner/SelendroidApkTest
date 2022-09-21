@DisplayTextView
Feature:Selendroid apk test senaryo

  Scenario: Kullanici display text view butonuna tikladiginda cıkan mesaji gorebilmeli
    Given Kullanici selendroid mobil applikasyonu guncelle uyari yazisini kabul eder
    And Kullanici display text view butonuna tiklar
    And Text is sometimes displayed yazisinin gorunur oldugunu dogrular