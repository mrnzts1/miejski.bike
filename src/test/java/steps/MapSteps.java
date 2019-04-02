package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.MapView;

@CucumberOptions(features = "features")

public class MapSteps {


    @Given("^User accepts app conditions and allows access to location$")
    public void acceptingAppConditions() throws Throwable {
        new MapView()
                .acceptingAppConditionsIfAppears()
                .acceptingAccessToLocation();
    }

    @Given("^User accepts app conditions and allows access to location - landscape")
    public void acceptingAppConditionsInLandscapePosition() throws Throwable {
        new MapView()
                .rotatingDeviceToLandscape()
                .acceptingAppConditionsIfAppears()
                .acceptingAccessToLocation();
    }
    @Given("^User is located in Warsaw center")
    public void usersLocationIsSettingInWarsawCenter() throws Throwable{
        new MapView()
                .setLocationInWarsawCenter();
    }
    @Given("^User is located out of Warsaw")
    public void usersLocationIsSettingOutOfWarsaw() throws Throwable{
        new MapView()
                .setLocationOutOfWarsaw();
    }

    @Then("^Map and all elements on the map are displayed$")
    public void checkingAllTheElementsAreDisplayed() throws Throwable{
        new MapView()
                .checkingMenuDrawerIsDisplayed()
                .checkingStartRecordingButtonIsDisplayed()
                .checkingLegendButtonIsDisplayed()
                .checkingTrackingButtonIsDisplayed()
                .checkingInformationIconIsDisplayed();

    }
    @When("^User located out of Warsaw")
    public void swipingMapWherePOIWillNotBeAvailable() throws Throwable{
        new MapView()
                .setLocationOutOfWarsaw();
    }
    @When("^User clicks legend button")
    public void clickingLegendButton() throws Throwable{
        new MapView()
                .clickingLegendButton();
    }

    @Given("^User does not accept app conditions$")
    public void userDoesNotAcceptAppConditions() throws Throwable {
        new MapView()
                .notAcceptingAppConditionsIfAppears();
    }

    @Then("^All positions in legend are displayed")
    public void checkingIfAllElementsInLegendAreDisplayed() throws Throwable{
        new MapView()
                .checkingIfAllElementsInLegendAreDisplayed();
    }

    @When("^User clicks start recording button")
    public void clickingStartRecordingButton() throws Throwable{
        new MapView()
                .recordingTrace();
    }
}
