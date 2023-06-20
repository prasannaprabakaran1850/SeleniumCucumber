package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DirectoryPage;
import pages.HomePage;
import pages.LoginPage;

public class VerifyCEOStepDef {
    HomePage homePage = new HomePage();
    DirectoryPage directoryPage = new DirectoryPage();
    @Given("the user is logged successfully anf is on Home page")
    public void the_user_is_logged_successfully_anf_is_on_home_page() {
        LoginPage loginPage =new LoginPage();
        loginPage.verifyLogin();
    }
    @When("the user clicks on directory option from Menu bar")
    public void the_user_clicks_on_directory_option_from_menu_bar() {
        homePage.clickDirectory();
    }
    @When("the user selects job title as {string} from drop down")
    public void the_user_selects_job_title_as_from_drop_down(String jobTitle) {
        directoryPage.selectJobTitle(jobTitle);
 }
    @When("clicks the search button")
    public void clicks_the_search_button() {

    }
    @Then("the user should see the CEO name as {string}")
    public void the_user_should_see_the_ceo_name_as(String string) {
    }
}
