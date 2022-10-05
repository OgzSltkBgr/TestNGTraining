package tests.day22;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C01_RaporluTest extends TestBaseRapor {

    @Test
    public void test01() {
        extentTest = extentReports.createTest("BlueRentalCar", "Test ici yapilan islemler bildirilmeli.");
        BrcPage blueRentalCarsPage = new BrcPage();
        Actions actions=new Actions(Driver.getDriver());
        SoftAssert softAssert=new SoftAssert();
        //    -https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("blueRentalCars sayfasina gidildi.");

        //    -login butonuna bas
        //    -test data user email: customer@bluerentalcars.com ,
        //    -test data password : 12345 dataları girip login e basın
        //    -login butonuna tiklayin
        //login butonuna tıklayın

        blueRentalCarsPage.birinciLoginButton.click();
        extentTest.info("Ilk login butonuna tiklandi.");
        //email adres = customer@bluerentalcars.com
        //password =12345
        //Giris yapın (Enter ile)
        actions.click(blueRentalCarsPage.email)
                .sendKeys(ConfigReader.getProperty("brcValidEmail"))
                .sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("brcValidPassword"),Keys.ENTER).perform();

        extentTest.info("Bilgiler dogru girilerek sisteme giris yapildi.");

        //    -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        System.out.println(blueRentalCarsPage.girisDogrula.getText());
        softAssert.assertTrue(blueRentalCarsPage.girisDogrula.isDisplayed());
        extentTest.pass("Degerlerin dogru yazilarak sisteme giris yapildigi dogrulandi.");
        Driver.closeDriver();
    }
}
