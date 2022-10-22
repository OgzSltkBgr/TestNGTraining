package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SpendingGoodPage {
    public SpendingGoodPage(){
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (xpath="//a[@class='login inline-type']")       //ORTAK
    public WebElement signInButton;

    @FindBy(xpath = "//input[@id=\"username\"]")            //ORTAK
    public WebElement emailAdresBox;

    @FindBy(xpath = "//input[@id=\"password\"]")             //ORTAK
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@class=\"woocommerce-button button woocommerce-form-login__submit\"]")
    public WebElement signInButton2;                         //ORTAK

    @FindBy(xpath = "//li[@id=\"menu-item-1074\"]")
    public WebElement myAccountButton;                        //ORTAK

    @FindBy (xpath="(//*[text()='Orders'])[2]")
    public WebElement orders;

    @FindBy (xpath="//a[@class='btn btn-dark btn-rounded btn-icon-right continue-shopping mb-4 mt-6']")
    public WebElement goShop;

    @FindBy (xpath="//*[text()='Add to cart']")
    public List<WebElement> addtoCart;

    @FindBy (xpath="(//*[@class='w-icon-cart'])[1]")
    public WebElement cart;

    @FindBy (xpath="//a[@class='button checkout wc-forward']")
    public WebElement buttonCheckout;

    @FindBy (xpath = "//*[@aria-label='Add Arcelik to your cart']")
    public WebElement buzdolabi;

    @FindBy(xpath = "//*[@class='btn-product-icon product_type_simple add_to_cart_button ajax_add_to_cart']")
    public List<WebElement> miniAddToCartButon;

    @FindBy(xpath = "//*[@class='product-wrap']")
    public List<WebElement>UrunListesi;

    @FindBy (xpath="//*[@name='billing_first_name']")
    public  WebElement billingDetailsfirstName;

    @FindBy (xpath="//*[@name='billing_last_name']")
    public  WebElement billingDetailslastName;

    @FindBy (xpath="//*[@name='billing_company']")
    public  WebElement billingDetailscompany;

    @FindBy (xpath="//*[@name='billing_address_1']")
    public  WebElement billingDetailsstreetAddress;

    @FindBy (xpath="//*[@name='billing_postcode']")
    public  WebElement billingDetailspostCode;

    @FindBy (xpath="//*[@name='billing_city']")
    public  WebElement billingDetailscity;

    @FindBy (xpath="//*[@name='billing_phone']")
    public  WebElement billingDetailsphone;

    @FindBy (xpath="//*[@name='billing_email']")
    public  WebElement billingDetailemail;

    @FindBy (id="select2-billing_state-container']")
    public  WebElement billingDetailsprovince;

    @FindBy (xpath="(//span[@class='select2-selection__rendered'])[1]")
    public WebElement billingDetailscountry;

    @FindBy (id="place_order")
    public WebElement placeOrder;

    @FindBy (xpath="//*[@aria-label='Add Automatic Crusher to your cart']")
    public WebElement productsCrusher;

    @FindBy (xpath="(//*[@class='attachment-woocommerce_thumbnail size-woocommerce_thumbnail'])[15]")
    public WebElement productsCrusher1;

    @FindBy (xpath="(//a[@class='btn-product-icon product_type_simple add_to_cart_button ajax_add_to_cart'])[4]")
    public WebElement productsBagCart;

    @FindBy (xpath="(//label[@class='product-label label-sale'])[2]")
    public WebElement productsBag;

    @FindBy (xpath = "(//*[text()='My Account'])[1]")
    public WebElement MyAccount;
    @FindBy (xpath = "(//*[text()='Sign In'])[2]")
    public WebElement SignIn;
    @FindBy (xpath = "//*[@id='username']")
    public WebElement username;
    @FindBy (xpath = "(//*[@name='password'])[1]")
    public WebElement Password;
    @FindBy (xpath = "//*[text()='Store Manager']")
    public WebElement StoreManager;

    @FindBy (xpath = "(//*[text()='Status'])[1]")
    public WebElement statusGorunur;
    @FindBy (xpath = "(//*[text()='Stock'])[1]")
    public WebElement stockGorunur;
    @FindBy (xpath = "(//*[text()='Price'])[1]")
    public WebElement priceGorunur;
    @FindBy (xpath = "(//*[text()='Date'])[1]")
    public WebElement dateGorunur;
    @FindBy (xpath = "(//*[@class='wcfmfa fa-cube'])[3]")
    public  WebElement addNew;
    @FindBy (xpath = "(//*[text()='Virtual'])[1]")
    public WebElement virtualGorunur;
    @FindBy(xpath = "(//*[text()='Downloadable'])[1]")
    public WebElement downloadableGorunur;
    @FindBy (xpath = "//*[@id='pro_title']")
    public WebElement productTitle;
    @FindBy (xpath = "//*[@id='regular_price']")
    public WebElement price;
    @FindBy (xpath = "//*[@id='featured_img_display']")
    public WebElement fotoEkle1;
    @FindBy (xpath = "//*[@class='media-menu-item']")
    public WebElement mediaLibrary;
    @FindBy (xpath = "(//*[@class='attachment save-ready'])[1]")
    public WebElement ilkFotoSec;
    @FindBy (xpath = "//*[@class='button media-button button-primary button-large media-button-select']")
    public WebElement select;
    @FindBy (xpath = "//*[@id='gallery_img_gimage_0_display']")
    public WebElement fotoEkle2;
    @FindBy(xpath = "//*[@id='gallery_img_gimage_0_display']")
    public WebElement ikinciFotosec;
    @FindBy (xpath = "(//*[text()='Add to Gallery'])[6]")
    public WebElement addToGallery;
    @FindBy (xpath = "//*[@class='wcfm_product_manager_gallery_fields']")
    public  WebElement fotolarGorunur;


    @FindBy (xpath = "//*[@class='woocommerce-ordering toolbox-item toolbox-sort select-box']")
    public  WebElement sortByMove;
    @FindBy (xpath = "(//*[@class='product-label label-new'])[2]")
    public  WebElement arcelikBuzdolabiMove;

    @FindBy (xpath = "(//a[@class='btn-product-icon product_type_simple add_to_cart_button ajax_add_to_cart'])[2]")
    public  WebElement arcelikBuzdolabiChart;


    @FindBy (xpath = "//*[@class='btn btn-sm btn-rounded']")
    public  WebElement viewChart;

    @FindBy (xpath = "//*[@class='next page-numbers']")
    public WebElement nextButton;

    @FindBy(xpath = "//button[@value='SUBSCRIBE']")
    public WebElement subscribe;

    @FindBy (xpath = "(//*[@class='product-label label-sale'])[9]")
    public WebElement simsekMcQueenMove;

    @FindBy (xpath = "(//*[@class='btn-product-icon product_type_simple add_to_cart_button ajax_add_to_cart'])[10]")
    public WebElement simsekMcQueenChartButton;


    @FindBy (xpath = "//*[@title='Plus']")
    public WebElement quantityPlus;

    @FindBy(xpath = "//*[@title='Minus']")
    public WebElement getQuantityMinus;

    @FindBy (xpath = "//*[@name='update_cart']")
    public WebElement updateChart;

    @FindBy (xpath = "//button[@name='apply_coupon']")
    public WebElement applyCoupon;

    @FindBy(xpath = "//*[@id='select2-calc_shipping_country-container']")
    public WebElement shippingCountry;

    @FindBy (xpath = "//*[@id='calc_shipping_city_field']")
    public WebElement shippingCity;

    @FindBy (xpath = "//*[@id='select2-calc_shipping_state-container']")
    public WebElement shippingState;

    @FindBy (xpath = "//*[@id='calc_shipping_postcode_field']")
    public WebElement shippingPostCode;

    @FindBy (xpath = "//*[@class='checkout-button button alt wc-forward']")
    public WebElement proceedtoCheckout;

    @FindBy (xpath = "//*[@class='btn btn-dark btn-rounded btn-icon-left continue-shopping mb-4 mr-auto']")
    public WebElement continueShopping;

    @FindBy (xpath = "//*[@name='clear_cart']")
    public WebElement clearChart;

    @FindBy (xpath = "(//span[text()='Home'])[1]")
    public WebElement home;

    @FindBy (xpath = "(//span[@class='text'])[4]")
    public WebElement Products;

}