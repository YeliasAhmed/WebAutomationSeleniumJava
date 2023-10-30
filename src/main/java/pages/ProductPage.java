package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {

   public String text;

    By registerButton = By.xpath("(//a[normalize-space()='Login / Register'])[1]");
    By vendor = By.xpath("//input[@value='seller']");
    By regEmail = By.xpath("//input[@id='reg_email']");
    By regPassword = By.xpath("//input[@id='reg_password']");
    By fName = By.xpath("//input[@id='first-name']");
    By lName = By.xpath("//input[@id='last-name']");
    By shopName = By.xpath("//input[@id='company-name']");
    By shopUrl = By.xpath("//input[@id='seller-url']");
    By shopPhoneNo = By.xpath("//input[@id='shop-phone']");
    By registerBtn = By.xpath("//button[@name='register']");
    By welcomeMessage = By.xpath("//h1[@id='wc-logo']");
    By notRightNow = By.xpath("//a[normalize-space()='Not right now']");
    By productBtn = By.xpath("//main[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]");
    By addNewProduct = By.xpath("//a[contains(@class,'dokan-btn dokan-btn-theme')]");
    By addNewProductPage = By.xpath("//h1[@class='entry-title']");
    By productName = By.xpath("//input[@id='post_title']");
    By productTypeDropdown = By.xpath("//select[@id='product_type']");
    By downloadable = By.xpath("//input[@id='_downloadable']");
    By productPrice = By.xpath("//input[@id='_regular_price']");
    By shortDes = By.xpath("(//body[@id='tinymce'])[1]");
    By des = By.xpath("(//body[@id='tinymce'])[2]");
    By saveProduct = By.xpath("//input[@id='publish']");
    By editProduct = By.xpath("//button[@aria-label='Edit permalink']");
    By editProductName = By.xpath("//input[@id='new-post-slug']");
    By editProductSave = By.xpath("//a[normalize-space()='Save attribute']");
    By productDelete = By.xpath("//tbody/tr[2]/td[2]/div[1]/span[2]/a[1]");
    By productWeight = By.xpath("//input[@id='_weight']");
    By productWarrantyPrice = By.xpath("//input[@id='warranty_addon_price[]']");


    public WebDriver driver;

    public ProductPage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getRegisterButton() {
        return driver.findElement(registerButton);
    }
    public WebElement getVendor() {
        return driver.findElement(vendor);
    }
    public WebElement getRegisterEmail() {
        return driver.findElement(regEmail);
    }
    public WebElement getRegisterPassword() {
        return driver.findElement(regPassword);
    }
    public WebElement getFirstName() {
        return driver.findElement(fName);
    }
    public WebElement getLastName() {
        return driver.findElement(lName);
    }
    public WebElement getShopName() {
        return driver.findElement(shopName);
    }
    public WebElement getShopUrl() {
        return driver.findElement(shopUrl);
    }
    public WebElement getShopPhoneNo() {
        return driver.findElement(shopPhoneNo);
    }
    public WebElement getRegisterBtn() {
        return driver.findElement(registerBtn);
    }
    public WebElement getWelcomeMessage() {
         text = driver.findElement(welcomeMessage).getText();
        return driver.findElement(welcomeMessage);
    }
    public WebElement getNotRightNow() {
        return driver.findElement(notRightNow);
    }
    public WebElement getProductButton() {
        text = driver.findElement(productBtn).getText();
        return driver.findElement(productBtn);
    }
    public WebElement getAddProductButton() {
        text = driver.findElement(addNewProduct).getText();
        return driver.findElement(addNewProduct);
    }
    public WebElement getAddNewProductPage() {
        text = driver.findElement(addNewProductPage).getText();
        return driver.findElement(addNewProductPage);
    }
    public WebElement getProductName() {
        return driver.findElement(productName);
    }
    public WebElement getProductTypeDropdown() {
       return driver.findElement(productTypeDropdown);

    }

    public void getProductTypeDropdownList() {
        Select select = new Select(driver.findElement(productTypeDropdown));
        select.selectByIndex(1);

    }
    public WebElement getDownloadable() {
        return driver.findElement(downloadable);

    }

    public WebElement getProductPrice() {
        return driver.findElement(productPrice);

    }
    public WebElement getSaveProduct() {
        return driver.findElement(saveProduct);

    }
    public WebElement getEditProduct() {
        return driver.findElement(editProduct);

    }
    public WebElement getEditProductName() {
        return driver.findElement(editProductName);

    }
    public WebElement getEditProductSave() {
        return driver.findElement(editProductSave);

    }
    public WebElement getProductDelete() {
        return driver.findElement(productDelete);

    }
    public WebElement getProductWeight() {
        return driver.findElement(productWeight);

    }
    public WebElement getProductWarrantyPrice() {
        return driver.findElement(productWarrantyPrice);

    }
    public void getProductDeleteAlert() {
        driver.switchTo().alert().accept();
    }

    public WebElement getShortDescription() {
        driver.switchTo().frame(0);
        return driver.findElement(shortDes);
    }
    public WebElement getDescription() {
        driver.switchTo().frame(0);
        return driver.findElement(des);
    }

}
