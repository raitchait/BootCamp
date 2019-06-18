package regresion;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Account extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span[2]")
    WebElement acountbutt;

    @FindBy(xpath = "//*[@id=\"nav-flyout-ya-signin\"]/a/span")
    WebElement signin;

    @FindBy(id="ap_email")
    WebElement emailfield;

    @FindBy(id="ap_password")
    WebElement password;

    @FindBy(id="signInSubmit")
    WebElement signbutt;


    public void setAcountclick() {
        Actions action = new Actions(driver);
        action.moveToElement(acountbutt).build().perform();
        signin.click();

    }
    public void setlogein(String email,String pass){
        emailfield.sendKeys(email);
        password.sendKeys(pass);
        signbutt.click();



    }




}
