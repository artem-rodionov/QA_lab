package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Locators;
import utils.Sleeping;

/**
 * @author Artem
 * @created 29.03.2024 21:25
 */
public class ProductPage {
    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage clickToAdd() {
        WebElement button = driver.findElement(Locators.ProductPage.ADD_BUTTON);
        button.click();
        Sleeping.sleep(3);
        return this;
    }

    public String getCartNumber() {
        WebElement number = driver.findElement(Locators.ProductPage.CART_NUMBER);
        Sleeping.sleep(3);
        return number.getText();
    }

    public CartPage goToCart() {
        WebElement cart = driver.findElement(Locators.MainPage.CART_BUTTON);
        cart.click();
        Sleeping.sleep(3);
        return new CartPage(driver);
    }
}
