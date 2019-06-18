package testlogin;

import base.CommonAPI;
import loginpage.Loginpage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogin extends CommonAPI {
    Loginpage loginpage;
    @BeforeMethod

    public void init(){
        loginpage= PageFactory.initElements(driver,Loginpage.class);
    }
    @Test
    public void test(){
        loginpage.login();
        sleepFor(3);
    }
}
