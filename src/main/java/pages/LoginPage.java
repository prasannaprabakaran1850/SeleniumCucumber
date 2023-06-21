package pages;

import constants.Constants;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import stepdefinitions.TestBase;
import utils.Action;

public class LoginPage extends TestBase {
    public void verifyLogin(){
        driver.get(Constants.APP_URL);
        String userNameLoc ="//input[@name='username']";
        String passwordLoc = "//input[@name='password']";
        Action.enterText(driver,userNameLoc,Constants.USERNAME);
        Action.enterText(driver,passwordLoc,Constants.PASSWORD);

        String loginButtonLoc="//button[text()=' Login ']";
        WebElement loginButton = Action.waitAndReturnElement(driver, loginButtonLoc);
        Action.clickElementWithJs(driver,loginButton);
        Assert.assertEquals("OrangeHRM",driver.getTitle());

    }
}
