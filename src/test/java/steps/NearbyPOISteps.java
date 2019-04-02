package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.MapView;
import page.MenuView;
import page.NearbyPOIView;

public class NearbyPOISteps {

    @When("^User goes to 'Nearby POI'")
    public void goingToNearbyPOI() throws Throwable {
        new MapView()
                .clickingMenuDrawer();

        new MenuView()
                .clickingNearbyPOI();
    }

    @Then("^Nearby POI are displayed")
    public void checkingIfAllElementsAreDisplayed() throws Throwable {
        new NearbyPOIView()
                .checkingIfNearbyPoiListIsDisplayed()
                .checkingIfPoiIconIsDisplayed()
                .checkingIfPoiDistanceIsDisplayed()
                .checkingIfAroundLocationIsDisplayed()
                .checkingIfFilterIconIsDisplayed();
    }

    @Then("^Nearby POI around screen center are displayed")
    public void checkingIfNearbyPOISAroundScreenIsDisplayed() throws Throwable{
        new NearbyPOIView()
                .clickingFilterIcon()
                .checkingIfNearbyPOISAroundScreenIsDisplayed();
    }
    @When("^User change ‘Around screen center’ to ‘Around GPS position’")
    public void changingAroundScreenCenterToAroundGPSPosition() throws Throwable{
        new NearbyPOIView()
                .clickingFilterIcon()
                .clickingNearbyPOIAroundScreen()
                .selectingNearbyPOIAroundGPSRadioButton();
    }

    @Then("^Nearby POI around GPS position are displayed")
    public void checkingIfNearbyPOIIsChangedToAroundGPS() throws Throwable{
        new NearbyPOIView()
                .checkingIfNearbyPOIIsChangedToAroundGPS();
    }

    @Then("^An empty POI list is displayed")
    public void checkingIfNothingToDisplayIsVisible() throws Throwable{
        new NearbyPOIView()
                .checkingIfEmptyListMessageIsDisplayed();
    }
    @When("^User clicks IBOMBO POI")
    public void goingToIbomboPoi() throws Throwable{
        new NearbyPOIView()
                .clickingIbomboPoi();
    }
    @When("^User clicks VETURILO POI")
    public void goingToVeturiloPoi() throws Throwable{
        new NearbyPOIView()
                .clickingVeturiloPoi();
    }

    @When("^User clicks BICYCLE PARKING POI")
    public void goingToBicycleParkingPoi() throws Throwable{
        new NearbyPOIView()
                .clickingBicycleParkingPoi();
    }

    @Then("^All the elements on IBOMBO POI are displayed")
    public void checkingIfAllTheElementsOnIbomboAreDisplayed() throws Throwable{
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
    public void checkingIfAllTheElementsOnVeturiloAreDisplayed() throws Throwable{
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
    public void checkingIfAllTheElementsOnBicykleParkingAreDisplayed() throws Throwable{
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
