package page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import java.net.MalformedURLException;
import static config.AndroidDriverFactory.getDriver;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static org.junit.Assert.assertTrue;

public class AboutUsView extends Page {

    @AndroidFindBy(id = "about_profile_1_name")
    protected MobileElement MACIEJ;

    @AndroidFindBy(id = "about_profile_2_name")
    protected MobileElement WOJCIECH;

    @AndroidFindBy(id = "about_profile_3_name")
    protected MobileElement PIOTR;

    @AndroidFindBy(id = "about_profile_4_name")
    protected MobileElement AGA;

    @AndroidFindBy(id = "about_profile_5_name")
    protected MobileElement MARIUSZ;

    @AndroidFindBy(id = "about_thanks_for_icon_name")
    protected MobileElement MACIEJ_JURCZAK;

    @AndroidFindBy(id = "about_thanks_for_lottie_name")
    protected MobileElement YUE_XL;

    @AndroidFindBy(id = "about_header_title")
    protected MobileElement MIEJSKI_BIKE_HEADER;

    public AboutUsView() throws MalformedURLException {
        super();
    }

    public AboutUsView checkingMaciejIsDisplayed(){
        assertTrue(MACIEJ.isDisplayed());
        return this;
    }

    public AboutUsView checkingWojciechIsDisplayed(){
        assertTrue(WOJCIECH.isDisplayed());
        return this;
    }

    public AboutUsView checkingPiotrIsDisplayed(){
        assertTrue(PIOTR.isDisplayed());
        return this;
    }

    public AboutUsView checkingAgaIsDisplayed(){
        assertTrue(AGA.isDisplayed());
        return this;
    }

    public AboutUsView checkingMariuszIsDisplayed() throws MalformedURLException{

        TouchAction action = new TouchAction((getDriver()));
        action.press(element(WOJCIECH)).moveTo(element(MIEJSKI_BIKE_HEADER)).perform();
        assertTrue(MARIUSZ.isDisplayed());
        return this;
    }
    public AboutUsView checkingMaciejJurczakIsDisplayed(){
        assertTrue(MACIEJ_JURCZAK.isDisplayed());
        return this;
    }
    public AboutUsView checkingYueXlIsDisplayed(){
        assertTrue(YUE_XL.isDisplayed());
        return this;
    }


}