package shop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopSignInPage {
    private final WebDriver driver;
    @FindBy(id = "field-email")
    WebElement emailField;

    @FindBy(id = "field-password")
    WebElement psswdField;

    @FindBy(id = "submit-login")
    WebElement logInBtn;


    public ShopSignInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void iEnterEmail() {
        emailField.sendKeys("zkkrrggkmtuwprpzfi@cazlg.com");
    }

    public void iEnterPsswd() {
        psswdField.sendKeys("1234ToStefcio:)");
    }

    public void iLogIn() {
        logInBtn.click();
    }
}

