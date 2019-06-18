package loginpage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends CommonAPI {
    @FindBy(xpath = "//a[@class='btn btn-sm btn-primary'][text()='Log in to myCigna']")
    WebElement Singin;
public void login(){
    Singin.click();
}
}
