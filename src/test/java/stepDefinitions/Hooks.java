package stepDefinitions;

import io.cucumber.java.After;
import utils.ContextSetup;

import java.io.IOException;

public class Hooks {
    ContextSetup ContextSetup;

    public Hooks(ContextSetup testContextSetup)
    {
        this.ContextSetup = testContextSetup;
    }
    @After
    public void AfterScenario() throws IOException, InterruptedException {
        ContextSetup.base.WebDriverSetup().quit();
    }

}
