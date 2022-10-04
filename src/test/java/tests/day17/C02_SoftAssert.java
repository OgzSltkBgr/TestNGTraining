package tests.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C02_SoftAssert extends TestBaseBeforeMethodAfterMethod {
    @Test (groups = "gp1")
    public void test01() {
        //1-amazon anasayfaya gidin
        driver.get("https://amazon.com");

        //2-title in Amazon içerdigini test edin
        String expectedTitle="Amazon";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(driver.getTitle().contains(expectedTitle));

        //3-arama kutusnun erişilebilir oldugunu tets edin
        softAssert.assertTrue(driver.findElement(By.id("twotabsearchtextbox")).isDisplayed());

        //4-arama kutusuna Nuella yazıp aratın
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nutella", Keys.ENTER);

        //5-arama yapıldıgını test edin
        WebElement aramaSonucu=driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(aramaSonucu.isDisplayed());

        //6-arama sonucunun Nutella içerdigini test edin
        softAssert.assertTrue(aramaSonucu.getText().contains("Nutella"));
    }
}
