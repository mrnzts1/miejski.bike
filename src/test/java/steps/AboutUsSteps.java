package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.AboutUsView;
import page.MapView;
import page.MenuView;

import java.net.MalformedURLException;

@CucumberOptions(features = "features")

public class AboutUsSteps {


    @When("User goes to About Us view")
    public void goingToAboutUs() throws MalformedURLException {
        new MapView()
                .clickingMenuDrawer();

        new MenuView()
                .clickingAboutUS();
    }
    @Then("^All team is displayed")
    public void checkingAllTeamIsDisplayed() throws MalformedURLException{
        new AboutUsView()
                .checkingMaciejIsDisplayed()
                .checkingWojciechIsDisplayed()
                .checkingPiotrIsDisplayed()
                .checkingAgaIsDisplayed()
                .checkingMariuszIsDisplayed()
                .checkingMaciejJurczakIsDisplayed()
                .checkingYueXlIsDisplayed();
    }
}
