package page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Assert;
import java.net.MalformedURLException;
import java.util.List;
import static config.AndroidDriverFactory.getDriver;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static org.junit.Assert.assertTrue;

public class NearbyPOIView extends Page {

    public NearbyPOIView() throws MalformedURLException {
        super();
    }
    @AndroidFindBy(id = "poiListData")
    protected MobileElement NEARBY_POI_LIST;

    @AndroidFindBy(id = "poiItemDistance")
    protected MobileElement POI_DISTANCE;

    @AndroidFindBy(id = "poiItemIcon")
    protected MobileElement POI_ICON;

    @AndroidFindBy(id = "menu_filter")
    protected MobileElement FILTER;

    @AndroidFindBy(id = "around_location")
    protected MobileElement AROUND_LOCATION;

    @AndroidFindBy(xpath = ("//android.widget.TextView[@text='Wokół środka ekranu']"))
    protected MobileElement NEARBY_POI_AROUND_SCREEN;

    @AndroidFindBy(id = "checkbox")
    protected List<MobileElement> ALL_CHECKBOXES;

    @AndroidFindBy(xpath = ("//android.widget.CheckedTextView[@text='Wokół pozycji GPS']"))
    protected MobileElement NEARBY_POI_AROUND_GPS_RADIO_BUTTON;

    @AndroidFindBy(xpath = ("//android.widget.TextView[@text='Wokół pozycji GPS']"))
    protected MobileElement NEARBY_POI_AROUND_GPS;

    @AndroidFindBy(id = "poiListEmptyMessage")
    protected MobileElement POI_LIST_EMPTY_MESSAGE;

    @AndroidFindBy(xpath = ("//android.widget.TextView[@text='IBOMBO']"))
    protected MobileElement IBOMBO;

    @AndroidFindBy(xpath = ("//android.widget.TextView[@text='Parking rowerowy']"))
    protected MobileElement BICYCLE_PARKING;

    @AndroidFindBy(xpath = ("//android.widget.TextView[@text='Veturilo']"))
    protected MobileElement VETURILO;

    @AndroidFindBy(id = "handle")
    protected MobileElement POI_HANDLE;

    @AndroidFindBy(id = "main_toolbar")
    protected MobileElement MAIN_TOOLBAR;

    @AndroidFindBy(id = "title")
    protected MobileElement POI_TITLE;

    @AndroidFindBy(id = "report")
    protected MobileElement REPORT_ISSUE;

    @AndroidFindBy(id = "pointMoreInfo")
    protected MobileElement POI_ADDRESS;

    @AndroidFindBy(id = "imageView")
    protected MobileElement POI_IMAGE;

    @AndroidFindBy(id = "counter")
    protected MobileElement POI_COUNTER;

    @AndroidFindBy(id = "pointTags")
    protected MobileElement POI_TAGS_ON_IBOMBO;

    @AndroidFindBy(id = "typeMoreInfo")
    protected MobileElement POI_MORE_INFO;

    @AndroidFindBy(id = "actionEmail")
    protected MobileElement POI_EMAIL;

    @AndroidFindBy(id = "actionFacebook")
    protected MobileElement POI_FACEBOOK;

    @AndroidFindBy(id = "actionWebsite")
    protected MobileElement POI_WEBSITE;


