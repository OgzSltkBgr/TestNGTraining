package tests.day21;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.HepsiBuradaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class Odev {
    @Test
    public void test01() {
        HepsiBuradaPage hepsiBuradaPage=new HepsiBuradaPage();
        Actions actions = new Actions(Driver.getDriver());

        //Hepsiburada sayfasına gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("hepsiburadaUrl"));
        List<WebElement> urunList= hepsiBuradaPage.elementList;
        actions.moveToElement(hepsiBuradaPage.elektronik).click().perform();
        actions.moveToElement(hepsiBuradaPage.bilgisayarTablet).perform();

        for (WebElement each: urunList
             ) {
            //Elektronik altında bilgisayar/tablet altındaki tüm linkleri tıklayalım
            each.click();
            ReusableMethods.waitFor(1);
            Driver.getDriver().navigate().back();
            actions.moveToElement(hepsiBuradaPage.elektronik).click().perform();
            actions.moveToElement(hepsiBuradaPage.bilgisayarTablet).perform();
        }
        //Her linkten sonra o sayfaya gittimizi test edelim ve o sayfanız resmini alalım
        //Sayfayı kapatalım
    }
}
