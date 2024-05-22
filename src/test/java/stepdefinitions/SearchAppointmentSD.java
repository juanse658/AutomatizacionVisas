package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import interactions.GoToCalendar;
import tasks.Login;
import tasks.Navigate;
import tasks.SelectTheAppointments;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class SearchAppointmentSD {
    @Managed
    private WebDriver hisBrowser;

    @Before
    public void setUp() {
        OnStage.setTheStage(OnlineCast.ofStandardActors());
        OnStage.theActorCalled("Client").can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("I am on the main booking page")
    public void iAmOnTheMainBookingPage() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(
                Navigate.to("VisasLogIn")
        );

    }

    @And("Login")
    public void login(DataTable info) {

        theActorInTheSpotlight().attemptsTo(

                Login.withInfo(info));

    }

    @When("looking for a new appointment")
    public void lookingForANewAppointment() {

        theActorInTheSpotlight().attemptsTo(

                GoToCalendar.go(),
                SelectTheAppointments.select());
    }


}
