package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepdefinitions.TestBase;
import utils.Action;

public class DirectoryPage extends TestBase {

    public void selectJobTitle(String jobtitle){
      //  WebElement dropdown= Action.waitAndReturnElement(driver,"(//label[text()='Job Title']/following::div[text()='-- Select --'])[1]");
        //Action.clickElementWithJs(driver,dropdown);

        WebElement dropdown=Action.waitAndReturnElement(driver,"//div[@class='oxd-select-text--after']");
        Action.mouseClickElement(driver,dropdown);

        String jobTitleXpath="//span[text()='"+jobtitle+"']";
        WebElement jobTitle= Action.waitAndReturnElement(driver,jobTitleXpath);
        Action.mouseClickElement(driver,jobTitle);
      //  Action.clickElement(driver,jobTitleXpath);
    }

    public void clickSearchButton() {
        String searchButtonXpath="//button[@type='submit']";
        Action.mouseClickElement(driver,Action.waitAndReturnElement(driver,searchButtonXpath));
    }

    public void verifyDirectoryName(String expectedName) {
        String directoryNameXpath="//p[text()='Odis  Adalwin ']";
        String actualName= Action.getText(driver,directoryNameXpath);
        Assert.assertEquals(expectedName,actualName);
    }
}
