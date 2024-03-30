package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.Locators;
import utils.Sleeping;

public class MainPage {

    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }


    public CartPage goToCart() {
        WebElement catalog = driver.findElement(Locators.MainPage.CART_BUTTON);
        catalog.click();
        Sleeping.sleep(2);
        return new CartPage(driver);
    }

    public DelieveryPage goToDelieveryPage() {
        Sleeping.sleep(5);
        WebElement point = driver.findElement(Locators.MainPage.PLACE_BUTTON);
        point.click();
        Sleeping.sleep(5);
        return new DelieveryPage(driver);
    }

    public String getDelieveryPoint() {
        WebElement point = driver.findElement(Locators.MainPage.PLACE_BUTTON);
        return point.getText();
    }

    public MainPage clickSearchInput() {
        WebElement searchInput = driver.findElement(Locators.MainPage.SEARCH_INPUT);
        searchInput.click();
        //Sleeping.sleep(1);
        return this;
    }

    public MainPage inputTextToSearchInput(String text) {
        WebElement searchInput = driver.findElement(Locators.MainPage.SEARCH_INPUT);
        searchInput.sendKeys(text);
        Sleeping.sleep(1);
        return this;
    }

    public ProductPage clickProductButton() {
        WebElement addButton = driver.findElement(Locators.MainPage.PRODUCT_BUTTON);
        addButton.click();
        Sleeping.sleep(3);
        return new ProductPage(driver);
    }
    public InformationPage clickSearchButton() {
        WebElement searchInput = driver.findElement(Locators.MainPage.SEARCH_INPUT);
        searchInput.sendKeys(Keys.ENTER);
        Sleeping.sleep(3);
        return new InformationPage(driver);
    }
}
