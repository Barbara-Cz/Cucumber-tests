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


}







