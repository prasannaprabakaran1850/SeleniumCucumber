package pages;

import org.openqa.selenium.WebElement;
import stepdefinitions.TestBase;
import utils.Actions;

public class DirectoryPage extends TestBase {

    public void selectJobTitle(String jobtitle){
        WebElement dropdown= Actions.waitAndReturnElement(driver,"(//label[text()='Job Title']/following::div[text()='-- Select --'])[1]");
        Actions.clickElementWithJs(driver,dropdown);
        String jobTitleXpath="Chief Executive Officer";

    }
}
