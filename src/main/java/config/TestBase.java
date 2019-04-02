package config;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import java.net.MalformedURLException;
import static config.AndroidDriverFactory.getDriver;

public class TestBase extends AppConfig{

    @Before
    public void setUp() throws MalformedURLException {
        openApp();
    }

    @After
    public void quit () throws MalformedURLException {
        getDriver().resetApp();
    }
}
