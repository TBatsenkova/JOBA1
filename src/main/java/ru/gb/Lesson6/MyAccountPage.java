package ru.gb.Lesson6;

import org.openqa.selenium.WebDriver;

public class MyAccountPage extends MainPage {

    public MyAccountPage(WebDriver driver) {
        super(driver);
        navigationBlock = new NavigationBlock(driver);
    }

    public NavigationBlock navigationBlock;

}
