package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.SpendingGoodPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
public class H01 {
    //Store Manager url adresine gider
    //Store Manager My Account'a tiklar
    //Store Manager Username or email address kutusuna tiklar
    //Store Manager Gecerli bir username veya email adresi yazar
    //Store Manager Password kutusuna tiklar
    //Store Manager Gecerli bir password girer
    //Store Manager Sign in butonuna tiklar
    //Store Manager, Store Manager seceneğini tiklar
    //Store Manager Products seceneğini tiklar
    //Store Manager Add New'e tiklar
    //Store Manager fotograf ekleme kutusuna tiklar
    //Store Manager acılan sayfada "Media Library"a tiklar
    //Store Manager eklemek istedigi urun fotografini secer
    //Store Manager "Select" butonuna tiklar
    //Store Manager kucuk fotograf ekleme kutusuna tiklar
    //Store Manager eklemek istedigi urun fotografini secer
    //Store Manager "Add To Gallery" butonuna tiklar
    //Store Manager fotograflarin eklendigini gorur
    @Test
    public void TC_004() {
        SpendingGoodPage SpendinGoodPage = new SpendingGoodPage();
        Actions actions = new Actions(Driver.getDriver());
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        Driver.getDriver().get(ConfigReader.getProperty("spendingGoodUrl"));
        SpendinGoodPage.MyAccount.click();
        js.executeScript("arguments[0].click();", SpendinGoodPage.SignIn);
        //SpendinGoodPage.username.click();
        SpendinGoodPage.username.sendKeys(ConfigReader.getProperty("haticeEmail"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(2);
        SpendinGoodPage.Password.click();
        SpendinGoodPage.Password.sendKeys(ConfigReader.getProperty("haticePassword"));
        actions.sendKeys(Keys.ENTER).perform();
        js.executeScript("arguments[0].click();", SpendinGoodPage.StoreManager);
        SpendinGoodPage.StoreManager.click();
        ReusableMethods.waitFor(2);
        ReusableMethods.jsExecutorScrool(SpendinGoodPage.home);
        ReusableMethods.jsExecutorClick(SpendinGoodPage.Products);
        js.executeScript("arguments[0].scrollIntoView(true);", SpendinGoodPage.addNew);
        ReusableMethods.jsExecutorClick(SpendinGoodPage.addNew);
        ReusableMethods.waitFor(2);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.jsExecutorClick(SpendinGoodPage.fotoEkle1);
        ReusableMethods.waitFor(3);
        SpendinGoodPage.mediaLibrary.click();
        ReusableMethods.waitFor(3);
        SpendinGoodPage.ilkFotoSec.click();
        ReusableMethods.waitFor(3);
        SpendinGoodPage.select.click();
        ReusableMethods.waitFor(3);
        js.executeScript("arguments[0].scrollIntoView(true)", SpendinGoodPage.ikinciFotosec);
        //actions.sendKeys(Keys.PAGE_DOWN).perform();
        SpendinGoodPage.ikinciFotosec.click();
        ReusableMethods.waitFor(3);
        SpendinGoodPage.addToGallery.click();
        Assert.assertTrue(SpendinGoodPage.fotolarGorunur.isDisplayed());
    }
}