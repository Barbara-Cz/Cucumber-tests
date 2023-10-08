package shop;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class ShopSteps {

    private WebDriver driver;

    private ShopMyAddressesPage myAddressesPage;


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

    @And("I go to addresses page")

    public void iGoToAddressesPage() {

        ShopMyAccountPage myAccountPage = new ShopMyAccountPage(driver);
        myAccountPage.goToMyAddressesPage();
    }

    @And("I add new address")
    public void iAddNewAddress() {
        ShopMyAddressesPage myAddressesPage = new ShopMyAddressesPage(driver);
        myAddressesPage.iClickOnCreateNewAddressBtn();


    }

    @And("I fill in the New address form with alias {} address {} city {word} postalCode {} country {} and phone {}")
    public void iFillInTheNewAddressFormWithAliasAliasAddressAddressCityCityPostalCodePostalCodeCountryCountryAndPhonePhone(String alias, String address, String city, String postalCode, String country, String phone) {
        ShopNewAddressPage newAddressPage = new ShopNewAddressPage(driver);
        newAddressPage.iFillNewAddressForm(alias, address, city, postalCode, country, phone);
        driver.findElement(By.cssSelector("button[type=submit]")).click();
    }

    @Then("I verify created address {}, {}, {}, {}, {}, {}, {}, {}")
    public String iVerifyCreatedAddressAliasNameSurnameAddressCityPostalCodeCountryPhone(String alias, String name, String surname, String address, String city, String postalCode, String country, String phone) {

        List<WebElement> addressesList = driver.findElements(By.cssSelector("article.address"));
        int dynamicIndex = addressesList.size() - 1;
        WebElement newAddress = addressesList.get(dynamicIndex);
        WebElement addressBody = newAddress.findElement(By.cssSelector(".address-body"));

        String addressText = addressBody.getText();
        addressText = addressText.replaceAll("\\s+", " ").trim();

        System.out.println("Nowy adres:");
        System.out.println(addressText);
        String expectedAddress = String.join(" ", alias, name, surname, address, city, postalCode, country, phone);

//
        Assert.assertEquals(expectedAddress, addressText);
        return addressText;

    }

    @And("I delete created address")
    public void iDeleteCreatedAddress() {
        ShopMyAddressesPage myAddressesPage = new ShopMyAddressesPage(driver);
        myAddressesPage.clickingNewlyAddedDeleteBtn();

    }

    @And("I close the browser")
    public void iCLoseTheBrowser() {
        driver.quit();
    }


}







