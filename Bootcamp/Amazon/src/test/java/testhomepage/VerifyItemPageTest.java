package testhomepage;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regresion.VerifyItemPage;
import reporting.TestLogger;

public class VerifyItemPageTest extends CommonAPI {
    VerifyItemPage verifyItem;
    TestLogger testlogger;


    @BeforeMethod
    public void init() {
        verifyItem = PageFactory.initElements(driver, VerifyItemPage.class);
    }

    @Test(priority = 4)
    public void setVerifyItemTest() {
        verifyItem.setSerachfield("soccer ball");
        sleepFor(2);
        verifyItem.setSubmit();
        sleepFor(2);
        verifyItem.setSoccer();
        sleepFor(2);
        verifyItem.setPicture1();
        sleepFor(2);
        verifyItem.setDetails();
        testlogger.log("TestPass");
        sleepFor(2);


    }
}
