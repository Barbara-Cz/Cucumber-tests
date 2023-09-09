package shop2;
//    potwierdzi address (możesz go dodać wcześniej ręcznie),
//        wybierze metodę odbioru - PrestaShop "pick up in store",
//        wybierze opcję płatności - Pay by Check,
//        kliknie na "order with an obligation to pay",-nie było takiego przycisku, kliknęłam "place order"

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shop2ShipmentPage {
    private final WebDriver driver;


    @FindBy(xpath = "//button[@class='btn btn-primary continue float-xs-right' and @name='confirm-addresses' and @value='1']")
    WebElement confirmAddressBtn;

    @FindBy(xpath = "//button[@class='continue btn btn-primary float-xs-right' and @name='confirmDeliveryOption' and @value='1']")
    WebElement confirmShpmntBtn;

    @FindBy(xpath = "//input[@id='payment-option-1' and contains(@class, 'ps-shown-by-js')]")
    WebElement selectPayment;

    @FindBy(xpath = "//input[@id='conditions_to_approve[terms-and-conditions]' and contains(@class, 'ps-shown-by-js')]")
    WebElement termsAndConditionsCheckbox;

    @FindBy(xpath = "//button[@class='btn btn-primary center-block' and @type='submit']")
    WebElement placeOrderBtn;

    public Shop2ShipmentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void iConfirmThsDeliveryAddress() {
        confirmAddressBtn.click();
    }

    public void iConfirmShipmentType() {
        confirmShpmntBtn.click();
    }

    public void iSelectPaymentMethod() {
        selectPayment.click();
    }

    public void iCheckCheckedBox() {
        termsAndConditionsCheckbox.click();
    }

    public void iPlaceOrder() {
        placeOrderBtn.click();
    }


}