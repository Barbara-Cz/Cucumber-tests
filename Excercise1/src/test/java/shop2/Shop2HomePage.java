package shop2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shop2HomePage {
    private final WebDriver driver;

    @FindBy(css = "a[href='https://mystore-testlab.coderslab.pl/index.php?id_product=2&id_product_attribute=9&rewrite=brown-bear-printed-sweater&controller=product#/1-size-s']")
    WebElement productMiniature;



    public Shop2HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }




    public void iSelectProduct() {
        productMiniature.click();

    }
}

