package page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import static io.appium.java_client.touch.offset.ElementOption.element;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;
import static config.AndroidDriverFactory.getDriver;
import static org.junit.Assert.assertTrue;


public class MapView extends Page {

    @AndroidFindBy(id = "button1")
    protected MobileElement OK_BUTTON;

    @AndroidFindBy(id = "button2")
    protected MobileElement CANCEL_BUTTON;

    @AndroidFindBy(id = "menu_button")
    protected MobileElement MENU_BUTTON;

    @AndroidFindBy(xpath=("//android.widget.Button[@text='ZEZWÓL']"))
    protected MobileElement ALLOW_LOCATION_ACCESS;

    @AndroidFindBy(id = "permission_deny_button")
    protected MobileElement DENY_LOCATION_ACCESS;

    @AndroidFindBy(id = "recording_start_button")
    protected MobileElement START_RECORDING_BUTTON;

    @AndroidFindBy(id = "recording_stop_button")
    protected MobileElement STOP_RECORDING_BUTTON;

    @AndroidFindBy(id = "legend_button")
    protected MobileElement LEGEND_BUTTON;

    @AndroidFindBy(id = "tracking_button")
    protected MobileElement TRACKING_BUTTON;

    @AndroidFindBy(id = "attributionView")
    protected MobileElement INFORMATION_ICON;

    @AndroidFindBy(xpath=("//android.widget.TextView[@text='Drogi rowerowe']"))
    protected MobileElement BIKEWAYS;

    @AndroidFindBy(xpath=("//android.widget.TextView[@text='Pasy rowerowe']"))
    protected MobileElement BIKE_LANES;

    @AndroidFindBy(xpath=("//android.widget.TextView[@text='Kontraruch']"))
    protected MobileElement CONTRAFLOW;

    @AndroidFindBy(xpath=("//android.widget.TextView[@text='Inne']"))
    protected MobileElement OTHER;

    @AndroidFindBy(xpath=("//android.widget.TextView[@text='W budowie']"))
    protected MobileElement UNDER_CONSTRUCTION;

    public MapView() throws MalformedURLException {
        super();
    }

    public MapView rotatingDeviceToLandscape() throws Throwable{
        getDriver().rotate(ScreenOrientation.LANDSCAPE);
        return this;
    }

    public MapView rotatingDeviceToPortrait() throws Throwable{
        getDriver().rotate(ScreenOrientation.PORTRAIT);
        return this;
    }

    public MapView acceptingAppConditionsIfAppears() {
        OK_BUTTON.click();
        return this;
    }

    public MapView notAcceptingAppConditionsIfAppears(){
        CANCEL_BUTTON.click();
        return this;}

    public MapView acceptingAccessToLocation(){
        ALLOW_LOCATION_ACCESS.click();
        return this;
    }

    public MapView checkingMenuDrawerIsDisplayed() {
        assertTrue(MENU_BUTTON.isDisplayed());
        return this;
    }

    public MapView checkingStartRecordingButtonIsDisplayed(){
        assertTrue(START_RECORDING_BUTTON.isDisplayed());
        return this;
    }
    public MapView checkingLegendButtonIsDisplayed(){
        assertTrue(LEGEND_BUTTON.isDisplayed());
        return this;
    }
    public MapView checkingTrackingButtonIsDisplayed(){
        assertTrue(TRACKING_BUTTON.isDisplayed());
        return this;
    }
    public MapView checkingInformationIconIsDisplayed() {
        assertTrue(INFORMATION_ICON.isDisplayed());
        return this;
    }
    public MapView clickingMenuDrawer() throws MalformedURLException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 15);
        wait.until(ExpectedConditions.elementToBeClickable(MENU_BUTTON));
        MENU_BUTTON.click();
        return this;
    }

    public MapView clickingLegendButton() throws Throwable{
        LEGEND_BUTTON.click();
        TouchAction action = new TouchAction((getDriver()));
        action.longPress(element(BIKEWAYS)).moveTo(element(INFORMATION_ICON)).release().perform();
        return this;
    }
    public MapView checkingIfAllElementsInLegendAreDisplayed(){
        assertTrue(BIKEWAYS.isDisplayed());
        assertTrue(BIKE_LANES.isDisplayed());
        assertTrue(CONTRAFLOW.isDisplayed());
        assertTrue(OTHER.isDisplayed());
        assertTrue(UNDER_CONSTRUCTION.isDisplayed());
        return this;
    }

    public MapView recordingTrace()throws Throwable{
        START_RECORDING_BUTTON.click();
        STOP_RECORDING_BUTTON.click();
        Thread.sleep(5000);
        return this;
    }

    public MapView setLocation(double latitude, double longitude, double altitude) throws Throwable{
        Location  location = new Location(latitude, longitude, altitude);
        getDriver().setLocation(location);
        return this;
    }

    public MapView setLocationInWarsawCenter() throws Throwable{
        setLocation(52.228971, 21.0048278, 300);
        return this;
    }

    public MapView setLocationOutOfWarsaw() throws Throwable{
        setLocation(52.6245461, 20.36986, 300);
        return this;
    }

}
