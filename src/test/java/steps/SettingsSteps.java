package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.MapView;
import page.MenuView;
import page.SettingsView;

import java.net.MalformedURLException;

public class SettingsSteps {

    @When("^User goes to ‘Settings’")
    public void goingToSettings() throws MalformedURLException {
        new MapView()
                .clickingMenuDrawer();
        new MenuView()
                .clickingSettings();
    }
    @Then("^All the elements are displayed")
    public void allElementsInSettingsAreDisplayed() throws MalformedURLException{
        new SettingsView()
                .checkingIfDisableApplicationsColorsIsDisplayed()
                .checkingIfAutoChangeColorsIsDisplayed()
                .checkingIfKeppMapScreenOnIsDisplayed()
                .checkingIfPoiSpotsIsDisplayed()
                .checkingIfApplicationVersionIsDisplayed();
    }
    @Then("^Keep map on toggle is turned off")
    public void disableTrackingCheckboxIsSelected() throws MalformedURLException{
        new SettingsView()
                .checkingIfKeepMapScreenOnIsTurnedOff();
    }
}
