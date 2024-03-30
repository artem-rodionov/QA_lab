package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.Locators;
import utils.Sleeping;

import javax.swing.*;

public class CartPage {

    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getItemCount() {
        WebElement count = driver.findElement(Locators.CartPage.ITEM_COUNT);
        return count.getAttribute("value");
    }

    public CartPage clickPlusButton(int times) {
        WebElement plus = driver.findElement(Locators.CartPage.PLUS_BUTTON);
        plus.click();
        return this;
    }
    public InformationPage goToInfoPage() {
        WebElement button = driver.findElement(Locators.CartPage.REQUISITE_BUTTON);
        Sleeping.sleep(2);
        button.click();
        Sleeping.sleep(3);
        return new InformationPage(driver);
    }
}
