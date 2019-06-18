package regresion;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span[2]")
    WebElement accont;
    @FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
    WebElement search;
    @FindBy(xpath = "//*[@id=\"nav-search\"]/form/div[2]/div/input")
    WebElement click;
    @FindBy(xpath = "//*[@id=\"nav-cart\"]")
    WebElement cart;

    public void setSearch(String x) {
        search.sendKeys(x);
        click.click();
        cart.click();
    }

    public void accont() {
        accont.click();
    }
}