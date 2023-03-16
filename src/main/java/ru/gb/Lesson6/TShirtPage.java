package ru.gb.Lesson6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class TShirtPage extends BaseView{
    public TShirtPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = " ")
    private List<WebElement> sizesList;

    public TShirtPage selectSize(String size) {
        webDriverWait.until(d -> sizesList.size() > 1);
         sizesList.stream().filter(s -> s.getText().contains(size)).findFirst().get().click();
         return this;
    }

    @FindBy(xpath = " ")
    private WebElement leftPriseSliderElement;

    public TShirtPage moveLeftPriseSlideElement (int pixelsCount) {
        actions.clickAndHold(leftPriseSliderElement)
                .moveByOffset(pixelsCount, 0)
                .perform();
        return this;
    }

    @FindBy(xpath = " ")
    private List<WebElement> dressesList;

    private static final String addToCartButtonXPathLocator = "//span[]";
    @FindBy(xpath = " ")
    private WebElement addToCartButton;

    public SuccessBlock addToCartByName(String tShirtName) {
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
        dressesList.stream().filter(d -> d.getText().contains(tShirtName)).findFirst().get().findElement(
                By.xpath(addToCartButtonXPathLocator)).click();
        return new SuccessBlock(driver);
    }

}
