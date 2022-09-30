package tests.day19;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_NegatifTest {
    @Test
    public void test01() {
        // 1 ) Bir Class olustur : NegativeTest
        //2) Bir test method olustur NegativeLoginTest()
        // https://www.hotelmycamp.com/ adresine git
        //login butonuna bas
        //test data username: manager1 ,  test data password : manager1!
        //Degerleri girildiginde sayfaya girilemedigini test et
        Driver.getDriver().get(ConfigReader.getProperty("hotelMyCampUrl"));

        //login butonuna bas
        HotelMyCampPage hotelMyCampPage= new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();

        //test data username: manager ,
        //test data password : Manager1!
        hotelMyCampPage.userNameBox.sendKeys(ConfigReader.getProperty("hotelMyCampWrongUserName"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("hotelMyCampWrongPassword"));
        hotelMyCampPage.loginButonu.click();

        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hotelMyCampPage.girisYapilamadiYaziElementi.isDisplayed());

        Driver.closeDriver();
    }
}
