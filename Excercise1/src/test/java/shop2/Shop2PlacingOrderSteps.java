package shop2;

//Zadanie warsztatowe 2 (dowolny sposób)
//        Napisz skrypt, który:
//
//        zaloguje się na tego samego użytkownika z zadania 1,
//        wybierze do zakupu Hummingbird Printed Sweater (opcja dodatkowa: sprawdzi czy rabat na niego wynosi 20%),
//        wybierze rozmiar M (opcja dodatkowa: zrób tak żeby można było sparametryzować rozmiar i wybrać S,M,L,XL),
//        wybierze 5 sztuk według parametru podanego w teście (opcja dodatkowa: zrób tak żeby można było sparametryzować liczbę sztuk),
//        dodaj produkt do koszyka,
//        przejdzie do opcji - checkout,
//        potwierdzi address (możesz go dodać wcześniej ręcznie),
//        wybierze metodę odbioru - PrestaShop "pick up in store",
//        wybierze opcję płatności - Pay by Check,
//        kliknie na "order with an obligation to pay",
//        zrobi screenshot z potwierdzeniem zamówienia i kwotą.

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import shop.ShopHomePage;
import shop.ShopSignInPage;

import java.time.Duration;

public class Shop2PlacingOrderSteps {
    private WebDriver driver;
    private Shop2HomePage homePage;
    private Shop2SignInPage signInPage;

    @Given("I'm on shop Home page")
    public void imOnShopHomePage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://mystore-testlab.coderslab.pl");
    }

    @When("I go to Sign in page")
    public void iGoToSignInPage() {
        ShopHomePage homePage = new ShopHomePage(driver);
        homePage.openHomePage();
        homePage.goToSignInPage();
    }

    @And("I sign in using {string} and {string}")
    public void iSignInUsingAnd(String login, String passwd) {
        ShopSignInPage signInPage = new ShopSignInPage(driver);
        signInPage.iEnterEmail();
        signInPage.iEnterPsswd();
        signInPage.iLogIn();
    }

    @And("I go back to Home Page")
    public void iGoBackToHomePage() {
        Shop2SignInPage signInPage = new Shop2SignInPage(driver);
        signInPage.iGoBackToHomePage();
    }


    @And("I select the Hummingbird Printed Sweater product")
    public void iSelectTheHummingbirdPrintedSweaterProduct() {
        Shop2HomePage homePage = new Shop2HomePage(driver);
        homePage.iSelectProduct();
    }

    @And("I select size M")
    public void iSelectSizeM() {
        Shop2ProductPage productPage = new Shop2ProductPage(driver);
        productPage.selectSize("M");
    }

    @And("I select 5 pieces")
    public void iSelect5Pieces() {
        Shop2ProductPage productPage = new Shop2ProductPage(driver);
        productPage.selectQuantity();
    }

    @And("I add the product to the cart")
    public void iAddTheProductToTheCart() {
        Shop2ProductPage productPage = new Shop2ProductPage(driver);
        productPage.addToCart();

    }

    @And("I proceed to the checkout")
    public void iProceedToTheCheckoutOption() {
        Shop2ProductPage productPage = new Shop2ProductPage(driver);
        productPage.proceedToCheckOut();
    }

    @And("I confirm the delivery address")
    public void iConfirmTheDeliveryAddress() {
        Shop2ShipmentPage shipmentPage = new Shop2ShipmentPage(driver);
        shipmentPage.iConfirmThsDeliveryAddress();
    }

    @And("I choose the pick up in store pickup method")
    public void iChoosePickUpInStorePickUpMethod() {
        Shop2ShipmentPage shipmentPage = new Shop2ShipmentPage(driver);
        shipmentPage.iConfirmShipmentType();
    }

    @And("I select the Pay by Check payment method")

    public void iSelectThePayByCheckPaymentMethod() {
        Shop2ShipmentPage shipmentPage = new Shop2ShipmentPage(driver);
        shipmentPage.iSelectPaymentMethod();
        shipmentPage.iCheckCheckedBox();

    }

    @And("I place the order")
    public void iPlaceTheOrder() {
        Shop2ShipmentPage shipmentPage = new Shop2ShipmentPage(driver);
        shipmentPage.iPlaceOrder();
    }

    @Then("I should see an order confirmation with the total amount")
    public void iShouldSeeAnOrderConfirmationWithTheTotalAmount() {
        Shop2OrderSummaryPage orderSummaryPage = new Shop2OrderSummaryPage(driver);
        orderSummaryPage.iTakeAScreenshot("/Users/bolech/Desktop/SavedScreenshots/screenshot3.png");
    }

    @And("I close the browser")
    public void iCLoseTheBrowser() {
        driver.quit();
    }

}



