package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.MapView;
import page.MenuView;
import page.NearbyPOIView;

import java.net.MalformedURLException;

public class NearbyPOISteps {

    @When("^User goes to 'Nearby POI'")
    public void goingToNearbyPOI() throws MalformedURLException {
        new MapView()
                .clickingMenuDrawer();

        new MenuView()
                .clickingNearbyPOI();
    }

    @Then("^Nearby POI are displayed")
    public void checkingIfAllElementsAreDisplayed() throws MalformedURLException {
        new NearbyPOIView()
                .checkingIfNearbyPoiListIsDisplayed()
                .checkingIfPoiIconIsDisplayed()
                .checkingIfPoiDistanceIsDisplayed()
                .checkingIfAroundLocationIsDisplayed()
                .checkingIfFilterIconIsDisplayed();
    }

    @Then("^Nearby POI around screen center are displayed")
    public void checkingIfNearbyPOISAroundScreenIsDisplayed() throws MalformedURLException{
        new NearbyPOIView()
                .clickingFilterIcon()
                .checkingIfNearbyPOISAroundScreenIsDisplayed();
    }
    @When("^User change ‘Around screen center’ to ‘Around GPS position’")
    public void changingAroundScreenCenterToAroundGPSPosition() throws MalformedURLException{
        new NearbyPOIView()
                .clickingFilterIcon()
                .clickingNearbyPOIAroundScreen()
                .selectingNearbyPOIAroundGPSRadioButton();
    }

    @Then("^Nearby POI around GPS position are displayed")
    public void checkingIfNearbyPOIIsChangedToAroundGPS() throws MalformedURLException{
        new NearbyPOIView()
                .checkingIfNearbyPOIIsChangedToAroundGPS();
    }

    @Then("^An empty POI list is displayed")
    public void checkingIfNothingToDisplayIsVisible() throws MalformedURLException{
        new NearbyPOIView()
                .checkingIfEmptyListMessageIsDisplayed();
    }
    @When("^User clicks IBOMBO POI")
    public void goingToIbomboPoi() throws MalformedURLException{
        new NearbyPOIView()
                .clickingIbomboPoi();
    }
    @When("^User clicks VETURILO POI")
    public void goingToVeturiloPoi() throws MalformedURLException{
        new NearbyPOIView()
                .clickingVeturiloPoi();
    }

    @When("^User clicks BICYCLE PARKING POI")
    public void goingToBicycleParkingPoi() throws MalformedURLException{
        new NearbyPOIView()
                .clickingBicycleParkingPoi();
    }

    @Then("^All the elements on IBOMBO POI are displayed")
    public void checkingIfAllTheElementsOnIbomboAreDisplayed() throws MalformedURLException{
        new NearbyPOIView()
                .checkingIfPoiTitleOnPoiIsDisplayed()
                .checkingIfPoiAddressOnPoiIsDisplayed()
                .checkingIfReportIssueButtonOnPoiIsDisplayed()
                .checkingIfPoiImageOnPoiIsDisplayed()
                .checkingIfPoiTagsOnIbomboAreDisplayed()
                .checkingIfPoiMoreInfoIsDisplayed()
                .checkingIfPoiFacebookIsDisplayed()
                .checkingIfPoiEmailIsDisplayed()
                .checkingIfPoiWebsiteIsDisplayed();
    }
    @Then("^All the elements on VETURILO POI are displayed")
    public void checkingIfAllTheElementsOnVeturiloAreDisplayed() throws MalformedURLException{
        new NearbyPOIView()
                .checkingIfPoiTitleOnPoiIsDisplayed()
                .checkingIfPoiAddressOnPoiIsDisplayed()
                .checkingIfReportIssueButtonOnPoiIsDisplayed()
                .checkingIfPoiImageOnPoiIsDisplayed()
                .checkingIfPoiCounterIsDisplayed()
                .checkingIfPoiMoreInfoIsDisplayed()
                .checkingIfPoiFacebookIsDisplayed()
                .checkingIfPoiEmailIsDisplayed()
                .checkingIfPoiWebsiteIsDisplayed();
    }
    @Then("^All the elements on BICYKLE PARKING POI are displayed")
    public void checkingIfAllTheElementsOnBicykleParkingAreDisplayed() throws MalformedURLException{
        new NearbyPOIView()
                .checkingIfPoiTitleOnPoiIsDisplayed()
                .checkingIfPoiAddressOnPoiIsDisplayed()
                .checkingIfReportIssueButtonOnPoiIsDisplayed()
                .checkingIfPoiImageOnPoiIsDisplayed()
                .checkingIfPoiCounterIsDisplayed()
                .checkingIfPoiMoreInfoIsDisplayed()
                .checkingIfPoiFacebookIsDisplayed()
                .checkingIfPoiEmailIsDisplayed()
                .checkingIfPoiWebsiteIsDisplayed();
    }
}
