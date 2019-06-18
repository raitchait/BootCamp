package mobile;

import base.MobileAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Mobile extends MobileAPI {
    @FindBy(xpath = "//android.widget.TextView[@text='TAP TO CONTINUE']")
    WebElement continues;

    public void setContinues(){
        continues.click();
    }
}
