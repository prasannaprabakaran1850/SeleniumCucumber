package utils;

import constants.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Action {
    /**
     * This method is used get the WebElement
     *
     * @author Prasanna.Prabakaran
     * @param driver
     * @param xpath
     * @return
     */
    public static WebElement waitAndReturnElement(WebDriver driver, String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.TIME_OUT));
        WebElement element= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        return element;
    }

    /**
     * This mthod is used to click the web elements
     * @param driver
     * @param xpath
     */

    public static void clickElement(WebDriver driver,String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.TIME_OUT));
        WebElement element= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        element.click();
    }

    /**
     * This method is used to enter text in text field
     * @param driver
     * @param xpath
     * @param text
     */

    public static void enterText(WebDriver driver,String xpath, String text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.TIME_OUT));
        WebElement element= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        element.clear();
        element.sendKeys(text);
    }

    /**
     * This method is used to get text from the text field
     * @param driver
     * @param xpath
     */

    public static String getText(WebDriver driver,String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.TIME_OUT));
        WebElement element= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        return element.getText();
    }

    /**
     *
     * @param driver
     * @param element
     */
    public static void clickElementWithJs(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    /**
     * This method is used to scroll
     * @param driver
     * @param scrollX
     * @param scrollY
     */
    public static void scroll(WebDriver driver, int scrollX, int scrollY) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(" + scrollX + ", " + scrollY + ");");
    }

    public static void mouseClickElement(WebDriver driver, WebElement element) {

        Actions action = new Actions(driver);
        action.click(element).perform();
    }
}
