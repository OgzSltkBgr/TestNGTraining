package tests.day19;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_PozitifTest {
    @Test
    public void test01() {
        // 1) com.techproed altinda bir package olustur : smoketest
        //2) Bir Class olustur : PositiveTest
        //3) Bir test method olustur positiveLoginTest()
        //https://www.hotelmycamp.com adresine git
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));

        //login butonuna bas
        HotelMyCampPage hotelMyCampPage= new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();

        //test data username: manager ,
        //test data password : Manager1!
        hotelMyCampPage.userNameBox.sendKeys(ConfigReader.getProperty("hotelMyCampValidUserName"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("hotelMyCampValidPassword"));
        hotelMyCampPage.loginButonu.click();

        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hotelMyCampPage.basariliGirisYazisiElementi.isDisplayed());

        Driver.closeDriver();

    }
}

