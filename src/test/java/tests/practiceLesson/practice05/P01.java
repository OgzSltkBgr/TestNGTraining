package tests.practiceLesson.practice05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class P01 extends TestBaseBeforeMethodAfterMethod {
    @Test
    public void test01() {
        // ...Exercise3...
        // go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.findElement(By.id("cookieChoiceDismiss")).click();

        //fill the firstname
        driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Oguz");

        //fill the lastname
        driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Bugra");

        //check the gender
        driver.findElement(By.cssSelector("#sex-0")).click();

        //check the experience
        driver.findElement(By.cssSelector("#exp-0")).click();

        //fill the date
        driver.findElement(By.cssSelector("#datepicker")).sendKeys("28/09");

        //choose your profession -> Automation Tester
        driver.findElement(By.cssSelector("#profession-1")).click();

        //choose your tool -> Selenium Webdriver
        driver.findElement(By.cssSelector("#tool-2")).click();

        //choose your continent -> Antartica
        WebElement dropDown=driver.findElement(By.cssSelector("#continents"));
        Select select= new Select(dropDown);
        select.selectByVisibleText("Antartica");

        //choose your command  -> Browser Commands
        WebElement dropDown1=driver.findElement(By.cssSelector("#selenium_commands"));
        Select select1=new Select(dropDown1);
        select1.selectByVisibleText("Browser Commands");

        //click submit button
        driver.findElement(By.cssSelector("#submit")).click();
    }
}
