package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Locators;
import utils.Sleeping;

public class InformationPage {

    private final WebDriver driver;

    public InformationPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getInfo() {
        WebElement text = driver.findElement(Locators.InformationButtons.INFORMATION_HEADER);
        return text.getText();
    }

    public String getHeaderText() {
        WebElement header = driver.findElement(Locators.InformationButtons.PAGE_HEADER);
        return header.getText();
    }
}
