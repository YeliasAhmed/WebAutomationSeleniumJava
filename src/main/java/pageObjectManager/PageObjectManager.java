package pageObjectManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.ProductPage;

public class PageObjectManager {

    public static WebDriver driver;

    public ProductPage page1;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }
    public ProductPage getPage1(){
        page1 = new ProductPage(driver);
        return page1;
    }
    public static WebElement hoverToElement(WebElement element) {
        Actions action = new Actions(driver);
        WebElement we = element;
        action.moveToElement(we).perform();
        return we;
    }
}
