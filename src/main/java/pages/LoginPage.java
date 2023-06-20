package pages;

import constants.Constants;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepdefinitions.TestBase;
import utils.Actions;

public class LoginPage extends TestBase {
    public void verifyLogin(){
        driver.get(Constants.APP_URL);
        String userNameLoc ="//input[@name='username']";
        String passwordLoc = "//input[@name='password']";
        Actions.enterText(driver,userNameLoc,Constants.USERNAME);
        Actions.enterText(driver,passwordLoc,Constants.PASSWORD);

        String loginButtonLoc="//button[text()=' Login ']";
        WebElement loginButton = Actions.waitAndReturnElement(driver, loginButtonLoc);
        Actions.clickElementWithJs(driver,loginButton);
        Assert.assertEquals("OrangeHRM",driver.getTitle());

    }
}
