package pages;

import stepdefinitions.TestBase;
import utils.Action;

public class HomePage extends TestBase {
    public void clickDirectory(){
        String dashboard="//span[text()='Directory']/parent::a";
        Action.clickElement(driver,dashboard);
    }

    public void clickTime(){
        String dashboard="//span[text()='Time']/parent::a";
        Action.clickElement(driver,dashboard);
    }
}
