package testhomepage;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regresion.HomePage;

public class TestHomePage extends CommonAPI {
    HomePage homePage;

    @BeforeMethod
    public void start() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(priority = 1)
    public void clickaccont() {
        homePage.accont();

    }

    @Test(priority = 2)
    public void search() {
        homePage.setSearch("phone");

    }
}