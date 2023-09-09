package shop2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

//Wybrać rozmiar M
//Wybrać 5 sztuk, dodać do koszyka, proceed to check out- pop up window

public class Shop2ProductPage {
    private final WebDriver driver;

    @FindBy(id = "group_1")
    WebElement sizeDropdown;

    @FindBy(id = "quantity_wanted")
    WebElement quantityInput;

    @FindBy(xpath = "//button[@class='btn btn-primary add-to-cart']")
    WebElement addToCartBtn;

    @FindBy(xpath = "//a[contains(@class, 'btn btn-primary') and contains(@href, 'controller=cart&action=show')]")
    WebElement checkOutBtn;

    @FindBy(css = "a[href='https://mystore-testlab.coderslab.pl/index.php?controller=order']")
    private WebElement proceedToCheckoutButton;


    public Shop2ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectSize(String size) {
        Select select = new Select(sizeDropdown);
        select.selectByVisibleText(size);
    }

    public void selectQuantity() {
        quantityInput.click();
        quantityInput.sendKeys(Keys.BACK_SPACE);
        quantityInput.sendKeys("5");

    }

    public void addToCart() {
        addToCartBtn.click();

    }

    public void proceedToCheckOut() {

        checkOutBtn.click();
        proceedToCheckoutButton.click();
    }

}


