package shop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopNewAddressPage {
    private final WebDriver driver;

    @FindBy(id = "field-alias")
    WebElement aliasInput;
    @FindBy(id = "field-address1")
    WebElement addressInput;
    @FindBy(id = "field-city")
    WebElement cityInput;
    @FindBy(name = "postcode")
    WebElement postalCodeInput;
    @FindBy(id = "field-id_country")
    WebElement countryInput;
    @FindBy(id = "field-phone")
    WebElement phoneInput;
//    @FindBy(type = "submit")
//    WebElement saveBtn;



//    @FindBy(name = "submitNewsletter")
//    WebElement newsLetter;

//    @FindBy(name ="email")
//        WebElement inputNewsletter;


    public ShopNewAddressPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void iFillNewAddressForm(String alias, String address, String city, String postalCode, String country, String phone) {
        aliasInput.clear();
        aliasInput.sendKeys(alias);

        addressInput.clear();
        addressInput.sendKeys(address);

        cityInput.clear();
        cityInput.sendKeys(city);

        postalCodeInput.clear();
        postalCodeInput.sendKeys(postalCode);

//        Select countryDropdown = new Select(countryInput);
//        countryDropdown.selectByVisibleText(country);

        countryInput.click();
        countryInput.click();

//        phoneInput.clear();

        phoneInput.clear();
        phoneInput.sendKeys(phone);
//Thread.sleep(5000);

//        saveBtn.click();

//        inputNewsletter.sendKeys("barb.olech@gmail.com");
//        newsLetter.click();

    }
}
//
////        ten będzie do zmiany, bo  jest lista a nie pole do wpisania tekstu,
////        muszę wpisać coś po kliknięciu, a tam jest tylko jeden wybór UK
//public void iSelectCountry(String country) {}