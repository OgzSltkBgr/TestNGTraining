package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SpendingPage {
    public SpendingPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[text()='Sign In ']")
    public WebElement signIn;

    @FindBy (xpath = "//input[@id='username']")
    public WebElement emailBox;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement passwordBox;

    @FindBy (xpath = "//button[@name='login']")
    public WebElement sigInButton;

    @FindBy (xpath = "(//a[text()='My Account'])[1]")
    public  WebElement myAccount;

    @FindBy (xpath = "//a[text()='Store Manager']")
    public WebElement storeManager;

    @FindBy (xpath = "(//span[@class='text'])[5]")
    public WebElement orders;

    @FindBy (xpath = "//span[@class='wcfmfa fa-eye text_tip']")
    public List<WebElement> ordersListViewDetails;

    @FindBy (xpath = "//*[@class='icon-box-icon icon-orders']")
    public WebElement ordersIcon;

    @FindBy (xpath = "//a[text()='Dashboard']")
    public WebElement dashboard;

    @FindBy (xpath = "(//a[@class='wcfmmp_order_refund_request wcfm-action-icon'])[7]")
    public WebElement refundRequest;

    @FindBy (xpath = "//*[@name='wcfm_refund_request']")
    public WebElement refundRequestDropDown;

    @FindBy (xpath = "(//span[text()='Home'])[1]")
    public WebElement home;

    @FindBy (xpath = "//*[@id='wcfm_refund_reason']")
    public WebElement refundRequestReasonTextBox;

    @FindBy (xpath = "//*[@id='wcfm_refund_requests_submit_button']")
    public  WebElement refundRequestSubmitButton;

    @FindBy (xpath = "(//span[@class='text'])[8]")
    public WebElement refundButton;

    @FindBy (xpath = "(//a[@class='wcfm_dashboard_item_title transaction_order_id'])[3]")
    public WebElement orderIdUrunNo;

    @FindBy (xpath = "(//span[@class='woocommerce-Price-amount amount'])[3]")
    public WebElement orderIdAmount;

    @FindBy (xpath = "(//tbody//tr//td)[19]")
    public WebElement refundType;

    @FindBy (xpath = "(//tbody//tr//td)[20]")
    public WebElement refundReason;

    @FindBy (xpath = "(//span[@class='text'])[11]")
    public WebElement follewers;

    @FindBy (xpath = "//td[text()='No data in the table']")
    public WebElement follewersTable;

    @FindBy (xpath = "(//span[@class='text'])[16]")
    public WebElement reviews;

    @FindBy (xpath = "//span[text()='Product Reviews']")
    public WebElement productReviews;

    @FindBy(xpath = "(//div[@class='wcfmmp-author-meta'])[2]")
    public WebElement productReviewsKullaniciBilgisi;

    @FindBy (xpath = "(//div[@class='wcfmmp-comments-content'])[2]")
    public WebElement productReviewsComment;

    @FindBy (xpath = "(//*[@itemprop='ratingValue'])[2]")
    public WebElement productReviewsRating;

    @FindBy (xpath = "//td[text()='15 October 2022 13:41']")
    public WebElement productReviewsDate;




}
