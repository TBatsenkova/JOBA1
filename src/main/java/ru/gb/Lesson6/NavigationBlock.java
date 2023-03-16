package ru.gb.Lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NavigationBlock extends BaseView {

    public NavigationBlock(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "")
    private WebElement womenButton;

    @FindBy(xpath = "")
    private WebElement tShirtsButtonInSubMenu;

    public TShirtPage hoverWomenMenuAndClickTShirt() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(tShirtsButtonInSubMenu));
        actions.moveToElement(womenButton)
                .click(tShirtsButtonInSubMenu)
                .perform();
        tShirtsButtonInSubMenu.click();
        return new TShirtPage(driver);
    }

}
