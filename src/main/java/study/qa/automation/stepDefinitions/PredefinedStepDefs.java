package study.qa.automation.stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static study.qa.automation.utils.TestContext.getDriver;

public class PredefinedStepDefs {

    @Given("^I open url \"([^\"]*)\"$")
    public void iOpenUrl(String url) {
        getDriver().get(url);
    }

    @Then("^I wait for (\\d+) sec$")
    public void iWaitForSec(int sec) throws Exception {
        Thread.sleep(sec * 1000);
    }


//    @When("^I open urlv$")
//    public void iOpenUrlv() throws Throwable {
//        getDriver().get(url);
//    }

    @When("^I open urlvv$")
    public void iOpenUrlvv() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}

