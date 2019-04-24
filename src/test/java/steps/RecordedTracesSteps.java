package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.MapView;
import page.MenuView;
import page.RecordedTraces;

import java.net.MalformedURLException;

public class RecordedTracesSteps {

    @When("User goes to Recorded Traces")
    public void goingToRecordedTraces() throws MalformedURLException {
        new MapView()
                .clickingMenuDrawer();

        new MenuView()
                .clickingRecordedTraces();
    }
    @Then("^User can see information that there are no recorded traces")
    public void checkingThereAreNoRecordedTraces() throws MalformedURLException{
        new RecordedTraces()
                .checkingEmptyDescriptionIsDisplayed();
    }
}
