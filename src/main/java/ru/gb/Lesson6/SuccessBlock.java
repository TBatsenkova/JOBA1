package ru.gb.Lesson6;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessBlock extends BaseView {
    public SuccessBlock(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = " ")
    private WebElement totalSum;

    public void checkTotalSum(String expectedSumma) {
        Assertions.assertEquals(totalSum.getText(), expectedSumma);
    }
}
