package regresion;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement email;
    @FindBy(xpath = "//*[@id=\"pass\"]")
    WebElement password;
    @FindBy(xpath = "//*[@id=\"u_0_2\"]")
    WebElement connexion;
    @FindBy(xpath = "//*[@id=\"u_7_2\"]/input[2]")
    WebElement searchname;
    @FindBy(xpath = "//*[@id=\"js_2s\"]/form/button/i")
    WebElement search;
    @FindBy(xpath = "//*[@id=\"u_1i_4\"]/button[1]")
    WebElement friendrequest;
    public void sendrequest(){
        friendrequest.click();
    }
    public void sedsearchname(String name){
        searchname.sendKeys(name);
        search.click();
    }
    public void login(String usrname, String word){
        email.sendKeys(usrname);
        password.sendKeys(word);
        connexion.click();
    }


}
