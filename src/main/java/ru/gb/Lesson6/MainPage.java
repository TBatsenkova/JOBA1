package ru.gb.Lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends BaseView {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "")
    private WebElement singInButton;

    public LoginView clickSignInButton() {
        singInButton.click();
        return new LoginView(driver);
    }
}
