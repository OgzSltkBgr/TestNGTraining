package tests.day23;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_DataProvider {
    BrcPage brcPage=new BrcPage();

    @DataProvider
    public static Object[][] kullanicilar() {
        return new Object[][]{{"oguz@gmail.com","123456"},{"saltuk@gmail.com","123456"}, {"bugra@gmail.com","123456"}};
    }

    @Test(dataProvider = "kullanicilar")
    public void test01(String userEmail, String password) {
        //https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));

        //login butonuna bas
        brcPage.birinciLoginButton.click();

        //Data provider ile 3 farklı userEmail ve 3 farklı password girelim
        //login butonuna tiklayin
        brcPage.email.sendKeys(userEmail);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(password)
                .sendKeys(Keys.ENTER).perform();

        //Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et
        Assert.assertTrue(brcPage.ikinciLoginButonu.isDisplayed());
    }
}
