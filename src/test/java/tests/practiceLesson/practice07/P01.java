package tests.practiceLesson.practice07;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WebUniversityPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P01 {
    @Test
    public void test01() {
        WebUniversityPage webUniversityPage=new WebUniversityPage();
        Actions actions = new Actions(Driver.getDriver());
        // http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
        Driver.getDriver().get("http://webdriveruniversity.com/To-Do-List/index.html");

        // Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)
        List<String> workList = new ArrayList<>(Arrays.asList("Kahvaltıyı hazırla","Bulaşıkları yıka","Bebekle ilgilen","Çocuğunun ödevine yardım et",
                "Selenyum çalış","Uyu"));
        for (String each:workList) {
            actions.click(webUniversityPage.textBox).sendKeys(each, Keys.ENTER).perform();
        }

        //Tüm yapılacakların üzerini çiz.
        List<WebElement>toDoList=webUniversityPage.toDoList;
        for (WebElement each:toDoList
             ) {
            each.click();
        }

        //Tüm yapılacakları sil.
        List<WebElement>deleteList=webUniversityPage.deleteButtonList;
        for (WebElement each:deleteList
             ) {
            each.click();
        }
        //Tüm yapılacakların silindiğini doğrulayın.
        Assert.assertFalse(webUniversityPage.deleteButtonWE.isDisplayed());

        Driver.closeDriver();

        //EXPLORATORY testing
    }
}
