package ru.gb.Lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginView extends BaseView {

    public LoginView(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "")
    private WebElement emailField;

    @FindBy(id = "")
    private WebElement passwordField;

    @FindBy(id = "")
    private WebElement submitButton;

    public MyAccountPage login(String login, String password) {
        emailField.sendKeys(login);
        passwordField.sendKeys(password);
        submitButton.click();
        return new MyAccountPage(driver);
    }


}
