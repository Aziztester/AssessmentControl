package study.qa.automation.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import study.qa.automation.utils.TestContext;

import java.util.concurrent.TimeUnit;

import static study.qa.automation.utils.TestContext.getDriver;

public class CreateUser {

    @Given("^I open the \"([^\"]*)\"$")
    public void iOpenThe(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}

