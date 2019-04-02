package page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Assert;
import java.net.MalformedURLException;
import static org.junit.Assert.assertTrue;

public class SettingsView extends Page{

    public SettingsView() throws MalformedURLException {
        super();
    }
    @AndroidFindBy(xpath = ("//android.widget.TextView[@text='Kolor aplikacji']"))
    protected MobileElement APPLICATIONS_COLORS;

    @AndroidFindBy(xpath = ("//android.widget.TextView[@text='Zachowaj ekran mapy włączony']"))
    protected MobileElement KEEP_MAP_SCREEN_ON;

    @AndroidFindBy(xpath = ("//android.widget.TextView[@text='Punkty POI']"))
    protected MobileElement POI_SPOTS;

    @AndroidFindBy(xpath = ("//android.widget.TextView[@text='Wersja aplikacji']"))
    protected MobileElement APPLICATION_VERSION;

    @AndroidFindBy (xpath = ("//android.widget.TextView[@text='Automatyczna zmiana']"))
    protected MobileElement AUTO_CHANGE_COLORS;

    @AndroidFindBy(id = "switch_widget")
    protected MobileElement SWITCH_TOGGLE;

    public SettingsView checkingIfDisableApplicationsColorsIsDisplayed() {
        assertTrue(APPLICATIONS_COLORS.isDisplayed());
        return this;
    }
    public SettingsView checkingIfKeppMapScreenOnIsDisplayed() {
        assertTrue(KEEP_MAP_SCREEN_ON.isDisplayed());
        return this;
    }
    public SettingsView checkingIfPoiSpotsIsDisplayed() {
        assertTrue(POI_SPOTS.isDisplayed());
        return this;
    }
    public SettingsView checkingIfApplicationVersionIsDisplayed() {
        assertTrue(APPLICATION_VERSION.isDisplayed());
        return this;
    }

    public SettingsView checkingIfAutoChangeColorsIsDisplayed() {
        assertTrue(AUTO_CHANGE_COLORS.isDisplayed());
        return this;
    }
    public SettingsView checkingIfKeepMapScreenOnIsTurnedOff() {
        Assert.assertEquals("false", SWITCH_TOGGLE.getAttribute("checked"));
        return this;
    }
}
