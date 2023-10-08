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

       

        countryInput.click();
        countryInput.click();


        phoneInput.clear();
        phoneInput.sendKeys(phone);


    }
}
