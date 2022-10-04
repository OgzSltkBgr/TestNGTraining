package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class WebUniversityPage {
    public WebUniversityPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//*[@placeholder='Add new todo']")
    public WebElement textBox;

    @FindBy (xpath = "//li")
    public List<WebElement> toDoList;

    @FindBy (xpath = "//*[@class='fa fa-trash']")
    public List<WebElement> deleteButtonList;

    @FindBy (xpath = "//*[@class='fa fa-trash']")
    public WebElement deleteButtonWE;
}