    public NearbyPOIView checkingIfAllCheckboxesAreSelected() {
        for (int i =0; i < 3; i++){
            Assert.assertEquals("true",ALL_CHECKBOXES.get(i).getAttribute("checked"));
        }
        return this;
    }
    public NearbyPOIView checkingIfNearbyPoiListIsDisplayed(){
        assertTrue(NEARBY_POI_LIST.isDisplayed());
        return this;
    }
    public NearbyPOIView checkingIfPoiIconIsDisplayed(){
        assertTrue(POI_ICON.isDisplayed());
        return this;
    }
    public NearbyPOIView checkingIfPoiDistanceIsDisplayed(){
        assertTrue(POI_DISTANCE.isDisplayed());
        return this;
    }
    public NearbyPOIView checkingIfAroundLocationIsDisplayed(){
        assertTrue(AROUND_LOCATION.isDisplayed());
        return this;
    }
    public NearbyPOIView checkingIfFilterIconIsDisplayed() {
        assertTrue(FILTER.isDisplayed());
        return this;
    }
    public NearbyPOIView clickingFilterIcon(){
        FILTER.click();
        return this;
    }
    public NearbyPOIView checkingIfNearbyPOISAroundScreenIsDisplayed() {
        assertTrue(NEARBY_POI_AROUND_SCREEN.isDisplayed());
        return this;
    }
    public NearbyPOIView clickingNearbyPOIAroundScreen() {
        NEARBY_POI_AROUND_SCREEN.click();
        return this;
    }
    public NearbyPOIView selectingNearbyPOIAroundGPSRadioButton(){
        NEARBY_POI_AROUND_GPS_RADIO_BUTTON.click();
        return this;
    }
    public NearbyPOIView checkingIfNearbyPOIIsChangedToAroundGPS() {
        assertTrue(NEARBY_POI_AROUND_GPS.isDisplayed());
        return this;
    }

    public NearbyPOIView checkingIfEmptyListMessageIsDisplayed() {
        assertTrue(POI_LIST_EMPTY_MESSAGE.isDisplayed());
        return this;
    }

    public NearbyPOIView clickingIbomboPoi() throws MalformedURLException {
        IBOMBO.click();
        openingPOIdrawer();
        return this;
    }
    public NearbyPOIView clickingVeturiloPoi() throws MalformedURLException {
        VETURILO.click();
        openingPOIdrawer();
        return this;
    }
    public NearbyPOIView clickingBicycleParkingPoi() throws MalformedURLException {
        BICYCLE_PARKING.click();
        openingPOIdrawer();
        return this;
    }

    public NearbyPOIView openingPOIdrawer()throws MalformedURLException{
        TouchAction action = new TouchAction((getDriver()));
        action.longPress(element(POI_HANDLE)).moveTo(element(MAIN_TOOLBAR)).release().perform();
        return this;
    }
    //ALL POI
    public NearbyPOIView checkingIfPoiTitleOnPoiIsDisplayed(){
        assertTrue(POI_TITLE.isDisplayed());
        return this;
    }

    //All POI
    public NearbyPOIView checkingIfReportIssueButtonOnPoiIsDisplayed(){
        assertTrue(REPORT_ISSUE.isDisplayed());
        return this;
    }
    //All POI
    public NearbyPOIView checkingIfPoiAddressOnPoiIsDisplayed(){
        assertTrue(POI_ADDRESS.isDisplayed());
        return this;
    }
    //All POI
    public NearbyPOIView checkingIfPoiImageOnPoiIsDisplayed(){
        assertTrue(POI_IMAGE.isDisplayed());
        return this;
    }
    //All POI
    public NearbyPOIView checkingIfPoiMoreInfoIsDisplayed(){
        assertTrue(POI_MORE_INFO.isDisplayed());
        return this;
    }
    //All POI
    public NearbyPOIView checkingIfPoiFacebookIsDisplayed(){
        assertTrue(POI_FACEBOOK.isDisplayed());
        return this;
    }
    //All POI
    public NearbyPOIView checkingIfPoiEmailIsDisplayed(){
        assertTrue(POI_EMAIL.isDisplayed());
        return this;
    }
    //All POI
    public NearbyPOIView checkingIfPoiWebsiteIsDisplayed(){
        assertTrue(POI_WEBSITE.isDisplayed());
        return this;
    }
    //VETURILO and PARKING ROWEROWY
    public NearbyPOIView checkingIfPoiCounterIsDisplayed(){
        assertTrue(POI_COUNTER.isDisplayed());
        return this;
    }
    //IBOMBO
    public NearbyPOIView checkingIfPoiTagsOnIbomboAreDisplayed(){
        assertTrue(POI_TAGS_ON_IBOMBO.isDisplayed());
        return this;
    }

}
