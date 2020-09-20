package co.com.banistmo.stepdefinitions;

import co.com.banistmo.questions.PageValidation;
import co.com.banistmo.tasks.WritingBar;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.banistmo.util.WebDriver.chrome;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BanistmoStepDefinition {

    @Before
    public void init() {
        setTheStage(OnlineCast.ofStandardActors());
    }

    @Given("^the user need to enter the tucumenpanama page$")
    public void the_user_need_to_enter_the_tucumenpanama_page() throws Throwable {
        theActorCalled("user");
        theActorInTheSpotlight().can(BrowseTheWeb.with((chrome())));
    }

    @When("^the user search the infomation travel$")
    public void the_user_search_the_infomation_travel() throws Throwable {
        theActorInTheSpotlight().attemptsTo(
                WritingBar.SearchBar()
        );


    }

    @Then("^the user should see the file pdf correctly$")
    public void the_user_should_see_the_file_pdf_correctly() throws Throwable {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(PageValidation.isVisible()));
    }
}
