package tests.US018;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SpendingPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC01 extends TestBaseRapor {
    @Test
    public void testCase01()  {
        extentTest = extentReports.createTest("RequestID geri isteme istegi", "Vendor olarak RequestID geri isteme istegi olusturulabilmeli");
        SpendingPage spendingPage=new SpendingPage();
        Actions actions = new Actions(Driver.getDriver());
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();

        Driver.getDriver().get(ConfigReader.getProperty("spendingUrl"));
        spendingPage.signIn.click();
        spendingPage.emailBox.sendKeys(ConfigReader.getProperty("spendingEmail"));
        spendingPage.passwordBox.sendKeys(ConfigReader.getProperty("spendingPassword"));
        spendingPage.sigInButton.click();
        extentTest.info("Spendinggood sitesine gidildi, vendor olarak giris yapıldı");

        ReusableMethods.waitFor(3);
        spendingPage.myAccount.click();
        extentTest.info("My account butonuna tiklandi.");
        js.executeScript("arguments[0].scrollIntoView(true);",spendingPage.dashboard);

        ReusableMethods.waitFor(1);
        spendingPage.storeManager.click();
        extentTest.info("Store Manager butonuna tiklandi.");

        js.executeScript("arguments[0].scrollIntoView(true);",spendingPage.home);
        ReusableMethods.waitFor(1);
        js.executeScript("arguments[0].click()",spendingPage.orders);
        extentTest.info("Orders butonuna tiklandi.");

        js.executeScript("arguments[0].scrollIntoView(true);",spendingPage.home);
        ReusableMethods.waitFor(1);
        Assert.assertFalse(spendingPage.ordersListViewDetails.isEmpty());
        ReusableMethods.waitFor(1);
        ReusableMethods.jsExecutorScrool(spendingPage.refundRequest);
        js.executeScript("arguments[0].click()",spendingPage.refundRequest);
        ReusableMethods.waitFor(1);
        Select select = new Select(spendingPage.refundRequestDropDown);
        ReusableMethods.waitFor(1);
        select.selectByIndex(0);
        spendingPage.refundRequestReasonTextBox.sendKeys("Magazamizdan kaynakl bir sorundan dolayı urununuz gonderilememektedir.");
        //spendingPage.refundRequestSubmitButton.click();

    }
}
