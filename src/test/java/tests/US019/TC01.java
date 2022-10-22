package tests.US019;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SpendingPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TC01 extends TestBaseRapor {
    @Test
    public void testCase02() {
        SpendingPage spendingPage=new SpendingPage();
        Actions actions = new Actions(Driver.getDriver());
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();

        Driver.getDriver().get(ConfigReader.getProperty("spendingUrl"));
        spendingPage.signIn.click();
        spendingPage.emailBox.sendKeys(ConfigReader.getProperty("spendingEmail"));
        spendingPage.passwordBox.sendKeys(ConfigReader.getProperty("spendingPassword"));
        spendingPage.sigInButton.click();
        ReusableMethods.waitFor(3);
        spendingPage.myAccount.click();
        js.executeScript("arguments[0].scrollIntoView(true);",spendingPage.dashboard);
        ReusableMethods.waitFor(1);
        spendingPage.storeManager.click();
        js.executeScript("arguments[0].scrollIntoView(true);",spendingPage.home);
        js.executeScript("arguments[0].click()",spendingPage.follewers);
        js.executeScript("arguments[0].scrollIntoView(true);",spendingPage.home);
        String actualResultStr=spendingPage.follewersTable.getText();
        ReusableMethods.jsExecutorScrool(spendingPage.home);

        Assert.assertEquals(actualResultStr,"No data in the table");
        extentTest.fail("Takipçi adı görülemedi");

        Assert.assertEquals(actualResultStr,"No data in the table");
        extentTest.fail("Takipçi email i görülemedi");
    }
}
