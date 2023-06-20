package stepdefinitions;

import constants.Constants;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import utils.Utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestBase {
    public static WebDriver driver;

    @Before
    public void beforeScenario() {
        Utils.loadProperties();
        try {
            if(driver==null) {
                launchBrowser();
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void launchBrowser() {

        try {
            switch (Constants.BROWSER){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "ie":
                    WebDriverManager.iedriver().setup();
                    driver=new InternetExplorerDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();

            }

        }catch (Exception exception){

        }
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "FailedTestScreenshot");

            String screenshotName = scenario.getName().replaceAll(" ", "_");
            String filePath = System.getProperty("user.dir") + "\\screenshots\\" + screenshotName + ".png";
            System.out.println(filePath);
            try {
                Files.write(Paths.get(filePath), screenshot);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
    


