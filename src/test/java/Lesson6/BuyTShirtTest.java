package Lesson6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.gb.Lesson6.MainPage;

public class BuyTShirtTest {
    WebDriver driver;
    MainPage mainPage;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        driver = new ChromeDriver();
        driver.get("http");
    }

    @Test
    void buyTShirtTest() {
        mainPage.clickSignInButton()
                .login("login", "123654")
                .navigationBlock.hoverWomenMenuAndClickTShirt()
                .selectSize("S")
                .moveLeftPriseSlideElement(10)
                .addToCartByName("Fadded")
                .checkTotalSum("19$");


        //new LoginView(driver).login("login", "123456");

    }


    @AfterEach
    void tearDriver() {
        driver.quit();
    }
}
