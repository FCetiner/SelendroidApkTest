## SelendroidApkTest

### Bu frameworkde selendroid mobil uygulamasindan 4 adet fonksiyonel test otomasyona dokulmustur.  

* TC001->Kullanici selendroid mobil application da kayit olabilmeli
* TC002->Pop up window gorunur olmali
* TC003->Kullanici say hello sayfasinda kendi adini yazdirabilmeli
* TC004->Kullanici display text view butonuna tikladiginda cıkan mesaji gorebilmeli

- Testler browserstack uzerinden remote olarak çaliştirilmaktadir.

- Framework olarak Cucumber BDD kullanıldı ve POM a gore dizayn edildi.

- Cucumber framework'ünde Rapor almak için ilgili testin tagi runner classına eklenir ve runner classindan calistirilir ve target/cucumber-html-reports altinda overwiev isimli raporlar browser da acılarak görüntülenir.

- Raporlar ayrica testlerin terminal uzerinden mvn clean verify komutu ile calistirilmasi ile alinabilir.

- stepdefinition da
Feature da bulunan stepler icin gerekli methodlar yazildi.

- pages package:
webelementlerin locateleri alindi.

- utilities: 
Driver, sık kullanılacak methodlar (AndroidReusable methods, Excel utils ) ve kullanılacak url ın daha kolay alınması icin configuration.properties
in baglantısı saglanır (ConfigReader).

- feature:
Stepler yazılır ve calistırılır. (Gherkin dili ile yazılmıstır)

- pom.xml:
Pluginler ve gerekli kütüphaneler dependecies ile icerisine eklenir.

- configuration.properties:
Hangi platformun kullanilacagi(androidbrowserstack-iosBrowserstack) ve proje kapsamında kullanılacak data lar yazılır. Datalar ayrica src/test/java/resources klasorunde bulunan excelden alinmaktadir.

- TC001 Register user videosu aşagıya eklenmiştir.


https://user-images.githubusercontent.com/93828041/191477508-b8518028-a81e-4753-948c-5f0e587e4d71.mp4


