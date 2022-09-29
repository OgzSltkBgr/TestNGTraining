package tests.practiceLesson.practice05;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class P02 extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test01() {
        // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");

        // 2. JavaScript alertin "CLICK ME!" seçeneğine tıklayın
        driver.findElement(By.cssSelector("#button1")).click();

        // 3. Açılır metni alın
        String alertMessage=driver.switchTo().alert().getText();
        System.out.println(alertMessage);

        // 4. Mesajın "I am an alert box!" olduğunu doğrulayın.
        Assert.assertTrue(alertMessage.equals("I am an alert box!"));

        // 5. Açılır pencereyi kabul edin
        driver.switchTo().alert().accept();
    }
}
