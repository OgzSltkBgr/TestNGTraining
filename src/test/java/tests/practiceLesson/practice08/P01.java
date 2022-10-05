package tests.practiceLesson.practice08;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HerokuTestPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class P01 {
    HerokuTestPage herokuTestPage;
    Actions actions=new Actions(Driver.getDriver());
    @Test
    public void test01() {
        //Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
        Driver.getDriver().get("https://testpages.herokuapp.com/styled/events/javascript-events.html");

        //Click all the buttons and verify they are all clicked
        herokuTestPage=new HerokuTestPage();

        herokuTestPage.onBlur.click();
        herokuTestPage.onclick.click();

        herokuTestPage.onclick.click();

        ReusableMethods.waitFor(3);
        actions.contextClick(herokuTestPage.onContextMenu)
                .doubleClick(herokuTestPage.onDoubleClick)
                .click(herokuTestPage.onFocus)
                .click(herokuTestPage.onKeyDown).sendKeys(Keys.ENTER)
                .click(herokuTestPage.onKeyUp).sendKeys(Keys.ENTER)
                .click(herokuTestPage.onKeyPress).sendKeys(Keys.ENTER)
                .moveToElement(herokuTestPage.onMouseOver)
                .moveToElement(herokuTestPage.onMouseLeave).moveToElement(herokuTestPage.onMouseOver)
                .click(herokuTestPage.onMouseDown).perform();

    List<WebElement> clickedList=herokuTestPage.elementlerinHepsininTiklandiginiDogrula;
        Assert.assertEquals(clickedList.size(),11);


        ReusableMethods.waitFor(3);
        Driver.closeDriver();
    }
}
