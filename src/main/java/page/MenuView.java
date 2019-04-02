package page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import java.net.MalformedURLException;


public class MenuView extends Page {

    @AndroidFindBy(xpath = ("//android.widget.CheckedTextView[@text='Mapa']"))
    protected MobileElement MAP;

    @AndroidFindBy(xpath = ("//android.widget.CheckedTextView[@text='Najbliższe POI']"))
    protected MobileElement NEARBY_POI;

    @AndroidFindBy(xpath = ("//android.widget.CheckedTextView[@text='Zapisane trasy']"))
    protected MobileElement RECORDED_TRACES;

    @AndroidFindBy(xpath = ("//android.widget.CheckedTextView[@text='Ustawienia']"))
    protected MobileElement SETTINGS;

    @AndroidFindBy(xpath = ("//android.widget.CheckedTextView[@text='Oceń nas']"))
    protected MobileElement RATE_US;

    @AndroidFindBy(xpath = ("//android.widget.CheckedTextView[@text='Skontaktuj się']"))
    protected MobileElement SEND_FEEDBACK;

    @AndroidFindBy(xpath = ("//android.widget.CheckedTextView[@text='O nas']"))
    protected MobileElement ABOUT_US;

    @AndroidFindBy(xpath = ("//android.widget.CheckedTextView[@text='Partnerzy']"))
    protected MobileElement PARTNERS;


    public MenuView() throws MalformedURLException {
        super();
    }
    public MenuView clickingMap() {
        MAP.click();
        return this;
    }
    public MenuView clickingNearbyPOI() {
        NEARBY_POI.click();
        return this;
    }
    public MenuView clickingRecordedTraces() {
        RECORDED_TRACES.click();
        return this;
    }
    public MenuView clickingSettings() {
        SETTINGS.click();
        return this;
    }
    public MenuView clickingRateUs() {
        RATE_US.click();
        return this;
    }
    public MenuView clickingSendFeedback() {
        SEND_FEEDBACK.click();
        return this;
    }

    public MenuView clickingAboutUS() {
        ABOUT_US.click();
        return this;
    }

    public MenuView clickingPartners() {
        PARTNERS.click();
        return this;
    }
}
