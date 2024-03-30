package utils;

import org.openqa.selenium.By;

public interface Locators {

    interface MainPage {

        By CART_BUTTON = By.xpath("/html/body/div[1]/header/div/div[2]/div[4]/div[3]/a");
        By CATALOG_BUTTON = By.xpath("/html/body/div[1]/header/div/div[2]/div[1]/button");

        By PLACE_BUTTON = By.xpath("/html/body/div[1]/header/div/div[1]/ul/li[1]/span");

        By SEARCH_INPUT = By.id("searchInput");

        By PRODUCT_BUTTON = By.xpath("//*[@id=\"app\"]/div[2]/div/div[2]/div/article[1]/div/a");


    }

    interface ProductPage {
        By ADD_BUTTON = By.xpath("/html/body/div[1]/main/div[2]/div/div[3]/div/div[3]/div[12]/div/div[1]/div[4]/div/div/button[1]");

        By CART_NUMBER = By.xpath("/html/body/div[1]/header/div/div[2]/div[4]/div[3]/a/span/span");
    }

    interface InformationButtons {
        By PAGE_HEADER = By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div/div/div[1]/div/h1");
        By INFORMATION_HEADER = By.xpath("/html/body/div[1]/main/div[2]/div/div[2]/div/div[1]/div/ul/li[2]/a");
    }

    interface DelieveryPage {
        By POINT_BUTTON = By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div[2]/div/div/div");
        By CHOOSE_BUTTON = By.xpath("/html/body/div[1]/div/div/div[2]/div[2]/div/div[3]/button");
        By SEARCH_INPUT = By.xpath("/html/body/div[1]/div/div/div[4]/div[1]/ymaps/ymaps/ymaps/ymaps[4]/ymaps[1]/ymaps[1]/ymaps/ymaps[1]/ymaps/ymaps/ymaps/ymaps/ymaps[1]/ymaps/ymaps[1]/ymaps[1]/input");
        By SEARCH_BUTTON = By.xpath("/html/body/div[1]/div/div/div[4]/div[1]/ymaps/ymaps/ymaps/ymaps[4]/ymaps[1]/ymaps[1]/ymaps/ymaps[1]/ymaps/ymaps/ymaps/ymaps/ymaps[1]/ymaps/ymaps[2]/ymaps/ymaps");
    }

    interface CartPage {

        By REQUISITE_BUTTON = By.xpath("/html/body/div[1]/footer/div/div[2]/div[1]/section[2]/ul/li[2]/a");
        By ITEM_COUNT = By.xpath("//*[@id=\"app\"]/div[4]/div/div[1]/form/div[1]/div[1]/div[2]/div/div/div/div/div/div/div[2]/div/div/input");
        By PLUS_BUTTON = By.xpath("/html/body/div[1]/main/div[2]/div/div[4]/div/div[1]/form/div[1]/div[1]/div[2]/div/div/div/div/div/div/div[2]/div/div/button[2]");
          }

}
