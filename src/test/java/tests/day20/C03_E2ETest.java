package tests.day20;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C03_E2ETest {
    @Test
    public void E2ETest() {

        // Tests packagenin altına class olusturun: CreateHotel
        //Bir metod olusturun: createHotel
        //https://www.hotelmycamp.com adresine git.
        //Username textbox ve password metin kutularını locate edin ve asagidaki verileri
        //Username : manager
        //Password  : Manager1!
        //Login butonuna tıklayın.

        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();

        hotelMyCampPage.girisYap();

        //Hotel Management/Room reservation menusunden ADD ROOM RESERVATION butonuna tiklayin
        hotelMyCampPage.bekle(3);
        hotelMyCampPage.hotelManagementLinki.click();
        hotelMyCampPage.roomReservationLinki.click();
        hotelMyCampPage.addRoomReservationButonu.click();

        //Açılan sayfadaki tüm metin kutularına istediğiniz verileri girin.
        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();
        Select select = new Select(hotelMyCampPage.idUserDropDown);

        select.selectByVisibleText("manager");
        actions.sendKeys(Keys.TAB).sendKeys("Happy Hotel")
                .sendKeys(Keys.TAB).sendKeys("1500")
                .sendKeys(Keys.TAB).sendKeys("10/02/2022")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("10/13/2022")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("2")
                .sendKeys(Keys.TAB).sendKeys("2")
                .sendKeys(Keys.TAB).sendKeys(faker.name().fullName())
                .sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().cellPhone())
                .sendKeys(Keys.TAB).sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB).sendKeys("Oda temiz olsun lütfen")
                .sendKeys(Keys.TAB).sendKeys(Keys.SPACE)
                .sendKeys(Keys.TAB).sendKeys(Keys.SPACE)
                //Save butonuna tıklayın.
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER)
                .perform();


        //“RoomReservation was inserted successfully” textinin göründüğünü test edin.
        Assert.assertTrue(hotelMyCampPage.roomResarvationSuccessfully.isDisplayed());

        //OK butonuna tıklayın.
        hotelMyCampPage.roomResarvationSuccessfullyOkButton.click();

        Driver.closeDriver();
    }
}
