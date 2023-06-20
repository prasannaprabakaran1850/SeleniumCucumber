package pages;

import stepdefinitions.TestBase;
import utils.Actions;

public class HomePage extends TestBase {
    public void clickDirectory(){
        String dashboard="//span[text()='Directory']/parent::a";
        Actions.clickElement(driver,dashboard);
    }
}
