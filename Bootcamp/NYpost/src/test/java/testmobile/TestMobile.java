package testmobile;

import base.MobileAPI;
import mobile.Mobile;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMobile extends MobileAPI {

    Mobile mobileClass;

    @BeforeMethod
    public void init(){
        mobileClass = PageFactory.initElements(appiumDriver, Mobile.class);
    }

    @Test
    public void cont(){
        appiumDriver.scrollTo("TAP TO CONTINUE").click();
    }
    //@Test
    public void setContinuesTest(){
        mobileClass.setContinues();
    }

}
