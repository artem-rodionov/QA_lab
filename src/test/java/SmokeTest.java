import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;
import utils.Sleeping;


public class SmokeTest {

    private WebDriver driver;

    @Before
    public void preparation(){
        String url = "https://www.wildberries.ru/";
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);
        Sleeping.sleep(4);
    }

    @Test
    public void testAddingToCart(){

        MainPage mainPage = new MainPage(driver);

        String headerText = mainPage.clickProductButton().clickToAdd().getCartNumber();

        Assert.assertEquals("1", headerText);
    }

    @Test
    public void testSearch() {

        MainPage mainPage = new MainPage(driver);
        String searchText = "Ноутбуки";

        String headerText = mainPage
                .clickSearchInput()
                .inputTextToSearchInput(searchText)
                .clickSearchButton()
                .getHeaderText();

        Assert.assertEquals(searchText, headerText);
    }


    @Test
    public void testChangeCountOfItemInCart() {
        MainPage mainPage = new MainPage(driver);
        CartPage cartPage = mainPage.clickProductButton().clickToAdd().goToCart();
        String countText = cartPage.getItemCount();
        String count2Text = cartPage.clickPlusButton(1).getItemCount();

        Assert.assertEquals("1", countText);
        Assert.assertEquals("2", count2Text);
    }


    @Test
    public void testNavigation() {
        MainPage mainPage = new MainPage(driver);
        String data = "Реквизиты";

        String requisite = mainPage
                .goToCart()
                .goToInfoPage()
                .getInfo();

        Assert.assertEquals(data,requisite);

    }

    @Test
    public void testChangeDelieveryPlace() {
        MainPage mainPage = new MainPage(driver);
        String place = "Санкт-Петербург, Зеленогорск, Гражданская улица, 1";

        String point = mainPage
                .goToDelieveryPage()
                .enterAddres(place)
                .choosePoint()
                .getDelieveryPoint();

        Assert.assertEquals(place, point);
    }

    @After
    public void ending(){
        driver.quit();
    }
}
