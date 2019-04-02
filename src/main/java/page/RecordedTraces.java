package page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import java.net.MalformedURLException;
import static org.junit.Assert.assertTrue;

public class RecordedTraces extends Page{

    @AndroidFindBy(xpath=("//android.widget.TextView[@text='Przykro mi, nie mam nic do pokazania']"))
    protected MobileElement EMPTY_DESCRIPTION;

    public RecordedTraces() throws MalformedURLException {
        super();
    }

    public RecordedTraces checkingEmptyDescriptionIsDisplayed (){
        assertTrue(EMPTY_DESCRIPTION.isDisplayed());
        return this;

    }
}
