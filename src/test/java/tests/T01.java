package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SpendingGoodPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class T01 {
    @Test
    public void US_004Test()  {
        Actions actions = new Actions(Driver.getDriver());
        ////Vendor "url" adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("spendingUrl"));
        SpendingGoodPage spendinGoodPage = new SpendingGoodPage();
        //. Vendor login olur
        spendinGoodPage.signInButton.click();
        spendinGoodPage.emailAdresBox.sendKeys(ConfigReader.getProperty("tubaEmail"));
        spendinGoodPage.passwordBox.sendKeys(ConfigReader.getProperty("tubaPassword"));
        spendinGoodPage.signInButton2.click();
        ReusableMethods.waitFor(3);

        // Vendor acilan sayfada My Account butonuna tiklar
        spendinGoodPage.myAccountButton.click();
        ReusableMethods.waitFor(3);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.jsExecutorClick(spendinGoodPage.orders);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);

        //Vendor My Account altinda Orders/Go Shop butonuna tiklar
        spendinGoodPage.goShop.click();

        //vendor buzdolabını sepete ekler
        ReusableMethods.jsExecutorScrool(spendinGoodPage.sortByMove);
        actions.sendKeys(Keys.PAGE_DOWN).perform();


        ReusableMethods.waitFor(3);
        //actions.moveToElement(spendinGoodPage.productsCrusher).perform();
        //ReusableMethods.jsExecutorClick(spendinGoodPage.productsCrusher1);

        actions.moveToElement(spendinGoodPage.arcelikBuzdolabiMove).perform();
        spendinGoodPage.arcelikBuzdolabiChart.click();

        ReusableMethods.waitFor(3);

        spendinGoodPage.viewChart.click();

      //  actions.sendKeys(Keys.PAGE_DOWN).perform();
        // ürün arttırma
      spendinGoodPage.quantityPlus.click();

        // ürün azaltma
        spendinGoodPage.getQuantityMinus.click();

        for (int i = 0; i <186 ; i++) {
            spendinGoodPage.quantityPlus.click();
        }
        ReusableMethods.waitFor(3);
        ReusableMethods.jsExecutorClick(spendinGoodPage.updateChart);

        ReusableMethods.waitFor(5);
        spendinGoodPage.clearChart.click();

    }}