package stepDefinitions.prducts;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pageObjectManager.PageObjectManager;
import pages.ProductPage;
import utils.ContextSetup;

import java.util.Random;

public class ProductSteps {

    public WebDriver driver;
    ContextSetup contextSetup;
    ProductPage productPage;


    public ProductSteps(ContextSetup contextSetup) {
        this.contextSetup = contextSetup;
        this.productPage = contextSetup.pageObjectManager.getPage1();
        this.driver = productPage.driver;
    }
    @Given("Click on the LoginRegister button")
    public void LoginRegisterBtn() throws InterruptedException {
        Assert.assertTrue(productPage.getRegisterButton().isDisplayed());
        Thread.sleep(1000);
        productPage.getRegisterButton().click();
        Thread.sleep(1000);
    }

    @And("Click on the I am a vendor radio button")
    public void clickOnTheIAmAVendorRadioButton() throws InterruptedException {
        Assert.assertTrue(productPage.getRegisterButton().isDisplayed());
        Thread.sleep(1000);
        productPage.getVendor().click();
        Thread.sleep(1000);
    }

    @And("Fill up the required field")
    public void fillUpTheRequiredField() throws InterruptedException {

        Random random = new Random();
        int value = random.nextInt(500);
        Assert.assertTrue(productPage.getRegisterEmail().isDisplayed());
        Thread.sleep(1000);
        productPage.getRegisterEmail().sendKeys("yelias"+value+"@gmail.com");
        Thread.sleep(1000);

        productPage.getRegisterPassword().sendKeys("Asdfgh12345@Abc");
        Thread.sleep(1000);

        productPage.getFirstName().sendKeys("yelias");
        Thread.sleep(1000);

        productPage.getLastName().sendKeys("ahmed");
        Thread.sleep(1000);

        productPage.getShopName().sendKeys("My-shop");
        Thread.sleep(1000);

        productPage.getShopUrl().sendKeys("https://myshop.com");
        Thread.sleep(1000);

        productPage.getShopPhoneNo().sendKeys("01920834881");
        Thread.sleep(1000);

        productPage.getRegisterBtn().click();
        Thread.sleep(1000);

        Assert.assertTrue(productPage.getWelcomeMessage().isDisplayed());
        Thread.sleep(2000);
        Assert.assertEquals(productPage.getWelcomeMessage().getText(),productPage.text);
        Thread.sleep(2000);
        System.out.println(productPage.text);

        productPage.getNotRightNow().click();
        Thread.sleep(1000);


    }

    @Then("Check that the product button is available")
    public void checkThatTheProductButtonIsAvailable() throws InterruptedException {
        Assert.assertTrue(productPage.getProductButton().isDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(productPage.getProductButton().getText(),productPage.text);
        Thread.sleep(1000);
        System.out.println(productPage.text);
    }

    @When("Click on the product Button")
    public void clickOnTheProductButton() throws InterruptedException {
        productPage.getProductButton().click();
        Thread.sleep(1000);
    }

    @Then("Check that the Add new product button is available")
    public void checkThatTheAddNewProductButtonIsAvailable() throws InterruptedException {
        Assert.assertTrue(productPage.getAddProductButton().isDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(productPage.getAddProductButton().getText(),productPage.text);
        Thread.sleep(1000);
        System.out.println(productPage.text);


    }

    @When("Click on the Add new Product button")
    public void clickOnTheAddNewProductButton() throws InterruptedException {
        productPage.getAddProductButton().click();
        Thread.sleep(1000);
    }

    @And("Fill the all product details")
    public void fillTheAllProductDetails() throws InterruptedException {

        Assert.assertTrue(productPage.getAddNewProductPage().isDisplayed());
        Thread.sleep(1000);
        Assert.assertEquals(productPage.getAddNewProductPage().getText(),productPage.text);
        Thread.sleep(1000);
        System.out.println(productPage.text);

        productPage.getProductName().sendKeys("My product");
        Thread.sleep(1000);


        productPage.getProductTypeDropdown().click();
        Thread.sleep(1000);

        productPage.getProductTypeDropdownList();
        Thread.sleep(1000);

//        productPage.getDownloadable().click();
//        Thread.sleep(1000);

//        productPage.getProductPrice().sendKeys("10");
//        Thread.sleep(1000);

        productPage.getShortDescription().sendKeys("This is an authentic product");
        Thread.sleep(1000);

//        productPage.getDescription().sendKeys("This is an authentic product");
//        Thread.sleep(1000);

//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView(false);", productPage.getSaveProduct());
//        Thread.sleep(3000);

//        productPage.getProductWeight().click();
//        Thread.sleep(1000);
//
//        productPage.getProductWarrantyPrice().sendKeys("15");
//        Thread.sleep(1000);

        productPage.getSaveProduct().isDisplayed();
        Thread.sleep(1000);
        productPage.getSaveProduct().click();
        Thread.sleep(1000);

        productPage.getEditProduct().click();
        Thread.sleep(1000);
        productPage.getEditProductName().clear();
        Thread.sleep(1000);
        productPage.getEditProductName().sendKeys("Edited My-product");
        Thread.sleep(1000);


        productPage.getSaveProduct().click();
        Thread.sleep(1000);

        productPage.getProductButton().click();
        Thread.sleep(1000);

        productPage.getProductDelete().click();
        Thread.sleep(1000);

//        productPage.getProductDeleteAlert();
//        Thread.sleep(1000);






    }
}
