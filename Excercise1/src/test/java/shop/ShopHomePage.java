package shop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopHomePage {
    private final WebDriver driver;
    @FindBy(className = "user-info")

    WebElement signInBtn;

    public ShopHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void openHomePage() {
        driver.get("https://mystore-testlab.coderslab.pl");
    }

    public void goToSignInPage() {
        signInBtn.click();
    }
}

