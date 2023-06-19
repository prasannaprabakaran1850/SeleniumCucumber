package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginStepDef {
    public static WebDriver driver;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }

    @When("I enter my username as {string} and password as {string}")
    public void i_enter_my_username_as_and_password_as(String username, String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        String userNameLoc ="//input[@name='username']";
        String passwordLoc = "//input[@name='password']";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(userNameLoc)));

        driver.findElement(By.xpath(userNameLoc)).sendKeys(username);
        driver.findElement(By.xpath(passwordLoc)).sendKeys(password);
    }

    @When("I click on the login button")
    public void i_click_on_the_login_button() {
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();

    }

    @Then("I should be logged in")
    public void i_should_be_logged_in() {
        Assert.assertEquals("OrangeHRM",driver.getTitle());
    }
}
