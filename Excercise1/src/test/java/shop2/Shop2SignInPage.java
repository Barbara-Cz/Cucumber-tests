package shop2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shop2SignInPage {
    private final WebDriver driver;


    @FindBy(css = "a[href='https://mystore-testlab.coderslab.pl/index.php']")
    WebElement homePagebtn;

    //    elementy z pierwszego zadania:
//    @FindBy(id = "field-email")
//    WebElement emailField;
//
//    @FindBy(id = "field-password")
//    WebElement psswdField;
//
//    @FindBy(id = "submit-login")
//    WebElement logInBtn;

    public Shop2SignInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
//metody z pierwszego zadania:
//public void iEnterEmail() {
//    emailField.sendKeys("zkkrrggkmtuwprpzfi@cazlg.com");
//}
//
//    public void iEnterPsswd() {
//        psswdField.sendKeys("1234ToStefcio:)");
//    }
//
//    public void iLogIn() {
//        logInBtn.click();
//    }


    public void iGoBackToHomePage() {
        homePagebtn.click();

    }
}



