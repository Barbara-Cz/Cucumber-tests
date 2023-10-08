package shop2;
//        zrobi screenshot z potwierdzeniem zamówienia i kwotą.

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;

public class Shop2OrderSummaryPage {
    private final WebDriver driver;


    @FindBy(id = "order-items")
    WebElement orderConfirmation;

    public Shop2OrderSummaryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void iTakeAScreenshot(String filePath) {
        try {
//            File elementScreenshotFile = orderConfirmation.getScreenshotAs(OutputType.FILE);
//            -fragment strony

            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            // Kopiowanie pliku zrzutu do określonej ścieżki na dysku
            File destinationFile = new File(filePath);
            
            FileUtils.copyFile(screenshotFile, destinationFile);
//            FileUtils.copyFile(elementScreenshotFile, destinationFile);

            System.out.println("Screenshot saved to: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
            // Obsługa wyjątku
        }
    }


}



