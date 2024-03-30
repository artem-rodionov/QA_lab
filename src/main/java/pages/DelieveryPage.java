package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Locators;
import utils.Sleeping;

public class DelieveryPage {

    private WebDriver driver;

    public DelieveryPage(WebDriver driver) {
        this.driver = driver;
    }


    public DelieveryPage enterAddres(String adr) {
        Sleeping.sleep(2);
        WebElement input = driver.findElement(Locators.DelieveryPage.SEARCH_INPUT);
        input.sendKeys(adr);
        Sleeping.sleep(2);
        WebElement button = driver.findElement(Locators.DelieveryPage.SEARCH_BUTTON);
        button.click();
        Sleeping.sleep(5);
        return this;
    }

    public MainPage choosePoint() {
        WebElement point = driver.findElement(Locators.DelieveryPage.POINT_BUTTON);
        point.click();
        Sleeping.sleep(2);
        WebElement button = driver.findElement(Locators.DelieveryPage.CHOOSE_BUTTON);
        button.click();
        Sleeping.sleep(5);
        return new MainPage(driver);
    }



}
