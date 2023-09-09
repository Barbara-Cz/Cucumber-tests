package shop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopMyAccountPage {
    private final WebDriver driver;

    //    tutaj wypiszę wszystkie elementy na stornie

    @FindBy(id = "addresses-link")
    private WebElement addressesTile;

    //    to jest konstruktor pozwala korzystać z WebDriver i Page Factory
    public ShopMyAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //tutaj wypiszę metody użyte na stornie
    public void goToMyAddressesPage() {
        addressesTile.click();

    }
}
