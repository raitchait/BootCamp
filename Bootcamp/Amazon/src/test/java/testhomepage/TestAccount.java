package testhomepage;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regresion.Account;

public class TestAccount extends CommonAPI {
   Account account;
    @BeforeMethod
    public void initi(){
        account= PageFactory.initElements(driver,Account.class);

    }
    @Test(priority =3 )
    public void SetloginTest(){
        account.setAcountclick();
        account.setlogein("raitchait@gmail.com","abcd1234");
        sleepFor(5);

    }



}
