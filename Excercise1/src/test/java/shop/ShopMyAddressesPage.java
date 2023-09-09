package shop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ShopMyAddressesPage {

    private final WebDriver driver;

    //na tej stronie będą zarówno elementy i metody potrzebne do kliknięcia w Create new Address,
//    jak i do sprawdzenia poprawności dodanego adresu.
    @FindBy(xpath = "//span[text()='Create new address']")
    WebElement createNewAddress;

    @FindAll(@FindBy(css = "a[data-link-action='delete-address']"))
    List<WebElement> deleteBtns;


    public ShopMyAddressesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void iClickOnCreateNewAddressBtn() {
        createNewAddress.click();

    }

    public void clickingNewlyAddedDeleteBtn() {
        WebElement newlyAddedDeleteBtn = deleteBtns.get(deleteBtns.size() - 1);
        newlyAddedDeleteBtn.click();
    }

//    nie napisałam metody "getCreatedAddressText" w tej klasie bo nie wiedziałam jak uzyskać dostęp do
//        zmiennej "addressTExt" z poziomu klasy ShopSteps, dlatego opisałam wszystko od razu tam
//
//    public String getCreatedAddressText() {
//        int dynamicIndex = addressesList.size() - 1; // Pobieramy indeks ostatniego elementu (następnego adresu)
//        WebElement newAddress = addressesList.get(dynamicIndex);
//        WebElement addressBody = newAddress.findElement(By.cssSelector(".address-body"));
//
//        String addressText = addressBody.getText();
//
//        System.out.println("Nowy adres:");
//        System.out.println(addressText); // Wydrukuj pobrany adres
//
//        return addressText;
//
//    }
}







