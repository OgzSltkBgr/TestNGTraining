package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C03_Priority extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void youtubeTesti() {
        driver.get("https://youtube.com");
    }

    @Test
    public void bestBuyTesti() {
        driver.get("https://bestbuy.com");
    }

    @Test
    public void amazonTesti() {
        driver.get("https://techproeducation.com");
    }
    @Test (groups = "gp1")
    public void hepsiburadaTesti() {
        driver.get("https://hepsiburada.com");
    }
}
