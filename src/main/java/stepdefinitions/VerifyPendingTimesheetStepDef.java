package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.TimeSheetPage;

public class VerifyPendingTimesheetStepDef {
    HomePage homePage = new HomePage();
    TimeSheetPage timeSheetPage = new TimeSheetPage();
    @When("the user clicks on the time option from the menu")
    public void the_user_clicks_on_the_time_option_from_the_menu() {
        homePage.clickTime();
    }
    @When("the user enters the name as {string}")
    public void the_user_enters_the_name_as(String employeeName) {
        timeSheetPage.enterEployeeName(employeeName);

    }
    @When("clicks on the view button")
    public void clicks_on_the_view_button() {
        timeSheetPage.clickView();
    }
    @Then("the user should see the message as {string}")
    public void the_user_should_see_the_message_as(String string) {
   }
}
